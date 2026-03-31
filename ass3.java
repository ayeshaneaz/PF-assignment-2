import java.util.Scanner;
public class ass3 {
    public static String toBinaryString(int num) {
        if (num == 0) return "0";
        String binary = "";
        while (num > 0) {
            binary = (num % 2) + binary;
            num = num / 2;
        }
        return binary;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = input.nextInt();
        String result = toBinaryString(num);
        System.out.println("Binary string: " + result);
    }
}