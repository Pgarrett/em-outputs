import  org.junit.AfterClass;
import  org.junit.BeforeClass;
import  org.junit.Before;
import  org.junit.Test;
import static org.junit.Assert.*;
import  java.util.Map;
import  java.util.Arrays;
import  java.util.List;
import static org.evomaster.test.utils.EMTestUtils.*;
import  org.evomaster.client.java.controller.SutHandler;
import  io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import  io.restassured.response.ValidatableResponse;
import static org.evomaster.client.java.sql.dsl.SqlDsl.sql;
import  org.evomaster.client.java.controller.api.dto.database.operations.InsertionResultsDto;
import  org.evomaster.client.java.controller.api.dto.database.operations.InsertionDto;
import static org.hamcrest.Matchers.*;
import  io.restassured.config.JsonConfig;
import  io.restassured.path.json.config.JsonPathConfig;
import static io.restassured.config.RedirectConfig.redirectConfig;
import static org.evomaster.client.java.controller.contentMatchers.NumberMatcher.*;
import static org.evomaster.client.java.controller.contentMatchers.StringMatcher.*;
import static org.evomaster.client.java.controller.contentMatchers.SubStringMatcher.*;




/**
*  This file was automatically generated by EvoMaster on 2024-11-28T23:06:45.064-03:00[America/Argentina/Buenos_Aires]
 * <br>
*  The generated test suite contains 4 tests
 * <br>
*  Covered targets: 20
 * <br>
*  Used time: 0h 10m 1s
 * <br>
*  Needed budget for current results: 85%
 * <br>
*  This file contains test cases that are likely to indicate faults.
*/
public class EvoMaster_faults_Test {

    
    private static final SutHandler controller = new em.embedded.org.tsdes.EmbeddedEvoMasterController();
    private static String baseUrlOfSut;
    
    
    @BeforeClass
    public static void initClass() {
        controller.setupForGeneratedTest();
        baseUrlOfSut = controller.startSut();
        controller.registerOrExecuteInitSqlCommandsIfNeeded();
        assertNotNull(baseUrlOfSut);
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
        RestAssured.useRelaxedHTTPSValidation();
        RestAssured.urlEncodingEnabled = false;
        RestAssured.config = RestAssured.config()
            .jsonConfig(JsonConfig.jsonConfig().numberReturnType(JsonPathConfig.NumberReturnType.DOUBLE))
            .redirect(redirectConfig().followRedirects(false));
    }
    
    
    @AfterClass
    public static void tearDown() {
        controller.stopSut();
    }
    
    
    @Before
    public void initTest() {
        controller.resetDatabase(Arrays.asList("NEWS_ENTITY"));
        controller.resetStateOfSUT();
    }
    
    
    
    
    @Test(timeout = 60000)
    public void test_0_postOnNewsWithQueryParamCauses500_internalServerError() throws Exception {
        
        // Fault100. HTTP Status 500. org/tsdes/spring/examples/news/api/NewsRestApi_123_createNews POST:/news
        given().accept("application/vnd.tsdes.news+json;charset=UTF-8;version=2")
                .header("x-EMextraHeader123", "")
                .contentType("application/vnd.tsdes.news+json;charset=UTF-8;version=2")
                .body(" { " + 
                    " \"authorId\": \"_EM_6534_XYZ_\", " + 
                    " \"country\": \"uuAqg\", " + 
                    " \"text\": \"apntAKrqzDLZet\" " + 
                    " } ")
                .post(baseUrlOfSut + "/news")
                .then()
                .statusCode(500)// org/tsdes/spring/examples/news/api/NewsRestApi_123_createNews
                .assertThat()
                .contentType("application/vnd.tsdes.news+json")
                .body("'status'", numberMatches(500.0))
                .body("'error'", containsString("Internal Server Error"))
                .body("'message'", containsString("Could not commit JPA transaction; nested exception is javax.persistence.RollbackException: Error while committing the transaction"))
                .body("'path'", containsString("/news"));
    }
    
    
    @Test(timeout = 60000)
    public void test_1_postOnNewsWithQueryParamCauses500_internalServerError() throws Exception {
        
        // Fault100. HTTP Status 500. org/tsdes/spring/examples/news/api/NewsRestApi_123_createNews POST:/news
        given().accept("application/vnd.tsdes.news+json;charset=UTF-8;version=2")
                .header("x-EMextraHeader123", "")
                .contentType("application/json;charset=UTF-8")
                .body(" { " + 
                    " \"authorId\": \"_\", " + 
                    " \"country\": \"5Z7OeH9RU\", " + 
                    " \"newsId\": \"\", " + 
                    " \"text\": \"gmHAMsi\" " + 
                    " } ")
                .post(baseUrlOfSut + "/news")
                .then()
                .statusCode(500)// org/tsdes/spring/examples/news/api/NewsRestApi_123_createNews
                .assertThat()
                .contentType("application/vnd.tsdes.news+json")
                .body("'status'", numberMatches(500.0))
                .body("'error'", containsString("Internal Server Error"))
                .body("'message'", containsString("Could not commit JPA transaction; nested exception is javax.persistence.RollbackException: Error while committing the transaction"))
                .body("'path'", containsString("/news"));
    }
    
    
    @Test(timeout = 60000)
    public void test_2_putOnNewCauses500_internalServerErrorUsingSql() throws Exception {
        List<InsertionDto> insertions = sql().insertInto("NEWS_ENTITY", 744L)
                .d("ID", "0")
                .d("AUTHOR_ID", "\"b\"")
                .d("COUNTRY", "\"KoUYUwsO7UUoUU\"")
                .d("CREATION_TIME", "\"1985-08-08 08:50:55\"")
                .d("TEXT", "\"_EM_10683_XYZ_\"")
            .dtos();
        InsertionResultsDto insertionsresult = controller.execInsertionsIntoDatabase(insertions);
        
        // Fault100. HTTP Status 500. org/tsdes/spring/examples/news/api/NewsRestApi_204_update PUT:/news/{id}
        given().accept("application/vnd.tsdes.news+json;charset=UTF-8;version=2")
                .header("x-EMextraHeader123", "")
                .contentType("application/json")
                .body(" { " + 
                    " \"authorId\": \"0\", " + 
                    " \"country\": \"0\", " + 
                    " \"creationTime\": \"1943-03-13T05:06:51+15:50\", " + 
                    " \"id\": \"0\", " + 
                    " \"newsId\": \"0\", " + 
                    " \"text\": \"NCRsBB7O4\" " + 
                    " } ")
                .put(baseUrlOfSut + "/news/0")
                .then()
                .statusCode(500)// org/tsdes/spring/examples/news/api/NewsRestApi_204_update
                .assertThat()
                .contentType("application/vnd.tsdes.news+json")
                .body("'status'", numberMatches(500.0))
                .body("'error'", containsString("Internal Server Error"))
                .body("'message'", containsString("Could not commit JPA transaction; nested exception is javax.persistence.RollbackException: Error while committing the transaction"))
                .body("'path'", containsString("/news/0"));
    }
    
    
    @Test(timeout = 60000)
    public void test_3_putOnTextCauses500_internalServerErrorUsingSql() throws Exception {
        List<InsertionDto> insertions = sql().insertInto("NEWS_ENTITY", 49L)
                .d("ID", "53")
                .d("AUTHOR_ID", "\"_EM_969_XYZ_\"")
                .d("COUNTRY", "\"9BjFIFuliicJXZ4\"")
                .d("CREATION_TIME", "\"1909-05-05 03:44:22\"")
                .d("TEXT", "\"yZeLSeXIkSxd5if\"")
            .dtos();
        InsertionResultsDto insertionsresult = controller.execInsertionsIntoDatabase(insertions);
        
        // Fault100. HTTP Status 500. org/tsdes/spring/examples/news/api/NewsRestApi_233_updateText PUT:/news/{id}/text
        given().accept("application/vnd.tsdes.news+json;charset=UTF-8;version=2")
                .header("x-EMextraHeader123", "")
                .contentType("text/plain")
                .body("519")
                .put(baseUrlOfSut + "/news/53/text")
                .then()
                .statusCode(500)// org/tsdes/spring/examples/news/api/NewsRestApi_233_updateText
                .assertThat()
                .contentType("application/vnd.tsdes.news+json")
                .body("'status'", numberMatches(500.0))
                .body("'error'", containsString("Internal Server Error"))
                .body("'message'", containsString("Could not commit JPA transaction; nested exception is javax.persistence.RollbackException: Error while committing the transaction"))
                .body("'path'", containsString("/news/53/text"));
    }


}
