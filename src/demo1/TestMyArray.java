package demo1;

import demo.util.MyArray;

import javax.swing.plaf.synth.SynthLookAndFeel;

public class TestMyArray {

    public static void main(String[] args)
    {
        MyArray ma = new MyArray();
        int size = ma.size();
        System.out.println(size);

        ma.add(94);
        ma.add(95);
        ma.add(96);
        ma.add(97);
        ma.add(98);
        ma.add(99);
        ma.show();
        //ma.delete(1);
        ma.show();
        System.out.println(ma.get(0));

        ma.show();
        System.out.println(ma.search(10));
        System.out.println(ma.binary(95));
        ma.insert(2,3);
        ma.show();
        ma.insert(5,10);
        ma.show();
        ma.set(1, 100);
        ma.show();
    }
}
