Feature: What is result of Tan ?
  Nobody want to know the result of Tan
  

  Scenario Outline: Result of Tan
    Given input is "<degree>"
    When I ask what is reuslt
    Then I should be told "<output>"

  Examples:
    | degree          | output  |
    | 0               | 0       |
    | 45              | 1       |
    | 135             | -1      |
    | 180             | 0       |
    | 225             | 1       |
    | 315             | -1      |
    | 360             | 0       |
    | 90              | Invalid |
    | 270             | Invalid |
