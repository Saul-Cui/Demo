package demo1;

public class TestSearch {
    public static void main(String[] args) {
        int[] arr = new int[] {2,3,4,5,6,7,8,9,0};
        int target = 8;
        int index = -1;
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i] == target)
            {
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}
