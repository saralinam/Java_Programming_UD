package generics;

class M{}
class L extends M{}
class K extends L{}
public class WildCard {

    static void fun(MyArray <? super L> obj) //You can write nothing after MyArray or "?", because it is anonymous(you don't have to specify data type)
    {                               // "?" unbounded wild card as good as generics definition
        obj.display();              //if we use "extends"  it means "Upper bounded", if we use "super" in means "lower bounded"


    }
    public static void main(String[] args) {
      MyArray<L> ma1=new MyArray<>();


        MyArray<M> ma2=new MyArray<>();


        fun(ma1);
        fun(ma2);


    }
}
