/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loops;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        //for ,while,do-while,for-each

//        System.out.println("number "+num);
//        System.out.println("number "+num);
//        System.out.println("number "+num);
//        System.out.println("number "+num);
        //syntax of for
        //for( initialization; condition;inc/dec )1234{
        //code
        //}
        int c = 10;
        //int a=c++;
        //iterations
        for (int a = 1; a < 6; a++) {//1,2,3,4,5

            System.out.println("hello");
        }

        for (int a = 1; a < 5; ++a) {
            System.out.println("abc");
        }
        int b;
        for (b = 1; b < 5; b++) {

            System.out.println("Iteration  " + b);//2 3 4
        }
        //Output
        //2*1=2
        //2*2=4
        //int a=1;  
        //int num=5;
//            for (int i = 1; i <=6; i++) {
//            System.out.println(num+" * "+i+" = "+(num*i));
//            //a++;
//        }
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number ");
        int num = scan.nextInt();

        System.out.println("Enter 2nd number");
        int num2 = scan.nextInt();//6

        for (int i = 1; i <= num2; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
        //alt+shift+f        
        // System.out.println("a "+a);

        //Output
//        1
//        2
//        3
//        4
//        5
        System.out.println("ENter 10 numbers :");
        int num3;
//        for (int i = 1; i <= 10; i++) {
//
//            num3 = scan.nextInt();
//          
//        }
//1+2+3+4+5+6+7+8+9+10=
//sum=50
//1+2=3+3=6+4=10+5=15......
        int sum=0;
        for (int i = 1; i <= 10; i++) {
           
            System.out.println(i);//1 2
            //sum=sum+i;//a=0,sum=6,i=4
            sum += i;

        }
        
      //4+2=6+3  =9+2
        int num4,sum1=0;
        System.out.println("Enter any 10 Numbers");
        for (int i = 1; i <= 5; i++) {
            num4=scan.nextInt();
            sum1=sum1+num4;
          
        }
        System.out.println("sum "+sum1);

      
        for(int i=10 ; i>=1; i--){
            System.out.println("value "+i);
        }
//         
//         sum=sum-i;
//         sum-=i;
//         
//         sum=sum*i;
//         sum*=i;
//         
//         sum=sum/i;
//         sum/=i;
        
    }

}
