class fibo1{
    /**
     * 计算第n个斐波那契数列
     * @param n
     * @return
     */
    public int fib(int n){
        if (n==1 || n==2) {
            return 1;
        }else{
            return fib(n-1)+fib(n-2);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int fibonaci = new fibo1().fib(n);
        System.out.println(fibonaci);
    }
}