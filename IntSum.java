package JRays;

public class IntSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,i=100;
		for(;i<200;i++)
		{
			if(i%7==0)
			{
				sum=+i;
				System.out.print("   "+i);
			}
		}
	System.out.println("The sum is : "+ sum);

	}

}
