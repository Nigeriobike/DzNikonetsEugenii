package part3.Code;

import part3.Obj.PhoneObj;

import java.util.Scanner;

public class Phone {
    public static void main(String[] args) {
        int num1;String s;double num3;
        Scanner in = new Scanner(System.in);
        Scanner iS = new Scanner(System.in);
        PhoneObj p1 = new PhoneObj();
        PhoneObj p2 = new PhoneObj();
        PhoneObj p3 = new PhoneObj();
        //menu

        for (int i = 1 ;i <=3 ;i++) {
            System.out.println("Enter number"+" "+ i + " "+"classes");
            num1 = in.nextInt();
            System.out.println("Enter model"+" "+ i + " "+"classes");
            s = iS.nextLine();
            System.out.println("Enter weight"+" "+ i + " "+"classes");
            num3 = in.nextDouble();
            if (i==1){p1.setNumber(num1);p1.setModel(s);p1.setWeight(num3);}
            if (i==1){p2.setNumber(num1);p2.setModel(s);p2.setWeight(num3);}
            if (i==1){p3.setNumber(num1);p3.setModel(s);p3.setWeight(num3);}
        }
        //receive
        p1.receiveCall();
        p2.receiveCall();
        p3.receiveCall();
    }
}
