package org.corejava.ceptions;

import java.util.Scanner;

public class NestedManner {
    public static void main(String[] hai) {
        int proposed=0, expectedInMonths=0,monthly=0;double repay=0.0;
        Scanner scanner=new Scanner(System.in);
        try{
            proposed=Integer.parseInt(hai[0]);
            expectedInMonths=Integer.parseInt(hai[1]);
            repay=proposed+(proposed*0.075);
            System.out.println("Repayment through EMI is "+repay);
            monthly=(int)repay/expectedInMonths;
            System.out.println("Monthly ECS "+monthly);
        }
        catch (ArithmeticException am){
            am.printStackTrace();
            System.out.println("Invalid/ZERO value in Excepted EMI\nTry Once again");
            expectedInMonths=scanner.nextInt();
            monthly=(int)repay/expectedInMonths;
            System.out.println("Monthly ECS "+monthly);
        }
        catch (NumberFormatException nums){
            nums.printStackTrace();
            try{
                System.out.println("Invalid Propsed loan / month tenor");
                proposed= scanner.nextInt();
                expectedInMonths= scanner.nextInt();
                repay=proposed+(proposed*0.075);
                System.out.println("Repayment through EMI is "+repay);
                monthly=(int)repay/expectedInMonths;
                System.out.println("Monthly ECS "+monthly);
            }
            catch (ArithmeticException as){
                System.out.println(as+"\nEnter NON ZERO value to expected EMI");
                expectedInMonths=scanner.nextInt();
                monthly=(int)repay/expectedInMonths;
                System.out.println("Monthly ECS "+monthly);
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
            System.out.println("Generic Exception");
        }
    }
}
