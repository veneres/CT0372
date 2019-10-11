package it.unive.ch2.e7;

public class LettersReplace {
    private String text;
    private char rep1;
    private char rep2;

    public LettersReplace(String text, char rep1, char rep2) {
        this.text = text;
        this.rep1 = rep1;
        this.rep2 = rep2;
    }

    public String replace(){
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == rep1){
                chars[i] = rep2;
            } else if(chars[i] == rep2){
                chars[i] = rep1;
            }
        }
        return new String(chars);
    }
    public static void main(String[] args) {
        LettersReplace hp = new LettersReplace("Hello World", 'o', 'e');
        System.out.println(hp.replace());
    }
}
