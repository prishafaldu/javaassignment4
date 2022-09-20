public class part3 {
public static void main(String[] args) {
try {
int a[] = new int[5];
a[5] = 30 / 0;
} 
catch (ArithmeticException e) 
{
System.out.println("Arithmetic Exception occurs");
} 
catch (ArrayIndexOutOfBoundsException e)
 {
System.out.println("ArrayIndexOutOfBounds Exceptionoccurs");
} catch (Exception e) 
{
System.out.println("Parent Exception occurs");
}
try
 {
int a[] = new int[5];
a[6] = 30;
} 
catch (ArrayIndexOutOfBoundsException e) 
{
    System.out.println("ArrayIndexOutOfBounds Exceptionoccurs");
    } 
    catch (ArithmeticException e) 
    {
System.out.println("Arithmetic Exception occurs");
} 
catch (Exception e) 
{
System.out.println("Parent Exception occurs");
}
finally {
    System.out.println("1st have both the exception but it check arithmatic 1st while 2nd have array exception"); }
}
}