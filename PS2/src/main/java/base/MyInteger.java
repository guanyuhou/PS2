package base;

import java.lang.Math;

public class MyInteger {
	
	//create a integer data field
	private int iValue;
	
	//define a constructor method
	public MyInteger(int number)
	{
		iValue = number;
	}
	
	//getter and setter
	public int get_iValue()
	{
		return iValue;
	}
	
	public void set_iValue(int new_iValue)
	{
		iValue = new_iValue;
	}
	
	//create methods for iValue
	public boolean isEven()
	{
		//return true if iValue is even
		if ((iValue % 2) == 0)
			return true;
		return false;
	}
	
	public boolean isOdd()
	{
		//return true if iValue is odd
		if ((iValue % 2) != 0)
			return true;
		return false;
	}
	
	public boolean isPrime()
	{
		//return true if iValue is prime
		if (iValue <= 0)
			return false;
		double i_sqrt = Math.sqrt(iValue);
		for (double i = 2.0; i <= i_sqrt; i++)
		{
			if (iValue / i == 0)
			return false;
		}
		return true;
	}
	
	//create the the methods for a specified value
	public static boolean isEven(int number)
	{
		//return true if the specified value is even
		if ((number % 2) == 0)
			return true;
		return false;
	}
	
	public static boolean isOdd(int number)
	{
		//return true if the specified value is odd
		if ((number % 2) != 0)
			return true;
		return false;
	}
	
	public static boolean isPrime(int number)
	{
		//return true if the specified value is prime
		if (number <= 0)
			return false;
		double i_sqrt = Math.sqrt(number);
		for (double i = 2.0; i <= i_sqrt; i++)
		{
			if (number / i == 0)
			return false;
		}
		return true;
	}
	
	//create methods for MyInteger type
	public static boolean isEven(MyInteger number)
	{
		return number.isEven();
	}
	
	public static boolean isOdd(MyInteger number)
	{
		return number.isOdd();
	}
	
	public static boolean isPrime(MyInteger number)
	{
		return number.isPrime();
	}
	
	//methods return true if values equal
	public boolean equals(int number)
	{
		if (iValue == number)
			return true;
		return false;
	}
	
	public boolean equals(MyInteger number)
	{
		return number.equals(iValue);
	}
}
