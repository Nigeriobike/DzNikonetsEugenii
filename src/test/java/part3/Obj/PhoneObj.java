package part3.Obj;

import java.security.PublicKey;

public class PhoneObj
{
    private int number;
    private String model;
    private double weight;

    public PhoneObj(int number,String model,double weight) {
        this.number=number;
        this.model=model;
        this.weight=weight;
    }
    public PhoneObj(int number,String model){
        this.number=number;
        this.model=model;
    }
    public PhoneObj() {
    }

    public int  getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number=number;
    }

    public double  getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight=weight;
    }

    public String  getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model=model;
    }
    public void  receiveCall()
    {
        System.out.println("Телефонує"+' '+getNumber());
    }
}
