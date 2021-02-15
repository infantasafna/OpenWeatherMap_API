# OpenWeatherMap_API


Rest Assured.io framework for API Automation

Step by step guide for the setup of Rest Assured.io

Step 1) Install Java.
Step 2) Download an IDE eclipse
Step 3) InstallMaven and set up your eclipse

Setup Rest Assured

1. Create a Maven Project in your IDE.
2. Open your POM.xml

For Rest Assured.io: For Java version < 9 users:

Add the below dependency to your POM.xml:

</dependency>
<!-- https://mvnrepository.com/artifact/io.rest-assured/rest-assured -->
<dependency>
    <groupId>io.rest-assured</groupId>
    <artifactId>rest-assured</artifactId>
    <version>4.3.3</version>
    <scope>test</scope>
</dependency>
<!-- https://mvnrepository.com/artifact/io.rest-assured/json-path -->
<dependency>
    <groupId>io.rest-assured</groupId>
    <artifactId>json-path</artifactId>
    <version>4.3.3</version>
</dependency>
<!-- https://mvnrepository.com/artifact/io.rest-assured/xml-path -->
<dependency>
    <groupId>io.rest-assured</groupId>
    <artifactId>xml-path</artifactId>
    <version>4.3.3</version>
</dependency>
<!-- https://mvnrepository.com/artifact/io.rest-assured/json-schema-validator -->
<dependency>
    <groupId>io.rest-assured</groupId>
    <artifactId>json-schema-validator</artifactId>
    <version>4.3.3</version>
</dependency>
<!-- https://mvnrepository.com/artifact/com.googlecode.json-simple/json-simple -->
<dependency>
    <groupId>com.googlecode.json-simple</groupId>
    <artifactId>json-simple</artifactId>
    <version>1.1.1</version>
</dependency>
<!-- https://mvnrepository.com/artifact/org.hamcrest/hamcrest-all -->
<dependency>
    <groupId>org.hamcrest</groupId>
    <artifactId>hamcrest-all</artifactId>
    <version>1.3</version>
    <scope>test</scope>
</dependency>

For Rest Assured.io : For Java version 9+ users :

<dependency>
<groupId>io.rest-assured</groupId>
<artifactId>rest-assured-all</artifactId>
<version>4.2.0</version>
<scope>test</scope>
</dependency>


3. Perform a maven build to import all dependencies
4. Add the below lines in your java class

import io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import io.restassured.http.ContentType;
import static org.hamcrest.Matchers.*;

Syntax:
The syntax of Rest Assured.io is the most beautiful part, as it is very BDD like and understandable.

Given(). 
        param("x", "y"). 
        header("z", "w").
when().
Method().
Then(). 
        statusCode(XXX).
        body("x, ”y", equalTo("z"));


Explanation:

Given() - 'Given' keyword, lets you set a background, here, you pass the request headers, query and path param, body, cookies. This is optional if these items are not needed in the request
When() - 'when' keyword marks the premise of your scenario. For example, 'when' you get/post/put something, do something else.
Method() - Substitute this with any of the CRUD operations(get/post/put/delete)
Then() - Your assert and matcher conditions go here
