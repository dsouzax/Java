/*
    Harry Potter used "Arania Exumai"  to blast off Acromantulas the giant spider to protect Ron.
    Like that you have to take a sentence as input, After that, you have to blast off for double letter sequence if exists and print the count.

    Input: One line input for a sentence S of string type.

    Output: An integer N.

    Constraints:
        *3 <= S <= 10^4
        *1 <= N <= 10^4

    Sample Input:                                              Sample Output:
    MY DREAM COMPANY IS GOOGLE                                       1
    SHE WAS FEEDING THE LITTLE RABBIT WITH AN APPLE                  4

 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class AraniaExumai {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        StringTokenizer str = new StringTokenizer(S);
        int count = 0,  insideWordCount = 0;

        while (str.hasMoreTokens()){
            String word = str.nextToken();
            for(int i = 0; i < word.length() - 1; i++){
                if(word.charAt(i) == word.charAt(i + 1)){
                    insideWordCount++;
                    count++;
                    if(insideWordCount == 1){
                        break;
                    }
                }
            }

        }
        System.out.println(count);
    }
}
