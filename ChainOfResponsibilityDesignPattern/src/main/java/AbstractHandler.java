public abstract class AbstractHandler implements Handler {
    protected Handler handler;

    public void setNextHandler(Handler handler) {
        this.handler = handler;
    }
}