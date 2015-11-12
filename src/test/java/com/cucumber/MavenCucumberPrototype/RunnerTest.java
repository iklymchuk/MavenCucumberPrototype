package com.cucumber.MavenCucumberPrototype;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resource/"}
		//tags = {"@Application, @Server"}
		) 
public class RunnerTest {

}
