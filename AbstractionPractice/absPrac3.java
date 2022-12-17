/*We have to calculate the percentage of marks obtained in three subjects (each out of 100) by student A and in four subjects (each out of 100) by student B. Create an abstract class 'Marks' with an abstract method 'getPercentage'. It is inherited by two other classes 'A' and 'B' each having a method with the same name which returns the percentage of the students. The constructor of student A takes the marks in three subjects as its parameters and the marks in four subjects as its parameters for student B. Create an object for each of the two classes and print the percentage of marks for both the students.*/

package AbstractionPractice;

abstract class marks{
    abstract float getPercentage();
}
class A extends marks{
    float sub1, sub2,sub3,sum;

    A(float sub1, float sub2, float sub3){
        this.sub1=sub1;
        this.sub3=sub3;
        this.sub2=sub2;  
        this.sum=sub1+sub2+sub3;// well did'nt know how to do it easier :|
    }
    
    @Override
    float getPercentage() {
        // TODO Auto-generated method stub
        return (this.sum)/3.0f;
    }
}
class B extends marks{
    float sub1, sub2,sub3,sub4,sum;

    B(float sub1, float sub2, float sub3, float sub4){
        this.sub1=sub1;
        this.sub4=sub4;
        this.sub3=sub3;
        this.sub2=sub2;  
        this.sum=sub1+sub2+sub3+sub4;
    }
    
    @Override
    float getPercentage() {
        // TODO Auto-generated method stub
        return (this.sum)/4.0f;
    }
}
class absPrac3{
   public static void main(String[] args) {
    A claA=new A(35.f, 45.f, 55.f);
    B claB=new B(35.f, 45.f, 55.f, 66.f);
    System.out.println(" \n\n\nthe percentage for student A is "+claA.getPercentage()+"% and percentage for student B is "+claB.getPercentage()+"%");
   }
}