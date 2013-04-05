package utility;

class q1Reverse
{
	int num,r=0,s=0;
	q1Reverse(int n)
	{
		num = n;
	}
	void Reverse()
	{
		while(num>0)
		{
			r=num%10;
			s=(s*10)+r;
			num=num/10;
		}
		System.out.println("Reverse of number ="+s);
	}
	public static void main(String args[])
	{
		q1Reverse r1 = new q1Reverse(112345);
		r1.Reverse();
	}
}