public class Main {
    public static void main(String[] args) {
        FactoryProducer factoryProducer = new FactoryProducer();
        System.out.println(factoryProducer.getFactory("Bank").getBank("ICICIBank").getBankName());
        System.out.println(factoryProducer.getFactory("Bank").getBank("YesBank").getBankName());
        System.out.println(factoryProducer.getFactory("Account").getAccount("Saving").getAccountType());
        System.out.println(factoryProducer.getFactory("Account").getAccount("Checking").getAccountType());
    }
}
