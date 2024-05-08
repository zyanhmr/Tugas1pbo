import java.util.Scanner;

public class Percabangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();
        String skor;

        if (nilai >= 90) {
            skor = "A";
        } else if (nilai >= 80) {
            skor = "B";
        } else if (nilai >= 70) {
            skor = "C";
        } else if (nilai >= 60) {
            skor = "D";
        } else {
            skor = "E";
        }

        System.out.println("Nilai: " + nilai + ", Skor: " + skor);

        System.out.print("Masukkan hari (Senin, Selasa, Rabu, Kamis, Jumat, Sabtu, Minggu): ");
        String hari = input.next();
        String keteranganHari = "";

        switch (hari) {
            case "Senin":
            case "Selasa":
            case "Rabu":
                keteranganHari = "Hari kerja";
                break;
            case "Kamis":
            case "Jumat":
                keteranganHari = "Hari kerja, hari ini adalah akhir pekan";
                break;
            case "Sabtu":
            case "Minggu":
                keteranganHari = "Hari libur";
                break;
            default:
                keteranganHari = "Hari tidak valid";
        }

        System.out.println(hari + " adalah " + keteranganHari);
    }
}