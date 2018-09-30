public interface Handler {
    void setNextHandler(Handler handler);
    void handle(String incomingSuspect);
}