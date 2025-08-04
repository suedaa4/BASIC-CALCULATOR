import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the first number: ");
        double firstNum = scanner.nextDouble();

        System.out.print("Please enter the second number: ");
        double secondNum = scanner.nextDouble();

        System.out.print("Please enter the operator (+,-,*,/): ");
        char operator = scanner.next().charAt(0);
       
        if(operator == '+'){
            System.out.println(firstNum + " " + "+" + " " + secondNum + " = " + (firstNum + secondNum));
        }
        else if( operator == '-') {
            System.out.println(firstNum + " " + "-" + " " + secondNum + " = " + (firstNum - secondNum));
        }
        else if(operator == '*'){
            System.out.println(firstNum + " " + "*" + " " + secondNum + " = " + (firstNum * secondNum));
        }
        else if(operator =='/'){
            if (firstNum == 0 && secondNum == 0) {
                System.out.println("Both number is 0 thats why result is undefined!");
            }  
            else if (secondNum == 0) {
                System.out.println("Second number is 0 thats why result is indeterminate!");
            }
             else {
                System.out.println(firstNum + " " + "/" + " " + secondNum + " = " + (firstNum / secondNum));
           
        }
          }
        else {
            System.out.println("Operation is wrong, try again!");
            scanner.close();
        }
 } 
}
