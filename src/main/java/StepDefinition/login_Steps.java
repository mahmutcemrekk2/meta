package StepDefinition;


import PageObjectModel.AbstractClass;
import PageObjectModel.loginPage;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class login_Steps extends AbstractClass {

    private WebDriver driver;

    private String mainWindowHandle;
    private String otherWindowHandle;

    loginPage loginPage = new loginPage();




    @Given("^Go to metatime site$")
    public void Go_to_metatime_site() throws Throwable {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://accounts.metatime.com/login");
        System.out.println("step 1 - ok");
        //https://accounts.metatime.com/login
        //https://test-account.metatimex.com/login
    }

    @When("^Enter Mail address$")
    public void Enter_Username() throws Throwable {
        loginPage.enterMail();
        System.out.println("step 2 - ok");
    }

    @And("^enter password$")
    public void enter_password() throws Throwable {
        loginPage.enterPassword();
        System.out.println("step 3 - ok");
    }

    @And("^Click on Login Button$")
    public void Click_on_Login_Button() throws Throwable {
        loginPage.clickLoginButton();
        System.out.println("step 4 - ok");
    }
    @And("^Change language status to Turkish$")
    public void Change_language_status_to_Turkish() {
        loginPage.clickLanguageButton();
        loginPage.clickTrButton();
        System.out.println("step 5 - ok");
    }

    @And("^Verify success message$")
    public void Verify_success_message() throws Throwable {
        loginPage.assertLoginMessage();
        System.out.println("step 6 - ok");
    }


    @And("^Click the Referanslarım$")
    public void click_the_referanslarım() throws Throwable {
        loginPage.assertReferanslarimMessage();
        System.out.println("Click the Referanslarım");
    }

    @And("^Click Ayarlar$")
    public void click_ayarlar() {
        loginPage.clickAyarlar();
        System.out.println("Click Ayarlar");
    }

    @And("^Click Ayarlar ==> Profil$")
    public void click_ayarlar_profil() {
        loginPage.clickAyarlarProfil();
        System.out.println("Click Ayarlar ==> Profil");
    }


    @And("^Ad Soyad butonuna tikla$")
    public void ad_soyad_butonuna_tikla() {
        loginPage.clickProfilGorunumuAdSoyad();
        System.out.println("Ad Soyad butonuna tikla");
    }

    @And("^Adim sonrasi profil guncellendi$")
    public void adim_sonrasi_profil_guncellendi() {
        loginPage.assertProfilGorunumuGuncellendi();
        System.out.println("Adim sonrasi profil guncellendi");
    }

    @And("^Takma Ad butonuna tikla$")
    public void takma_ad_butonuna_tikla() {
        loginPage.clickProfilGorunumuTakmaAd();
        System.out.println("Takma Ad butonuna tikla");
    }

    @And("^Detay goster gizle butonuna tikla$")
    public void detay_goster_gizle_butonuna_tikla() {
        loginPage.clickDetayGosterGizle();
        System.out.println("Detay goster gizle butonuna tikla");
    }

    @And("^E_posta degistir butonuna tikla$")
    public void E_posta_degistir_butonuna_tikla() {
        loginPage.clickE_posta_degistir();
        System.out.println("E_posta degistir butonuna tiklandi");
    }

    @When("^Enter Mail address to change$")
    public void Enter_Username_to_change() throws Throwable {
        loginPage.enterMailToChange();
        System.out.println("Enter Mail address to change");
    }

    @And("^Mail degistir OTP kontrol et$")
    public void mail_degistir_OTP_kontrol_et() {
        loginPage.assertOtpKontrol();
        driver.navigate().refresh();
        System.out.println("Mail degistir OTP kontrol et");
    }

    @And("^Mail adresinin daha once kullanildigini kontrol et$")
    public void mail_adresinin_daha_once_kullanildigini_kontrol_et() {
        loginPage.assertMailKullanilmis();
        driver.navigate().refresh();
        System.out.println("Mail adresinin daha once kullanildigini kontrol et");
    }

    @And("^Click Ayarlar ==> Güvenlik")
    public void click_ayarlar_güvenlik() {
        loginPage.clickAyarlarGuvenlik();
        System.out.println("Click Ayarlar ==> Güvenlik");
    }

    @And("^Sifre degistir butonuna tikla$")
    public void sifre_degistir_butonuna_tikla() {
        loginPage.clickPasswordToChange();
        System.out.println("Sifre degistir butonuna tikla");
    }

    @And("^enter confirm password$")
    public void enter__confirm_password() throws Throwable {
        loginPage.enterConfirmPassword();
        System.out.println("enter confirm password");
    }





















    @And("^log out of the site$")
    public void log_out_of_the_site() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        loginPage.clickNameIcon();
        loginPage.clickLogout();
        System.out.println("step 7 - ok");
    }



    @And("^verify output$")
    public void verify_output() {
        loginPage.asserLogoutMessage();
        System.out.println("step 8 - ok");
    }

    @And("^Click the Gmail icon$")
    public void click_the_gmail_icon() {
        loginPage.clickGmail();
        mainWindowHandle = driver.getWindowHandle();
        System.out.println("step 9 - ok");
    }

    @And("^Enter Gmail Username$")
    public void enter_gmail_username() {
        // Gmail penceresinin tanımlayıcısını al
        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(mainWindowHandle)) {
                otherWindowHandle = handle;
                driver.switchTo().window(otherWindowHandle);
                break;
            }
        }
        loginPage.enterGmailUsername();
        System.out.println("step 10 - ok");
    }

    @And("^click Gmail next button$")
    public void click_Gmail_next_button() {
        loginPage.clickNextButton();
        System.out.println("step 11 - ok");
    }

    @And("^enter Gmail password$")
    public void enter_gmail_password() {
        loginPage.enterPasswordGmail();
        System.out.println("step 12 - ok");

    }

    @And("^log out of the Social Media Login$")
    public void log_out_of_the_Social_Media_Login() {
        driver.switchTo().window(mainWindowHandle);
        loginPage.clickNameIcon();
        loginPage.clickLogout();
        System.out.println("step 14 - ok");
    }

    @And("^Click the Github icon$")
    public void click_the_github_icon() {
        loginPage.clickGithub();
        mainWindowHandle = driver.getWindowHandle();
        System.out.println("step 16 - ok");
    }


    @And("^Enter Github Username$")
    public void enter_github_username() {
        // Github penceresinin tanımlayıcısını al
        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(mainWindowHandle)) {
                otherWindowHandle = handle;
                driver.switchTo().window(otherWindowHandle);
                break;
            }
        }
        loginPage.enterGithubUsername();
        System.out.println("step 17 - ok");
    }

    @And("^enter Github password$")
    public void enter_github_password() {
        loginPage.enterPasswordGithub();
        System.out.println("step 12 - ok");
    }

    @And("^click Github next button$")
    public void click_github_next_button() {
        loginPage.clickGithubSiginButton();
        System.out.println("step 18 - ok");
    }

    @And("^Click the Linkedin icon$")
    public void click_the_linkedin_icon() {
        loginPage.clickLinkedin();
        mainWindowHandle = driver.getWindowHandle();
        System.out.println("step 16 - ok");
    }


    @And("^Enter Linkedin Username$")
    public void enter_linkedin_username() {
        // Linkedin penceresinin tanımlayıcısını al
        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(mainWindowHandle)) {
                otherWindowHandle = handle;
                driver.switchTo().window(otherWindowHandle);
                break;
            }
        }
        loginPage.enterLinkedinUsername();
        System.out.println("step 17 - ok");
    }

    @And("^enter Linkedin password$")
    public void enter_linkedin_password() {
        loginPage.enterPasswordLinkedin();
        System.out.println("step 12 - ok");
    }

    @And("^click Linkedin next button$")
    public void click_linkedin_next_button() {
        loginPage.clickLinkedinSiginButton();
        System.out.println("step 18 - ok");
    }

    @Then("^Pencereyi kapat$")
    public void pencereyi_kapat() {
        loginPage.pencereyiKapat();
        System.out.println("Pencereyi kapat");
    }
}
