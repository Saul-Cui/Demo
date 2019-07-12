package test_demo2;

import demo2.MyQueue;
public class TestQueue {

    public static void main(String[] args)
    {
        MyQueue mq = new MyQueue();
        mq.add(4);
        mq.add(5);
        mq.add(6);
        mq.add(7);

        System.out.println(mq.poll());
        mq.add(8);
        System.out.println(mq.poll());
        System.out.println(mq.poll());
        System.out.println(mq.poll());
        System.out.println(mq.isEmpty());
        System.out.println(mq.poll());
        System.out.println(mq.isEmpty());
        System.out.println(mq.poll());
    }
}
