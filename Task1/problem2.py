from Listcode import Menu_code as ll

links = ll()

ls = list(map(int, input("Enter the elements: ").split()))
x = input("Do you want cycle or not (y/n): ")

for i in ls:
    links.insertEnd(i)

if x.lower() == 'y':
    temp = links.head

    while temp.next is not None:
        temp = temp.next
    temp.next = links.head.next


visited = set()
temp = links.head
while temp is not None:
    if temp in visited:
        print("Cycle Detected")
        print("Starting point of cycle is:", temp.data)
        break
    visited.add(temp)
    temp = temp.next
else:
    print("No Cycle")