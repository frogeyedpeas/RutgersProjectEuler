public class prob3{
    public static void main(String args []){
        long x = 600851475143L;
        long i = 3;
        long best = 0;
        while ( x >= i)
        {
            if ( x % i == 0 ) 
            {
                int flag = 0;
                for ( long j =2; j < i; j++ ) {
                    if ( i % j == 0)
                    {
                    flag =1 ;
                    break;
                    }
                }
                if ( flag == 0 ) 
                {
                    best = i;
                    x = x / i;
                }
            }
            else 
                    i = i + 2;

            }
    System.out.println (best) ;
    }
}

