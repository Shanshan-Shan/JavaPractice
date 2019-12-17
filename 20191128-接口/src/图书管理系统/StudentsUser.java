package 图书管理系统;

public class StudentsUser extends User{

    @Override
    public void menu() {
        System.out.println("1. 借书");
        System.out.println("2. 还书");

    }

    @Override
    public void opration(int select) {
        switch (select) {
            case 1:
                borrowBook();
                break;
            case 2:
                returnBook();
                break;
        }

    }
    private void returnBook() {
    }

    private void borrowBook() {
    }

}
