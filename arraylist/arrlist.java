/*Program that creates a number of blocks that the user inputs.
 * Each block has 3 factors that are either true or false.
 */
package arraylist;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
public class arrlist{
    public static void main(String args[]) {
        Random random=new Random();
        Scanner scanner=new Scanner(System.in);

        Boolean[] block=new Boolean[3];
        ArrayList<String> blocks=new ArrayList<String>();

        System.out.println("type the number of blocks: ");
        int numOfBlocks=scanner.nextInt();
        for(int i=0;i<numOfBlocks;i++){
            for(int j=0;j<3;j++){
                int k=random.nextInt(2)+1;
                if(k==1) block[j]=true;
                else block[j]=false;

            }
            blocks.add(Arrays.toString(block));
        }
        System.out.println(blocks);
        scanner.close();
    }

}