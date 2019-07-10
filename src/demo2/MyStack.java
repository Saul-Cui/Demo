package demo2;

public class MyStack {
    int[] elements;

    public MyStack()
    {
        elements = new int[0];
    }

    //压入元素
    public void push(int element)
    {
        //创建一个新的数组
        int[] newArr = new int[elements.length + 1];

        //把原数组中的元素复制到新的数组中
        for(int i=0;i < elements.length; i++)
        {
            newArr[i] = elements[i];
        }
        //新元素插入到数组最后一个位置
        newArr[elements.length] = element;
        elements = newArr;
    }

    public int pop()
    {
        //
        if(elements.length == 0)
        {
            throw new RuntimeException("Stack is empty");
        }
        //取出数组中的最后一个元素，最后一个元素是栈顶
        int element = elements[elements.length - 1];
        //创建一个新数组，长度为原数组长度减一（排除最后一个元素--栈顶）
        int[] newArr = new int[elements.length - 1];
        //原数组中除了最后一个元素的其他元素复制到新数组中
        for(int i = 0;i < elements.length - 1;i++)
        {
            newArr[i] = elements[i];
        }
        //替换数组
        elements = newArr;
        //返回栈顶元素
        return element;
    }
}
