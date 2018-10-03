public class Client {
    public static void main(String[] args) {
        ServiceInterface service = new ServiceProxy();
        service.performOperation();
    }
}