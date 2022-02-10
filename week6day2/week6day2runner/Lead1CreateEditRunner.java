package week6day2runner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;
import week6day2steps.Base;

@CucumberOptions(features="src/test/java/week6day2features/lead1createedit.feature",
glue="week6day2steps" ,
monochrome=true,
dryRun=false,
snippets=SnippetType.CAMELCASE)

public class Lead1CreateEditRunner extends Base
{
	
}
