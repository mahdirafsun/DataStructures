package primeNumber;


public class Math {
    public static void main( String[] args){
        for (int N = 1; N <= 10; N++) {
            System.out.println( 2*N );
        }
        for (int N = 2; N <= 20; N = N + 2) {
            System.out.println( N );
        }
        for (int N = 2; N <= 20; N++) {
            if ( N % 2 == 0 ) // is N even?
                System.out.println( N );
        }


        int init =1, pos =1;
        int x = 100;
        for(int i =1; i<=x;i++){
            System.out.println(init);
            init += pos;
            pos++;
        }
        int init1 =1, pos1 =1;
        int y = 5;
        for(int i =1; i<=y;i++){
            System.out.println(init1);
            init1 += (pos1 + 1);
            pos1++;
        }

    }
}
