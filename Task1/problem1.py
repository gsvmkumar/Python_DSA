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
    temp.next = links.head


visited = set()
temp = links.head
while temp is not None:
    if temp in visited:
        print("Cycle Detected")
        break
    visited.add(temp)
    temp = temp.next
else:
    print("No Cycle")


#It is slow pointer and fast pointer approach to detect cycle in linked list


# slow=links.head
# fast=links.head

# cycle_found=False

# while fast is not None and fast.next is not None:
#     slow = slow.next
#     fast = fast.next.next

#     if slow == fast:
#         cycle_found = True
#         break

# if cycle_found:
#     print("Cycle Detected")
# else:
#     print("No Cycle")