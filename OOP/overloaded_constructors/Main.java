package OOP.overloaded_constructors;

public class Main {
    public static void main(String args[]){
        pizza pizza=new pizza("thick crust","tomato","pepperoni");
        pizza pizza2=new pizza("thin crust", "chilli");
        System.out.println(pizza2.bread);
        System.out.println(pizza2.sauce);
        System.out.println(pizza.topping);

    }
    
}
