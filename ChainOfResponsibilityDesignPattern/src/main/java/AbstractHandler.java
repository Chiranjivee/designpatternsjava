public abstract class AbstractHandler implements Handler {
    protected Handler nextHandler;

    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }
}