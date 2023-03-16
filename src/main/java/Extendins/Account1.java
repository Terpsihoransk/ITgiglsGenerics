package Extendins;

public class Account1<T> {
    private T _id;

    T getId(){return _id;}

    Account1(T id)
    {
        _id = id;
    }

}

class DepositAccount1<T> extends Account1<T> {

    DepositAccount1(T id) { // в конструкторе обращение к базовому классу, в который передаются данные о типе
        super(id);
    }


    public static void main(String[] args) {
        DepositAccount1 dAccount1 = new DepositAccount1(20);
        System.out.println(dAccount1.getId());

        DepositAccount1 dAccount2 = new DepositAccount1("12345");
        System.out.println(dAccount2.getId());
    }
}
