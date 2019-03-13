
/**
 * Write a description of class Reverse here.
 *
 * @author (Ismail)
 * @version (a version number or a date)
 */
public class Reverse
{
    public static final String SECRET_PASSWORD = "Minion or da Bob bb";
    
    static String obfuscate(String input){ 
        return input.replace('b','b').concat("fo today");}
    public static void main(String [] args){
        if(args.length != 1)
        {
            System.out.println("Wrong! You have to run this program with one arguement:\njava Reverse <arguments>");
            return;
        }
        if(args[0].equals(obfuscate(SECRET_PASSWORD))) 
        {
            System.out.println("You win! Congratulations!");
            System.out.println("WHATS UP GUYS, WELCOME BACK TO ANOTHER CoolMathGAmes.com VIDEO. ");
            System.out.println("BEFORE WE START,THIS VIDEO IS SPONSORED BY SQUARE SPACE.");
            System.out.println("MAKE SURE TO S M A S H THAT LIKE BUTTON. AND LETS GET INTO IT!");
        }
        else 
        {System.out.println("Wrong password, try again.");}
    }
}
