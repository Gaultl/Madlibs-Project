import java.util.Scanner;
/**
 * Will prompt the user to fill in a mad lib
 *
 * @author Lauren G
 * @date 9/16/2022
 */
public class MadLibs
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        
        System.out.println("Enter the date as mm dd yyyy: ");
        int month = input.nextInt();
        int day = input.nextInt();
        int year = input.nextInt();
        input.nextLine();
        
        System.out.println("Enter an adjective: ");
        String adj1 = input.nextLine();
        
        System.out.println("Enter an adjective: ");
        String adj2 = input.nextLine();
        
        System.out.println("Enter an adjective: ");
        String adj3 = input.nextLine();
        
        System.out.println("Enter an adjective: ");
        String adj4 = input.nextLine();
        
        System.out.println("Enter an adjective: ");
        String adj5 = input.nextLine();
        
        System.out.println("Enter a verb: ");
        String vb1 = input.nextLine();
        
        System.out.println("Enter a verb: ");
        String vb2 = input.nextLine();
        
        System.out.println("Enter a noun: ");
        String noun1 = input.nextLine();

        System.out.println("Enter a noun: ");
        String noun2 = input.nextLine();
        
        System.out.println("Enter a plural noun: ");
        String noun3 = input.nextLine();
        
        System.out.println("Enter a noun: ");
        String noun4 = input.nextLine();
        
        System.out.println(name + "     " + month + "/" + day + "/" + year);
        
        System.out.println("Our school has really " + adj1 + " food.");
        System.out.println("just thinking about it makes my stomach " + vb1 + ".");
        System.out.println("The spaghetti is " + adj2 + " and tastes like a " + noun1 + ".");
        System.out.println("One day, I swear one of my meatballs started to " + vb2 + "!");
        System.out.println("The turkey tacos are totally " + adj3 + " and look kind of like old " + noun2 + ".");
        System.out.println("My friend Dana actually likes the meatloaf even though it's " + adj4 + " and " + adj5 + ".");
        System.out.println("I call it mystery meatloaf and think it's really made out of " + noun3 + ".");
        System.out.println("My dad said he'd make my lunches, but the first day, he made me a sandwich out of " + noun4 + " and peanut butter!");
        System.out.println("I think I'd rather take my chances with the cafeteria!");
    }
}
