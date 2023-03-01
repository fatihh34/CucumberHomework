@blueRentalCar
  Feature:kullanici


    Scenario Outline: TC01_BlueRentalCar
      Given user "https://www.bluerentalcars.com/" gider
    When kullanici login sayfasina gider

      And user emali "<email>" girer

      And user "<password>" girer

    And login butonuna basar
    Then login islemi gerceklesir

      Examples: tablo

      |email                        | password  |
      |sam.walker@bluerentalcars.com| c!fas_art |




