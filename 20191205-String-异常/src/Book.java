//练习== 和 equal的用法

public class Book implements {
    private String ISBN;
    private String title;
    private String author;
    private int price;

    @Override
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }
        if(!(obj instanceof Book)){
            return false;
        }
        Book book = (Book)obj; //向下转型
        //根据需要比较
        return
    }

    @Override
    public int compareTo(Book o){
        return this.price;
    }

}