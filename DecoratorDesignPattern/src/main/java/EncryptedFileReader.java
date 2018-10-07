public class EncryptedFileReader extends ReadDecorator {
    public EncryptedFileReader(Reader reader) {
        super(reader);
    }

    public void read() {
        System.out.println("Decrypting the file");
        this.reader.read();
    }
}
