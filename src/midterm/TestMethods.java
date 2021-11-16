package midterm;

public class TestMethods {
    

    /** 
     * Checks to see if word is inside sentence.
     * 
     * @param sentence the text to look in
     * @param word the text to look for
     * @return true if word is found in sentence, and false otherwise
     */
    public static boolean findSubString(String sentence, String word) {
        if (word.length() == 0) {
            return false;
        }

        for (int index = 0; index + word.length() < sentence.length(); index++) {
            if (sentence.substring(index, index + word.length()).equals(word)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String test = "testabctest";
        String word = "abc";
        System.out.println(findSubString(test, word));

        word = "test";
        System.out.println(findSubString(test, word));

        word = "bca";
        System.out.println(findSubString(test, word));
        
    }
}
