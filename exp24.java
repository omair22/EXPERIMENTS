class exp24{
public static void main(String args[]){
	double num1=Double.parseDouble(args[0]);
	double num2=Double.parseDouble(args[2]);
	String symbol=args[1];
	double Result;
	if(symbol.equals("+"))
	{
		Result=num1+num2;
		System.out.println(Result);
	}
	if(symbol.equals("-"))
	{
		Result=num1-num2;
		System.out.println(Result);
	}
	if(symbol.equals("/"))
	{
		Result=num1/num2;
		System.out.printf("%.2f",Result);
	}
	if(symbol.equals("*"))
	{
		Result=num1*num2;
		System.out.println(Result);
	}
	
}
}