
public class Customer {
    public String name;
    public int frequency;//次数
   public LocalDate l1;
    Customer(String name1,int frequency1,int a,int b)
    {
        name=name1;
        frequency=frequency1;
         LocalDate L1=new LocalDate(a,b);
         l1=L1;
    }
    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", frequency=" + frequency +
                '}'+"\n";
    }
}
