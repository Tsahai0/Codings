//LandTract.java
//Name: Tsahai Corbie
//Date: 12/10/18
public class LandTract

{

   private double length;

   private double width;

  

   public LandTract()
   
   {
   
      length = 0;
   
      width = 0;
   
   }

  

   public LandTract(double len, double wid)
   
   {
   
      setLength(len);
   
      setWidth(wid);
   
   }

  

   public double area()
   
   {
   
      return length * width;
   
   }

  

   public String toString()
   
   {
   
      return "Length: " + length + " Width: " + width;
   
   }

   public boolean equals(LandTract l)
   
   {
   
      return area() == l.area();
   
   }

   public double getLength()
   
   {
   
      return length;
   
   }

   public void setLength(double len)
   
   {
   
      if (len < 0)
      
         len = 0;
   
      this.length = len;
   
   }

   public double getWidth()
   
   {
   
      return width;
   
   }

   public void setWidth(double wid)
   
   {
   
      if (wid < 0)
      
         wid = 0;
   
      this.width = wid;
   
   }

  

}

