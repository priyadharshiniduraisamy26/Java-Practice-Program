class WordCount {
    public static void main(String[] args) {
        String text = "Now is the time \nfor all good men\n"
                    + "to come to the aid of their country\n"
                    + "and pay their taxes.\n";

        int len = text.length();
        boolean inWord = false;
        int numbers = 0;
        int numWords = 0;
        int numLines = 0;

        for (int i = 0; i < len; i++) {
            char c = text.charAt(i);

            if (c == '\n') {
                numLines++;
            }
            if (Character.isDigit(c)) {
                numbers++;
            }
            if (Character.isWhitespace(c)) {
                inWord = false;
            } else if (!inWord) {
                inWord = true;
                numWords++;
            }
        }

        System.out.println("Number of lines: " + numLines);
        System.out.println("Number of words: " + numWords);
        System.out.println("Number of digits: " + numbers);
    }
}
