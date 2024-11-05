import java.util.Scanner;

class math {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter your name: ");
        // String name=scanner.nextLine();
        // String name=JOptionPane.showInputDialog("Enter your name: ");
        boolean keep_on=true;
        do {
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter math operator: ");
            char operator = scanner.next().charAt(0);

            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            int result = 0;
            boolean validOperation = true;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;

                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '%':
                    if (num2 == 0) {
                        System.out.println("Error cannot divide by zero");
                        validOperation = false;
                    } else {
                        result = num1 % num2;
                    }

                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("Cannot perform modulus by zero");
                        validOperation = false;
                    } else {

                        result = num1 / num2;
                    }
                    break;
                default:
                    System.out.println("Invalid operator");
                    return;
            }
            if (validOperation) {

                System.out.println("Result: " + result);
            }
            System.out.print("Do you want to stop? (y/n)");
            String choice=scanner.next();
            if(choice.equalsIgnoreCase("y"))
            {
                keep_on=false;
            }

        } while (keep_on);

    }

}