public class prob6{
    public static void main ( String [] args ) {
        long sum_squares = 0;
        long sq_sums = 0;
        for ( int i = 1 ; i <= 100; i++)
        {
            sum_squares = sum_squares + i*i;
            sq_sums = sq_sums + i;

        }
        sq_sums = sq_sums * sq_sums;
        System.out.println(sq_sums - sum_squares);
    }
}

