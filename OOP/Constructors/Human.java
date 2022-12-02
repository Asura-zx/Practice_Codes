package OOP.Constructors;

public class Human {
String name;
int age;
double Salary;

Human(String name,int age, double Salary){
    this.name=name;//'this' represents Human class. so parameter 'name' is assigned to the variable name of Human class not human function
    this.age=age;
    this.Salary=Salary;
}

void walk(){
    System.out.println("the human : "+this.name+" has walked !");
}
void eat(){
    System.out.println("the human : "+this.name+" has eaten");
}
}
