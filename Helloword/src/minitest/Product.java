package minitest;

public class Product {
 private String id;
 private String name;
 private double price;
 private String type;
 private String usd = "USD";
 public Product () {
 }
    public Product (String id, String name, double price, String type, String usd) {
     this.id = id;
     this.name = name;
     this.price = price;
     this.type = type;
     this.usd = usd;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public String getUsd() {
        return usd;
    }



    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", usd='" + usd + '\'' +
                '}';
    }
}

