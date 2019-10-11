package it.unive.ch2.e7;

public class HollePrinter {
    private String text;
    private char rep1;
    private char rep2;

    public HollePrinter(String text, char rep1, char rep2) {
        this.text = text;
        this.rep1 = rep1;
        this.rep2 = rep2;
    }

    public String holleReplace(){
        String res = text.replace(rep1, '#');
        res = res.replace(rep2, rep1);
        res = res.replace('#', rep2);
        return res;
    }

    public static void main(String[] args) {
        HollePrinter hp = new HollePrinter("Hello World", 'o', 'e');
        System.out.println(hp.holleReplace());
    }
}
