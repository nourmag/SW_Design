public class FacebookPoster implements ISocialMedia {
    @Override
    public void login(String username, String password) {
        System.out.println("You have logged in your Facebook account successfully, " +username);
    }
    @Override
    public void logout() {
        System.out.println("You have logged out of your Facebook account successfully. ");
    }
    @Override
    public void post(String message) {
        System.out.println(message);
    }
}
