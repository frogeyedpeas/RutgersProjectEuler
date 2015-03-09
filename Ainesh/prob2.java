public class prob2{
    public static void main(String [] args){
        long a = 1;
        long b = 2;
        long c = a + b;
        long sum  = 0;
        while ( c <= 4000000)
        {
            if ( c < 100)
                System.out.println(c);

            if ( c % 2 == 0)
            {
                sum = sum + c;
            }
            a =b;
            b = c;
            c = a + b;
        }
        System.out.println(sum);
    }
}

