import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class bank {
    public static void main(String[] args) {
        boolean menu = true;
        while (menu) {
            System.out.println("====================================");
            System.out.println("-----Selamat Datang Di Bank Sad-----");
            System.out.println("====================================");
            System.out.println("1. Account");
            System.out.println("2. Transfer");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit\n");
            Scanner scan = new Scanner(System.in);
            int pilihan = scan.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("1. Rekening\n2. Saldo");
                    int sub = scan.nextInt();
                    switch (sub) {
                        case 1:
                            System.out.println("Rekening anda 12345");
                            break;
                        case 2:
                            System.out.println("Saldo anda Rp 210.000");
                            break;
                        default:
                            System.out.println("Pilihan tidak tersedia");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Masukkan Rekening...");
                    int rek = scan.nextInt();
                    System.out.println("Masukkan nominal...");
                    int tf = scan.nextInt();
                    System.out.println("Uang sudah berhasil terkirim ke " + rek + " Sejumlah Rp." + tf);
                    System.out.println("Kembali ke manu(1/2)?");
                    int exit = scan.nextInt();
                    switch(exit){
                        case 1: System.out.println("Kembali Ke Menu...");
                        break;
                        case 2: System.out.println("Terimasiiiiiii...");
                        System.exit(0);
                    }
                    break;
                case 3:
                    System.out.println("Masukkan nominal...");
                    int wd = scan.nextInt();
                    System.out.println("Terimkasih anda menarik sebesar Rp." + wd);
                    break;
                case 4:
                    System.out.println("Terimkasih telah menggunakan BANK SAD");
                    menu = false;
                    break;
                default :System.out.println("Masukkan Pilihan Yang Bener!!!");
                break;
            }

        }

    }
}