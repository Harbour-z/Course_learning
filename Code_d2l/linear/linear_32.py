import random
import torch
from d2l import torch as d2l
from linear_31 import *
def synthetic_data(w, b, num_examples):
  X=torch.normal(0,1,(num_examples,len(w)))
  y=torch.matmul(X,w)+b
  y+=torch.normal(0,0.01,y.shape)
  return X,y.reshape((-1,1))
true_w = torch.tensor([2,-3.4])
true_b=4.2
features, labels=synthetic_data(true_w,true_b,1000)
# 上面的X就是特征量features，y就是labels
print('features:', features[0],'\nlabel:', labels[0])
# d2l.set_figsize()
# d2l.plt.scatter(features[:, (1)].detach().numpy(), labels.detach().numpy(), 1);
# d2l.plt.show()

def data_iter(batch_size,features,labels):
  num_exaples=len(features)
  indices=list(range(num_exaples))
  random.shuffle(indices)
  for i in range(0, num_exaples, batch_size):
    batch_indicies = torch.tensor(
      indices[i:min(i+batch_size,num_exaples)]
    )
    yield features[batch_indicies], labels[batch_indicies]
    #张量可以作为索引，且长度大于1时，其会作为
    # 索引返回包含多个元素的张量
batch_size = 10
for X, y in data_iter(batch_size, features, labels):
  print(X,'\n',y)
  break
# requires_grad用于控制张量是否需要计算梯度，
# 这通常用于神经网络中的可训练参数，如偏置和权重，
# 在训练中，需要根据Loss Function对参数求导来更新参数
w=torch.normal(0,0.01,size=(2,1), requires_grad=True)
b=torch.zeros(1,requires_grad=True)

# define the model
def linreg(X, w, b):
  return torch.matmul(X,w)+b
# define the Loss Function
def squard_loss(y_hat, y):
  return (y_hat-y.reshape(y_hat.shape))**2/2

# 定义优化算法
def sgd(params, lr, batch_size):
  '''
  随机梯度下降优化算法，Stochastic Gradient Descent
  
  '''
  with torch.no_grad():
    for param in params:
      param -= lr * param.grad / batch_size
      param.grad.zero_()
      
# Traning
lr = 0.03
num_epochs = 30
net = linreg
loss = squard_loss
for epoch in range(num_epochs):
  for X, y in data_iter(batch_size, features, labels):
    l = loss(net(X,w,b), y)
    l.sum().backward()
    sgd([w,b],lr,batch_size)
  with torch.no_grad():
    train_l = loss(net(features, w, b),labels)
    print(f'epoch{epoch+1}, loss{float(train_l.mean()):f}')

print(f'w的估计误差: {true_w-w.reshape(true_w.shape)}')
print(f'b的估计误差: {true_b-b}')

