package demo.util;

import java.util.Arrays;

public class MyArray {

    private int[] elements;

    public MyArray()
    {
        elements = new int[0];
    }

    public int size()
    {
        return elements.length;
    }

    public void add(int element)
    {
        int[] newArr = new int[elements.length+1];
        for(int i=0;i<elements.length;i++)
        {
            newArr[i] = elements[i];
        }
        newArr[elements.length] = element;
        elements = newArr;
    }

    public void show()
    {
        System.out.println(Arrays.toString(elements));
    }

    public void delete(int index)
    {
        if (index < 0 || index > elements.length - 1)
        {
             throw new RuntimeException("下标越界");
        }
        int[] newArr = new int[elements.length - 1];
        for (int i=0;i<newArr.length;i++)
        {
            if (i < index)
            {
                newArr[i] = elements[i];
            } else
            {
                newArr[i] = elements[i + 1];
            }
        }
        elements = newArr;
    }

    public int get(int index)
    {
        if (index < 0 || index > elements.length - 1)
        {
            throw new RuntimeException("下标越界");
        }
        return elements[index];
    }

    public void insert(int index, int element)
    {
        int[] newArr = new int [elements.length + 1];
        for(int i=0;i<newArr.length;i++)
        {
            if(i < index)
            {
                newArr[i] = elements[i];
            } else {
                newArr[i] = elements[i - 1];
            }
        }
        newArr[index] = element;
        elements = newArr;
    }
}
