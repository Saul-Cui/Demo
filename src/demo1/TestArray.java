package demo1;

public class TestArray {

    public static void main(String[] args)
    {
        int[] arr1 = new int[3];

        int length1 = arr1.length;

        System.out.println(length1);

        int element0 = arr1[0];
        System.out.println(element0);
        arr1[0] = 99;
        System.out.println(arr1[0]);
        arr1[1] = 98;
        arr1[2] = 97;

        for(int i=0;i<length1;i++)
        {
            System.out.println(arr1[i]);
        }

        int[] arr2 = new int[] {90,80,70,60,50};
        System.out.println(arr2.length);
    }
}
