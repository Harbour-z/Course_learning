import numpy as np
def sigmoid(x):
  return 1 / (1 + np.exp(-x))
X=np.array([1.0,0.5])
w1=np.array([[0.1,0.3,0.5],[0.2,0.4,0.6]])
b1=np.array([0.1,0.2,0.3])
a1=np.dot(X,w1)+b1

print(a1)
z1=sigmoid(a1)
print(z1)
w2=np.array([[0.1,0.4],[0.2,0.5],[0.3,0.6]])
b2=np.array([0.1,0.2])
a2=np.dot(z1,w2)+b2
z2=sigmoid(a2)
def identity_function(x):
  return x