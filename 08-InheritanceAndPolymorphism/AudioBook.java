class AudioBook extends Book {
  private int minutes;
  private int seconds;

  public AudioBook(String title, String author, int minutes, int seconds, Publisher pub) {
    super(title, author, pub);
    this.minutes = minutes;
    this.seconds = seconds;
  }

  public int getMinutes() {
    return minutes;
  }

  public void setMinutes(int minutes) {
    this.minutes = minutes;
  }

  public int getSeconds() {
    return seconds;
  }

  public void setSeconds(int seconds) {
    this.seconds = seconds;
  }

  @Override
  public void display() {
    super.display();
    System.out.println("Duration: " + minutes + " minutes, " + seconds + " seconds");
  }

  public static void main(String[] args) {
    Publisher p = new Publisher("null", "null");
    Book book1 = new Book("The Lord of the Rings", "J.R.R. Tolkien", p);
    AudioBook audioBook1 = new AudioBook("The Martian", "Andy Weir", 11, 22, p);
    AudioBook audioBook2 = new AudioBook("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 3, 54, p);

    book1.display();
    audioBook1.display();
    audioBook2.display();
  }


}