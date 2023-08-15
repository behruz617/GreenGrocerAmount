import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double apple = 3.14;
        double cucumber = 4.11;
        double tomato = 2.22;
        double pumpkin = 0.95;
        double eggplant = 7.00;

        System.out.println("How many kq apple : ");
        double applekq = sc.nextDouble();

        System.out.println("How many kq cucumber : ");
        double cucumberkq = sc.nextDouble();

        System.out.println("How many kq tomato : ");
        double tomatokq = sc.nextDouble();

        System.out.println("How many kq pumpkin : ");
        double pumpkinkq = sc.nextDouble();

        System.out.println("How many kq eggplant : ");
        double eggplantkq = sc.nextDouble();

        double amount = (applekq * apple) + (cucumberkq * cucumber) +
                (tomatokq * tomato) + (pumpkinkq * pumpkin) + (eggplantkq * eggplant);


//        OR
//        double amount=0;
//        amount+=(apple*applekq);
//        amount+=(cucumber*cucumberkq);
//        amount+=(tomato*tomatokq);
//        amount+=(pumpkin*pumpkinkq);
//        amount+=(eggplant*eggplantkq);


        System.out.println("Total amount " + amount + "TL");

    }

}
