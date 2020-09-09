import java.io.*;
import java.util.*;

public class Solution {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
//The trim() method removes whitespace from both ends of a string. Whitespace in this /////context is all the whitespace characters (space, tab, no-break space, etc.) and all /////the line terminator characters
        s=s.trim();
        if(s.length()==0){
            System.out.println(0);
            return;
        }
//The string split() method breaks a given string around matches of the given regular /////expression.

        String[] words = s.split("[^a-zA-Z]+");
        System.out.println(words.length);
       // System.out.println(Arrays.toString(words));

        for(String word: words){
                System.out.println(word);
        }

    }
}

