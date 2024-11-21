import numpy as np
import torch
from torch.utils import data
from d2l import torch as d2l

true_w=torch.tensor([2,-3.4])
true_b=4.2
features, labels = d2l.synthetic_data(true_w, true_b, 1000)
def load_array(data_arrays, batch_size, is_train=True):
  dataset = data.TensorDataset(*data_arrays) # *表示接受任意多个参数并将其放在一个元组中
  return data.DataLoader(data, batch_size, shuffle=is_train)
