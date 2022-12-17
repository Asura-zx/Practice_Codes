//Create an abstract class 'Animals' with two abstract methods 'cats' and 'dogs'. Now create a class 'Cats' with a method 'cats' which prints "Cats meow" and a class 'Dogs' with a method 'dogs' which prints "Dogs bark", both inheriting the class 'Animals'. Now create an object for each of the subclasses and call their respective methods.
package AbstractionPractice;

 abstract class Animals{
    abstract void cats();
    abstract void dogs();

 }

 class Cats extends Animals{
    void dogs(){};//because it showed the error, "The type Cats must implement the inherited abstract method Animals.dogs()". 
    void cats(){
        System.out.println("Cats meow");
    }
 }
 class Dogs extends Animals{
    void cats(){};//same as above
    void dogs(){
        System.out.println("Dogs bark");
    }
 }
public class absPrac5 {
    public static void main(String[] args) {
        Cats cat1=new Cats();
        Dogs dog1=new Dogs();
        cat1.cats();
        dog1.dogs();
    }
}
