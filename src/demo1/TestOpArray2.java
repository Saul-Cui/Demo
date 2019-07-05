package demo1;

import java.util.Arrays;
public class TestOpArray2 {

    public static void main(String[] args)
    {
        int[] arr = new int[] {9,8,7,6,5};
        System.out.println(Arrays.toString(arr));

        int[] newArr = new int[arr.length-1];
        for (int i=0;i<arr.length;i++)
        {
            if (i < 2)
            {
                newArr[i] = arr[i];
            } else if (i == 2)
            {
                continue;
            } else
            {
                newArr[i-1] = arr[i];
            }
        }
        System.out.println(Arrays.toString(newArr));
    }
}
