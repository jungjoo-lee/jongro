import java.io.*;

public class test {
    public static void main(String[] args) {
        int a, b, c;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            System.out.print("숫자를 입력하세요 : ");
            a = Integer.parseInt(br.readLine());

            System.out.print("숫자를 입력하세요 : ");
            b = Integer.parseInt(br.readLine());

            c = a + b;

            if (c > 100) {
                System.out.println("100 초과");
            } else if (50 < c) {
                System.out.println("50초과 100이하");
            } else {
                System.out.println("50이하");
            }

            bw.write("두 수의 합 : " + c);
            bw.flush();
            br.close();
            bw.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
