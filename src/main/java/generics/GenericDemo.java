package generics;

public class GenericDemo <T>{

    T data[]=(T[]) new Object[3];



    public static void main(String[] args) {
   /*
        Benefits of the generic is that you can have a generalized array, but while using you have to
         mention "type" as parameter
         */
        GenericDemo<String> gd= new GenericDemo();
        gd.data[0]="hi";
        gd.data[1]="bye";
        //gd.data[2]=new Integer (10);

        String str=gd.data[0];




        Object object = new String("Beauty");
      //  object=new Integer(10);  //we are getting run time error, (ClassCastException). Integer can't convert in String
        String s=(String)object;  //here we don't get error


        Object obj[]=new Object[3];

        String s1[]=new String[3];


        obj[0]="hi";
        obj[1]="bye";
        obj[2]=new Integer(10); //we get run time error (RTE)

        String str2;
        for (int i = 0; i <3; i++) {
            str2= (String) obj[i];
            System.out.println(str2);
        }

    }
}
