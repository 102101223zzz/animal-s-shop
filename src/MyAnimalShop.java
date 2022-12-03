import java.util.ArrayList;

public class MyAnimalShop implements AnimalShop
{
    double money;
    ArrayList<Animal> l1=new ArrayList<>();
    ArrayList<Customer> Cs=new ArrayList<>();
    double profit;
    public MyAnimalShop(double a)
    {
        money=a;
        profit=0;
    }

    @Override
    public void BuyAnimal(String name, int age, char sex, int price) {

        if (money < price) {
            try {

                throw new InsufficeintBalanceException(price);
            }
        catch(InsufficeintBalanceException e)
        {
            System.out.println("余额不足");
        }
    }
    else
        {
            if(name.equals("ruraldog"))
            {

                Animal e=new ruraldog(age,sex,true);
                l1.add(e);
                money-=price;
                profit-=price;
            }
            else if(name.equals("cat"))
            {

                Animal e=new cat(age,sex);
                l1.add(e);money-=price;
                profit-=price;
            }
            else if(name.equals("pig"))
            {
                Animal e=new pig(age,sex);
                l1.add(e);money-=price;
                profit-=price;

            }
        }

    }

    @Override
    public void treatCustomer(Customer cs1,Animal e1) {
        Cs.add(cs1);
        int sale=0;//0为未出售成功，1为出售成功；
        for (int i = 0; i < l1.size(); i++) {
            if(l1.get(i).name.equals(e1.name)&&l1.get(i).age==e1.age&&l1.get(i).sex==e1.sex)
            {
                sale=1;
                l1.remove(i);
                System.out.println("出售成功！");
                profit+=e1.price;
            }
        }
        try
        {
            if(sale==0)
            {
             throw new AnimalNotFountException(e1);
            }
        }catch(AnimalNotFountException k)
            {
                 System.out.println("没有该动物\n"+k.toString());
            }
    }

    @Override
    public  boolean outBusiness(Customer e) {
        if(e.l1.hour>22||e.l1.hour<8)
        {
            System.out.println("歇业");
            System.out.println("今日招待人数为:"+Cs.size());
            for(int i=0;i<Cs.size();i++)
            {
                System.out.println(Cs.get(i).toString());
            }
            System.out.println("今天利润为："+profit);
            return true;
        }
        else return false;
    }
}
