package functionnalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {

        // Normal java function
        Customer maria = new Customer("Maria", "9999");
        greetCustomer(maria);
        greetCustomer2(maria, false);

        // Consumer Functional interface
        greetCustomerConsumer.accept(maria);

        greetCustomerConsumerV2.accept(maria, false);
    }

    static Consumer<Customer> greetCustomerConsumer = customer
            -> System.out.println("Hello " + customer.customerName + ", thanks for registering " + customer.CustomerPhoneNumber);

    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer, showPhoneNumber)
            -> System.out.println("Hello " + customer.customerName + ", thanks for registering " + (showPhoneNumber ? customer.CustomerPhoneNumber : "*****"));


    static void greetCustomer(Customer customer){
        System.out.println("Hello " + customer.customerName + ", thanks for registering " + customer.CustomerPhoneNumber);
    }

    static void greetCustomer2(Customer customer, boolean showPhoneNumber){
        System.out.println("Hello " + customer.customerName + ", thanks for registering " + (showPhoneNumber ? customer.CustomerPhoneNumber : "*****"));
    }

    static class Customer {
        private final String customerName;
        private final String CustomerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            CustomerPhoneNumber = customerPhoneNumber;
        }
    }
}
