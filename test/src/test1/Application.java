package test1;

public class Application {
    public static void main(String[] args) {
        byte bnum = 1;
        short snum = 2;
        int inum = 4;
        long lnum = 8;
        float fnum = 4.0f;
        double dnum = 8.0;
        char ch = '2';
        boolean bool = true; // 1

        long sum1 = inum + lnum;
        int sum2 = inum + (int) lnum;

        System.out.println("sum1 = " + sum1);
        System.out.println("sum2 = " + sum2);

        System.out.println(sum1 != 0 ? sum1 > 0 ? "양수입니다." : "음수입니다." : "0입니다.");
    }
}
