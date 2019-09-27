/**
 * Default package used: https://docs.oracle.com/javase/specs/jls/se8/html/jls-7.html#jls-7.4.2
 */
public class FancyCat {
    public static void main(String[] args) {
        if (args.length <= 0) { // simple parameters check
            System.out.println("Missing parameters");
            return;
        }
        String text = args[0]; // words to display
        String width_str = args[1]; // maximum line width;
        int text_width = Integer.parseInt(width_str);
        int cat_height = cat.length;

        // print first line
        System.out.print(cat[0]);
        for (int i = 0; i < text_width; i++)
            System.out.print("_");
        System.out.print(right_bal[0] + "\n");

        // text
        String[] words = text.split(" ");
        String tmp;
        // line counter
        int line = 1;

        int i = 0;
        while (i < words.length) {
            tmp = words[i++]; // tmp represent the current row

            while (i < words.length && tmp.length() + words[i].length() + 1 <= text_width)
                tmp = tmp + " " + words[i++]; // add a new word until is not possible anymore

            tmp = String.format("%-" + width_str + "s", tmp); // fill with spaces
            //print
            System.out.print(line < cat_height ? (cat[line]) : (cat_fill)); // print the cat or the filler
            System.out.print(tmp); //print text
            // print ball or filler
            System.out.print(line < right_bal_height ? (right_bal[line] + "\n") : (right_bal_fill + "\n"));
            line++;
        }

        if (line < cat_height) //we still have something to draw
        {
            for (; line < cat_height; line++) {
                //print cat or fill
                System.out.print(cat[line]);
                //print space for text
                for (i = 0; i < text_width; i++)
                    System.out.print(line + 1 == cat_height ? "_" : " ");
                //print right baloon or fill
                System.out.print(line < right_bal_height ? (right_bal[line] + "\n") : (right_bal_fill + "\n"));
            }
        } else //we have to draw only the last line
        {
            System.out.print(cat_fill_last);
            for (i = 0; i < text_width; i++)
                System.out.print("_");
            System.out.print(right_bal_end + "\n");
        }
    }

    private static final String cat_fill_last = "         \\ ";
    private static final String cat_fill = "         | ";
    private static final String[] cat =
            {
                    " /\\_/\\     ",
                    "( ' ' )  / ",
                    "(  -  ) <  ",
                    " | | |   \\ ",
                    "(__|__)  | "
            };

    private static final int right_bal_height = 4;
    private static final String right_bal_fill = " |";
    private static final String right_bal_end = " /";
    private static final String[] right_bal =
            {
                    "  ",
                    " \\",
                    "  |",
                    " /"
            };
}
