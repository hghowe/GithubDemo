import java.util.Scanner;

public class GitDemoClass
{
    public static void main(String[] args)
    {
        //TODO: 1) fill in the blank on then next line.
        //      2) commit this change.
        System.out.println("My name is _________");
        Scanner keyReader = new Scanner(System.in);
        System.out.print("What is your favorite word? ");
        String word = keyReader.next();
        System.out.print("What is your favorite positive integer number?");
        int num = keyReader.nextInt();

        System.out.println("I'm going to print \""+word+"\" "+num+" times.");
        //TODO: 3) Write this section of code so that it does what it says it will.
        //      4) Commit this change.
        //      5) Push.

        System.out.println("Done!");
    }
}
