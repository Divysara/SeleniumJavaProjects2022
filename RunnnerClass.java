package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//it should contain the step definition and feature file

@CucumberOptions(features ="featurefiles/OpenGoogle.feature", glue="stepDefinitions")
@RunWith(Cucumber.class)
public class RunnnerClass{
}


/*1...First create a feature folder inside the project, then create a file with .feature extension.
 * ------------
 
 * feature folder---> LogoCheck.feature--->
 * 
 *2.. Second u can see the file with cucumber symbol, ie, green color file will be created
 * -----------
 *3.. Third inside the file u see the following structure:
 * ----------------------------------------------------
 * #Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
    Given I want to write a step with precondition
    And some other precondition
    When I complete action
    And some other action
    And yet another action
    Then I validate the outcomes
    And check more outcomes

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
      
      
      
 4..Fourth step: type the following in the feature file that you created
---------------- 
Feature: This is to test google search
Scenario:Google search scenario
Given user is entering google.com
When user is typing the search term "wikipedia"
And enters the return key
Then the user should see the search results

5.  Fifth step: create a runner class in test folder and write the below codes:
----------------
@CucumberOptions(features ="featurefiles/OpenGoogle.feature", glue="stepDefinitions")
@RunWith(Cucumber.class)

6. Sixth step: run this class and you can see the recommendations for step definitions file.
 just copy and create the step definition file.
 
 7.Seventh Step: in this file you can type in the code that you need for the program.



 */

















