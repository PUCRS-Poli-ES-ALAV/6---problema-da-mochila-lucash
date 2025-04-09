import java.math.BigInteger;

public class Fibo {
   private BigInteger [] mem = new BigInteger[10001];
   public BigInteger fib(int n){
    mem[0] = BigInteger.ZERO;
    mem[1] = BigInteger.ONE;
    for(int i = 2; i <= n; i++) {
        mem[i] = mem[i-1].add(mem[i-2]) ;
    }    
    return mem[n];
   }

   public static void main(String[] args) {
    Fibo f = new Fibo();
    BigInteger res = f.fib(1000);
    System.out.println(res);
   }
}
