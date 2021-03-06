/**
 * Created by emmaperez on 2/13/18.
 */

/**Alice is taking a cryptography class and finding anagrams to be very useful.
 * We consider two strings to be anagrams of each other if the first string's letters can be rearranged to form the second string.
 * In other words, both strings must contain the same exact letters in the same exact frequency For example, bacdc and dcbac are anagrams,
 * but bacdc and dcbad are not.
 * Alice decides on an encryption scheme involving two large strings where encryption is dependent on the minimum number
 * of character deletions required to make the two strings anagrams. Can you help her find this number?
 * Given two strings, a  and  b, that may or may not be of the same length,
 * determine the minimum number of character deletions required to make a and b anagrams.
 * Any characters can be deleted from either of the strings.
**/

 public class Anagrams {
    public static void main(String[] args){
        String a;
        String b;

        a = "cde";
        b = "abc";

        char[] aChar = a.toCharArray();
        char[] bChar = b.toCharArray();
        int totalChars = aChar.length + bChar.length;

        for(int i = 0; i < aChar.length; i++){

            for(int j = 0; j< bChar.length; j++){

                if(aChar[i] == bChar[j] && aChar[i] != '*') {
                    System.out.println(bChar[j]);
                    System.out.println(aChar[i]);
                    bChar[j] = '*';
                    aChar[i] = '*';
                    totalChars = totalChars - 2;
                }

            }

        }
        System.out.println(totalChars);

    }
}
