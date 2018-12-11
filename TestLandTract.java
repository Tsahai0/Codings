//TestLandTract.java
//Name: Tsahai Corbie
//Date: 12/10/18
import java.util.Scanner;

public class TestLandTract

{

public static void main(String[] args)

{

Scanner scan = new Scanner(System.in);

System.out.print("Enter length for land tract 1: ");

double length = scan.nextDouble();

System.out.print("Enter width for land tract 1: ");

double width = scan.nextDouble();

LandTract land1 = new LandTract(length, width);

  

System.out.print("Enter length for land tract 2: ");

length = scan.nextDouble();

System.out.print("Enter width for land tract 2: ");

width = scan.nextDouble();

LandTract land2 = new LandTract(length, width);

  

System.out.println("Area of land1: " + land1.area());

System.out.println("Area of land2: " + land2.area());

if (land1.equals(land2))

System.out.println("They are of equal size.");

else

System.out.println("They are NOT of equal size.");

}

}