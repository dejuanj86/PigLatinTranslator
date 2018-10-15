import java.util.Scanner;
public class PigLatin {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        final String vowels = "aeiouAEIOU";
        System.out.println("Welcome to the Pig Latin Translator!");
        System.out.println("Enter a line to be translated.");
        String word = sc.nextLine();
        while (!word.equalsIgnoreCase("done"))
        {
            String beforeAVowel = "";
            int split = 0;
            while (split < word.length() && !vowels.contains("" + word.charAt(split)))
            {
                beforeAVowel += word.charAt(split);
                split++;
            }
            if (split == 0)
            {
                split = 1;
                word += word.charAt(0) + "w";
            }
            System.out.println(word.substring(split) + beforeAVowel + "ay");
            System.out.println("Enter your word.");
            word = sc.nextLine();
        }
        
        System.out.println("Bye!");
    }
    
    
}
