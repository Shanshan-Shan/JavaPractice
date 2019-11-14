// 访问限定符——够用就行

public class Bike{

//定义一个自行车类
		// 属性
		private String color;			// 颜色
		private int currentSpeed;		// 当前速度
		private int maxSpeed;			// 最高速度
		
		// 构造方法
		void Bike() {
			color = "黑色";
			currentSpeed = 0;
			maxSpeed = 193;
		}
		
		void Bike(String color) {
			color = "黑色";
			currentSpeed = 0;
			maxSpeed = 193;
		}
		
		
		// 方法
		// setter
		void setColor(String color) {
			this.color = color;
		}
		
		void speedUp() {
			currentSpeed += 10;
			if (currentSpeed > maxSpeed) {
				currentSpeed = maxSpeed;
			}
		}
		
		void speedDown() {
			currentSpeed -= 10;
			if (currentSpeed < 0) {
				currentSpeed = 0;
			}
		}
		
		// getter
		String getColor() {
			return color;
		}
		
		int getCurrentSpeed() {
			return currentSpeed;
		}
		public static void main(String[] args){
				Bike b = new Bike();
				
				System.out.println(b.getColor());
				System.out.println(b.getCurrentSpeed());
				
				b.color = "黑色";
				b.currentSpeed = 0;
				b.maxSpeed = 193;		
				//b.speed(0,193);
				
			}
}

	

	