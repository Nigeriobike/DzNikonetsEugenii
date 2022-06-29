package part3.Obj;

public class ReaderObj {
    private String pib;
    private int num , tel , ticket;

    public void takeBook(int a1){
        if ((a1+num)>5){
            ticket+=((a1+num)-5)*50;
            System.out.println("Ліміт перевищенний штраф = "+ticket+" грн \n");
        }
        System.out.println("Читач " +pib+ " взяв сьогодні "+a1+" книг.\nЗагалом читач взяв "+(a1+num)+" книг.");
        num+=a1;
    }
    public void returnBook(int a1){
        num-=a1;
        System.out.println("Читач "+pib+" повернув сьогодні "+a1+" книг. \nЗагалом в читача залишається  "+num+" .\n");
        System.out.println("Ліміт перевищенний штраф = "+ticket+" грн");

    }

    public void setPib(String pib) {
        this.pib = pib;
    }

    public String getPib() {
        return pib;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public int getTel() {
        return tel;
    }
}
