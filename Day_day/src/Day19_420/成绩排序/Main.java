package Day19_420.成绩排序;
import java.util.Scanner;

class Student{
    String name;
    int score;
    public void setName(String name) {
        this.name = name;
    }
    public void setScore(int score) {
        this.score = score;
    }
    @Override
    public String toString(){
        return name + " " + score;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt(); //num--人数
        int sort = in.nextInt();//sort--排序方式（0==降序）
        if(num == 0){
            return;
        }else{
            Student[] stu = new Student[100];
            for (int i = 0; i < num; i++) {
                String name = in.next();
                int score = in.nextInt();
                stu[i].setName(name);
                stu[i].setScore(score);
            }
            Student tmp = new Student();
            if(sort == 1){ //升序排列
                for (int i = 1; i < num; i++) {
                    for (int j = 1; j < num-i; j++) {
                        if(stu[j].score > stu[j+1].score){
                            tmp = stu[j];
                            stu[j] = stu[j+1];
                            stu[j+1] = tmp;
                        }
                    }
                }
            }else{
                for (int i = 1; i < num; i++) {
                    for (int j = 1; j < num-i; j++) {
                        if(stu[j].score < stu[j+1].score){
                            tmp = stu[j];
                            stu[j] = stu[j+1];
                            stu[j+1] = tmp;
                        }
                    }
                }
            }
            for (int i = 0; i < num; i++) {
                System.out.println(stu[i].name + " " + stu[i].score);
            }
        }
    }
}
