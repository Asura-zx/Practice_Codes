//program to sort using arraylist


package arraylist.arrlist2;
import java.util.ArrayList;
import java.util.Scanner;
public class arrlist2{
    public static void main(String args[]){
        ArrayList<Integer> array=new ArrayList<Integer>();//creating instance of arraylist named array
        Scanner scanner=new Scanner(System.in);//creating instance of scanner
        char c;//to take input for continuity of the loop
        
        do{
            System.out.println("please type the integer: ");
            int number=scanner.nextInt();//take number input for data
            array.add(number);//adding number to arraylist
            System.out.println("continue(y/n)?");//ask for continuity
            c=scanner.next().charAt(0);
        }while(c=='y');//run as long as user types 'y'
        
        for(int i=0;i<array.size()-1;i++){//program to sort
            for(int j=i;j<array.size();j++){
                if(array.get(i)>array.get(j)){
                    int k=array.get(i);
                    array.set(i, array.get(j));
                    array.set(j,k);
                }
            }
        }
        System.out.println(array);
        scanner.close();
    }
}