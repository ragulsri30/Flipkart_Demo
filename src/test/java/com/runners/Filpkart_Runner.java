package com.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Flipkar_Features_File",glue = {"com.stepdefinition","com.hooks.Hooks"}, tags = "@new")
public class Filpkart_Runner {

}
