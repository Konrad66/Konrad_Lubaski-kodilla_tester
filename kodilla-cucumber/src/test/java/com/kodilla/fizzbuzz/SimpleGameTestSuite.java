package com.kodilla.fizzbuzz;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import static org.junit.jupiter.api.Assertions.*;
import static com.kodilla.fizzbuzz.SimpleGame.simpleGame;

class SimpleGameTestSuite {

    private int number;
    private String answer;

    @Given("number is divisible by three")
    public void number_is_divisible_by_three() {
        this.number = 3;
    }

    @Given("number is divisible by five")
    public void number_is_divisible_by_five() {
        this.number = 5;
    }

    @Given("number is divisible by three and five")
    public void number_is_divisible_by_three_and_five() {
        this.number = 15;
    }

    @Given("number isn't divisible by three and five")
    public void number_isnt_divisible_by_three_and_five() {
        this.number = 6;
    }

    @When("I pass a number")
    public void I_pass_a_number() {
        this.answer = simpleGame(this.number);
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String string) {
        assertEquals(string, this.answer);
    }
}