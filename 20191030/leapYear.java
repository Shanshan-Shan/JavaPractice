//判断闰年

public class leapYear
{
    public static void main(String[] args)
   {
	   int i = 0;
	   int year = Integer.parseInt(args[i]);
	   boolean isLeapYear = false;
	   if(year % 400 == 0) 
	   {
		   isLeapYear = true;  
	   }
	   else if(year % 4 == 0)
	   {
		  if(year % 100 != 0) 
		  {
			  isLeapYear = true; 
		  }
	   }
	   if(isLeapYear)
	   {
		   System.out.println(year + "是闰年");
	   }
	   else
	   {
		   System.out.println(year + "不是闰年");
	   }
   }
}