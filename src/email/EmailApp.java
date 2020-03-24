package email;

import java.util.Scanner;

public class EmailApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your First Name : ");
        String firstname = sc.nextLine();
        System.out.println("Please Enter your Last Name : ");
        String lastname = sc.nextLine();
      Email email1 =  new Email(firstname, lastname);

      int mail = email1.getMailboxCapacity();
      String email = email1.getAlternativeEMail();
      String password = email1.getPassword();

      email1.setMailboxCapacity(mail);
      email1.setAlternativeEMail(email);
      email1.setPassword(password);

        System.out.println(email1.showInfo());
    }
}
