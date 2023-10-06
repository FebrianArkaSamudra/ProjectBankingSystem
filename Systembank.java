import java.util.Scanner;

public class Systembank {
    public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    
    System.out.println("Masukkan nama");
    String u = scan.next();
    System.out.println("Masukkan password");
    int pass = scan.nextInt();
        if (u.equals("Majid") && pass == 123) {
                    System.out.println("====================================");
                    System.out.println("------ Welcome to Bank Qwerty ------");
                    System.out.println("====================================");
                    System.out.println("1. Withdraw");
                    System.out.println("2. Top up");
                    System.out.println("3. Transfer");
                    System.out.println("4. Payment");
                    System.out.println("5. Cash Deposit");
                    System.out.println("6. Balance Info");
                    System.out.println("7. Bill");
        }
        else if (u.equals("Xavier") && pass == 124 ){
                    System.out.println("====================================");
                    System.out.println("------ Welcome to Bank Qwerty ------");
                    System.out.println("====================================");
                    System.out.println("1. Withdraw");
                    System.out.println("2. Top up");
                    System.out.println("3. Transfer");
                    System.out.println("4. Payment");
                    System.out.println("5. Cash Deposit");
                    System.out.println("6. Balance Info");
                    System.out.println("7. Bill");

        }
        else if (u.equals("Arka") && pass == 125){
                    System.out.println("====================================");
                    System.out.println("------ Welcome to Bank Qwerty ------");
                    System.out.println("====================================");
                    System.out.println("1. Withdraw");
                    System.out.println("2. Top up");
                    System.out.println("3. Transfer");
                    System.out.println("4. Payment");
                    System.out.println("5. Cash Deposit");
                    System.out.println("6. Balance Info");
                    System.out.println("7. Bill");
        }
        else if (u.equals("Baihaqi") && pass == 126){

                    System.out.println("====================================");
                    System.out.println("------ Welcome to Bank Qwerty ------");
                    System.out.println("====================================");
                    System.out.println("1. Withdraw");
                    System.out.println("2. Top up");
                    System.out.println("3. Transfer");
                    System.out.println("4. Payment");
                    System.out.println("5. Cash Deposit");
                    System.out.println("6. Balance Info");
                    System.out.println("7. Bill");
        }
        else
            System.out.println("Wrong");
        

        }   

 }

