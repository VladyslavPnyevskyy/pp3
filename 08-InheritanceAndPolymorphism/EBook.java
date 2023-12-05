public class EBook extends Book {
    protected String fileName;
    public EBook(String title, String author,Publisher pub,  String fileName) {
        super(title,author, pub);
        this.fileName = fileName;
    }
        public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
@Override
    public void display() {
        super.display();

        System.out.println("fileName: " + fileName);
    }
}
