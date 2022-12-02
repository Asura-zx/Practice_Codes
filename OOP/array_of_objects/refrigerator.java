package OOP.array_of_objects;

public class refrigerator {
    public static void main(String args[]){
    food food1=new food("pizza");
    food food2=new food("burger");
    food food3=new food("momos");
    food[] refrigerator={food1,food2,food3};
    System.out.println(refrigerator[0].name);
    System.out.println(refrigerator[1].name);
    System.console().printf(refrigerator[0].name);
    
}
}
