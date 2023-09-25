package JavaProjects2;

interface WebDriver {
    void open();
    void close();
    String getTitle();

}
interface RemoteWebDriver extends WebDriver{
    void navigate();
}
interface TakeScreenShot extends RemoteWebDriver{
    void getScreenShot();
}
class ChromeDriver implements RemoteWebDriver{
    @Override
    public void open() {
        System.out.println("Open Chrome Browser");
    }
    @Override
    public void close() {
        System.out.println("Close the Chrome Browser");
    }
    @Override
    public String getTitle() {
        return null;
    }
    @Override
    public void navigate() {
    }
}
class FirefoxBrowser implements RemoteWebDriver{
    @Override
    public void open() {
        System.out.println("Open Firefox Browser");
    }
    @Override
    public void close() {
        System.out.println("Close the Firefox Browser");
    }
    @Override
    public String getTitle() {
        return null;
    }
    @Override
    public void navigate() {
    }
}
class WebDriverTester{
    public static void main(String[] args) {
        WebDriver [] arr={new ChromeDriver(),new FirefoxBrowser()};
        for (WebDriver a:arr){
            a.open();
            a.getTitle();
            a.close();
        }
    }
}
