public class cat extends Animal{
    public cat(int age1,char sex1)
    {
        name="cat";
        age=age1;
        sex=sex1;
        price=200;
    }
    public String toString()
    {
        return "name:"+name+"\n"+"age:"+age+"\n"+"sex:"+sex+"\n"+"price:"+price+"\n";
    }
}
