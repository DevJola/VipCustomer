public class Main {
    public static void main(String[] args) {
        VipCustomer customer1 = new VipCustomer();
        System.out.println(customer1.getName());

        VipCustomer customer2 = new VipCustomer("Jude", 3000.00);
        System.out.println(customer2.getEmailAddress());

        VipCustomer customer3 = new VipCustomer("James", 6000, "jamesgorden@gmail.com");
        System.out.println(customer3.getCreditLimit());
    }
}
