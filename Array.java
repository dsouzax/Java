/*
    Create a program using arrays that sorts a list of integers in descending order.
    Set up the program so that the numbers to sort are read in from the keyboard.
    Implement the following methods - getIntegers and sortIntegers
    getIntegers returns an array of entered integers from keyboard
    and sortIntegers should sort the array and return a new array containing the sorted numbers
    sort them and return the new sorted array.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter size of Array: ");
        int n = s.nextInt();
        int[] Array = getIntegers(n);
        System.out.println("The input Array is: " + Arrays.toString(Array));
        //System.out.println(Arrays.toString(Array));
        int[] sortedArrayIs = sortedArray(Array);
        System.out.println("The sorted Array in descending order is: " + Arrays.toString(sortedArrayIs));
        //System.out.println(Arrays.toString(sortedArrayIs));
    }

    public static int[] getIntegers(int n) {
        int[] getArray = new int[n];
        System.out.println("Enter " + n + " number of integers: ");
        for (int i = 0; i < getArray.length; i++) {
            getArray[i] = s.nextInt();
        }
        return getArray;
    }

    public static int[] sortedArray(int[] unsortedArray) {
        int temp;
        int[] sortArray = Arrays.copyOf(unsortedArray, unsortedArray.length);

        for(int j = 0; j < sortArray.length; j++){
            for(int k = j + 1; k < sortArray.length; k++){
                if(sortArray[j] < sortArray[k]){
                    temp = sortArray[j];
                    sortArray[j] = sortArray[k];
                    sortArray[k] = temp;
                }
            }
        }
        return sortArray;
    }
}
