package email;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity = 200;
    private String alternativeEMail;
    private  int defaultPasswordLenght =10;
    private String email;
    private String companySuffix = "company.com";

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("User Created : " + this.firstName + " " + this.lastName);
        this.department = setDepartment();
        System.out.println("Department : " + this.department);

        email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
        System.out.println("Your Email Address is : " + email);

        this.password = generateRandomPassword(defaultPasswordLenght);
        System.out.println("Your Password is : " + this.password);
    }

    private String setDepartment() {
        System.out.println("Please Enter the department Code \n1 For Sale " +
                "\n2 For Development \n3 For Accounting \n4 For Others \n Enter the code only ");
        Scanner sc = new Scanner(System.in);
        int inputDepartment = sc.nextInt();

        if (inputDepartment == 1) {
            return "Sale";
        } else if (inputDepartment == 2) {
            return "Development";
        } else if (inputDepartment == 3) {
            return "Accounting";
        } else {
            return "Others";
        }
    }

    private String generateRandomPassword(int lenght) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890@!#$&";
        char[] password = new char[lenght];
        for (int i = 0; i < lenght; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    public void setMailboxCapacity(int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAlternativeEMail(String alternativeEMail) {
        this.alternativeEMail = alternativeEMail;
    }

    public String getPassword() {
        return password;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternativeEMail() {
        return alternativeEMail;
    }

    public String showInfo(){
        return "Person Full Name : " + firstName + " " + lastName + "\n"
                +"Department Name :" + department + "\n" +
                "Company EMail : " + email + "\n" +
                "MainBox Capacity : " + mailboxCapacity + "mb";
    }
}
