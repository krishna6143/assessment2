public class Oddpositions {
    public static void main(String[] args) {
        String text = "type here to search";
        printOddPositionCharacters(text);
    }
    
    public static void printOddPositionCharacters(String str) {
        str = str.replaceAll("\\s+", ""); // Remove white spaces
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) { // Odd positions
                System.out.print(str.charAt(i) + " ");
            }
        }
    }
}
