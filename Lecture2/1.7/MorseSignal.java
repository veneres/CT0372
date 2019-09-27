/**
 * Default package used: https://docs.oracle.com/javase/specs/jls/se8/html/jls-7.html#jls-7.4.2
 */
public class MorseSignal
{
	public static void main(String[] args)
	{
		if (args.length == 0)
		{
			System.out.println("No input parameter");
			return;
		}
		
		for (String word : args) //for each word in the parameters
		{		
			word = word.toUpperCase();
			char[] chars = word.toCharArray();
			
			for(char c : chars) //for each character in word
			{
				String code = morse[c - 'A'];
				
				for (int s = 0; s < code.length(); s++) //print letter c
				{
					if(code.charAt(s) == '-') System.out.print("111"); //line = 3 units
					else System.out.print("1"); //point = 1 unit
					
					System.out.print("0"); // point-line separator https://en.wikipedia.org/wiki/Morse_code#Transmission
				}
				
				System.out.print("000"); // character separator https://en.wikipedia.org/wiki/Morse_code#Transmission
			}
			
			System.out.print("0000000"); // words separator https://en.wikipedia.org/wiki/Morse_code#Transmission
		}
		
		System.out.print("101110100011101"); //end of message
		
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