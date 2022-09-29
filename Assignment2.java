import java.util.*;

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
    }
}