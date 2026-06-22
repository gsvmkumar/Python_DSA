from Listcode import Menu_code as ll
links=ll()
ls=list(map(int,input("Enter the elements: ").split()))
for i in ls:
    links.insertEnd(i)

head=links.head

freq={}

cur=head

while cur is not None:
    if cur.data in freq:
        freq[cur.data]+=1
    else:
        freq[cur.data]=1
    cur=cur.next

for key,value in freq.items():
    print(key,"->",value)