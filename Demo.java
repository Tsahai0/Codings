 //Name: Tsahai Corbie
//Date: 12/10/18
//Write a class named Month. The class should have an int field named monthNumber that holds the number of the month.
class Month
{
   private int monthNumber;
//In addition, provide the following methods:
//A no-arg constructor that sets the monthNumber to 1.
   public Month()
   {
      monthNumber = 1;
   }
// A constructor that accepts the number of the month as an argument. It would set the monthNumber field to the value passed as the argument.
//If a value less that 1 or greater than 12 is passed, the constructor should set monthNumber to 1.
   public Month(int num)
   {
      setMonthNumber(num);
   }
// A constructor that accepts the name of the month, case insensitive, such as "January" or "february" as argument.
// It should set the monthNumber field to the correct corresponding value.
   public Month(String str)
   {
      if(str.equalsIgnoreCase("January")) monthNumber = 1;
      else if(str.equalsIgnoreCase("February")) monthNumber = 2;
      else if(str.equalsIgnoreCase("March")) monthNumber = 3;
      else if(str.equalsIgnoreCase("April")) monthNumber = 4;
      else if(str.equalsIgnoreCase("May")) monthNumber = 5;
      else if(str.equalsIgnoreCase("June")) monthNumber = 6;
      else if(str.equalsIgnoreCase("July")) monthNumber = 7;
      else if(str.equalsIgnoreCase("August")) monthNumber = 8;
      else if(str.equalsIgnoreCase("September")) monthNumber = 9;
      else if(str.equalsIgnoreCase("October")) monthNumber = 10;
      else if(str.equalsIgnoreCase("November")) monthNumber = 11;
      else if(str.equalsIgnoreCase("December")) monthNumber = 12;
      else monthNumber = 1;
   }
// * A setMonthNumber method that accepts an int argument, which is assigned to the monthNumber field. If a value less than 1 or
// greater than 12 is passed, the method should set monthNumber to 1.
   public void setMonthNumber(int num)
   {
      if(num < 1 || num > 12)
         monthNumber = 1;
      else
         monthNumber = num;
   }
//* A getMonthNumber method that returns the value in the monthNumber field.
   public int getMonthNumber()
   {
      return monthNumber;
   }
// * A getMonthName method that returns the name of the month. For example, if the monthNumber field contains 1, then this method should return
// "January" (First letter capitalized and the rest lower-case).
   public String getMonthName()
   {
      String[] array = new String[]{"January","February","March","April","May","June","July","August","September","October","November","December"};
      return array[monthNumber-1];
   }
//* A toString method that returns the same value as the getMonthName method.
   public String toString()
   {
      return getMonthName();
   }
// * An equals method that accepts a Month object as an argument. If the argument object holds the same data as the calling object, this method
// should return true. Otherwise, it should return false.
   public boolean equals(Month M)
   {
      return (monthNumber == M.monthNumber);
   }
// * A greaterThan method that accepts a Month object as an argument. If the calling object's monthNumber field is greater than the argument's
// monthNumber field, this method should return true. Otherwise, it should return false.
   public boolean greaterThan(Month M)
   {
      return (monthNumber > M.monthNumber);
   }
// * A lessThan method that accepts a Month object as an argument. If the calling object's monthNumber field is less than the argument's monthNumber field,
// this method should return true. Otherwise, it should return false.
   public boolean lessThan(Month M)
   {
      return (monthNumber < M.monthNumber);
   }
}

public class Demo
{
   public static void main(String[] args)
   {
      Month M = new Month(3);
      System.out.println(M);
      Month M1 = new Month("April");
      System.out.println(M1);
      System.out.println("are M and M1 are same ? " + (M.equals(M1)?"Yes":"No"));
      System.out.println("are M is greater than M1 ? " + (M.greaterThan(M1)?"Yes":"No"));
      System.out.println("are M is less than M1 ? " + (M.lessThan(M1)?"Yes":"No"));
   }
}