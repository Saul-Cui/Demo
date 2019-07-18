package demo3;

public class TestFebonacci {

    public static void main(String[] args)
    {
        // 1 1 2 3 5 8 13 21 34 55 89
        // 1 2 3 4 5 6 7  8  9  10 11
        System.out.println(febonacci(11));

    }

    //斐波那契数列
    public static int febonacci(int i)
    {
        if (1 == i || 2 == i)
        {
            return 1;
        } else {
            return febonacci(i - 1) + febonacci(i - 2);
        }

    }
}
