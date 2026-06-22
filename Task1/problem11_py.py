class Node:
    def __init__(self,data):
        self.data=data
        self.right=None
        self.down=None

def create2DLinkedList(mat):
    if not mat:
        return None

    rows=len(mat)
    cols=len(mat[0])

    nodes=[[None for j in range(cols)] for i in range(rows)]

    for i in range(rows):
        for j in range(cols):
            nodes[i][j]=Node(mat[i][j])

    for i in range(rows):
        for j in range(cols):

            if j+1<cols:
                nodes[i][j].right=nodes[i][j+1]

            if i+1<rows:
                nodes[i][j].down=nodes[i+1][j]

    return nodes[0][0]

mat=[
    [1,2,3],
    [4,5,6],
    [7,8,9]
]
head=create2DLinkedList(mat)