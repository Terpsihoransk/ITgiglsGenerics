package Extendins;

public class Account2 <T>{

    private T _id;

    T getId() {
        return _id;
    }

    Account2(T id)
    {
        _id = id;
    }

}

class DepositAccount2<T, S> extends Account2<T> {  // наследник добавляет свои параметры S

    private S _name;

    S getName() {
        return _name;
    }

    DepositAccount2(T id, S name){
        super(id); // обращение к родителю
        this._name=name;
    }

    public static void main(String[] args) {
        DepositAccount2<Integer, String> dAccount1 = new DepositAccount2(20, "Tom");
        System.out.println(dAccount1.getId() + " : " + dAccount1.getName());

        DepositAccount2<String, Integer> dAccount2 = new DepositAccount2("12345", 23456);
        System.out.println(dAccount2.getId() + " : " + dAccount2.getName());
    }

}
