package GenericsInterface;

public class ProgramStrategy2 {

    public static void main(String[] args) {

        AccountStrategy2<String> acc1 = new AccountStrategy2<String>("1235rwr", 5000);
        AccountStrategy2<Integer> acc2 = new AccountStrategy2<Integer>(2373, 4300); // можем использовать разные типы
        System.out.println(acc1.getId());
        System.out.println(acc2.getId());
    }

}

interface AccountableStrategy2<T> {
    T getId();
    int getSum();
    void setSum(int sum);
}
class AccountStrategy2<T> implements AccountableStrategy2<T> { // при второй стратегии тоже используем универсальный параметр

    private T id;
    private int sum;

    AccountStrategy2(T id, int sum){
        this.id = id;
        this.sum = sum;
    }

    public T getId() { return id; }
    public int getSum() { return sum; }
    public void setSum(int sum) { this.sum = sum; }
}
