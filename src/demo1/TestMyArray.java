package demo1;

import demo.util.MyArray;

public class TestMyArray {

    public static void main(String[] args)
    {
        MyArray ma = new MyArray();
        int size = ma.size();
        System.out.println(size);

        ma.show();
        ma.add(99);
        ma.show();
        ma.add(98);
        ma.show();
        ma.add(97);
        ma.show();
        //ma.delete(1);
        ma.show();
        System.out.println(ma.get(0));

        ma.add(96);
        ma.add(95);
        ma.add(94);
        ma.show();
        ma.insert(2,3);
        ma.show();
        ma.insert(5,10);
        ma.show();
    }
}
