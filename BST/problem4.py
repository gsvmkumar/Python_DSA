from tree import BST
bst = BST()
ls = list(map(int, input("Enter the elements of the BST: ").split()))
for i in ls:
    bst.root = bst.insert(bst.root, i)

def smallest(root):
    curr=root
    while curr.left is not None:
        curr=curr.left
    return curr.data
print("Smallest element in the BST:", smallest(bst.root))