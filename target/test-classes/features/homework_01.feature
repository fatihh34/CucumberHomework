@blueRentalCar
  Feature:kullanici


    Scenario Outline: TC01_BlueRentalCar
      Given user "https://www.bluerentalcars.com/" gider
    When kullanici login sayfasina gider

      And user emali "<email>" girer

      And user "<password>" girer

    And login butonuna basar
    Then login islemi gerceklesir
      Then user logout olur

      Examples: tablo

      |email                         | password  |
      |sam.walker@bluerentalcars.com | c!fas_art |
      |kate.brown@bluerentalcars.com | tad1$Fas  |
      |raj.khan@bluerentalcars.com   | v7Hg_va^  |
      |pam.raymond@bluerentalcars.com| Nga^g6!   |




