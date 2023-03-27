package generics;


class Data<T>{
    private T obj;
    public void setData(T v)

    {
        obj=v;
    }

    public T getData(){
        return obj;
    }
}

public class Generic01 {
    public static void main(String[] args) {

        Data<Integer> d=new Data<>();
        d.setData(new Integer(10));

        System.out.println(d.getData());
    }
}
