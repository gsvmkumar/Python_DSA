import threading
import time

def f1():
    for i in range(5):
        print("Thread 1")
        time.sleep(1)
        print("Thread 1 completed")
def f2():
    for i in range(5):
        print("Thread 2")
        time.sleep(4)
        print("Thread 2 completed")

t1=threading.Thread(target=f1)
t2=threading.Thread(target=f2)
t1.start()
t2.start()
t1.join()
t2.join()