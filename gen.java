public class gen
{
    public static void main(String[] args)
    {
	int number[] = new int [10];

	init_num(number);
	
    }

    public static void init_num(int number[])
    {
	int	i = -1;

	while (++i < number.length)
	    number[i] = 0;
	number[1] = 6;
    }
}
