package adapter;

public class Main {
  public static void main(String[] args) {
    var client = new EmailClient();
    client.addProvider(new GmailClientAdapter());
    client.downloadEmails();

  }
}
