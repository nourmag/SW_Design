public class FactoryProducer {
    public AbstractFactory getFactory(String factory) {
        if (factory.equalsIgnoreCase("Bank")) {
            return new BankFactory();
        } else if (factory.equalsIgnoreCase("Account")) {
            return new AccountFactory();
        }
        return null;
    }
}
