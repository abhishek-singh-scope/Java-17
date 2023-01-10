package Java8;

import java.util.Objects;

enum Type{
    DEBIT,
    CREDIT;
}

public class Transaction {

    int amount;
    Type type;
    int id;

    public Transaction() {
    }

    public Transaction(int amount, Type type, int id) {
        this.amount = amount;
        this.type = type;
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public Type getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "BeyondJava8.Transaction{" +
                "amount=" + amount +
                ", type=" + type +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transaction)) return false;
        Transaction that = (Transaction) o;
        return amount == that.amount && id == that.id && type == that.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, type, id);
    }
}
