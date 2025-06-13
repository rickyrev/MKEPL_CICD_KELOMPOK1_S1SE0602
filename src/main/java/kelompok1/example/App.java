package kelompok1.example;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Berapa banyak nama yang ingin dimasukkan?");
        int count = scanner.nextInt();
        scanner.nextLine(); // konsumsi newline

        for (int i = 1; i <= count; i++) {
            System.out.print("Masukkan nama ke-" + i + ": ");
            String name = scanner.nextLine();
            System.out.println(greet(name));
        }

        scanner.close();
    }

    // Untuk runtime (pakai waktu sekarang)
    public static String greet(String name) {
        return greet(name, LocalTime.now());
    }

    // Untuk testing (pakai waktu custom)
    public static String greet(String name, LocalTime time) {
        String formattedTime = time.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        return "Halo, " + name + "! Sekarang jam: " + formattedTime;
    }
}
