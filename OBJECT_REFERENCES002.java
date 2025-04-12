
import java.util.Scanner;

class Song {
  private String name;
  private String author;
  private String duration;

  public Song(String name, String author, String duration) {
    this.name = name;
    this.author = author;
    this.duration = duration;
  }

  public boolean equals(Song song) {
    if (this.name.equals(song.name) && this.author.equals(song.author) && this.duration.equals(song.duration)) {
      return true;
    } else {
      return false;
    }
  }
}

public class OBJECT_REFERENCES002 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    while (t-- > 0) {
      String s1 = sc.nextLine();
      String s2 = sc.nextLine();
      String[] list1 = s1.split(" ");
      String[] list2 = s2.split(" ");
      Song song1 = new Song(list1[0], list1[1], list1[2]);
      Song song2 = new Song(list2[0], list2[1], list2[2]);
      System.out.println(song1.equals(song2));
    }
    sc.close();
  }
}
