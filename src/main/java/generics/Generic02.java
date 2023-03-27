package generics;

@SuppressWarnings("unchecked")

class MyArray<T>{
    T A[]=(T[])new Object[10];
    int length=0;

    public void append(T v){

        A[length++]=v;

    }

    public void display(){
        for(int i=0; i<length; i++){
            System.out.println(A[i]);
        }
    }
}



public class Generic02 {
    public static void main(String[] args) {
    MyArray<Integer>ma=new MyArray<>();
    ma.append(10);
    ma.append(20);
    ma.append(30);

    ma.display();


        MyArray<String>ma1=new MyArray<>();
        ma1.append("Beauty");
        ma1.append("and");
        ma1.append("Beast");

        ma1.display();
    }
}
