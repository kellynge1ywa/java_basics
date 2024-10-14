import java.util.Scanner;

public class test {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your name: ");
            String name=scanner.nextLine();

            String confirmation=String.format("Is %s correct? (yes/no) ", name);
            
            System.out.print(confirmation);
            String response=scanner.nextLine();
            System.out.println(response);
            scanner.close();
    }
}
