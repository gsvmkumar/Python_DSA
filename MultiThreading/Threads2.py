import threading
import time
import concurrent.futures
def add(x,y):
    return x+y
l=[10,20,30,40]
l2=[1,2,3,4]
with concurrent.futures.ThreadPoolExecutor(max_workers=2) as e:
    res=e.map(add,l,l2)
    print(list(res))