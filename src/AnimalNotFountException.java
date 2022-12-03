public class AnimalNotFountException extends RuntimeException{
    Animal e;
    public AnimalNotFountException(Animal E1)
    {
        e=E1;
    }

    @Override
    public String toString() {
        return e.toString();
    }
}
