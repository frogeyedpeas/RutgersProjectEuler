import java.util.ArrayList;

public class prob10{
    public static ArrayList<Integer> primes = new ArrayList <Integer> ();

    public static boolean isPrime(long i)
    {
        for(long j = 0; j< primes.size(); j++)
        {
            if ( i % primes.get((int)j) == 0)
                return false;
        }
        return true;
    }

    public static void main(String [] args)
    {
        primes.add(2);

        long sum = 2;
        for(int i =3; i<2000000; i = i +2){

            if( isPrime(i))
            {
                sum = sum +i;
                primes.add(i);
            }
        }
        System.out.println(sum);
    }
}
