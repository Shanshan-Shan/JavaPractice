//This关键字的用法
//this关键字最大的用处就是让类中的一个方法，访问该类里的另一个方法或者实例变量

public class ThisTest {
	public void jump() {
		System.out.println("正在执行jump方法");
	}
	
	public static void main(String[] args) {
		ThisTest test = new ThisTest();  //main方法是静态方法；jump是非静态方法
		test.jump();                     //main方法是属于类的方法，jump是属于对象的方法
		                                 //在静态方法中访问另外一个普通方法，只能重新创建一个对象
		System.out.println("正在执行run方法");
	}
	
}