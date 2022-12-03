import java.util.Scanner;
public class Main {
    public static void  test()
    {
        MyAnimalShop MS=new MyAnimalShop(1000);
        Scanner S1=new Scanner(System.in);

        for(int i=0;i<3;i++)
        {
            System.out.println("请输入动物姓名");
            String name=S1.next();
            System.out.println("请输入动物年龄");
            int age=S1.nextInt();
            System.out.println("请输入动物性别");
            char sex=S1.next().charAt(0);
            System.out.println("请输入动物价格");
            int price=S1.nextInt();
            MS.BuyAnimal(name,age,sex,price);
        }
        for(int i=0;i<3;i++)
        {
            System.out.println("请输入顾客姓名");
            String name1=S1.next();//人的名字
            System.out.println("请输入顾客次数");
            int frequency=S1.nextInt();//次数
            System.out.println("请输入顾客进入的小时");
            int hour=S1.nextInt();
            System.out.println("请输入顾客进入的分钟");
            int minutes=S1.nextInt();
            Animal e;
            Customer  Cs1=new Customer(name1,frequency,hour,minutes);
            System.out.println("请输入动物姓名");
            String name2=S1.next();//动物名字；
            System.out.println("请输入动物年龄");
            int age=S1.nextInt();
            System.out.println("请输入动物性别");
            char sex1=S1.next().charAt(0);
            if(name2.equals("ruraldog"))
            {
                 e=new ruraldog(age,sex1,true);
            }
            else if(name2.equals("cat"))
            {
                 e=new cat(age,sex1);
            }
            else
            {
                e=new pig(age,sex1);
            }
            System.out.println(e.toString());
            if(hour<22&&hour>8)
            MS.treatCustomer(Cs1,e);
            else
            {
                break;
            }
        }
        Customer csl=new Customer("zzz",1,24,00);//输出歇业；
       MS.outBusiness(csl);
    }
    public static void main(String[] args) {

test();
    }
}