
public class javaP2 {
    public static void main(String[] args)
        {
        int n = 3;
        while (n >= 0)
            {
            System.out.println("1 = " + n * n );
           
            --n;
              
            }
        System.out.println("2 = " + n );
        while (n < 4)
        System.out.println("3 = " + ++n );
        System.out.println("4 = " + n );
        while (n >= 0)
        System.out.println("5 = " + (n /= 2) );
        }
}
