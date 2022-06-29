package part3.Code;

import part3.Obj.ReaderObj;

import java.util.Scanner;

public class Reader {
    public static void main(String[] args) {
        ReaderObj r1 = new ReaderObj();
        Scanner in = new Scanner(System.in);
        boolean is = false;
        int i1,i2,i3;
        //menu
        System.out.println("Введіть ПІБ");
        String s = in.nextLine();
        r1.setPib(s);
        System.out.println("Введіть Телефон");
        i1 = in.nextInt();
        r1.setTel(i1);
        do {
            System.out.println("1 взяти\n2 покласти\n3 зупинити меню");
            i2 = in.nextInt();
            if(i2==1){
                i3=in.nextInt();
                r1.takeBook(i3);}
            else if (i2==2) {
                i3=in.nextInt();
                r1.returnBook(i3);}
            else if (i2==3) {is=false;}
            else {
                System.out.println("Не та степь");
            }
        }while (!is);
        r1.takeBook(6);
        r1.returnBook(3);
    }
}
