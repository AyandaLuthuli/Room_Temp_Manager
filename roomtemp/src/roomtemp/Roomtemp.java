
package roomtemp;
import java.util.Scanner ;

public class Roomtemp {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("what will your T1 temp be ?");
        int t1 =scanner.nextInt();
        
                System.out.println("what will your T2 temp be ?");
        int t2=scanner.nextInt();
        
                System.out.println("what is the current room TEMP?");
            int current=scanner.nextInt();
        
        
            
          if (current<t1) {
             int dif=t1-current;
             
              System.out.println("INCREASE THE TEMP BY " + " "+ dif);
           
        }
         if (current>t2) {
             int diff=t2-current;
             System.out.println("DECREASE THE TEMP BY " + " "+ diff);
            
        }
 
    }
    
}
