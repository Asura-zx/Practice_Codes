//CReating methods
package OOP.Basics;
public class oop{
    public static void main(String args[]){
        car car1=new car();
        System.out.println("LEts check the drive...");
        System.out.println("What is the make of car?: "+car1.make);
        System.out.println("Then the specifications are?:");
        System.out.println("Color\t: "+car1.color);
        System.out.println("Series\t: "+car1.Series);
        System.out.println("Available\t: "+car1.available);
        System.out.println("Price\t: "+car1.price+" USD");
        System.out.println("\n\nOK lets drive..\n\n");
        car1.drive();
        System.out.println("\n\nwait wait wait!...Stop\n\n");
        car1.brake();
    }
}



