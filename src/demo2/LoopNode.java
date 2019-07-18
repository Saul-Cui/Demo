package demo2;

public class LoopNode {

    int data;

    LoopNode next = this;

    public LoopNode (int data)
    {
        this.data = data;
    }

    public LoopNode next()
    {
        return this.next;
    }

    public void after(LoopNode node)
    {
        node.next = next;
        this.next = node;
    }

    public int getData ()
    {
        return this.data;
    }

    public void removeNext()
    {
        this.next = this.next.next;
    }


}
