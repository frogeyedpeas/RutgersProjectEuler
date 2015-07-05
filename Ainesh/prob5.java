public class prob5{
    public static void main ( String [] args) {
        long smallest= 2520;
        while(true){
            int flag = 0;
            for ( int i = 2 ; i <=20; i++ )
            { 
                if ( smallest % i !=0 )
                {
                    flag = 1;
                    break;
                }
            }
            if ( flag == 0) 
                break;
            else 
            {
                smallest ++;
            }
        }
        System.out.println(smallest);
    }
}
