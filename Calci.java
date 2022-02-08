import java.util.*;
public class Calci{
    public static long addition(long value1,long value2){
        return value1+value2;
    }
    public static long subtract(long value1,long value2){
        return value1-value2;
    }
    public static long multiply(long value1,long value2){
        return value1*value2;
    }
    public static long divison(long value1,long value2){
        return value1/value2;
    }
    public static long modulus(long value1,long value2){
        return value1%value2;
    }
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Options to Perform Calculations");
            System.out.println("Addition : 1");
            System.out.println("Subtraction : 2");
            System.out.println("multiplication : 3");
            System.out.println("Divison : 4");
            System.out.println("Modulus : 5");
            System.out.println("");
            System.out.print("Option for calculation :");
            int option=sc.nextInt();
            System.out.print("Value1 :");
            long value1=sc.nextLong();
            System.out.print("Value2 :");
            long value2=sc.nextLong();
            if(option==1){
                System.out.println("Addition of "+value1+" and "+value2+" is :"+addition(value1,value2));
            }else if(option==2){
                System.out.println("Subtraction of "+value1+" and "+value2+" is :"+subtract(value1,value2));
            }else if(option==3){
                System.out.println("Multiplication of "+value1+" and "+value2+" is :"+multiply(value1,value2));
            }else if(option==4){
                System.out.println("Divison of "+value1+" and "+value2+" is :"+divison(value1,value2));
            }else if(option==5){
                System.out.println("Modulus of "+value1+" and "+value2+" is :"+modulus(value1,value2));
            }else{
                System.out.println("Please Select A Valid Option");
            }

    }
}
