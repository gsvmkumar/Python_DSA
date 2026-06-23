from tree import BST

b = BST()

l = list(map(int, input().split()))
x = int(input())

for i in l:
    b.root = b.insert(b.root, i)

v = []

def traverse(root, v, x):
    if root is not None:
        res = traverse(root.left, v, x)
        if res:
            return res

        if x - root.data not in v:
            v.append(root.data)
        else:
            return [root.data, x - root.data]

        res = traverse(root.right, v, x)
        if res:
            return res

    return None

result = traverse(b.root, v, x)

if result:
    print("yes")
    print("Pair:", result)
else:
    print("no")