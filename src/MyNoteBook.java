public class MyNoteBook {
    private String title;
    private int numberOfWord;
    private String paperQuality;
    private String color;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfWord() {
        return numberOfWord;
    }

    public void setNumberOfWord(int numberOfWord) {
        this.numberOfWord = numberOfWord;
    }

    public String getPaperQuality() {
        return paperQuality;
    }

    public void setPaperQuality(String paperQuality) {
        this.paperQuality = paperQuality;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "MyNoteBook{" +
                "title='" + title + '\'' +
                ", numberOfWord=" + numberOfWord +
                ", paperQuality='" + paperQuality + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public MyNoteBook(String title, int numberOfWord, String paperQuality, String color) {
        this.title = title;
        this.numberOfWord = numberOfWord;
        this.paperQuality = paperQuality;
        this.color = color;
    }




    public static void main(String[] args) {
        MyNoteBook myNoteBook = new MyNoteBook(" Top Flight", 2000, "Excellent", "White");
        System.out.println("MyNoteBook :"+ myNoteBook );

    }
}


