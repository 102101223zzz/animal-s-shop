public class ruraldog extends Animal{
    public boolean isVaccinelnjected;
    public ruraldog(int age1,char sex1,boolean isVaccinelnjected1)
    {
        name="ruraldog";
        age=age1;
        sex=sex1;
        price=100;
        isVaccinelnjected=isVaccinelnjected1;
    }
    public String toString()
    {
        return "name:"+name+"\n"+"age:"+age+"\n"+"sex:"+sex+"\n"+"price:"+price+"\n";
    }
}
