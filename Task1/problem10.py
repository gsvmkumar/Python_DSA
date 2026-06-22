from Listcode import Menu_code as ll

links=ll()

ls=list(map(int,input("Enter the elements (0,1,2 only): ").split()))

for i in ls:
    links.insertEnd(i)

head=links.head

zero=0
one=0
two=0

cur=head

while cur is not None:
    if cur.data==0:
        zero+=1
    elif cur.data==1:
        one+=1
    else:
        two+=1
    cur=cur.next

cur=head

while zero>0:
    cur.data=0
    zero-=1
    cur=cur.next

while one>0:
    cur.data=1
    one-=1
    cur=cur.next

while two>0:
    cur.data=2
    two-=1
    cur=cur.next

temp=head

while temp is not None:
    print(temp.data,end="->")
    temp=temp.next

print("None")