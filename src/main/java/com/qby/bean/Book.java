package com.qby.bean;

/**
 * @author qby
 * @date 2020/6/24 23:43
 */
public class Book {

    private Integer id;
    private String bookName;
    private String author;
    private Double price;
    private Integer stock;

    public Book() {
    }

    public Book(Integer id, String bookName, String author, Double price, Integer stock, Integer sales) {
        this.id = id;
        this.bookName = bookName;
        this.author = author;
        this.price = price;
        this.stock = stock;
        this.sales = sales;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", sales=" + sales +
                ", addres=" + addres +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private Integer sales;

    private Addres addres;

    public Addres getAddres() {
        return addres;
    }

    public void setAddres(Addres addres) {
        this.addres = addres;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }
}
