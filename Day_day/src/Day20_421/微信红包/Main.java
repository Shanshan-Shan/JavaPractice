package Day20_421.微信红包;
import java.util.Arrays;
//如果一个数出现次数超过一半了，排序过后，必然在中间，则最后遍历整个数组查看是否符合即可；
//题中说没有金额超过总数的一半就返回0，即该金额的数目必须大于红包数的一半，不可以小于等于。
public class Main {
    public static int getValue(int[] gifts, int n) {
        Arrays.sort(gifts);
        int money = gifts[n/2];
        int count = 0;
        for (int i = 0; i < gifts.length; i++) {
            if(gifts[i] == money){
                count++;
            }
            if(count > n/2){
                return gifts[i];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] gifts = {1,2,3,2,2};
        int n = 5;
        System.out.println(getValue(gifts,n));
    }
}