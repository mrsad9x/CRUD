package rikkeisoft.com.demo.dto;

import java.math.BigDecimal;

public class ProductCTMDTO {
    private long id;
    private String productName;
    private BigDecimal price;
    private String categoriesName;

    public ProductCTMDTO() {
    }

    public ProductCTMDTO(long id, String productName, BigDecimal price, String categoriesName) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.categoriesName = categoriesName;
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getCategoriesName() {
        return categoriesName;
    }

    public void setCategoriesName(String categoriesName) {
        this.categoriesName = categoriesName;
    }
}
