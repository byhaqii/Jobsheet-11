import java.util.Scanner;
import java.util.Random;

public class Quiz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        char menu = 'y';

        do {
            int number = random.nextInt(10) + 1;
            boolean success = false;

            do {
                System.out.print("Tebak angka (1-10): ");
                int answer = input.nextInt();
                input.nextLine();
                success = (answer == number);

                if (answer == number) {
                    System.out.println("ANDA BENARRR");
                    success = true;
                } else if (answer < number) {
                    System.out.println("Terlalu kecil. Coba lagi ");
                } else {
                    System.out.println("Terlalu besar. Coba lagi ");
                }

            } while (!success);

            System.out.print("Apakah Anda ingin mengulang permainan (Y/n)? ");
            menu = input.nextLine().charAt(0);

        } while (menu == 'y' || menu == 'Y');

        if (menu == 'n' || menu == 'N') {
            System.out.println("TERIMA KASIH");
            System.exit(0);

        }
        {

        }
    }

}
