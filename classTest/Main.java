//创建一个类
class Person{
	//定义类的属性
	String name;
	int age;
	
	//定义类的方法（普通方法）
	public void sayHello(String arr){
		System.out.println(name + " say hello to " + arr);
	}
	
}

public class Main{
	public static void main(String[] args){
		Person p = new Person();
		
		p.name = "HSS";
		p.age = 18;
		
		p.sayHello("LYS");
		
	}
	
}