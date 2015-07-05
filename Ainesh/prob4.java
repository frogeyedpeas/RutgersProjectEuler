
public class prob4
{
    public static boolean isPalin(long i ){
        long temp= i;
        long rev = 0;
        long digit;
        while ( temp > 0){
            digit = temp% 10;
            temp = temp /10;
            rev = rev * 10 + digit;
        }
        if ( rev == i ) 
            return true;
        else
            return false;
    }
    

    public static void main (String[] args)
    {
        int best = 0;
        int a = 999;
        int b = 999;
        for ( int i = a ; i > 0 ; i-- )
        {
            for (int j =b ; j > 0 ; j -- ){
                int prod = i * j;
                if (isPalin(prod))
                {
                    if ( prod > best)
                        best = prod;
                    //System.out.println (prod);
                    //break;
                }
            }
        }
        System.out.println(best);
    }
}
