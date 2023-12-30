public class TwitterCreator extends creator{
    @Override
    public ISocialMedia createConnector() {
        return new TwitterPoster();
    }
}