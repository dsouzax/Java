/*
    Jack is awesome. His friends call him little Einstein. To test him, his friends gave him a string.
    They told him to add the string with its reverse string and follow these rules:
        1. Every ith character of string will be added to every ith character of reverse string.
        2. Both string will contain only lower case alphabets(a-z).
        3. Eg:- a+a=b,a+c=d,z+a=a (Refer to sample test cases for more details)
    Input:
        *First line contains a value N denoting number of test cases. Next N lines contains string str.

    Output:
        *For every string str output the string that Jack's friends wants from him.

    Constraints:
        *1 <= N <= 10
        *1 <= str <= 10^5


    Sample Input:                                            Sample Output:
    4                                                        wqxqw
    hello                                                    hhtdmqrrqmdthh
    codeapocalypse                                           wfxtebetxfw
    programming                                              aajaa
    world

    5
ulnzhekkonomoiyhxzbwfadhbmevrrdtbzibflwfgjklohtfucozfgvaasq  leoadlqkdqjsiqntijiccmjjkmgpvjvpgmkjjmccijitnqisjqdkqldaoel
jcnuumhxsypoowjcphfezxhbfemgftoktermpd                       nsamzgsmmewbtclknhkkhnklctbwemmsgzmasn
aoubnrqas                                                    tpltbtlpt
bgxbjifjrx                                                   zyhhsshhyz
jziu                                                         eiie
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordProblem {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int first, second, ans;
        int N = Integer.parseInt(br.readLine());
        StringBuilder reverse;
        String str;

        for(int i = 0; i < N; i++) {
            str = br.readLine().toLowerCase();
            StringBuilder sb = new StringBuilder(str);
            reverse = sb.reverse();
            for (int j = 0; j < str.length(); j++) {
                first = alphabet.indexOf(str.charAt(j)) + 1;
                second = alphabet.indexOf(reverse.charAt(j)) + 1;
                ans = first + second;

                if (ans > 26) {
                    ans -= 26;
                }
                System.out.print(alphabet.charAt(ans - 1));
            }
            System.out.println();
        }
    }
}