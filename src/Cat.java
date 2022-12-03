public class Cat extends Animal{
    public Cat(int age1,char sex1)
    {
        name="Cat";
        age=age1;
        sex=sex1;
        price=200;
    }
    public String toString()
    {
        return "name:"+name+"\n"+"age:"+age+"\n"+"sex:"+sex+"\n"+"price:"+price+"\n";
    }
}
