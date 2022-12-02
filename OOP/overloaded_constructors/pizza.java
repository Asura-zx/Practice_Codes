package OOP.overloaded_constructors;

public class pizza {
    String bread;
    String sauce;
    String topping;
        
    pizza(  String bread,String sauce,String topping){
        this.bread=bread;
        this.sauce=sauce;
        this.topping=topping;
    }
    pizza(String bread,String sauce){
        this.bread=bread;
        this.sauce=sauce;
    }
}
