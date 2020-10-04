public class WordCount {

    public static void main(String[] args) {

       System.out.println(countWord("Hello There, Welcome"));

       System.out.println(countLetters("Patrick  ", true));

        System.out.println(countLetters("Patrick  ", false));

        String text = "Hello There";

        int freqOfL = countSymbolFreq(text, 'l');

        System.out.println("Freq of Char l in Hello There -> "
                +freqOfL);

    }

    public static Integer countWord(String s){
        int count = 0;

        if(!(s==null || s.isEmpty())){


            // \\s+ is a regex to match variable number of whitespaces
            // here we are splitting by whitespaces
            String [] strings = s.split("\\s+");

            count = strings.length;
        }
        return count;
    }

    public static Integer countLetters(String s, boolean whiteSpace){
        int count = 0;

        if(whiteSpace){
            // count whitespace
            count = s.length();
        }

        else {
            count = s.replace(" ", "").length();
        }
        return count;
    }

    // count the frequency of a certain symbol in a string of text
    public static Integer countSymbolFreq(String text, Character symbol){
        int count = 0;
        if(!(text == null || text.isEmpty())){
            count = text.length() - text.replace(symbol.toString(), "").length();
        }
        return  count; }

}
