import java.util.Scanner;
public class ass2 {\
    public static int[] toBinaryArray(int num) {
        int temp = num;
        int count = 0;
        while (temp > 0) {
            count++;
            temp = temp / 2;
        }
        int[] binaryArray = new int[count];
        temp = num;
        for (int i = count - 1; i >= 0; i--) {
            binaryArray[i] = temp % 2;
            temp = temp / 2;
        }
        return binaryArray;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = input.nextInt();
        int[] result = toBinaryArray(num);
        System.out.print("Binary array: ");
        for (int bit : result) {
            System.out.print(bit);
        }
    }
}