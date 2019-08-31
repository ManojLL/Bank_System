import java.util.Scanner;

public class BankUser {
    public void home() {
        Scanner sc = new Scanner(System.in);
        for (int x = 0; x < 10; x++) {
            System.out.println("1. LOG IN ");
            System.out.println("2 CREATE A NEW BANK ACCOUNT");
            System.out.println("3 EXIT");
            int fInput = sc.nextInt();
            if (fInput == 1) {
                LogIn l1 = new LogIn();
                l1.ligIn();
            } else if (fInput == 2) {
                CreateAccount c1 = new CreateAccount();
                c1.cteate();
            } else if (fInput == 3) {
                System.out.println("**********GOOD BYE***********");
                break;
            } else {
                System.out.println("**PLEASE INPUT CORRECT VALUE**");
            }

        }
    }
}
