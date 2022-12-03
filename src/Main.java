import java.util.Scanner;
public class Main {
    public static void  test()
    {
        MyAnimalShop myAnimalShop=new MyAnimalShop(1000);
        Scanner scaner=new Scanner(System.in);

        for(int i=0;i<3;i++)
        {
            System.out.println("请输入动物姓名");
            String name=scaner.next();
            System.out.println("请输入动物年龄");
            int age=scaner.nextInt();
            System.out.println("请输入动物性别");
            char sex=scaner.next().charAt(0);
            System.out.println("请输入动物价格");
            int price=scaner.nextInt();
            myAnimalShop.BuyAnimal(name,age,sex,price);
        }
        for(int i=0;i<3;i++)
        {
            System.out.println("请输入顾客姓名");
            String name1=scaner.next();//人的名字
            System.out.println("请输入顾客次数");
            int frequency=scaner.nextInt();//次数
            System.out.println("请输入顾客进入的小时时间");
            int hour=scaner.nextInt();
            System.out.println("请输入顾客进入的分钟时间");
            int minutes=scaner.nextInt();
            Animal animal;
            Customer  Cs1=new Customer(name1,frequency,hour,minutes);
            System.out.println("请输入动物姓名");
            String name2=scaner.next();//动物名字；
            System.out.println("请输入动物年龄");
            int age=scaner.nextInt();
            System.out.println("请输入动物性别");
            char sex1=scaner.next().charAt(0);
            if(name2.equals("RuralDog"))
            {
                animal=new RuralDog(age,sex1,true);
            }
            else if(name2.equals("Cat"))
            {
                animal=new Cat(age,sex1);
            }
            else
            {
                animal=new Pig(age,sex1);
            }
            System.out.println(animal.toString());
            if(hour<22&&hour>8)
                myAnimalShop.treatCustomer(Cs1,animal);
            else
            {
                break;
            }
        }
        Customer csl=new Customer("zzz",1,24,00);//输出歇业；
        myAnimalShop.outBusiness(csl);
    }
    public static void main(String[] args) {

test();
    }
}