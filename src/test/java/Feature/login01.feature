Feature: Login test

  Scenario: Metatime sayfasına giris


    Given Metatime sitesine git
    And mail adresi gir
    And sifre gir
    When login butonuna bas
    Then Success mesajını doğrula