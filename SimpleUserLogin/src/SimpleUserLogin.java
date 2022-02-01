import java.util.Scanner;
public class SimpleUserLogin {
    public static void main(String[] args) {

        String userName, password;
        int select;


        Scanner inp = new Scanner(System.in);

        System.out.print("Your Username : ");
        userName = inp.nextLine();

        System.out.print("Your password : ");
        password = inp.nextLine();

        if (userName.equals("zirto") && password.equals("zirtovenus14")) {
            System.out.println("Logged in");
        } else {
            System.out.println("Your informations are wrong. Do you want to reset your password ?  ");
            System.out.println("If you want to reset password please press '1'");
            System.out.println("If you don't want to reset password please press '2'");
            System.out.print("Your choose : ");
            select = inp.nextInt();

            switch (select) {
                case 1:
                    System.out.println("Please create new password");
                    System.out.print("Your new password : ");
                    Scanner inp1 = new Scanner(System.in);
                    password = inp1.nextLine();

                    if (password.equals("zirtovenus14")) {
                        System.out.println("Your new password can't be same ! ");
                    } else {
                        System.out.println("Your password created ! ");
                    }
                    break;
                case 2:
                    System.out.println("Please try again !");
                    break;
            }


        }
    }
}
