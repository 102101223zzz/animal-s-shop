import java.util.ArrayList;

public class MyAnimalShop implements AnimalShop
{
    double money;
    ArrayList<Animal> listAnimal=new ArrayList<>();
    ArrayList<Customer> listCustomer=new ArrayList<>();
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
            if(name.equals("RuralDog"))
            {

                Animal e=new RuralDog(age,sex,true);
                listAnimal.add(e);
                money-=price;
                profit-=price;
            }
            else if(name.equals("Cat"))
            {

                Animal e=new Cat(age,sex);
                listAnimal.add(e);money-=price;
                profit-=price;
            }
            else if(name.equals("Pig"))
            {
                Animal e=new Pig(age,sex);
                listAnimal.add(e);money-=price;
                profit-=price;

            }
        }

    }

    @Override
    public void treatCustomer(Customer customer,Animal animal) {
        listCustomer.add(customer);
        int sale=0;//0为未出售成功，1为出售成功；
        for (int i = 0; i < listAnimal.size(); i++) {
            if(listAnimal.get(i).name.equals(animal.name)&&listAnimal.get(i).age==animal.age&&listAnimal.get(i).sex==animal.sex)
            {
                sale=1;
                listAnimal.remove(i);
                System.out.println("出售成功！");
                profit+=animal.price;
            }
        }
        try
        {
            if(sale==0)
            {
             throw new AnimalNotFountException(animal);
            }
        }catch(AnimalNotFountException k)
            {
                 System.out.println("没有该动物\n"+k.toString());
            }
    }

    @Override
    public  boolean outBusiness(Customer customer) {
        if(customer.l1.hour>22||customer.l1.hour<8)
        {
            System.out.println("歇业");
            System.out.println("今日招待人数为:"+listCustomer.size());
            for(int i=0;i<listCustomer.size();i++)
            {
                System.out.println(listCustomer.get(i).toString());
            }
            System.out.println("今天利润为："+profit);
            return true;
        }
        else return false;
    }
}
