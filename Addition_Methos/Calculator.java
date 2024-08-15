import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println("1. Addition \n2. Subtraction \n3. Multiplication \n4. Division \n5. Remainder");
        int option = scan.nextInt();
        
        Call call = new Call();
        
        switch (option) {
            case 1:
                System.out.println("Result: " + call.add(num1, num2));
                break;
        
            case 2:
                System.out.println("Result: " + call.sub(num1, num2));
                break;
        
            case 3:
                System.out.println("Result: " + call.mul(num1, num2));
                break;
        
            case 4:
                System.out.println("Result: " + call.div(num1, num2));
                break;
                
            case 5:
                System.out.println("Result: " + call.rem(num1, num2));               
                break;
        
            default:
                System.out.println("Invalid Input");
                break;
        }
        
        scan.close();
    }
}

class Call {
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int sub(int num1, int num2) {
        return num1 - num2;
    }

    public int mul(int num1, int num2) {
        return num1 * num2;
    }

    public float div(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Float.NaN;   
        }
        return (float) num1 / num2;   
    }

    public int rem(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;   
        }
        return num1 % num2;
    }
}
