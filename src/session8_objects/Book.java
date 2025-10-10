package session8_objects;

public class Book
{
  String title;
  int isbn;
  String author;
  boolean isAvailable = true;

  public Book(String title, int isbn, String author) {
    this.title = title;
    this.isbn = isbn;
    this.author = author;
  }

}
