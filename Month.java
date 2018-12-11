// Month.java
//Name: Tsahai Corbie
//Date: 11/30/18
public class Month

{

private int monthNumber;

  

public Month()

{

monthNumber = 1;

}

  

public Month( int num )

{

setMonthNumber(num);

}

  

public Month( String name )

{

if (name.equals("February"))

monthNumber = 2;

else if (name.equals("March"))

monthNumber = 3;

else if (name.equals("April"))

monthNumber = 4;

else if (name.equals("May"))

monthNumber = 5;

else if (name.equals("June"))

monthNumber = 6;

else if (name.equals("July"))

monthNumber = 7;

else if (name.equals("August"))

monthNumber = 8;

else if (name.equals("September"))

monthNumber = 9;

else if (name.equals("October"))

monthNumber = 10;

else if (name.equals("November"))

monthNumber = 11;

else if (name.equals("December"))

monthNumber = 12;

else

monthNumber = 1;

}

  

public void setMonthNumber(int num)

{

if (num < 1 || num > 12)

num = 1;

monthNumber = num;

}

  

public int getMonthNumber()

{

return monthNumber;

}

  

public String getMonthName()

{

switch (monthNumber)

{

case 1:

return "January";

case 2:

return "February";

case 3:

return "March";

case 4:

return "April";

case 5:

return "May";

case 6:

return "June";

case 7:

return "July";

case 8:

return "August";

case 9:

return "September";

case 10:

return "October";

case 11:

return "November";

case 12:

return "December";

}

return "";

}

  

public String toString()

{

return getMonthName();

}

  

public boolean equals(Month m)

{

return monthNumber == m.monthNumber;

}

public boolean greaterThan(Month m)

{

return monthNumber > m.monthNumber;

}

public boolean lessThan(Month m)

{

return monthNumber < m.monthNumber;

}

}

