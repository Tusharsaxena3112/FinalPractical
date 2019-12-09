package reverse;

import java.util.Scanner;

public class Execution {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String string = scanner.nextLine();
        Reverse reverse =new Reverse(string);
        System.out.println(reverse.findReverse());

    }
}
