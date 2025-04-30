class SwapTwoNumbers{
  public void performSwap(String[] args)
  {
if(args.length!=2)
    {
      System.out.println("Enter 2 Command Line Arguments To Swap");
    }
    else 
    {
      int firstDigit = Integer.parseInt(args[0]);
      int secondDigit = Integer.parseInt(args[1]);
      System.out.println("Before Swaping:\nFirst Digit = " + firstDigit+  "\nSecond Digit ="+ secondDigit);
      int toStoreVariable =0;
      toStoreVariable=firstDigit;
      firstDigit=secondDigit;
      secondDigit=toStoreVariable;
      System.out.println("After Swaping:\nFirst Digit = " + firstDigit+  "\nSecond Digit ="+ secondDigit);
    }
}
}