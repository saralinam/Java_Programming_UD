package generics;

/*
    1. No Parameters
    2. Multiple Parameters
    3.Subtypes
    4.Bounded Types

 */

        //If we don't give the parameters it will count like object

interface A {}
class B implements A{}
class C implements A{}

class MyArray2<T extends A>{
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

class MyArray3<T extends A> extends MyArray2<T>{

}



public class BoundsAndGenerics {
    public static void main(String[] args) {

    MyArray3 <A> ma=new MyArray3<>(); //we can use string and Integer, it will except like object,
   // ma.append(93.6F);            // even we are not giving any parameters
 //   ma.append(20.5F);              //If parameters are not given it becomes object
  //  ma.append(8.6F);

    ma.display();

    }
}
