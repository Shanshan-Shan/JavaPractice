package 接口practice.接口连同抽象类;

//定义接口
public interface MyList {
    void pushFront(int element);
    void pushBack(int element);
    void insert(int index, int element);
}

//实现接口
abstract class AbstractList implements MyList{
    protected int size;

    @Override
    public void pushFront(int element){
        insert(0, element);
    }

    @Override
    public void pushBack(int element) {
        insert(size, element);
    }
}

//接口继承接口
class MyArrayList extends AbstractList {

    @Override
    public void insert(int index, int element) {

    }
}


