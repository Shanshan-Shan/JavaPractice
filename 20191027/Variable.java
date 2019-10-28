public class Variable
{
    public static void main(String[] args)
   {
   /*String action = "你好";
	String target = "世界";
	String message = action + target;  
	java里面String可以拼接起来，用+ 
	字符串相加，必须是字符串开头

	System.out.println(args[0]);
	System.out.println(args[1]);
	System.out.println(args[2]);
	*/
	if (args.length <2)
	{
		System.out.println("请输入两个数字");
		return;	
	}
	 
	int x = Integer.parseInt(args[0]);
	int y = Integer.parseInt(args[1]);
	int ret = x + y;
	
	System.out.println("" + x + " + " + y + " 相加的结果是 "+ ret);
	
	/*
	    String s = "12345";
		System.out.println(Integer.parseInt(s));
		System.out.println(Long.parseLong(s));
		System.out.println(Double.parseDouble(s));
		System.out.println("===================");
		int x = 38;
		long y = 39L;
		double z = 3.1415;
		System.out.println(String.valueOf(x));
		System.out.println(String.valueOf(y));
		System.out.println(String.valueOf(z));
	*/
   }
}