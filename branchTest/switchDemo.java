//使用switch语句

public class switchDemo
{
    public static void main(String[] args)
   {
	   String s = args[0];
	   switch (s)
	   {
		   case "-encoding":
		   System.out.println("用户指定了编码方式");  //后面要有break；
		   break;
		   case "Run":
		   System.out.println("快跑");
		   break;
		   case "第一步":
		   System.out.println("运行第一步");
		   default:
		   System.out.println("我不知道你在说什么");
		   
	   }
   }
}