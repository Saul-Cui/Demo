package demo2;


//一个节点
public class Node {

    //节点内容
    int data;
    //下一个节点的位置
    Node next;

    public Node(int data)
    {
        this.data = data;
    }

    //为节点追加节点（追加到末尾）
    public Node append(Node node)
    {
        //this.next = node;
        Node currentNode = this;

        while(true)
        {
            Node nextNode = currentNode.next;
            if (null == nextNode)
            {
                break;
            }
            currentNode = nextNode;
        }
        currentNode.next = node;
        return this;
    }

    //插入一个节点作为当前节点的下一个节点
    public void after(Node node)
    {
        node.next = next;
        this.next = node;
    }

    public Node next()
    {
        return this.next;
    }

    public int getData()
    {
        return this.data;
    }

    public void removeNext()
    {
        Node newNext = next.next;
        this.next = newNext;
    }

    public void show()
    {
        Node currentNode = this;
        while (true)
        {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
            if (null == currentNode)
            {
                break;
            }
        }
    }

    public boolean isLast()
    {
        return next == null;
    }
}
