//Create an abstract class 'Parent' with a method 'message'. It has two subclasses each having a method with the same name 'message' that prints "This is first subclass" and "This is second subclass" respectively. Call the methods 'message' by creating an object for each subclass.

package AbstractionPractice;

abstract class parent{
    abstract void message();
}

class firstClass extends parent{
    public void message(){
        System.out.println("this is first subclass!");
    }
}
class secondClass extends parent{
    public void message(){
        System.out.println("this is second subclass!");
    }
}

public class absPrac1 {
    public static void main(String[] args) {
        firstClass class1=new firstClass();
        secondClass class2=new secondClass();
        class1.message();
        class2.message();
    }
}
