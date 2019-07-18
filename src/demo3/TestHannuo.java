package demo3;

public class TestHannuo {

    public static void main(String[] args)
    {
        hannuo(3,'A','B', 'C');
    }

    public static void hannuo(int n, char from, char in, char to)
    {
        if (1 == n)
        {
            System.out.println("第1个盘子从"+from+"移到"+to);
        } else {
            hannuo(n-1, from, to, in);
            System.out.println("第"+n+"个盘子从"+from+"移到"+to);
            hannuo(n-1, in, from, to);
        }
    }
}
