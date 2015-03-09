public class prob9{
    public static void main (String [] args){
        int a, b,c;

        for ( c=3; c <1000; c++)
        {
            for (  b =2; b < c; b++)
            {
                for ( a=1; a<b ; a++)
                {
                    if( (c*c == a*a + b*b) && (a+b+c==1000))
                    {
                        System.out.println(a*b*c);
                        return;
                    }
                }
            }
        }
    }
}
