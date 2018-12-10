/**
Name:Tsahai Corbie
 
*/
class Die
{
   private final int MAX = 6;  // maximum face value

   private int diefaceValue;  // current value showing o
   //  The constructor which Sets the initial face value.
   public Die()
   {
      diefaceValue = 1;
   }

   public Die(int value)
   {
      diefaceValue = value;
   }
   //  Returns the result after rolling the die.
   public int roll()
   {
      diefaceValue = (int)(Math.random() * MAX) + 1;

      return diefaceValue;
   }

   public void setdieFaceValue (int value)
   {
      diefaceValue = value;
   }

   public int getdieFaceValue()
   {
      return diefaceValue;
   }
// Then returns a string representation of this die. 
       public String toString() 
      { 
             String result = Integer.toString(diefaceValue); 
             return result; 
        } 

}

public class Dice
{

   //  Creates 2 Die objects and rolls them numurous times.
   public static void main (String[] args)
   {
      Die die1, die2, die3;
      int sum;

      die1 = new Die();
      die2 = new Die();

      die1.roll();
      die2.roll();
      System.out.println ("Die One: " + die1 + ", Die Two: " + die2);


      int x = die1.roll();


      System.out.println("Die 1 " + die1.roll());

      die2.setdieFaceValue(4);
      System.out.println ("Die One: " + die1 + ", Die Two: " + die2);

      sum = die1.getdieFaceValue() + die2.getdieFaceValue();
      System.out.println ("Sum: " + sum);

      sum = die1.roll() + die2.roll();
      System.out.println ("Die One: " + die1 + ", Die Two: " + die2);
      System.out.println ("New sum: " + sum);

      die3 = new Die(4);
      System.out.println("Die Three: " + die3.getdieFaceValue());
  
      die3 = die2;
      System.out.println("Die Three: " + die3.getdieFaceValue());



   }
}

