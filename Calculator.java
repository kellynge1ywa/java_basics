import java.text.MessageFormat;
import java.util.Scanner;

class Calculator
{
    public static void main (String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        String name;
        String response;
        String welcome;
        int maximumRepeat=3;
        int responseCount=0;

        while(responseCount < maximumRepeat)
        {
            System.out.print("Enter your name: ");
            name=scanner.nextLine();
            System.out.print("Is your name? "+ name + "(yes/no)");
            response=scanner.nextLine().toLowerCase();

            if(response.equals("yes"))
            {
                welcome=MessageFormat.format("Welcome {0}", name);
                System.out.println(welcome);
                break;
            }
            else if(response.equals("no"))
            {
                responseCount++;
                if(responseCount > maximumRepeat)
                {
                    System.out.println("Try again later");
                }
            }
            else
            {
                
                responseCount++;
                if(responseCount < maximumRepeat)
                {
                    System.out.println("Invalid input!!, Try again");
                }
            }
        }

       
        scanner.close();

    }
}