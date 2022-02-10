package week6day2runner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;
import week6day2steps.Base;

@CucumberOptions(features="src/test/java/week6day2features/lead1tags.feature",
glue="week6day2steps" ,
monochrome=true,
dryRun=false,
snippets=SnippetType.CAMELCASE
,tags="@Delete or @Create")

/*
 * @CucumberOptions(features=
 * "src/test/java/week6day2features/lead1tags.feature", glue="week6day2steps" ,
 * monochrome=true, dryRun=false, snippets=SnippetType.CAMELCASE
 * ,tags="not@Delete")
 */

/*
 * @CucumberOptions(features=
 * "src/test/java/week6day2features/lead1tags.feature", glue="week6day2steps" ,
 * monochrome=true, dryRun=false, snippets=SnippetType.CAMELCASE
 * ,tags="@Create")
 */

/*
 * @CucumberOptions(features=
 * "src/test/java/week6day2features/lead1tags.feature", glue="week6day2steps" ,
 * monochrome=true, dryRun=false, snippets=SnippetType.CAMELCASE
 * ,tags="@Delete and @Create")
 */

public class Lead1TagsRunner extends Base
{
	
	
}
