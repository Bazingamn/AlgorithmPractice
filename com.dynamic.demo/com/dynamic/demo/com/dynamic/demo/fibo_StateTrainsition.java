import java.util.Scanner;

public class fibo_StateTrainsition {

    /**
     * 计算第n个斐波那契数
     * 列出状态转移方程，动态规划求重叠子问题
     * 本次是状态压缩
     * @param n
     * @return
     */
    public int fib(int n){
        if (n == 1 || n == 2) {
            return 1;
        }
        int prev = 1, curr = 1;
        for (int i = 3; i <= n; i++) {
            int sum = prev + curr;
            prev = curr;
            curr = sum;
        }
        return curr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input the index you want to calculate:");
        if (scanner.hasNext()) {
            String s = scanner.next();
            int num = Integer.parseInt(s);
            System.out.println(new fibo_StateTrainsition().fib(num));
        }
    }
}
