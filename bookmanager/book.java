package bookmanager;

import java.util.List;

import java.util.ArrayList;

import bookmanager.chapter;

public class book {
  private String bookName;
  private String author;
  List<chapter> chapters = new ArrayList < chapter > ();

    public book(String author, String bookName) {
        this.author = author;
        this.bookName = bookName;
        this.chapters = new ArrayList < chapter > ();
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

    public void addchapter(chapter c) {
        chapters.add(c);
    }

    public int getNumberChapter(){
      return chapters.size();
    }

    public int getNumberPage(){
      int total = 0;
      for (chapter c: chapters) {
        total += c.getNumberPage();
      }
      return total;
    }
    
}
