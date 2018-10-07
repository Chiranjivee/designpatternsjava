public class FileReader implements Reader {

    private String filePath;

    public FileReader(String filePath) {
        this.filePath = filePath;
    }

    public void read() {
        System.out.println("Reading file from: " + this.filePath);
    }
}