import  org.junit.AfterClass;
import  org.junit.BeforeClass;
import  org.junit.Before;
import  org.junit.Test;
import static org.junit.Assert.*;
import  java.util.Map;
import  java.util.List;
import static org.evomaster.test.utils.EMTestUtils.*;
import  org.evomaster.client.java.controller.SutHandler;
import  io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import  io.restassured.response.ValidatableResponse;
import static org.hamcrest.Matchers.*;
import  io.restassured.config.JsonConfig;
import  io.restassured.path.json.config.JsonPathConfig;
import static io.restassured.config.RedirectConfig.redirectConfig;
import static org.evomaster.client.java.controller.contentMatchers.NumberMatcher.*;
import static org.evomaster.client.java.controller.contentMatchers.StringMatcher.*;
import static org.evomaster.client.java.controller.contentMatchers.SubStringMatcher.*;




/**
*  This file was automatically generated by EvoMaster on 2024-10-17T16:33:16.054-03:00[America/Argentina/Buenos_Aires]
 * <br>
*  The generated test suite contains 8 tests
 * <br>
*  Covered targets: 8
 * <br>
*  Used time: 0h 10m 37s
 * <br>
*  Needed budget for current results: 97%
 * <br>
*  This file contains test cases that represent failed calls, but not indicative of faults.
*/
public class EvoMaster_others_Test {

    
    private static String baseUrlOfSut = "http://localhost:8080";
    
    
    @BeforeClass
    public static void initClass() {
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
        RestAssured.useRelaxedHTTPSValidation();
        RestAssured.urlEncodingEnabled = false;
        RestAssured.config = RestAssured.config()
            .jsonConfig(JsonConfig.jsonConfig().numberReturnType(JsonPathConfig.NumberReturnType.DOUBLE))
            .redirect(redirectConfig().followRedirects(false));
    }
    
    
    
    
    
    
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: POST:/news
    // 			Action parameters:
    // 				body: '{"country":"SeBcXl3_5sKjL", "creationTime":"2058-10-00T11:11:09", "newsId":"_jspe1BpwyC7"}'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.OptionalGene = body:'{"country":"SeBcXl3_5sKjL", "creationTime":"2058-10-00T11:11:09", "newsId":"_jspe1BpwyC7"}'
    // 				org.evomaster.core.search.gene.collection.EnumGene = contentType:'application/json;charset=UTF-8'
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = sendUnquoteJsonString:'true'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: POST:/news
    @Test(timeout = 60000)
    public void test_0_postOnNewsReturns400() throws Exception {
        
        given().accept("application/vnd.tsdes.news+json;charset=UTF-8;version=2")
                .contentType("application/json;charset=UTF-8")
                .body(" { " + 
                    " \"country\": \"SeBcXl3_5sKjL\", " + 
                    " \"creationTime\": \"2058-10-00T11:11:09\", " + 
                    " \"newsId\": \"_jspe1BpwyC7\" " + 
                    " } ")
                .post(baseUrlOfSut + "/news")
                .then()
                .statusCode(400)
                .assertThat()
                .contentType("application/vnd.tsdes.news+json")
                .body("'status'", numberMatches(400.0))
                .body("'error'", containsString("Bad Request"))
                .body("'message'", containsString("JSON parse error: Cannot deserialize value of type `java.time.ZonedDateTime` from String \"2058-10-00T11:11:09\": Failed to deserialize java.time.ZonedDateTime: (java.time.format.DateTimeParseException) Text '2058-10-00T11:11:09' could not be parsed at index 19; nested exception is com.fasterxml.jackson.databind.exc.InvalidFormatException: Cannot deserialize value of type `java.time.ZonedDateTime` from String \"2058-10-00T11:11:09\": Failed to deserialize java.time.ZonedDateTime: (java.time.format.DateTimeParseException) Text '2058-10-00T11:11:09' could not be parsed at index 19\n at [Source: (PushbackInputStream); line: 1, column: 44] (through reference chain: org.tsdes.spring.examples.news.dto.NewsDto[\"creationTime\"])"))
                .body("'path'", containsString("/news"));
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: DELETE:/news/{id}
    // 			Action parameters:
    // 				id: 'SlkhKq_V35Y_S'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = id:'SlkhKq_V35Y_S'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: DELETE:/news/{id}
    @Test(timeout = 60000)
    public void test_1_deleteOnNewReturns400() throws Exception {
        
        given().accept("*/*")
                .delete(baseUrlOfSut + "/news/SlkhKq_V35Y_S")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: PUT:/news/{id}/text
    // 			Action parameters:
    // 				id: '422'
    // 				body: ''
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = id:'422'
    // 				org.evomaster.core.search.gene.optional.OptionalGene = body:''
    // 				org.evomaster.core.search.gene.collection.EnumGene = contentType:'text/plain'
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = sendUnquoteJsonString:'false'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: PUT:/news/{id}/text
    @Test(timeout = 60000)
    public void test_2_putOnTextReturns400() throws Exception {
        
        given().accept("application/vnd.tsdes.news+json;charset=UTF-8;version=2")
                .contentType("text/plain")
                .body()
                .put(baseUrlOfSut + "/news/422/text")
                .then()
                .statusCode(400)
                .assertThat()
                .contentType("application/vnd.tsdes.news+json")
                .body("'status'", numberMatches(400.0))
                .body("'error'", containsString("Bad Request"))
                .body("'message'", containsString("Required request body is missing: public org.springframework.http.ResponseEntity<java.lang.Object> org.tsdes.spring.examples.news.api.NewsRestApi.updateText(java.lang.Long,java.lang.String)"))
                .body("'path'", containsString("/news/422/text"));
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: PUT:/news/{id}
    // 			Action parameters:
    // 				id: 'T'
    // 				body: '{"authorId":"", "creationTime":"2007-08-14T17:14:34", "newsId":"", "text":"FSg3e8abDFKPicpa"}'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = id:'T'
    // 				org.evomaster.core.search.gene.optional.OptionalGene = body:'{"authorId":"", "creationTime":"2007-08-14T17:14:34", "newsId":"", "text":"FSg3e8abDFKPicpa"}'
    // 				org.evomaster.core.search.gene.collection.EnumGene = contentType:'application/json'
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = sendUnquoteJsonString:'true'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: PUT:/news/{id}
    @Test(timeout = 60000)
    public void test_3_putOnNewReturns400() throws Exception {
        
        given().accept("application/vnd.tsdes.news+json;charset=UTF-8;version=2")
                .contentType("application/json")
                .body(" { " + 
                    " \"authorId\": \"\", " + 
                    " \"creationTime\": \"2007-08-14T17:14:34\", " + 
                    " \"newsId\": \"\", " + 
                    " \"text\": \"FSg3e8abDFKPicpa\" " + 
                    " } ")
                .put(baseUrlOfSut + "/news/T")
                .then()
                .statusCode(400)
                .assertThat()
                .contentType("application/vnd.tsdes.news+json")
                .body("'status'", numberMatches(400.0))
                .body("'error'", containsString("Bad Request"))
                .body("'message'", containsString("JSON parse error: Cannot deserialize value of type `java.time.ZonedDateTime` from String \"2007-08-14T17:14:34\": Failed to deserialize java.time.ZonedDateTime: (java.time.format.DateTimeParseException) Text '2007-08-14T17:14:34' could not be parsed at index 19; nested exception is com.fasterxml.jackson.databind.exc.InvalidFormatException: Cannot deserialize value of type `java.time.ZonedDateTime` from String \"2007-08-14T17:14:34\": Failed to deserialize java.time.ZonedDateTime: (java.time.format.DateTimeParseException) Text '2007-08-14T17:14:34' could not be parsed at index 19\n at [Source: (PushbackInputStream); line: 1, column: 32] (through reference chain: org.tsdes.spring.examples.news.dto.NewsDto[\"creationTime\"])"))
                .body("'path'", containsString("/news/T"));
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/news/{id}
    // 			Action parameters:
    // 				id: '42mN3Qw2MEeTP7k0'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = id:'42mN3Qw2MEeTP7k0'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/news/{id}
    @Test(timeout = 60000)
    public void test_4_getOnNewReturns404() throws Exception {
        
        given().accept("*/*")
                .get(baseUrlOfSut + "/news/42mN3Qw2MEeTP7k0")
                .then()
                .statusCode(404)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: PUT:/news/{id}/text
    // 			Action parameters:
    // 				id: '-4021590596492938191'
    // 				body: '-4021590596492938191'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = id:'-4021590596492938191'
    // 				org.evomaster.core.search.gene.optional.OptionalGene = body:'-4021590596492938191'
    // 				org.evomaster.core.search.gene.collection.EnumGene = contentType:'text/plain'
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = sendUnquoteJsonString:'true'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: PUT:/news/{id}/text
    @Test(timeout = 60000)
    public void test_5_putOnTextReturns404() throws Exception {
        
        given().accept("*/*")
                .contentType("text/plain")
                .body("-4021590596492938191")
                .put(baseUrlOfSut + "/news/-4021590596492938191/text")
                .then()
                .statusCode(404)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: PUT:/news/{id}
    // 			Action parameters:
    // 				id: '8W66D'
    // 				body: '{"authorId":"WLadpUdhr0wWoLc_", "id":"8W66D", "text":"jx"}'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = id:'8W66D'
    // 				org.evomaster.core.search.gene.optional.OptionalGene = body:'{"authorId":"WLadpUdhr0wWoLc_", "id":"8W66D", "text":"jx"}'
    // 				org.evomaster.core.search.gene.collection.EnumGene = contentType:'application/json'
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = sendUnquoteJsonString:'true'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: PUT:/news/{id}
    @Test(timeout = 60000)
    public void test_6_putOnNewReturns404() throws Exception {
        
        given().accept("*/*")
                .contentType("application/json")
                .body(" { " + 
                    " \"authorId\": \"WLadpUdhr0wWoLc_\", " + 
                    " \"id\": \"8W66D\", " + 
                    " \"text\": \"jx\" " + 
                    " } ")
                .put(baseUrlOfSut + "/news/8W66D")
                .then()
                .statusCode(404)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: DELETE:/news/{id}
    // 			Action parameters:
    // 				id: '1'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = id:'1'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: DELETE:/news/{id}
    @Test(timeout = 60000)
    public void test_7_deleteOnNewReturns404() throws Exception {
        
        given().accept("*/*")
                .delete(baseUrlOfSut + "/news/1")
                .then()
                .statusCode(404)
                .assertThat()
                .body(isEmptyOrNullString());
    }


}
