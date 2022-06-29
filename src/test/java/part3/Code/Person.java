package part3.Code;

import part3.Obj.PersonObj;

public class Person {

    public Person(String s1, int age) {

    }

    public static void main(String[] args) {
        String s1 = "billy herirngton";
        int age = 48;
        PersonObj p1 = new PersonObj();
        PersonObj p2 = new PersonObj(s1,age);
        p1.move();
        p2.talk();
    }
}
