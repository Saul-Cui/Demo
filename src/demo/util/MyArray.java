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

    public void set(int index, int element)
    {
        if (index < 0 || index > elements.length - 1)
        {
            throw new RuntimeException("下标越界");
        }
        elements[index] = element;
    }

    public int search(int target)
    {
        int index = -1;
        for (int i=0;i<elements.length;i++)
        {
            if (elements[i] == target)
            {
                index = i;
                break;
            }
        }
        return index;
    }

    public int binary(int target)
    {
        int index = -1;
        int begin = 0;
        int end = elements.length - 1;
        int mid = (begin + end) / 2;

        if (target > elements[end] || target < elements[0])
        {
            return index;
        } else {
            while (true)
            {
                if (elements[mid] == target)
                {
                    index = mid;
                    break;
                } else {
                    if (elements[mid] > target)
                    {
                        end = mid - 1;
                    } else {
                        begin = mid + 1;
                    }
                    mid = (begin + end) / 2;
                }
            }
        }
        return index;
    }
}
