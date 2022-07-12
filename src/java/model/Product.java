
package model;


public class Product {
    private int id;
    private String name;
    private String img;
    private String description;
    private String type;
    private int price;
    private int amount;

    public Product() {
    }

    public Product(int id, String name, String img, int price) {
        this.id = id;
        this.name = name;
        this.img = img;
        this.price = price;
    }

    public Product(int id, String name, String img, int price, int amount) {
        this.id = id;
        this.name = name;
        this.img = img;
        this.price = price;
        this.amount = amount;
    }
    
    public Product(int id, String name, String img, String description, String type, int price) {
        this.id = id;
        this.name = name;
        this.img = img;
        this.description = description;
        this.type = type;
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        return "Product{" + "id=" + id + ", name=" + name + ", img=" + img + ", description=" + description + ", type=" + type + ", price=" + price + '}';
    }
    
}
