public class Account {

    private int id; // id задан как целое число, но может быть и плавающая точка и строка,
                    // или класс. Мы пока не знаем, что лучше
    private int sum; // сумма на счете

    public Account(int id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    public int getId() {
        return id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

}






