/*
    Write a method called reverse() with an int array as a parameter.
    The method should not return any value. In other words, the method is allowed to modify the array parameter.
    In main() test the reverse() method and print the array both reversed and non-reversed.
    To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.
    For example, if the array is {1, 2, 3, 4, 5}, then the reversed array is {5, 4, 3, 2, 1}.
 */

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter size of array: ");
        int count = s.nextInt();
        System.out.println("Enter "+count+ "number of Integers: ");
        int[] inputArray = new int[count];

        for (int i = 0; i < count; i++){
            inputArray[i] = s.nextInt();
        }
        reverse(inputArray);
    }

    public static void reverse(int[] array){
        int[] inputArray = Arrays.copyOf(array,array.length);
        System.out.println(Arrays.toString(inputArray));
        int index = inputArray.length - 1;
        int half = inputArray.length / 2;

        for(int i = 0; i < half; i++){
            int temp = inputArray[i];
            inputArray[i] = inputArray[index - i];
            inputArray[index - i] = temp;
        }

        System.out.println("The input Array is : "+Arrays.toString(array));
        System.out.println("The reversed Array is: "+Arrays.toString(inputArray));
    }
}
