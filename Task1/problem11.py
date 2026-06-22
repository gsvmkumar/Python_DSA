from Listcode import Menu_code as ll

links=ll()

ls=list(map(int,input("Enter the elements: ").split()))

for i in ls:
    links.insertEnd(i)

head=links.head

if head is None or head.next is None:
    print("Palindrome")
    exit()

slow=head
fast=head

while fast is not None and fast.next is not None:
    slow=slow.next
    fast=fast.next.next

prev=None
cur=slow

while cur is not None:
    nxt=cur.next
    cur.next=prev
    prev=cur
    cur=nxt

first=head
second=prev

flag=True

while second is not None:
    if first.data!=second.data:
        flag=False
        break

    first=first.next
    second=second.next

if flag:
    print("Palindrome")
else:
    print("Not Palindrome")