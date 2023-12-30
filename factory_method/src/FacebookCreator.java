public class FacebookCreator extends creator {
    @Override
    public ISocialMedia createConnector() {
        return new FacebookPoster();
    }
}
