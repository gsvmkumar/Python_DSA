from tree import BST
bst = BST()
ls = list(map(int, input("Enter the elements of the BST: ").split()))
for i in ls:
    bst.root = bst.insert(bst.root, i)
def count_leaves(root):
    if root is None:
        return 0
    if root.left is None and root.right is None:
        return 1
    return count_leaves(root.left) + count_leaves(root.right)

c=count_leaves(bst.root)
print("Number of leaf nodes in the BST:", c)