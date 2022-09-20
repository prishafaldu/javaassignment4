class part2
{
  static void check() throws ArithmeticException
  {  
    System.out.println("my name is prisha");
    throw new ArithmeticException("hi");
  }

  public static void main(String args[])
  //here we know that check function is going to throw arithmatic exception so we handle it earliar by throws
  { 
    try
    {
      check();
    }
    catch(ArithmeticException e)
    {
        System.out.println("hello");
    //   System.out.println("hello" +e);
    //   throw e;
    }
  }
}

