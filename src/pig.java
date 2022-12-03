public class pig extends Animal{
    public pig(int age1,char sex1)
    {
        name="pig";
        age=age1;
        sex=sex1;
        price=300;
    }
    public String toString()
    {
        return "name:"+name+"\n"+"age:"+age+"\n"+"sex:"+sex+"\n"+"price:"+price+"\n";
    }

}
