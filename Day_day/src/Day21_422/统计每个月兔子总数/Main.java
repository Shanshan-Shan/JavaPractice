package Day21_422.统计每个月兔子总数;
import java.util.Scanner;
//每个月的兔子总数呈斐波那契数:1,1,2,3,5,8,13,21,34...(递归)
public class Main {
    public static int getTotalCount(int monthCount) {
        if(monthCount < 3){
            return 1;
        }
        return getTotalCount(monthCount-1) + getTotalCount(monthCount-2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int monthCount = in.nextInt();
            System.out.println(getTotalCount(monthCount));
        }
    }
}
