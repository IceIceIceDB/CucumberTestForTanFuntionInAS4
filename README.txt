This Cucumber Test is used to test our previous Tan funtion in AS4.
Work Enviroment is Windsors 10 x64.

What we Use:
1.Java 
2.Maven
3.Cucumber

Steps:
1. Open windows cmd prompt
2. Create project by typing:
mvn archetype:generate -DarchetypeGroupId=io.cucumber -DarchetypeArtifactId=cucumber-archetype -DarchetypeVersion=6.8.1 -DgroupId=TanCucumberTest -DartifactId=TanCucumberTest -Dpackage=TanCucumberTest -Dversion=1.0.0-SNAPSHOT -DinteractiveMode=false
3. Copy What_is_Tan_Result.feature to .\TanCucumberTest\src\test\resources\TanCucumberTest
4. Copy StepDefinitions.java to .\TanCucumberTest\src\test\java\TanCucumberTest and choose replace.
5. Create a folder named general at .\TanCucumberTest\src\test\java and copy DegreeMeasurement.java, IAngleMeasurement.java, Maths.java, Quadrant.java and RadianMeasurement.java in it.
6. Create a folder named tangent at .\TanCucumberTest\src\test\java and copy Tan_FinalVersion.java in it.
7. Run test in cmd prompt by typing:
mvn test

Excepted result likes below:

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running TanCucumberTest.RunCucumberTest

Scenario Outline: Result of Tan # TanCucumberTest/What_is_Tan_Result.feature:12
  Given input is "0"            # TanCucumberTest.StepDefinitions.input_is(java.lang.String)
  When I ask what is reuslt     # TanCucumberTest.StepDefinitions.i_ask_what_is_result()
  Then I should be told "0"     # TanCucumberTest.StepDefinitions.i_should_be_told(java.lang.String)

Scenario Outline: Result of Tan # TanCucumberTest/What_is_Tan_Result.feature:13
  Given input is "45"           # TanCucumberTest.StepDefinitions.input_is(java.lang.String)
  When I ask what is reuslt     # TanCucumberTest.StepDefinitions.i_ask_what_is_result()
  Then I should be told "1"     # TanCucumberTest.StepDefinitions.i_should_be_told(java.lang.String)

Scenario Outline: Result of Tan # TanCucumberTest/What_is_Tan_Result.feature:14
  Given input is "135"          # TanCucumberTest.StepDefinitions.input_is(java.lang.String)
  When I ask what is reuslt     # TanCucumberTest.StepDefinitions.i_ask_what_is_result()
  Then I should be told "-1"    # TanCucumberTest.StepDefinitions.i_should_be_told(java.lang.String)

Scenario Outline: Result of Tan # TanCucumberTest/What_is_Tan_Result.feature:15
  Given input is "180"          # TanCucumberTest.StepDefinitions.input_is(java.lang.String)
  When I ask what is reuslt     # TanCucumberTest.StepDefinitions.i_ask_what_is_result()
  Then I should be told "0"     # TanCucumberTest.StepDefinitions.i_should_be_told(java.lang.String)

Scenario Outline: Result of Tan # TanCucumberTest/What_is_Tan_Result.feature:16
  Given input is "225"          # TanCucumberTest.StepDefinitions.input_is(java.lang.String)
  When I ask what is reuslt     # TanCucumberTest.StepDefinitions.i_ask_what_is_result()
  Then I should be told "1"     # TanCucumberTest.StepDefinitions.i_should_be_told(java.lang.String)

Scenario Outline: Result of Tan # TanCucumberTest/What_is_Tan_Result.feature:17
  Given input is "315"          # TanCucumberTest.StepDefinitions.input_is(java.lang.String)
  When I ask what is reuslt     # TanCucumberTest.StepDefinitions.i_ask_what_is_result()
  Then I should be told "-1"    # TanCucumberTest.StepDefinitions.i_should_be_told(java.lang.String)

Scenario Outline: Result of Tan # TanCucumberTest/What_is_Tan_Result.feature:18
  Given input is "360"          # TanCucumberTest.StepDefinitions.input_is(java.lang.String)
  When I ask what is reuslt     # TanCucumberTest.StepDefinitions.i_ask_what_is_result()
  Then I should be told "0"     # TanCucumberTest.StepDefinitions.i_should_be_told(java.lang.String)

Scenario Outline: Result of Tan   # TanCucumberTest/What_is_Tan_Result.feature:19
  Given input is "90"             # TanCucumberTest.StepDefinitions.input_is(java.lang.String)
  When I ask what is reuslt       # TanCucumberTest.StepDefinitions.i_ask_what_is_result()
  Then I should be told "Invalid" # TanCucumberTest.StepDefinitions.i_should_be_told(java.lang.String)

Scenario Outline: Result of Tan   # TanCucumberTest/What_is_Tan_Result.feature:20
  Given input is "270"            # TanCucumberTest.StepDefinitions.input_is(java.lang.String)
  When I ask what is reuslt       # TanCucumberTest.StepDefinitions.i_ask_what_is_result()
  Then I should be told "Invalid" # TanCucumberTest.StepDefinitions.i_should_be_told(java.lang.String)
┌───────────────────────────────────────────────────────────────────────────────────┐
│ Share your Cucumber Report with your team at https://reports.cucumber.io          │
│ Activate publishing with one of the following:                                    │
│                                                                                   │
│ src/test/resources/cucumber.properties:          cucumber.publish.enabled=true    │
│ src/test/resources/junit-platform.properties:    cucumber.publish.enabled=true    │
│ Environment variable:                            CUCUMBER_PUBLISH_ENABLED=true    │
│ JUnit:                                           @CucumberOptions(publish = true) │
│                                                                                   │
│ More information at https://reports.cucumber.io/docs/cucumber-jvm                 │
│                                                                                   │
│ Disable this message with one of the following:                                   │
│                                                                                   │
│ src/test/resources/cucumber.properties:          cucumber.publish.quiet=true      │
│ src/test/resources/junit-platform.properties:    cucumber.publish.quiet=true      │
└───────────────────────────────────────────────────────────────────────────────────┘
Tests run: 9, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.373 sec

Results :

Tests run: 9, Failures: 0, Errors: 0, Skipped: 0

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.756 s
[INFO] Finished at: 2021-03-02T16:44:24+08:00
[INFO] ------------------------------------------------------------------------


