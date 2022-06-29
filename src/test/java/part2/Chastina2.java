package part2;

import java.util.Scanner;

public class Chastina2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean b = true;
        ClassObj r1 = new ClassObj(b);
        char a1[] = {'а', 'я', 'о', 'у', 'ю', 'е', 'є', 'и', 'і', 'ї'};
        char a2[] = {'б', 'в', 'г', 'д', 'ж', 'з', 'й', 'к', 'л', 'м', 'н', 'р', 'с', 'т', 'ф', 'х', 'ц', 'ч', 'ш', 'щ','п'};
        char a3[] = {' '};
        //menu
            System.out.println("Слава Україні , введи строку козаче");
            String s = in.nextLine();
            System.out.println("Видалити : \n1 голосні \n2 приголосні \n3 пробіли");
            int var = in.nextInt();
            //
            switch (var) {
                case 1 : r1.miss(s,a1);break;
                case 2 : r1.miss(s,a2);break;
                case 3 : r1.miss(s,a3);break;
            }
        //


    }

}
