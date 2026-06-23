from Node import Node

class BST:
    def __init__(self):
        self.root = None

    def insert(self, root, x):
        if root is None:
            return Node(x)
        if x < root.data:
            root.left = self.insert(root.left, x)
        else:
            root.right = self.insert(root.right, x)

        return root

    def minValueNode(self, node):
        current = node
        while current.left is not None:
            current = current.left
        return current

    def delete(self, root, x):
        if root is None:
            return root

        if x < root.data:
            root.left = self.delete(root.left, x)

        elif x > root.data:
            root.right = self.delete(root.right, x)

        else:
            if root.left is None:
                return root.right

            elif root.right is None:
                return root.left

            temp = self.minValueNode(root.right)
            root.data = temp.data
            root.right = self.delete(root.right, temp.data)

        return root

    def inorder(self, root):
        if root:
            self.inorder(root.left)
            print(root.data, end=" ")
            self.inorder(root.right)