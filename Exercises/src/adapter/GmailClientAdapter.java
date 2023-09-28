package adapter;

import adapter.Gmail.GmailClient;

public class GmailClientAdapter implements EmailProvider {
  private GmailClient gmail = new GmailClient();

  @Override
  public void downloadEmails() {
    gmail.connect();
    gmail.getEmails();
    gmail.disconnect();
  }
}
