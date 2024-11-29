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
*  This file was automatically generated by EvoMaster on 2024-11-28T22:28:14.939-03:00[America/Argentina/Buenos_Aires]
 * <br>
*  The generated test suite contains 16 tests
 * <br>
*  Covered targets: 79
 * <br>
*  Used time: 0h 10m 0s
 * <br>
*  Needed budget for current results: 71%
 * <br>
*  This file contains test cases that represent successful calls.
*/
public class EvoMaster_successes_Test {

    
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
    public void test_0_getOnApi_docsReturnsObject() throws Exception {
        
        given().accept("*/*")
                .get(baseUrlOfSut + "/v2/api-docs")
                .then()
                .statusCode(200);
    }
    
    
    @Test(timeout = 60000)
    public void test_1_getOnBessjWithQueryParamReturnsObject() throws Exception {
        
        given().accept("application/json")
                .header("x-EMextraHeader123", "_EM_2_XYZ_")
                .get(baseUrlOfSut + "/api/bessj/112/0.6429868232730703?EMextraParam123=42")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'resultAsInt'", nullValue())
                .body("'resultAsDouble'", numberMatches(3.216746067110288E-238));
    }
    
    
    @Test(timeout = 60000)
    public void test_2_getOnBessjWithQueryParamReturnsObject() throws Exception {
        
        given().accept("application/json")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/bessj/8/-8.0")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'resultAsInt'", nullValue())
                .body("'resultAsDouble'", numberMatches(0.22345498635390812));
    }
    
    
    @Test(timeout = 60000)
    public void test_3_getOnExpintReturnsObject() throws Exception {
        
        given().accept("application/json")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/expint/576/0.6432067148781443?EMextraParam123=42")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'resultAsInt'", nullValue())
                .body("'resultAsDouble'", numberMatches(9.130712007251525E-4));
    }
    
    
    @Test(timeout = 60000)
    public void test_4_getOnGammqReturnsObject() throws Exception {
        
        given().accept("application/json")
                .header("x-EMextraHeader123", "42")
                .get(baseUrlOfSut + "/api/gammq/0.23742024223705582/0.46516092037038026?EMextraParam123=_EM_4_XYZ_")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'resultAsInt'", nullValue())
                .body("'resultAsDouble'", numberMatches(0.1551392643477152));
    }
    
    
    @Test(timeout = 60000)
    public void test_5_getOnRemaindWithQueryParamReturnsObject() throws Exception {
        
        given().accept("application/json")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/remainder/554/725")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'resultAsInt'", numberMatches(-1.0))
                .body("'resultAsDouble'", nullValue());
    }
    
    
    @Test(timeout = 60000)
    public void test_6_getOnRemaindWithQueryParamReturnsObject() throws Exception {
        
        given().accept("application/json")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/remainder/-106/980")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'resultAsInt'", numberMatches(-1.0))
                .body("'resultAsDouble'", nullValue());
    }
    
    
    @Test(timeout = 60000)
    public void test_7_getOnRemaindWithQueryParamReturnsObject() throws Exception {
        
        given().accept("application/json")
                .header("x-EMextraHeader123", "42")
                .get(baseUrlOfSut + "/api/remainder/656/-126?EMextraParam123=_EM_789_XYZ_")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'resultAsInt'", numberMatches(26.0))
                .body("'resultAsDouble'", nullValue());
    }
    
    
    @Test(timeout = 60000)
    public void test_8_getOnFisherWithQueryParamReturnsObject() throws Exception {
        
        given().accept("application/json")
                .header("x-EMextraHeader123", "_EM_0_XYZ_")
                .get(baseUrlOfSut + "/api/fisher/654/407/0.7583087960497676")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'resultAsInt'", nullValue())
                .body("'resultAsDouble'", numberMatches(8.657367970538661E-4));
    }
    
    
    @Test(timeout = 60000)
    public void test_9_getOnFisherWithQueryParamReturnsObject() throws Exception {
        
        given().accept("application/json")
                .header("x-EMextraHeader123", "42")
                .get(baseUrlOfSut + "/api/fisher/-1047682/238/0.8788463951369071")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'resultAsInt'", nullValue())
                .body("'resultAsDouble'", numberMatches(1.0));
    }
    
    
    @Test(timeout = 60000)
    public void test_10_getOnTrianglWithQueryParamReturnsObject() throws Exception {
        
        given().accept("application/json")
                .header("x-EMextraHeader123", "42")
                .get(baseUrlOfSut + "/api/triangle/568/499/428")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'resultAsInt'", numberMatches(1.0))
                .body("'resultAsDouble'", nullValue());
    }
    
    
    @Test(timeout = 60000)
    public void test_11_getOnTrianglWithQueryParamReturnsObject() throws Exception {
        
        given().accept("application/json")
                .header("x-EMextraHeader123", "42")
                .get(baseUrlOfSut + "/api/triangle/-67108372/16777937/33336?EMextraParam123=42")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'resultAsInt'", numberMatches(0.0))
                .body("'resultAsDouble'", nullValue());
    }
    
    
    @Test(timeout = 60000)
    public void test_12_getOnTrianglWithQueryParamReturnsObject() throws Exception {
        
        given().accept("application/json")
                .header("x-EMextraHeader123", "_EM_32_XYZ_")
                .get(baseUrlOfSut + "/api/triangle/891/-779973179/230?EMextraParam123=_EM_31_XYZ_")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'resultAsInt'", numberMatches(0.0))
                .body("'resultAsDouble'", nullValue());
    }
    
    
    @Test(timeout = 60000)
    public void test_13_getOnTrianglWithQueryParamReturnsObject() throws Exception {
        
        given().accept("application/json")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/triangle/138/644/-161733606")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'resultAsInt'", numberMatches(0.0))
                .body("'resultAsDouble'", nullValue());
    }
    
    
    @Test(timeout = 60000)
    public void test_14_getOnFisherWithQueryParamReturnsObject() throws Exception {
        
        given().accept("application/json")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/fisher/903/-65134/1.7061650219661613")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'resultAsInt'", nullValue())
                .body("'resultAsDouble'", containsString("NaN"));
    }
    
    
    @Test(timeout = 60000)
    public void test_15_getOnFisherWithQueryParamReturnsObject() throws Exception {
        
        given().accept("application/json")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/fisher/461/49/-1.8695144968005954")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'resultAsInt'", nullValue())
                .body("'resultAsDouble'", containsString("NaN"));
    }


}
