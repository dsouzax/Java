/*  Find minimum element in an Array:
    Write a method called readIntegers() with a parameter called count that represents how many integers the user needs to enter.
    The method needs to read from the console until all the numbers are entered, and then return an array containing the numbers entered.
    Write a method findMin() with the array as a parameter. The method needs to return the minimum value in the array.
    In the main() method read the count from the console and call the method readIntegers() with the count parameter.
    Then call the findMin() method passing the array returned from the call to the readIntegers() method.
    Finally, print the minimum element in the array.
 */

import java.util.Arrays;
import java.util.Scanner;

public class MinElementAray {
    private static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter size of Array: ");
        int count = s.nextInt();
        int[] inputArray = readIntegers(count);  //To get the input Array
        System.out.println("The Array entered is: "+ Arrays.toString(inputArray));
        System.out.println("The min value is: "+ findMin(inputArray));
        System.out.println("The min value through sort method is: "+ findMinEasy(inputArray));
    }

    public static int[] readIntegers(int count){
        int[] inputArray = new int[count];
        System.out.println("Enter "+count+ " number of integers: ");
        for (int i = 0; i < count; i++){
            inputArray[i] = s.nextInt();
        }
        return inputArray;
    }

    //This is the conventional way to go through the array using a "for" loop, below I have shown an alternative easier method
    public static int findMin(int[] inputArray){
        int min = inputArray[0];
        for(int i = 0; i < inputArray.length; i++){
            if(inputArray[i] < min){
                min = inputArray[i];
            }
        }
        return min;
    }

    //Here we use the inbuilt sort method to arrange the array in the ascending order, thus we get the smallest element at the 0th position of the array.
    public static int findMinEasy(int[] inputArray){
        Arrays.sort(inputArray);
        return inputArray[0];
    }
}
