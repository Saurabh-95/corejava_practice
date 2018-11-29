package saurabh;

public class Decimal_to_binary 
{
	public static void decToBin(int n) 
	{
        if (n > 0) 
        {
        decToBin(n / 2);
        System.out.printf("%d", n % 2);
        }
    }
	public static void main(String[] args) 
	{
		Decimal_to_binary.decToBin(5);
	}

}
