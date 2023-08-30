package pizza.customer;

public class Customer {

    private Long id;

    private String fullName;

    private String phoneNumber;

    public Customer(Long id, String fullName, String phoneNumber) {
        this.id = id;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
    }
}
