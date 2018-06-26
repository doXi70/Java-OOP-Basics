package p04_Telephony;

public class Smartphone implements Callable, Browseable {
    private String[] phoneNumbers;
    private String[] webSites;

    public Smartphone(String[] phoneNumbers, String[] webSites) {
        this.phoneNumbers = phoneNumbers;
        this.webSites = webSites;
    }

    @Override
    public void browse() {
        for (String webSite : webSites) {
            if (!webSite.matches(".*\\d+.*")) {
                System.out.println("Browsing: " + webSite + "!");
            } else {
                System.out.println("Invalid URL!");
            }
        }
    }

    @Override
    public void call() {
        for (String phoneNumber : phoneNumbers) {
            if (phoneNumber.matches("\\d+")) {
                System.out.println("Calling... " + phoneNumber);
            } else {
                System.out.println("Invalid number!");
            }
        }
    }
}
