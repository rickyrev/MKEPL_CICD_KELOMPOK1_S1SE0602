package kelompok1.example;

import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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

    public static String greet(String name) {
        // Tambahkan jam saat ini
        LocalTime timeNow = LocalTime.now();
        String formattedTime = timeNow.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        return "Halo, " + name + "! Sekarang jam: " + formattedTime;
    }
}
