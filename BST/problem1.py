from tree import BST

print("Binary Search Tree Operations:")
print("1. Insert")
print("2. Delete")
print("3. Inorder Traversal")
print("4. Exit")

bst = BST()

while True:
    choice = int(input("\nEnter your choice: "))

    match choice:
        case 1:
            x = int(input("Enter the value to insert: "))
            bst.root = bst.insert(bst.root, x)

        case 2:
            x = int(input("Enter the value to delete: "))
            bst.root = bst.delete(bst.root, x)

        case 3:
            print("Inorder Traversal:", end=" ")
            bst.inorder(bst.root)
            print()

        case 4:
            print("Exiting...")
            break

        case _:
            print("Invalid choice! Please try again.")