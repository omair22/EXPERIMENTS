class exp23{
public static void main(String args[]){
	int NumberOfTerms=Integer.parseInt(args[0]);
	int term1=0;
	int term2=1;
	int term3;
	for(int i=1;i<NumberOfTerms;i++)
	{
		if(i==1)
		{
			System.out.println(term1);
		}
		if(i==2)
		{
			System.out.println(term2);
		}
		else
		{
			term3=term1+term2;
			System.out.println(term3);
			term1=term2;
			term2=term3;
		}
	}		
}
}