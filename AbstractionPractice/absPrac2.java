//Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and $200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', each having a method named 'getBalance'. Call this method by creating an object of each of the three classes.

package AbstractionPractice;

abstract class Bank{
    abstract void getBalance();
}

class Bank1 extends Bank{
    public void getBalance(){
        System.out.println("Balance on bank 1: $100");
    }
}
class Bank2 extends Bank{
    public void getBalance(){
        System.out.println("Balance on bank 2: $150");
    }
}
class Bank3 extends Bank{
    public void getBalance(){
        System.out.println("Balance on bank 3 : $200");
    }
}

public class absPrac2 {
    public static void main(String[] args) {
        Bank1 firstBank=new Bank1();
        Bank2 sencondBank=new Bank2();
        Bank3 thirdBank=new Bank3();
        firstBank.getBalance();
        sencondBank.getBalance();
        thirdBank.getBalance();
    }
}
