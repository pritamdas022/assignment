//implementation of banking details
//group member names: DEBKANTA CHAKRABORTY,SRIKANTA BISWAS,PRITAM DAS,SUBRATA MONDAL,AMIT KUMBHAKAR
import java.util.*;
class BankAccount {
    String name;
    private String accountnum;
    String ifscode;
    String BankName;

    BankAccount() {//constructor
        this.accountnum = "void";
        this.name = "void";
        this.ifscode = "void";
        this.BankName = "void";
    }

    BankAccount(String ifscode, String name, String accountnum, String BankName) {//perameterished constructor
        this.accountnum = accountnum;
        this.name = name;
        this.ifscode = ifscode;
        this.BankName = BankName;
    }

    void acchide() {
        this.accountnum = accountnum.substring(accountnum.length() - (accountnum.length() - (accountnum.length() - 4)));
    }

    void display() {//method

        System.out.println("name: " + name);
        System.out.println("Ifsccode: " + ifscode);
        System.out.println("Bank Name :" + BankName);
        System.out.print("Account number: ");

        for (int i = 0; i < (accountnum.length() - 4); i++) {
            System.out.print("X");

        }
        acchide();
        System.out.print(accountnum);

    }

}
class StateBank {
    public static void main(String... args) {
        BankAccount s = new BankAccount();
        Scanner sc = new Scanner(System.in);
        BankAccount s1 = new BankAccount("SBIN0001111", "SRIKANTA BISWAS", "4076145986", "State Bank of India");
        System.out.println("1.press 1 to display the account details :");
        int a = sc.nextInt();
        switch (a){
            case 1 :
                s1.display();
                System.out.println();
                System.out.println("Thank you for checaking thr details !!");
                break;
            default:
                System.out.println("Invalid credentials!");
        }


    }}