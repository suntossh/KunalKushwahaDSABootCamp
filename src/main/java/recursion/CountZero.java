package recursion;

public class CountZero {
    public static void main(String[] args) {
       //3021000401
        System.out.println(zeroCounter(300040020, 0));
    }

    public static int zeroCounter(int n, int cnt){
        if(n==0){
            return cnt;
        }
        if(n%10 == 0){
            return zeroCounter(n/10,++cnt);
        }
        return zeroCounter(n/10,cnt);
    }


}
