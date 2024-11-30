import java.util.Scanner;

public class GreatestCommonDivisor {

    public void findGreatestCommonDivisor() {

        //Variable declaration and initialization
        int scannedInteger1 = 0;
        int scannedInteger2 = 0;
        int greatestInteger = 0;
        int smallestInteger = 0;
        int greatestCommonDivisor = 0;
        Scanner integerScanner = new Scanner(System.in);


        //Prompts user for two integers with checks
        do {

            System.out.println("Enter the first integer great than 0: ");
            scannedInteger1 = integerScanner.nextInt();
            System.out.println("Enter the second integer greater than 0: ");
            scannedInteger2 = integerScanner.nextInt();

        }
        while (scannedInteger1 <=0 || scannedInteger2 <=0);


        //Determines if scannedInteger1 and scannedInteger2 are greater, lesser, or equal
        // and assigns the greatest and smallest
        if (scannedInteger1 >= scannedInteger2) {

           greatestInteger = scannedInteger1;
           smallestInteger = scannedInteger2;

        } else {

            greatestInteger = scannedInteger2;
            smallestInteger = scannedInteger1;
        }


        //Calculates the greatest common divisor, breaking when found
        for (int i = smallestInteger; i >= 1; i--) {

            if (((greatestInteger % i) == 0) && ((smallestInteger % i) == 0)) {

                greatestCommonDivisor = i;
                break;

            } else {

                greatestCommonDivisor = i;
            }
        }

        //Print the gcd result
        System.out.println("The GCD of " + scannedInteger1 + " and " + scannedInteger2 + " is " + greatestCommonDivisor);
        System.out.println();
    }
}