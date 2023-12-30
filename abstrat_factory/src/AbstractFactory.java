public abstract class AbstractFactory {
    public abstract Bank getBank(String bank);
    public abstract Account getAccount(String accountType);
}
