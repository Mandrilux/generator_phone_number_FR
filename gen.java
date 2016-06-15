public class gen
{
    public static void main(String[] args)
    {
	int	number[] = new int [10];
	int	i, z;
	
	init_num(number);
	i = number.length;
	while (i-- > 2)
	    {
		z = -1;
		while (++z < 9)
		    {
			number[i] += 1;
			display_num(number);
		    }
		number[i] = 0;
	    }
	
	
    }

    public static void init_num(int number[])
    {
	int	i = -1;

	while (++i < number.length)
	    number[i] = 0;
	number[1] = 6;
    }

    public static void display_num(int number[])
    {
	int	i = -1;

	while (++i < number.length)
	    System.out.print(number[i]);
	System.out.println("");
	
    }
}
