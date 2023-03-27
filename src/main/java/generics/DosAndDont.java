package generics;

class A1{}
interface B1{}
interface C1{}

class Test extends A1 implements B1, C1
{

}

class MyArray4<T extends A1 & B1 & C1>{ //you can extend as much you want but first one MUST CLASS rest can be interfaces
    T A[]=(T[])new Object[10]; //in java you can't inherit more than one class
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



public class DosAndDont {

    static  void fun(MyArray<?> obj){  //super keyword (child) for lower bounding with wild card
     obj.append(null);                              //extends keyword (parents) for Upper bounding with wild card
    }
    public static void main(String[] args) {
    MyArray<Integer> ma1=new MyArray<Integer>();
    ma1.append(10);
    fun(ma1);
    }

}
