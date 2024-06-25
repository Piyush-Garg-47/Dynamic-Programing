
public class febonachi{

    // memozation form of DP 
    public static int febonachi(int n , int f[ ] ){
        if(n== 0 || n==1) {
            return n ;
        }
        if(f[n] !=0){
            return f[n] ;
        }

        f[n] = febonachi(n-1 ,f) +febonachi(n-2 ,f) ;
         return f[n] ;
    }

    //tabulation form  of DP
    
    public static int tabulationfib(int n ){
       int dp [] = new int [n+1] ; 
       dp [0] = 0 ;
       dp[1] =1 ;

        for(int i=2 ; i<=n ; i++){
            dp[i] = dp[i-1] +dp[i-2] ;
        }

        return dp[n] ;
    }
    public static void main(String [] args ){
    // Scanner sc = new Scanner(System.in) ; 
     int n =5;
      int f[] =new int[n+1] ;

     System.out.println(febonachi(n ,f));
     
     System.out.println(tabulationfib(n));
    }
}