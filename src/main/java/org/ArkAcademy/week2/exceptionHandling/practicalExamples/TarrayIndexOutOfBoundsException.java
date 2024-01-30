package org.ArkAcademy.week2.exceptionHandling.practicalExamples;

public class TarrayIndexOutOfBoundsException {
    public static void main(String args[]) {
        try{
            int a[]=new int[10];
            // This will throw exception as Array has
            // only 10 elements and we are trying to access
            // 12th element.
            a[11] = 9;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println ("ArrayIndexOutOfBounds Exception occurred");
            System.out.println ("System Message: "+e);
        }
    }
}
