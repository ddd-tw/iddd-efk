package iddd.efk.customercontext.domain;

public class Customer {

    private final String name;

    public Customer(String name) {
        this.name = name;
    }

    public String name() {
        return this.name;
    }

}
