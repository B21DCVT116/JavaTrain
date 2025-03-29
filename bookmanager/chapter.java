package bookmanager;

import java.util.ArrayList;
import java.util.List;

public class chapter {
  private String chapterName;
  private int chapterNumber;
  private List<page> pages;

    public chapter(String chapterName, int chapterNumber) {
        this.chapterName = chapterName;
        this.chapterNumber = chapterNumber;
        this.pages = new ArrayList<page> ();
    }

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName;
    }

    public int getChapterNumber() {
        return chapterNumber;
    }

    public void setChapterNumber(int chapterNumber) {
        this.chapterNumber = chapterNumber;
    }
    
    public void addPage(page p) {
        pages.add(p);
    }

    public int getNumberPage() {
        return pages.size();
    }
}
