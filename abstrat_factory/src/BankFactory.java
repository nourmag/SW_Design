public class BankFactory extends AbstractFactory {
    @Override
    public Bank getBank(String bank) {
        return switch (bank) {
            case "ICICIBank" -> new ICICIBank();
            case "YesBank" -> new YesBank();
            default -> null;
        };
    }
    @Override
    public Account getAccount(String accountType) {
        return null;
    }
}
