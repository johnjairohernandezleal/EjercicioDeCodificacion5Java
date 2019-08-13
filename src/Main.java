import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1 = Integer.parseInt(scanner.nextLine());
        int numero2 = Integer.parseInt(scanner.nextLine());

        if(numero1>numero2) {
            System.out.println(numero1);
        } else {
            System.out.println(numero2);
        }
    }
}
