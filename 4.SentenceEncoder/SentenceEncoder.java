import java.util.Scanner;

public class SentenceEncoder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the key and input sentence
        System.out.print("Enter the encoding key: ");
        int key = scanner.nextInt();
        scanner.nextLine(); // Consume newline left by nextInt()

        System.out.print("Enter the input sentence: ");
        String inputSentence = scanner.nextLine();

        // Split the input sentence into words
        String[] words = inputSentence.split("\\s+");

        // StringBuilder to store the encoded sentence
        StringBuilder encodedSentence = new StringBuilder();

        // Encode each word based on its position
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String encodedWord = encodeWord(word, key, i);

            // Append the encoded word to the result
            encodedSentence.append(encodedWord).append(" ");
        }

        // Print the encoded sentence
        System.out.println("Encoded Sentence: " + encodedSentence.toString().trim());
    }

    // Method to encode each word based on its position
    private static String encodeWord(String word, int key, int position) {
        StringBuilder encodedWord = new StringBuilder();

        // Determine if the position is odd or even
        boolean isOddPosition = (position % 2 == 0); // Positions are 0-indexed

        // Apply encoding based on position
        if (isOddPosition) {
            // Odd position: Shift each letter by the key value
            for (int i = 0; i < word.length(); i++) {
                char originalChar = word.charAt(i);
                char encodedChar = (char) (originalChar + key);
                encodedWord.append(encodedChar);
            }
        } else {
            // Even position: Reverse the word and then shift each letter by the key value
            String reversedWord = new StringBuilder(word).reverse().toString();
            for (int i = 0; i < reversedWord.length(); i++) {
                char originalChar = reversedWord.charAt(i);
                char encodedChar = (char) (originalChar + key);
                encodedWord.append(encodedChar);
            }
        }

        return encodedWord.toString();
    }
}
