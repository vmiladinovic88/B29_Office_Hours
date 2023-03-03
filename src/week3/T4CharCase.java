package week3.week4;

public class T4CharCase {

    public static void main(String[] args) {
        char letter = 'a';

        if (letter >='A' && letter <='Z'){
            System.out.println(letter + " is uppercase");
        }

        if (letter >= 'a' && letter <= 'z'){
            System.out.println(letter + " is lowercase");
        }
        System.out.println("------------");

        char charLetter = 'a';
        boolean isUpper = letter >= 'A' && charLetter <= 'Z';
        boolean isLower = letter >= 'a' && charLetter <= 'z';
        String result = charLetter + " is ";

        if(isUpper){
            result += "uppercase";
        }
        if(isLower){
            result += "lowercase";
        }

        System.out.println(result);


    }
}

  /*
    T4CharCase [variables, if statement, relational operator]

    Create a program that will define a char variable, which will only be defined as a letter (a-z). The character can be defined in uppercase or lowercase and we want to determine which one it is

    Output in this format:
        $character is $uppercase_or_lowercase
     */
