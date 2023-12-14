import java.util.Scanner;

public class Nestedloop19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] temps = new double[5][7];

        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + (i + 1));
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                temps [i][j] = scanner.nextDouble();
                temps[i][j] = scanner.nextDouble();
            }
            System.out.println();
        }

        for (int i = 0; i < temps.length; i++){
            System.out.print("Kota ke-" + (i + 1) + ": ");
            for (int j = 0; j < temps[0].length; j++){
                System.out.print(temps[i][j] + " ");

        System.out.println("Data suhu untuk setiap kota dan rata-rata:");

        int kotaIndex = 1;
        for (double[] kotaTemps : temps) {
            System.out.print("Kota ke-" + kotaIndex + ": ");
            double totalSuhu = 0;

            for (double suhu : kotaTemps) {
                System.out.print(suhu + " ");
                totalSuhu += suhu;
            }
            System.out.println();

            double rataRata = totalSuhu / kotaTemps.length;
            System.out.println(" - Rata-rata: " + rataRata);
            kotaIndex++;
        }


    }
}
    }
}
