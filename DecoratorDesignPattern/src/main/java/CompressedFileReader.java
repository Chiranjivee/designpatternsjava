public class CompressedFileReader extends ReadDecorator {
    public CompressedFileReader(Reader reader) {
        super(reader);
    }

    public void read() {
        System.out.println("Decompressing the file");
        this.reader.read();
    }
}
