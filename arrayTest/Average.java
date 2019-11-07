//用户在命令行输入多个参数，返回所有参数平均值

public class Average
{
    public static void main(String[] args)
   {
	   int ret = 0;
	   for (int i = 0; i < args.length; i++) 
	   {
		   int x = Integer.parseInt(args[i]);
		   
		   ret = ret + x;
		   
	   }
	   double y= 1.0*ret / args.length;  //输出double可以×1.0，或者强制类型转换
	   System.out.println(y);
   }
}