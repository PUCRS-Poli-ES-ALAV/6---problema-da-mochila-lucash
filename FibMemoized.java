import java.math.BigInteger;

public class FibMemoized {
    private BigInteger[] mem = new BigInteger[10001];

    public BigInteger memoizedFibo(BigInteger[] f, int n) {
        for(int i = 0; i <= n; i++)
            f[i] = BigInteger.valueOf(-1L);
        return lookupFibo(f, n);
    }

    public BigInteger lookupFibo(BigInteger[] f, int n) {
        if(f[n].intValue() >= 0) return f[n];
        if(n <= 1){
            f[n] = BigInteger.valueOf(n);
        } else {
            f[n] = lookupFibo(f, n-1).add(lookupFibo(f, n-2));
        }
        return f[n];
    }

    public BigInteger fib(int n) {
        return memoizedFibo(mem, n);
    }

    public static void main(String[] args) {
        FibMemoized f = new FibMemoized();
        BigInteger res = f.fib(1000);
        System.out.println(res);
    }
}
