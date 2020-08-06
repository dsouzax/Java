/*
        You are required to enter a word that consists of x and y that denote the number of Zs and Os respectively. The input word is considered similar to word zoo if
        2×x=y. Determine if the entered word is similar to word zoo.
        For example, words such as zzoooo and zzzoooooo are similar to word zoo but not the words such as zzooo and zzzo
        Input format
          *First line: A word that starts with several Zs and continues by several Os.
        Note: The maximum length of this word must be 20

        Output format
          *Print Yes if the input word can be considered as the string zoo otherwise, print No.

 */

import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        int countZ = 0, countO = 0;

        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i) == 'z'){
                countZ++;
            } else {
                countO++;
            }
        }
        String ans = countO == (2 * countZ) ? "Yes" : "No";
        System.out.println(ans);
    }
}
