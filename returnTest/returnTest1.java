//循环练习
//break可以结束本次循环；break标签可以结束外层循环
//contiune也可以跟标签；

public class returnTest1{
	public static void main(String[] args){
		outer:      //定义outer标签
		//外层循环
		for(int i=0; 1<5; i++){
			//内层循环
			for(int j=0; j<3; j++){
				System.out.println("i的值为："+ i + " j的值为：" + j);
				if(j==1){
					break outer;
				}
			}
		}
	}
}