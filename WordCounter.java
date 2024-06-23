public class WordCounter {
    public static int countWordOccurrences(String text, String word) {
        text = text.toLowerCase();
        word = word.toLowerCase();
        int count = 0;
        int index = 0;

        while (true) {
            index = text.indexOf(word, index);

            if (index != -1) {
                count++;
                index += word.length(); 
            } else {
                break;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String text = "Java is a programming language. Java is widely used in industry.";
        String wordToCount = "java";

        int occurrences = countWordOccurrences(text, wordToCount);
        System.out.println("The word \"" + wordToCount + "\" appears " + occurrences + " times in the text.");
    }
}
