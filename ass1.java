import java.util.Scanner;
public class ass1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = input.nextInt();
        String binary = "";
        int temp = num;
        while (temp > 0) {
            int remainder = temp % 2;
            binary = remainder + binary; // prepend
            temp = temp / 2;
        }
        System.out.println("Binary of " + num + " = " + binary);
    }
}