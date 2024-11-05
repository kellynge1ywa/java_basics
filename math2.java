import java.util.Scanner;

class math2
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        try{
            boolean go_on=true;

        while(go_on)
        {
            System.out.print("Enter first number: ");
            int num1=scanner.nextInt();

            System.out.print("Enter operator: ");
            char operator=scanner.next().charAt(0);

            System.out.print("Enter second name: ");
            int num2=scanner.nextInt();

            int result=0;
            boolean validOperation=true;

            switch(operator)
            {
                case '%':
                if(num2 == 0)
                {
                    System.out.println("Cannot divide by zero");
                }
                else
                {

                    result=num1 % num2;
                }
                break;

                case '/':
                if(num2 ==0)
                {
                    System.out.println("Cannot perform modulus by zero.");
                }
                else
                {
                    result=num1/num2;
                }
                break;

                case '+':
                result=num1 + num2;
                break;

                case '-':
                result=num1 -num2;
                break;

                default:
                System.out.println("Invalid operator!!!");
            }
            if(validOperation)
            {
                System.out.println("The result of your calculations is: "+ result);
            }
            System.out.print("Do you want to continue? (y/n) ");
            String choice=scanner.next();
            if(!choice.equalsIgnoreCase("y"))
            {
                go_on=false;
            }
        }

        } catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        finally{
            scanner.close();
        }

        
    }
}