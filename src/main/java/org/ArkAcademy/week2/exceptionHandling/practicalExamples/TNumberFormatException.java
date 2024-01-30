package org.ArkAcademy.week2.exceptionHandling.practicalExamples;

public class TNumberFormatException {
    public static void main(String args[]) {
        try{
            int num=Integer.parseInt ("XYZ") ;
            System.out.println(num);
        }catch(NumberFormatException e){
            System.out.println("Number format exception occurred");
        }
    }
}
