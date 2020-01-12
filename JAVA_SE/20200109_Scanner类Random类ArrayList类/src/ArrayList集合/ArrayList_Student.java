package ArrayList集合;

import java.util.ArrayList;

//在集合中存储自定义类型
/*
自定义4个学生对象，添加到集合，并遍历。
思路：
1. 自定义Student学生类，四个部分。
2. 创建一个集合，用来存储学生对象。泛型：<Student>
3. 根据类，创建4个学生对象。
4. 将4个学生对象添加到集合中：add
5. 遍历集合：for、size、get
 */
public class ArrayList_Student {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student one = new Student("刘亦菲",21);
        Student two = new Student("张靓颖",20);
        Student three = new Student("杨颖",28);
        Student four = new Student("杨幂",29);
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);

        for (int i = 0; i < 4; i++) {
            Student stu = list.get(i);
            System.out.println("姓名：" + stu.getName() + "  年龄：" + stu.getAge());
        }
    }
}
