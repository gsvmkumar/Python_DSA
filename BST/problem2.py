from tree import BST
bst = BST()
ls = list(map(int, input("Enter the elements of the BST: ").split()))
for i in ls:
    bst.root = bst.insert(bst.root, i)

def inorder1(root):
    if root:
        inorder1(root.left)
        if root.left is None and root.right is None:
            print(root.data, end=" ")
        inorder1(root.right)

inorder1(bst.root)