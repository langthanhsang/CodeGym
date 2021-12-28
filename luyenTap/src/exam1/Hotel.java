package exam1;

public class Hotel {
   private Customer customer;
   private int numberOfDay;
   private String type;
   private int price;

    public Hotel() {
    }

    public Hotel(Customer customer, int numberOfDay, String type, int price) {
        this.customer = customer;
        this.numberOfDay = numberOfDay;
        this.type = type;
        this.price = price;
    }

    public Hotel(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getNumberOfDay() {
        return numberOfDay;
    }

    public void setNumberOfDay(int numberOfDay) {
        this.numberOfDay = numberOfDay;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "customer=" + customer.toString()+
                ", numberOfDay=" + numberOfDay +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}
