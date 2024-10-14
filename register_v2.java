import java.util.Scanner;

public class register_v2 {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        String fname;
        String lname;
        String email;
        String response;
        String output;
        int responseCount=0;
        int maximumRepeat=3; 

        do
        {
            System.out.print("Enter your first name: ");
            fname=scanner.nextLine();
            System.out.print(String.format("Is your name %s (yes/no) ", fname));
            response=scanner.nextLine().toLowerCase();

            
            if(response.equals("yes") || response.equals("y"))
            {
                output=String.format("Welcome %s ", fname);
            System.out.println(output);
            break;
            }
            else if(!response.equals("yes") && !response.equals("no"))
            {
                responseCount++;
                if(responseCount < maximumRepeat)
                {
                    System.out.println("Invalid response, Try again!!!");
                }
                else
                {
                    System.out.println("TRY AGAIN LATER!!!");
                }
                
            }
           
            else
            {
                responseCount++;
                if(responseCount < maximumRepeat)
                {
                    System.out.println("Try again!!!");
                }
                else
                {
                    System.out.println("TRY AGAIN LATER!!!");
                }
               
            }
            
           
            

        }
        while(responseCount< maximumRepeat);
        
        scanner.close();
    }
}
