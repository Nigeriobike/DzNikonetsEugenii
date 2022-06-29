package part3.Obj;

public class PersonObj {
    String fullName;
    int age;

    public PersonObj()
    {

    }
    public PersonObj(String fullName, int age)
    {
        this.age=age;
        this.fullName=fullName;
    }
    public void move()
    {
        System.out.println("Person moving");
    }
    public void talk()
    {
        System.out.println("Person talking");
    }
}
