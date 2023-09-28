package facade;

public class Main {
  public static void main(String[] args) {
    var twitterAPI = new TwitterAPI("appKey", "secret");
    var tweets = twitterAPI.getRecentTweets();
    System.out.println(tweets);
  }
}
