import torch
m=torch.nn.Linear(20, 30)
print(m)
input=torch.randn(128,20)
print(input)
output=m(input)
print(m.weight)
print(m.bias)
print(output)