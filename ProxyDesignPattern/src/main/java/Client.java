public class Client {
    public static void main(String[] args) {
        ServiceInterface service = new ServiceProxy(new ActualService());
        service.performOperation();
    }
}