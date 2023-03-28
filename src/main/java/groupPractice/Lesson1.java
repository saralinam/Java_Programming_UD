package groupPractice;

import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {
        /*
        Ask user to their weight and height and type a program with calculates mass index
* HINT : Body Mass Index = Weight (kg) / Square of height (m)
Then give a message to user as following:
If BMI is less than 18.5 , you re weak
If BMI is between 18.5 and 25 , your weight is ideal
If BMI is between 25 and 30, you re fat
If BMI is more than or equal to 30, obese

EXAMPLE :

INPUT:
Weight : 71
Height : 1.72
OUTPUT :
         */

        Scanner input =new Scanner(System.in);
        System.out.println(" Enter your weight (kg)?");
       double weight= input.nextDouble();

        System.out.println("Enter your height (m) ?");
        double height= input.nextDouble();

   //Body Mass Index = Weight (kg) / Square of height (m)

        double bmi=weight/(height*height);
        System.out.println("bmi= " +bmi);


        /*
        If BMI is less than 18.5 , you re weak
        If BMI is between 18.5 and 25 , your weight is ideal
        If BMI is between 25 and 30, you re fat
        If BMI is more than or equal to 30, obese
         */




        if(bmi<18.5){
            System.out.println("you are weak");
        }else if(bmi>18.5 && bmi<25){
            System.out.println(" your weight is ideal");
        }else if(bmi>25 && bmi<30){
            System.out.println("you are fat ");
        }else if(bmi>=30){
            System.out.println("obese");
        }
        input.close();

    }
}
