package com.sidero.apptests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/*This runner class helps feature files acknowledge that it needs to run as part of a JUnit test and that there is code in the framework 
 * which matches up to "Steps". Effectively the runner class is the bridge between out feature files and steps. A feature is a use case 
 * that describes a particular function of software being tested. Feature files contain scenarios which describe a flow of events to be
 * tested. This flow is outlined using steps, steps are basically annotations like Given,And,When etc*/

/*When we run cucumber stuff run it (@RunWith) as part of Cucumber class. We are adding additional options when we run a test. plugin 
 * (replaces format depecated) is used for reporting purposes, what passed, what failed, what didn't run. It provides this 
 * kind of information We are saying we wish to use the pretty format for reporting and the results to be in json in the target folder. Features 
 * just tells us where our feature files are.*/
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","json:target/cucumber.json"},
features = {"src/test/java/com/sidero/apptests/"})//or possibly src/test/java/com/sidero/apptests       src/test/com.sidero.apptests/
public class CucumberRunner {

}
