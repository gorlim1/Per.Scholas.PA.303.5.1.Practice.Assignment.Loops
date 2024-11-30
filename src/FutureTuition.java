public class FutureTuition {

    public void predictFutureTuition() {

        //Variable declarations and initializing
        final int startingTuition = 10000;
        final double yearlyTuitionPercentageIncrease = .07;
        final double doubledTuition = 20000;
        double newTuition = startingTuition;
        int yearTuitionDoubled = 0;


        //Iterates to find the year when tuition first exceeds 10000
        for (int i = 1; newTuition < doubledTuition; i++) {

            newTuition += yearlyTuitionPercentageIncrease * newTuition;
            yearTuitionDoubled = i;
            //System.out.println(newTuition + " " + i); testing
        }

        //print the year the tuition doubled
        System.out.println("The tuition will double in " + yearTuitionDoubled + " years.");
    }
}