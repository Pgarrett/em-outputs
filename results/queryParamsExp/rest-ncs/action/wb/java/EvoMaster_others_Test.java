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
import static org.hamcrest.Matchers.*;
import  io.restassured.config.JsonConfig;
import  io.restassured.path.json.config.JsonPathConfig;
import static io.restassured.config.RedirectConfig.redirectConfig;
import static org.evomaster.client.java.controller.contentMatchers.NumberMatcher.*;
import static org.evomaster.client.java.controller.contentMatchers.StringMatcher.*;
import static org.evomaster.client.java.controller.contentMatchers.SubStringMatcher.*;




/**
*  This file was automatically generated by EvoMaster on 2024-11-28T22:28:15-03:00[America/Argentina/Buenos_Aires]
 * <br>
*  The generated test suite contains 7 tests
 * <br>
*  Covered targets: 30
 * <br>
*  Used time: 0h 10m 0s
 * <br>
*  Needed budget for current results: 71%
 * <br>
*  This file contains test cases that represent failed calls, but not indicative of faults.
*/
public class EvoMaster_others_Test {

    
    private static final SutHandler controller = new em.embedded.org.restncs.EmbeddedEvoMasterController();
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
        controller.resetStateOfSUT();
    }
    
    
    
    
    @Test(timeout = 60000)
    public void test_0_getOnBessjReturns400() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/bessj/-823809005/0.7274248625305596?EMextraParam123=42")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_1_getOnExpintWithQueryParamReturns400() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/expint/-1479182897/0.6490667806551349?EMextraParam123=42")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_2_getOnExpintWithQueryParamReturns400() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "_EM_159_XYZ_")
                .get(baseUrlOfSut + "/api/expint/437/-1.325590449957621?EMextraParam123=42")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_3_getOnGammqWithQueryParamReturns400() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "42")
                .get(baseUrlOfSut + "/api/gammq/3.247160035184614E7/-6.0617420058464944E7")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_4_getOnGammqWithQueryParamReturns400() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/gammq/-8.988465674311579E307/0.0")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_5_getOnRemaindReturns400() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "42")
                .get(baseUrlOfSut + "/api/remainder/1864078054/440?EMextraParam123=42")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_6_getOnFisherReturns400() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "_EM_37_XYZ_")
                .get(baseUrlOfSut + "/api/fisher/2098151/277/9.348575936717188")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }


}
