package demo1;

import java.util.Arrays;

public class TestOpArray {

    public static void main(String[] args)
    {
        int[] arr = new int[] {9,8,7};
        System.out.println(Arrays.toString(arr));

        int dst = 6;
        int[] newArr = new int[arr.length+1];
        for(int i=0;i<arr.length;i++)
        {
            newArr[i] = arr[i];
        }
        newArr[arr.length] = dst;
        arr = newArr;
        System.out.println(Arrays.toString(arr));
    }
}
