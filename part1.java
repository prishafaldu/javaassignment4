import java.util.*;

public class part1 {  
 
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
        try  
        {  
        int data=50/0;
        }  
             
        catch(ArithmeticException e)  
        {  
                 
            System.out.println("Can't divided by zero");  
        }  
        try{
            int[] array = new int[5];  
        for(int i=0;i<6;i++)
        {
           array[i]=sc.nextInt();  
        }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println ("Array Index is Out Of Bounds\n");
        }
        try {
            System.out.println ("enter string\n");
         //String str = "my name is prisha";
            String str= sc.next();      
            System.out.print("You have entered: "+str);  
            char c = str.charAt(15);
            System.out.println(c);
        }
        catch(StringIndexOutOfBoundsException e) {
            System.out.println("\nStringIndexOutOfBoundsException\n");
        }
         try {
            String a = null; //null value
            System.out.println(a.charAt(0));
        } catch(NullPointerException e) {
            System.out.println("NullPointerException..");
        }
       
    }  
     
}  

