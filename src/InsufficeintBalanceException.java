public class InsufficeintBalanceException extends RuntimeException{

    public int detail;
    public InsufficeintBalanceException(int a)
    {
        detail=a;
    }
    @Override
    public String toString() {
        return "InsufficeintBalanceException{" +
                "detail=" + detail +
                '}';
    }
}
