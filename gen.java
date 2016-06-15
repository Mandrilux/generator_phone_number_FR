public class gen
{
    public static void main(String[] args)
    {
	long	number = -1;
	int	flag = 6;
	while (flag < 8)
	    {
		while (++number <= 99999999)
		    display_num(number, flag);
		number = -1;
		flag++;
	    }
    }
   
    public static void display_num(long num, int flag)
    {
	int	len = String.valueOf(num).length();
	
	System.out.print("0"+flag);
	while (len < 8)
	    {
		System.out.print("0");
		len++;
	    }
	System.out.println(num);
    }
}
