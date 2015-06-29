/**
 * SumAndAverage
 */
public class SumAndAverage {
    public static void main(String[] args) {
        doAverage();
        doAverageWhile();
        doAverageCount();
        doAverageOdd();
        doAverageDivisibleBy7();
        doAverageSumOfSquares();
    }
    public static void doAverage(){
        //initial average check going from 1-100, summing each number and getting the average.
        int upperbound = 100,sum = 0;

        double average = 0, count = 0;

        for (int i = 1; i <= upperbound; i++) {
            sum += i;
            count++;

        }
        average = sum/count;

        System.out.println("The sum is " + sum + " and the average is " + average);

    }

    public static void doAverageWhile() {
        //Same as DoAverage, but utilises a while loop instead of a For loop
        int upperbound = 100,sum = 0, i = 1;

        double average = 0, count = 0;

        while (i <= upperbound){
            sum +=i++ ;
            count++;

        }

        average = sum/count;

        System.out.println("The sum is " + sum + " and the average is " + average);


    }
    public static void doAverageCount() {
        //This is the 2nd "TRY" that wants us to go from 111 to 8899
        int upperbound = 8899,sum = 0;

        double average, count = 0;

        for (int i = 111; i < upperbound; i++) {
            sum += i;
            count++;

        }
        average = sum/count;

        System.out.println("The sum is " + sum + " and the average is " + average+ ". The count is "+count);


    }

    public static void doAverageOdd() {
        //This is the Third "TRY" that has us add up and average up numbers from 1-100 that are odd
        int upperbound = 100,sum = 0;

        double average = 0, count = 0;

        for (int i = 1; i <= upperbound; i++) {
            if ((i%2) != 0) {
                sum += i;
                count++;
            }

        }
        average = sum/count;

        System.out.println("The sum is " + sum + " and the average is " + average+ ". This is for Odds only");


    }

    public static void doAverageDivisibleBy7() {
        //This is the Third "TRY" that has us add up and average up numbers from 1-100 that are odd
        int upperbound = 100,sum = 0;

        double average = 0, count = 0;

        for (int i = 1; i <= upperbound; i++) {
            if ((i%7) != 0) {
                sum += i;
                count++;
            }

        }
        average = sum/count;

        System.out.println("The sum is " + sum + " and the average is " + average+ ". This is for numbers divisible by 7 only");


    }

    public static void doAverageSumOfSquares() {
        //This is the Third "TRY" that has us add up and average up numbers from 1-100 that are odd
        int upperbound = 100,sum = 0;

        double average = 0, count = 0;

        for (int i = 1; i <= upperbound; i++) {

                sum += (i*i);
                count++;


        }
        average = sum/count;

        System.out.println("The sum is " + sum + " and the average is " + average+ ". Sum of Squares");


    }

}
