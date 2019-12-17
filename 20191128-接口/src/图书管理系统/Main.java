package 图书管理系统;

import java.util.Scanner;

public class Main {
    //登录--角色
    //if(老师){展示老师的操作界面();}
    //else{展示学生的操作界面();};
    //if-else不利于系统扩展，不用此法

    //利用多态的特性
    //用户
    //1.角色
    //2.登录界面

    public static void main(String[] args) {
        //登录
        //公共部分往外提，封装的思想
        Scanner scanner = new Scanner(System.in);

        while (true) {
            User user = login();
            System.out.println("欢迎" + user.name + "光临");
            user.menu();
            System.out.println("请选择：");
            int select = scanner.nextInt();
            user.opration(select);
        }
    }

    private static User login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请填写用户名: ");
        String name = scanner.nextLine();
        System.out.println("请选择 1. 老师 2. 学生");
        int select = scanner.nextInt();
        User u;
        if (select == 1) {
            u = new TeacherUser();
        } else {
            u = new StudentsUser();
        }
        u.name = name;
        return u;
    }
}
