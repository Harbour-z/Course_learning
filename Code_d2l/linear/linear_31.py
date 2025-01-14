import math
import time
import numpy as np
import torch
from d2l import torch as d2l

n=10000
a=torch.ones([n])
b=torch.ones([n])
class Timer:  #@save
    """记录多次运行时间"""
    def __init__(self):
        self.times = []
        self.start()

    def start(self):
        """启动计时器"""
        self.tik = time.time()

    def stop(self):
        """停止计时器并将时间记录在列表中"""
        self.times.append(time.time() - self.tik)
        return self.times[-1]

    def avg(self):
        """返回平均时间"""
        return sum(self.times) / len(self.times)

    def sum(self):
        """返回时间总和"""
        return sum(self.times)

    def cumsum(self):
        """返回累计时间"""
        return np.array(self.times).cumsum().tolist()
      

def normal(x, mu, sigma):
    p = 1 / math.sqrt(2 * math.pi * sigma**2)
    return p * np.exp(-0.5 / sigma**2 * (x - mu)**2)
if __name__=="__main__":
    x=np.arange(-7,7,0.01)
    print(x)
    params=[(0,1),(0,2),(3,1)]
    d2l.plot(x,[normal(x,mu,sigma) for mu,sigma in params],xlabel='x',
            ylabel='p(x)',figsize=(4.5,2.5),
            legend=[f'mean{mu},std{sigma}'for mu, sigma in params])
    d2l.plt.show()