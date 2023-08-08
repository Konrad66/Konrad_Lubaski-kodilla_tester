Feature: Fizz Buzz game
  I want to pass a number and see the correct answer

  Scenario Outline: Get answer based on played number
    Given number is <number> of value greater than zero
    When I pass a number
    Then I should be told the correct <answer>
    Examples:
      | number                           | answer     |
      | 3               | "Fizz"     |
      | 5                | "Buzz"     |
      | 15 | "FizzBuzz" |
      | 2         | "None"     |