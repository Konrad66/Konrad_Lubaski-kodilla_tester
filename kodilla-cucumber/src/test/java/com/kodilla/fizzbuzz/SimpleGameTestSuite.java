package com.kodilla.fizzbuzz;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import static org.junit.jupiter.api.Assertions.*;
import static com.kodilla.fizzbuzz.SimpleGame.simpleGame;

class SimpleGameTestSuite {

    private int number;
    private String answer;

    @Given("number is {int} of value greater than zero")
    public void number_is_of_value_greater_than_zero(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        this.number = int1;
    }
    @When("I pass a number")
    public void i_pass_a_number() {
        // Write code here that turns the phrase above into concrete actions
        this.answer = simpleGame(number);
    }
    @Then("I should be told the correct {string}")
    public void i_should_be_told_the_correct(String string) {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(string, this.answer);
    }
}