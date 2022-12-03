public abstract class  Animal {
    protected   String name;
    protected int age;
    protected char sex;
    protected  double price;
    public Animal(String name1,int age1,char sex1,double price1)
    {
        name=name1;
        age=age1;
        sex1=sex;
        price=price1;
    }
    public Animal()
    {

    }

    public abstract String toString();
}
