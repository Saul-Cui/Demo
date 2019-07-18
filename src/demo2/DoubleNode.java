package demo2;

public class DoubleNode {
    DoubleNode pre = this;
    DoubleNode next = this;
    int data;

    public DoubleNode(int data)
    {
        this.data = data;
    }

    public void after(DoubleNode node)
    {
        this.next.pre = node;
        node.next = this.next;
        this.next = node;
        node.pre = this;
    }

    public void removeNext()
    {
        this.next = this.next.next;
        this.next.next.pre = this;
    }

    public void removePre()
    {
        this.pre = this.pre.pre;
        this.pre.pre.next = this;
    }

    public DoubleNode next()
    {
        return this.next;
    }

    public DoubleNode pre()
    {
        return this.pre;
    }

    public int getData()
    {
        return this.data;
    }
}
