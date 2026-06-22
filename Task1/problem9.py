from Listcode import Menu_code as ll

links=ll()

ls=list(map(int,input("Enter the elements: ").split()))

for i in ls:
    links.insertEnd(i)

head=links.head

k=int(input("Enter k: "))

def reverseK(head,k):
    cur=head
    prev=None
    nxt=None
    count=0

    while cur is not None and count<k:
        nxt=cur.next
        cur.next=prev
        prev=cur
        cur=nxt
        count+=1

    if nxt is not None:
        head.next=reverseK(nxt,k)

    return prev

head=reverseK(head,k)
links.head=head

temp=head

while temp is not None:
    print(temp.data,end="->")
    temp=temp.next

print("None")