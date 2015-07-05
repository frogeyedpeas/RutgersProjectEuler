public class prob12{
    public static void main(String args[]){
        int num_div;
        int count = 1;
        while ( num_div <= 500)
        {
            int sum = 0;
            num_div = 0;
            for( int i =1; i <= count; i++)
            {
                sum = sum + i;
            }
            for ( int j = 1; j<sum; j++)
            {
                if ( sum % j == 0) 
                {
                    num_div++;
                }
            }
        }
    }
}

