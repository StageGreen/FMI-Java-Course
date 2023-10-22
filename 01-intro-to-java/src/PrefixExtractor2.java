public class PrefixExtractor2  {

    public static String getLongestCommonPrefix(String[] words){
        if(words.length == 0){
            return null;
        }
        else if (words.length == 1){
            return words[0];
        }

        StringBuilder longestCommonPrefix = new StringBuilder();

        String firstWord = words[0];
        for(int i = 0; i < firstWord.length(); i++){
            for(int j = 1; j < words.length; j++){
                if(words[j].length() < i ||
                        firstWord.charAt(i) != words[j].charAt(i)){
                    return longestCommonPrefix.toString();
                }
            }
            longestCommonPrefix.append(firstWord.charAt(i));
        }

        return longestCommonPrefix.toString();
    }

    public static void main(String[] args) {
        String[] words = {"catarzis", "cat1", "cat"};
        System.out.println(getLongestCommonPrefix(words));
    }
}
