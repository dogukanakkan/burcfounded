import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Doğum tarihinizi girin (GG.AA.YYYY): ");
        String tarih = scanner.nextLine();

        int gun = Integer.parseInt(tarih.substring(0, 2));
        int ay = Integer.parseInt(tarih.substring(3, 5));

        String burc = "";
        if ((gun >= 21 && ay == 3) || (gun <= 20 && ay == 4)) {
            burc = "Koç";
        } else if ((gun >= 21 && ay == 4) || (gun <= 21 && ay == 5)) {
            burc = "Boğa";
        } else if ((gun >= 22 && ay == 5) || (gun <= 22 && ay == 6)) {
            burc = "İkizler";
        } else if ((gun >= 23 && ay == 6) || (gun <= 22 && ay == 7)) {
            burc = "Yengeç";
        } else if ((gun >= 23 && ay == 7) || (gun <= 22 && ay == 8)) {
            burc = "Aslan";
        } else if ((gun >= 23 && ay == 8) || (gun <= 22 && ay == 9)) {
            burc = "Başak";
        } else if ((gun >= 23 && ay == 9) || (gun <= 22 && ay == 10)) {
            burc = "Terazi";
        } else if ((gun >= 23 && ay == 10) || (gun <= 21 && ay == 11)) {
            burc = "Akrep";
        } else if ((gun >= 22 && ay == 11) || (gun <= 21 && ay == 12)) {
            burc = "Yay";
        } else if ((gun >= 22 && ay == 12) || (gun <= 21 && ay == 1)) {
            burc = "Oğlak";
        } else if ((gun >= 22 && ay == 1) || (gun <= 19 && ay == 2)) {
            burc = "Kova";
        } else if ((gun >= 20 && ay == 2) || (gun <= 20 && ay == 3)) {
            burc = "Balık";
        }

        System.out.println("Burcunuz: " + burc);
    }
}