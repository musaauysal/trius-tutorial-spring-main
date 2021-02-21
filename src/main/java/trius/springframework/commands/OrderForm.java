package trius.springframework.commands;



import java.math.BigDecimal;
import java.time.LocalDate;


public class OrderForm {
    private String id;


    private String name;

    private String description;

    private BigDecimal price;

    private int number;

    private String date;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDate() { return date; }

    public void setDate(String date) { this.date = date; }

}
