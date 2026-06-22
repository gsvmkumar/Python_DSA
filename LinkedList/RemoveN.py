import Node
from LinkedListOP import Menu_code

links = Menu_code()

ls = list(map(int, input("Enter the elements: ").split()))
for i in ls:
    links.insertEnd(i)

links.traverse()

head = links.head  

n = int(input("\nEnter the position from the end to remove: "))

fp = head
sp = head

for i in range(n):
    if fp is None:
        print("Position exceeds the length of the linked list.")
        exit()
    fp = fp.next


if fp is None:
    head = head.next
    links.head = head
    links.traverse()
    exit()
while fp.next is not None:
    fp = fp.next
    sp = sp.next


sp.next = sp.next.next

links.traverse()