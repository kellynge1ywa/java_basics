import java.util.Scanner;

public class register {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        String name;
        String response;
        String confirmation;
        String output;
        int responseCount=0;
        int maximumRepeat=3;

        for (int i=0; i<maximumRepeat; i++)
        {
            System.out.print("Enter your name: ");
            name=scanner.nextLine();

            confirmation=String.format("Is %s correct? (yes/no)", name);
            System.out.print(confirmation);
            response=scanner.nextLine().toLowerCase();
            
           if(response.equals("yes") || response.equals("y"))
           {
            output=String.format("Welcome %s ", name);
            System.out.println(output);
            break;
           }
           

           
        }
        System.out.println("Try again later!!");
        scanner.close();
         
    }
    
}
