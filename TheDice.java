/*
    There are x number of girls and they rolled a dice in turns one after another.
    If the number on the dice is 6 , then the dice will be rolled again until she get a number other than 6.

    Since you know the sequence of numbers which the dice shows when rolled each time, you have to find what is the total number of girls or if the sequence is invalid.

    Input format
        *A single line that contains a string s(1 <= |s| <= 10^5) denoting the sequence of numbers the dice rolls on written as string.

    Output format
        *If the sequence is valid print the number of girls
        *If the sequence is invalid print -1

    Input:              Output:
    3662123               5
 */


import java.util.Scanner;

public class TheDice {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int count = 0;
        int ppl = 0;
        String numbers = s.next();

        for(int i =0; i < numbers.length(); i++){
            if(numbers.charAt(i) == '6'){
                count++;
            }
        }

        if(numbers.charAt(numbers.length() - 1) == '6'){
            count = -1;
        }

        if(count == -1){
            ppl = -1;
        } else {
            ppl = numbers.length() - (count);
        }
        System.out.println(ppl);
        s.close();
    }
}
