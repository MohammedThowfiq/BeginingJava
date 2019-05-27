package com.mohammedthowfiq.javapractice;

public class MyClass {


    public static void main(String[] args) {

        double YourBMI;




        YourBMI=BMI_CALCULATOR(60,5);
        System.out.println("Hello Mohammed You did it Successfully");

        System.out.println("Your BMI="+YourBMI);


        if(YourBMI<19.25){

            System.out.println("Under Weight");



        }

        else if(YourBMI>19.25 && YourBMI<24.50){

            System.out.println("Healthy");


        }
        else if(YourBMI>24.50){

            System.out.println("Weight");

        }

        else
        {
            System.out.println("Obesity");
        }


    }

    public static double BMI_CALCULATOR(int weight,double height)
    {

        final double conversion_value=0.3048;
        double bmi;

        height=conversion_value*height;

        bmi=weight/(height*height);
        return bmi;
    }

}
