
public class Assignment2 {
    
    //shows the average of a set of ages
    private static void showAverageAge(int[] ages) {
        double average = 0.;
        int ageDiff;
        if(ages.length > 0) { //checks to see if given empty array
            ageDiff = ages[ages.length - 1] - ages[0];
            System.out.println("The age difference between the last element, and the first is: " + ageDiff);
            for(int i = 0; i < ages.length; i++) {
                average = (average * i + ages[i]) / (i + 1); //calculates average on each loop through
            }
            System.out.println("The average of the ages is " + average);
        } else {
            System.out.println("ERROR: Given empty array");
        }
    }

    //print the average length of a set of names
    private static void messingWithNames(String[] names) {
        if(names.length > 0) { //checks to see if given empty array
            double average = 0.;
            String allNames = "";
            for(int i = 0; i < names.length; i++) { 
                average = (average * i + names[i].length()) / (i + 1); //calculates average on each loop through
                allNames += names[i] + " ";
            }
            allNames = allNames.stripTrailing();//take out extra space at end
            System.out.println("The average length of name is " + average);
            System.out.println("All the names are: " + allNames + "!");
        } else {
            System.out.println("ERROR: Given empty array");
        }
    }

    //prints the sum of the length of a set of names
    private static void sumOfNames(String[] names) {
        int[] nameLengths = new int[names.length];
        for(int i = 0; i < names.length; i++) {
            nameLengths[i] = names[i].length();//populate nameLengths array
        }
        int sum = 0;
        for(int element : nameLengths) {
            sum += element; //calculate sum
        }
        System.out.println("This is the sum of the length of all the names: " + sum);
    }

    //returns a string of a given word repeated n times
    private static String repeatWord(String word, int n) {
        String repeatWord = "";
        for(int i = 0; i < n; i++) {
            repeatWord += word;
        }
        return repeatWord;
    }

    //returns a string that is a combination of a first and last name.
    private static String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    //returns true if sum of elements of array is greater than 100.
    private static boolean isArrGreater100(int[] arr) {
        int sum = 0;
        for(int n : arr) {
            sum += n;
        }
        return sum > 100;
    }

    //returns the average of given array
    private static double getAverage(double[] arr) {
        double sum = 0.;
        for(double n : arr) {
            sum += n;
        }
        return sum / arr.length;
    }

    //returns true if average of first of array is larger than second
    private static boolean isFirstAverageGreater(double[] arr1, double[] arr2) {
        return getAverage(arr1) > getAverage(arr2);
    }

    //returns true if isHotOutside, and moneyInPocket is bigger than $10.50
    private static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
        return (isHotOutside && moneyInPocket > 10.50);
    }

    //neatly prints out an array of strings
    private static void printArray(String[] array) {
        String result = "{";
        for(String el : array) {
            result += "\"" + el + "\", ";//add each element to final result, put quotes around it, and add a comma and space.
        }
        result = result.substring(0, result.length() - 2) + "}"; //remove extra ", " and add closing "}"
        System.out.println(result);
    }

    public static void main(String[] args) {
        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
        showAverageAge(ages);
        System.out.println("And with another element:");
        int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 36};
        showAverageAge(ages2);

        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
        messingWithNames(names);
        sumOfNames(names);

        System.out.println(repeatWord("Hello", 3));

        System.out.println(getFullName("Neil", "Armstrong"));

        System.out.println("The sum of elements in array is greater than 100 = " + isArrGreater100( new int[]{17, 27, 28, 29}));

        System.out.println("The average of elements in array is " + getAverage(new double[]{12.5, 13.5, 14.5}));

        System.out.println("First array average is greater than second = " + isFirstAverageGreater(new double[]{12.5, 13.5, 14.5}, new double[]{12.5, 15.5, 14.5}));

        System.out.println("I am going to buy a drink: " + willBuyDrink(true, 10.5000000001));

        printArray(names);
    }
}