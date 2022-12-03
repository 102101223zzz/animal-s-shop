public interface AnimalShop {
    void BuyAnimal(String name,int age,char sex,int price);
    void treatCustomer(Customer e1,Animal e2);
    boolean outBusiness(Customer e);
}
