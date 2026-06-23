from tree import BST
bst = BST()
ls = list(map(int, input("Enter the elements of the BST: ").split()))
for i in ls:
    bst.root = bst.insert(bst.root, i)

def largest(root):
    curr=root
    while curr.right is not None:
        curr=curr.right
    return curr.data
print("Largest element in the BST:", largest(bst.root))