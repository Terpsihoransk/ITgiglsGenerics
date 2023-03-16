package Extendins;

public class Account3 <T> {

    private T _id;

    T getId(){return _id;}

    Account3(T id)
    {
        _id = id;
    }
}

class DepositAccount3 extends Account3<Integer> {  // явно указали тип

    DepositAccount3() {
        super(5); // в конструктор базового класса передали значение
    }

    public static void main(String[] args) {
        DepositAccount3 dAccount1 = new DepositAccount3();
        System.out.println(dAccount1.getId());
    }
}