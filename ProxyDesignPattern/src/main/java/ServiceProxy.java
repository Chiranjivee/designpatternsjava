public class ServiceProxy implements ServiceInterface {
    ServiceInterface actualService;

    public ServiceProxy(ServiceInterface actualService) {
        this.actualService = actualService;
    }

    @Override
    public void performOperation() {
        System.out.println("Going via proxy..");
        // whatever checks you want to make.

        // is data valid;
        System.out.println("Proceed invokation, data validation complete.");

        // at the end  call the actual service.
        actualService.performOperation();
    }
}