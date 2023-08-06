Feature: Fizz Buzz game
  I want to pass a number and see the correct answer

  Scenario Outline: Get answer based on played number
    Given number is <number> of value greater than zero
    When I pass a number
    Then I should be told the correct <answer>
    Examples:
      | number                           | answer     |
      | divisible by three               | "Fizz"     |
      | divisible by five                | "Buzz"     |
      | divisible by both three and five | "FizzBuzz" |
      | not divisible by both            | "None"     |