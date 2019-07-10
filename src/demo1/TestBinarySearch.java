package demo1;

public class TestBinarySearch {

    public static void main(String[] args)
    {
        int[] arr = new int[] {1,2,3,4,5,6,7,8,9};
        int target = 0;

        int begin = 0;
        int end = arr.length - 1;
        int mid = (begin + end) / 2;

        int index = -1;
        if (target > arr[end] || target < arr[0])
        {
            index = -1;
        } else {
            while (true)
            {
                if (arr[mid] == target)
                {
                    index = mid;
                    break;
                } else {
                    if (arr[mid] > target)
                    {
                        end = mid - 1;
                    } else {
                        begin = mid + 1;
                    }
                    mid = (begin + end) / 2;
                }
            }
        }

        System.out.println(index);
        //return index;
    }
}
