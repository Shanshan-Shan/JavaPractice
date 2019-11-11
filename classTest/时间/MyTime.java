public class MyTime {
	private int hour;
	private int minute;
	private int second;

	public MyTime(int hour, int minute, int second) {
		if (hour < 0 || hour > 23) {
			System.out.println("不支持的hour");
			return;
		}
		
		if (minute < 0 || minute > 59) {
			System.out.println("不支持的minute");
			return;
		}
		
		if (second < 0 || second > 59) {
			System.out.println("不支持的second");
			return;
		}
		
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	@Override
	public String toString() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
	
	// 在当前对象上添加多少时间
	public void add(int seconds) {
		if (seconds < 0) {
			System.out.println("请使用 sub");
			return;
		}
		
		second += seconds;
		
		while (second > 60) {
			second -= 60;
			minute += 1;
			if (minute > 60) {
				hour += 1;
				minute = 1;
			}
		}
	}
	
	// 在当前对象上退后多少时间
	// 2019-11-10		退 60 天
	// 2019-11-（-50）
	// 2019-10-（-19）
	// 2019-09-11
	public void sub(int seconds) {
		day -= days;
		while (day <= 0) {
			month -= 1;
			if (month == 0) {
				year -= 1;
				month = 12;
			}
			day += getDayOfMonth(year, month);
		}
	}
	*/
	public static void main(String[] args) {
		MyTime time = new MyTime(15, 11, 30);
		System.out.println(time);
		time.add(31);		// 2020-02-07
		System.out.println(time);
		//date.sub(96);		// 2019-11-03
		//System.out.println(date);
	}
}
