from Listcode import Menu_code as ll
links=ll()
ls=list(map(int,input("Enter the elements: ").split()))
for i in ls:
    links.insertEnd(i)
head=links.head
if head is None:
    print("No elements")
    exit()

cur=head
while cur is not None and cur.next is not None:
    if cur.data==cur.next.data:
        cur.next=cur.next.next
    else:
        cur=cur.next
temp=head
while temp is not None:
    print(temp.data,end="->")
    temp=temp.next
print("None")