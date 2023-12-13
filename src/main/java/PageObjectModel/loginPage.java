package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class loginPage extends AbstractClass {

    WebDriver driver;
    public loginPage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(name = "email")
    private WebElement mail;
    public void enterMail(){
        sendKeysFunction(mail,"denememetatime@hotmail.com");
    }

    @FindBy(name = "password")
    private WebElement password;
    public void enterPassword(){
        sendKeysFunction(password,"Deneme.1");
    }

    @FindBy(css = "button[type='submit']")
    private WebElement loginButton;
    public void clickLoginButton(){
        clickFunction(loginButton);
    }


    @FindBy(xpath = "//header/nav[1]/div[2]/div[2]/div[1]/div[1]/button[1]")
    private WebElement languageButton;
    public void clickLanguageButton(){
        clickFunction(languageButton);
    }

    @FindBy(xpath = "//header/nav[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]")
    private WebElement trButton;
    public void clickTrButton(){
        clickFunction(trButton);
    }

    @FindBy(xpath = "//p[contains(text(),'Genel Bakış')]")
    private WebElement loginMessage;
    public void assertLoginMessage(){
        assertion(loginMessage,"Genel Bakış");
    }

    @FindBy(xpath = "//h3[contains(text(),'Referanslarım')]")
    private WebElement referanslarimMessage;
    public void assertReferanslarimMessage(){
        assertion(referanslarimMessage,"Referanslarım");
    }

    @FindBy(xpath = "//p[contains(text(),'Ayarlar')]")
    private WebElement ayarlar;
    public void clickAyarlar(){
        clickFunction(ayarlar);
    }

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[3]/section[1]/a[1]/p[1]")
    private WebElement ayarlarProfil;
    public void clickAyarlarProfil(){
        clickFunction(ayarlarProfil);
    }

    @FindBy(id = "Fullname")
    private WebElement profilGorunumuAdSoyad;
    public void clickProfilGorunumuAdSoyad(){
        clickFunction(profilGorunumuAdSoyad);
    }

    @FindBy(xpath = "//p[contains(text(),'Profil görünüm ayarları güncellendi.')]")
    private WebElement profilGorunumuGuncellendi;
    public void assertProfilGorunumuGuncellendi(){
        assertion(profilGorunumuGuncellendi,"Profil görünüm ayarları güncellendi.");
    }

    @FindBy(id = "Nickname")
    private WebElement profilGorunumuTakmaAd;
    public void clickProfilGorunumuTakmaAd(){
        clickFunction(profilGorunumuTakmaAd);
    }


    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]")
    private WebElement detayGosterGizle;
    public void clickDetayGosterGizle(){
        clickFunction(detayGosterGizle);
    }

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[2]/div[2]/div[1]/div[1]/div[2]/button[1]")
    private WebElement e_postaDegistir;
    public void clickE_posta_degistir(){
        clickFunction(e_postaDegistir);
    }

    @FindBy(name = "email")
    private WebElement mailToChange;
    public void enterMailToChange(){
        sendKeysFunction(mailToChange,"denememetatime05@hotmail.com");
    }

    @FindBy(xpath = "//p[contains(text(),'Aşağıdaki e-posta adresine 6 haneli bir doğrulama kodu gönderdik.')]")
    private WebElement otpKontrol;
    public void assertOtpKontrol(){
        assertion(otpKontrol, "Aşağıdaki e-posta adresine 6 haneli bir doğrulama kodu gönderdik.");
    }

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]")
    private WebElement otpCikis;
    public void clickOtpcikis(){
        clickFunction(otpCikis);
    }


    @FindBy(xpath = "//p[contains(text(),'Başkası tarafından daha önce kullanılmış')]")
    private WebElement mailKullanilmis;
    public void assertMailKullanilmis(){
        assertion(mailKullanilmis, "Başkası tarafından daha önce kullanılmış");
    }

    @FindBy(xpath = "//p[contains(text(),'Güvenlik')]")
    private WebElement ayarlarGuvenlik;
    public void clickAyarlarGuvenlik(){
        clickFunction(ayarlarGuvenlik);
    }

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[2]/div[1]/div[2]/button[1]")
    private WebElement passwordToChange;
    public void clickPasswordToChange(){
        clickFunction(passwordToChange);
    }

    @FindBy(name = "confirmPassword")
    private WebElement confirmPassword;
    public void enterConfirmPassword(){
        sendKeysFunction(confirmPassword,"Deneme.1");
    }
























    @FindBy(xpath = "//header/nav[1]/div[2]/div[1]/div[2]/div[1]/button[1]")
    private WebElement NameIcon;
    public void clickNameIcon(){
        clickFunction(NameIcon);
    }

    @FindBy(xpath = "//header/nav[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]")
    private WebElement logout;
    public void clickLogout(){
        clickFunction(logout);
    }


    @FindBy(xpath = "//p[contains(text(),'Devam etmek için sosyal medya hesabınla oturum aç.')]")
    private WebElement logoutMessage;
    public void asserLogoutMessage(){
        assertion(logoutMessage,"Devam etmek için sosyal medya hesabınla oturum aç.");
    }


    @FindBy(xpath = "//body/div[@id='root']/main[@id='page-wrap']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
    private WebElement gmailButton;
    public void clickGmail(){
        clickFunction(gmailButton);
    }

    @FindBy(id = "identifierId")
    private WebElement gmail;
    public void enterGmailUsername(){
        sendKeysFunction(gmail,"denememetatime@gmail.com");
    }

    //Gmail adresini girdikten sonra ileri butonuna tıkladık.
    @FindBy(xpath = "//span[contains(text(),'Sonraki')]")
    private WebElement ileriButton;
    public void clickNextButton(){
        clickFunction(ileriButton);
    }

    @FindBy(name = "Passwd")
    private WebElement passwordGmail;
    public void enterPasswordGmail(){
        sendKeysFunction(passwordGmail,"Denememetatime.1");
    }

    @FindBy(xpath = "//body/div[@id='root']/main[@id='page-wrap']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]")
    private WebElement githubButton;
    public void clickGithub(){
        clickFunction(githubButton);
    }

    @FindBy(id = "login_field")
    private WebElement github;
    public void enterGithubUsername(){
        sendKeysFunction(github,"denememetatime@gmail.com");
    }

    @FindBy(id = "password")
    private WebElement passwordGithub;
    public void enterPasswordGithub(){
        sendKeysFunction(passwordGithub,"Denememetatime.1");
    }

    //Apple adresini girdikten sonra ileri butonuna tıkladık.
    @FindBy(name = "commit")
    private WebElement githubSignin;
    public void clickGithubSiginButton(){
        clickFunction(githubSignin);
    }


    @FindBy(xpath = "//body/div[@id='root']/main[@id='page-wrap']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]")
    private WebElement linkedinButton;
    public void clickLinkedin(){
        clickFunction(linkedinButton);
    }

    @FindBy(id = "username")
    private WebElement linkedin;
    public void enterLinkedinUsername(){
        sendKeysFunction(linkedin,"denememetatime@hotmail.com");
    }

    @FindBy(id = "password")
    private WebElement passwordLinkedin;
    public void enterPasswordLinkedin(){
        sendKeysFunction(passwordLinkedin,"Denememetatime.1");
    }


    //Lİnkdin adresini girdikten sonra ileri butonuna tıkladık.
    @FindBy(css = "body.system-fonts:nth-child(2) main.app__content:nth-child(2) div.flavor:nth-child(2) form.login__form div.login__form_action_container.login__form_action_container--multiple-actions:nth-child(30) > button.btn__primary--large.from__button--floating")
    private WebElement linkedinSignin;
    public void clickLinkedinSiginButton(){
        clickFunction(linkedinSignin);
    }


    public void pencereyiKapat(){
        driver.quit();
    }

}