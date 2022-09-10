public class Book {

    private String name;
    private String author;
    private int year;
    private String genre;
    private int price;

    Book(String name, String author, int year, String genre, int price){
        this.author = author;
        this.name = name;
        this.year = year;
        this.genre = genre;
        this.price = price;
    }

    //Setters

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPublisher(String publisher) {
        this.genre = publisher;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //Getters

    public int getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public String getPublisher() {
        return genre;
    }


    public String toString(){
        return String.format("Author: %s; Name: %s; Genre: %s; Year: %s; Price: %srub;", author, name, genre, year, price);
    }



}
