Feature: Check Message

  Scenario: check Bell icon

    Given click telphone number
    When write phone number
    Then click login
    And write password
    When user see "anasayfa"
    And user click "Mesajlar"
    Then user click "bell" icon
    And user check text

  Scenario: check Star icon

    Given click telphone number
    When write phone number
    Then click login
    And write password
    When user see "anasayfa"
    And user click "Mesajlar"
    Then user click "Star" icon
    And user check text


  Scenario: check megaphone icon

    Given click telphone number
    When write phone number
    Then click login
    And write password
    When user see "anasayfa"
    And user click "Mesajlar"
    Then user click "megaphone" icon
    And user check text
