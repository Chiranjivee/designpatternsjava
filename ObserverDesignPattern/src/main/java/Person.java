class Person implements Observer {
    private String name;
    public Person(String name) {
        this.name = name;
    }

    @Override
    public void notifyMe(int x) {
        System.out.println("I got notified by: " + x);
    }
}