from Listcode import Menu_code as ll

links=ll()

ls=list(map(int,input("Enter the elements: ").split()))

for i in ls:
    links.insertEnd(i)

head=links.head

x=int(input("Enter the value: "))

while head is not None and head.data==x:
    head=head.next

cur=head
while cur is not None and cur.next is not None:
    if cur.next.data==x:
        cur.next=cur.next.next
    else:
        cur=cur.next

links.head=head

temp=head
while temp is not None:
    print(temp.data,end="->")
    temp=temp.next
print("None")