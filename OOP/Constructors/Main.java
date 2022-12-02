package OOP.Constructors;

public class Main {
    public static void main(String[] args){
        Human human1=new Human("Aayush", 20, 2000.00);
        Human human2=new Human("ricky", 25, 20000);
        System.out.println(human1.name);
        System.out.println(human2.name);
        System.out.println(human1.Salary);
        human1.eat();
        human2.eat();
        human1.walk();
    }
    
}
