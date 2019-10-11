package it.unive.ch1.e7;

public class MorsePrinter {
    public static void main(String[] args) {
        if (args.length == 0) { // parameter check
            System.out.println("No input parameter");
            return;
        }

        for (int j = 0; j < args.length; j++) {
            String word = args[j].toUpperCase();
            char[] chars = word.toCharArray();

            for (int i = 0; i < chars.length; i++) {
                char c = chars[i];
                if (c != ' ') {
                    int index = c - 'A';
                    System.out.print(morse[index] + " ");
                } else
                    System.out.print(" ");
            }

            System.out.print(" ");
        }
    }

    // reference https://en.wikipedia.org/wiki/Morse_code
    static final String[] morse =
            {
                    ".-",   //a
                    "-...", //b
                    "-.-.", //c
                    "-..",  //d
                    ".",    //e
                    "..-.", //f
                    "--.",  //g
                    "....", //h
                    "..",   //i
                    ".---", //j
                    "-.-",  //k
                    ".-..", //l
                    "--",   //m
                    "-.",   //n
                    "---",  //o
                    ".--.", //p
                    "--.-", //q
                    ".-.",  //r
                    "...",  //s
                    "-",    //t
                    "..-",  //u
                    "...-", //v
                    ".--",  //w
                    "-..-", //x
                    "-.--", //y
                    "--.."  //z
            };


}
