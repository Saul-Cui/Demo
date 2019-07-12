package test_demo2;

import demo2.MyStack;

public class TestStack {

    public static void main(String[] args)
    {
        MyStack ms = new MyStack();

        ms.push(9);
        ms.push(8);
        ms.push(7);

        System.out.println(ms.isempty());
        System.out.println(ms.pop());
        System.out.println(ms.peek());
        System.out.println(ms.pop());
        System.out.println(ms.peek());
        System.out.println(ms.pop());
        System.out.println(ms.peek());

        System.out.println(ms.isempty());
    }
}
