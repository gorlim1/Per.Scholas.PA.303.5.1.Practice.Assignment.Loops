public class MultiplcationTable {

    public void printMultiplcationTable() {

        //Generates the numbers 1 - 12, iterating into the below for loop
        for (int i = 1; i < 13; i++) {

            //Generates the numbers 1 - 12 and multiplies them each by 1 - 12
            // prints each row on its own line
            for (int j = 1; j < 13; j++) {

                System.out.print(i * j + "\t");

            }

            System.out.println();
        }

        //new line padding for readability
        System.out.println();
    }
}