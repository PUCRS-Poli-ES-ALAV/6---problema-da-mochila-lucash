public class Fibrec {
    public int fib(int n) {
        if(n<=1) return n;
        int a = fib(n-1);
        int b = fib(n-2);
        return a+b;
    }

    public static void main(String[] args) {
        Fibrec f = new Fibrec();
        int res = f.fib(32);
        System.out.println(res);
    }

}