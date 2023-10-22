import java.util.ArrayList;
import java.util.Scanner;

public class PrefixExtractor {

    public static String getLongestCommonPrefix(String[] words){
        StringBuilder LongestCommonPrefix = new StringBuilder();
        boolean endOfPrefixNotReached = true;
        if(words == null || words.length == 0)
            return "";

        if(words.length == 1){
            return words[0];
        }

       for(int i = 0; endOfPrefixNotReached; i++){
           //iterate through first word letters
            char currentChar = words[0].charAt(i);

           //for each word check if char from first word is the same at the same place
            for(String word : words){
                if(word.charAt(i) != currentChar){
                    endOfPrefixNotReached = false;
                    break;
                }
            }
            if(endOfPrefixNotReached){
                LongestCommonPrefix.append(currentChar);
            }
            else{
                break;
            }
       }

       return LongestCommonPrefix.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> buffer = new ArrayList<>();

        int numberOfStrings = in.nextInt();
        System.out.println(numberOfStrings);
        String bufferString;
        for(int i = 0; i < 3; i++){
            System.out.println(i);
            bufferString = in.next();
            buffer.add(bufferString);
        }

        System.out.println(PrefixExtractor.getLongestCommonPrefix(buffer.toArray(new String[0])));
    }
}
