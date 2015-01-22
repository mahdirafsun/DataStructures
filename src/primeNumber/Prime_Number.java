package primeNumber;


public class Prime_Number {

    public static void main (String[] args)
    {
        int i =0;
        int num =0;
        int totalnum = 100;
        String  primeNumbers = "";

        for (i = 1; i <= totalnum; i++)
        {
            int counter=0;
            for(num =i; num>=1; num--)
            {
                if(i%num==0)
                {
                    counter = counter + 1;
                }
            }
            if (counter ==2)
            {
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println(primeNumbers);
        int x = 100;

        for (int i = 4; i <= x; i = i + 2)
            System.out.println(i );
    }
public static void main(String[] args) {
    Boolean isPrime = true;
    int maxNumber = 100;
    int numberOfPrimeNUmber = 0;

    for ( int i = 2; i <= maxNumber; i++) {
        isPrime = true;
        for (int j = 2; j < i / 2; j++) {
            if (i % j == 0){
                j = i;
                isPrime = false;
            }
        }
        if ( isPrime ) {
            System.out.println(i);
            numberOfPrimeNUmber++;
        }
    }

    System.out.println(numberOfPrimeNUmber);
}
}