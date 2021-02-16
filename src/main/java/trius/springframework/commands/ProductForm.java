package trius.springframework.commands;


import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.NumberFormat;

import javax.validation.constraints.*;
import java.math.BigDecimal;

public class ProductForm {

    private String id;

    @NotBlank
    @Size(max = 255,message = "Ad alanı en fazla 255 karakter olabilir!!!")
    private String name;

    @NotBlank
    @Size(max = 255,message = "Açıklama alanı en fazla 255 karakte olabilir")
    private String description;

    @Digits(integer =5,fraction = 2,message = "Lütfen virgülden önce 5 basamak virgülden sonra 2 basamak girin")
    @Min(value = 0,message = "Fiyat negatif olamaz")
    @NotNull
    private BigDecimal price;

    @Max(value = 99999,message = "En fazla 5 basamaklı değer girilebilir")
    @Min(value = 0,message = "Stok negatif olamaz")
    @NotNull
    private int stock;

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

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

}
