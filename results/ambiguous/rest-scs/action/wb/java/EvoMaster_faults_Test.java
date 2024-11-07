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
*  This file was automatically generated by EvoMaster on 2024-11-07T17:07:19.371-03:00[America/Argentina/Buenos_Aires]
 * <br>
*  The generated test suite contains 32 tests
 * <br>
*  Covered targets: 89
 * <br>
*  Used time: 0h 10m 1s
 * <br>
*  Needed budget for current results: 68%
 * <br>
*  This file contains test cases that are likely to indicate faults.
*/
public class EvoMaster_faults_Test {

    
    private static final SutHandler controller = new em.embedded.org.restscs.EmbeddedEvoMasterController();
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
    public void test_0_getOnText2txtReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/text2txt/{word1}/{word2}/{word3} -> GET on path '/api/text2txt/{word1}/{word2}/{word3}' defines a response schema but no response body found.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/text2txt/by/_EM_4102_XYZ_/b4N0GY")
                .then()
                .statusCode(200)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_1_getOnText2txtReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/text2txt/{word1}/{word2}/{word3} -> GET on path '/api/text2txt/{word1}/{word2}/{word3}' defines a response schema but no response body found.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/text2txt/see/_EM_4102_XYZ_/FbT7LxQghqeITAr")
                .then()
                .statusCode(200)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_2_getOnText2txtReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/text2txt/{word1}/{word2}/{word3} -> Response status 400 not defined for path '/api/text2txt/{word1}/{word2}/{word3}'.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/text2txt/sFpi/_EM_1156_XYZ_/MxOa%5C")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_3_getOnCookiReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/cookie/{name}/{val}/{site} -> Response status 400 not defined for path '/api/cookie/{name}/{val}/{site}'.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/cookie/_EM_9060_XYZ_/bES_4B8EaOY%5C_/i")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_4_getOnOrdered4ReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/ordered4/{w}/{x}/{z}/{y} -> Response status 400 not defined for path '/api/ordered4/{w}/{x}/{z}/{y}'.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/ordered4/M%5CJfx/_EM_11521_XYZ_/gqg2YT6G_/aPtAt")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_5_getOnFilesuffixReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/filesuffix/{directory}/{file} -> Response status 400 not defined for path '/api/filesuffix/{directory}/{file}'.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/filesuffix/PPzDNK2Sz/oC7Rbo%5CbCls3vZRj")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_6_getOnPatReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/pat/{txt}/{pat} -> Response status 400 not defined for path '/api/pat/{txt}/{pat}'.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/pat/vBxa905mdqp1xG/Z%5C%5Bv")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_7_getOnPatReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/pat/{txt} -> Response status 400 not defined for path '/api/pat/{txt}'.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/pat/UO%5CR8VlSVf")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_8_getOnDateparsReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/dateparse/{dayname}/{monthname} -> Response status 400 not defined for path '/api/dateparse/{dayname}/{monthname}'.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/dateparse/pa%5C/feb")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_9_getOnCostfunReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/costfuns/{i}/{s} -> Response status 400 not defined for path '/api/costfuns/{i}/{s}'.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/costfuns/0/bThU_jaCzz_%5C")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_10_getOnNotypevarReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/notypevar/{i}/{s} -> Response status 400 not defined for path '/api/notypevar/{i}/{s}'.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/notypevar/906/_IM_S54%5B%5C_XYaK")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_11_getOnTitlReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/title/{sex}/{title} -> Response status 400 not defined for path '/api/title/{sex}/{title}'.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/title/_EM_36806_XYZ_/F0XOjcbl_Ag%5CHX")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_12_getOnCalcReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/calc/{op}/{arg1}/{arg2} -> Response status 400 not defined for path '/api/calc/{op}/{arg1}/{arg2}'.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/calc/%5C9Wh/0.29684214436305656/0.36427057938150254?EMextraParam123=_EM_1733_XYZ_")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_13_getOnOrdered4ReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/ordered4/{w}/{x}/{z}/{y} -> No response body is expected but one was found.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/ordered4/;/_EM_12671_XYZ_/Gpk/kTv1PBoDFZljiq4")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(404.0))
                .body("'error'", containsString("Not Found"))
                .body("'message'", containsString("No message available"))
                .body("'path'", containsString("/api/ordered4/;/_EM_12671_XYZ_/Gpk/kTv1PBoDFZljiq4"));
    }
    
    
    @Test(timeout = 60000)
    public void test_14_getOnPatReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/pat/{txt} -> No response body is expected but one was found.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/pat/;l7D_9K")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(404.0))
                .body("'error'", containsString("Not Found"))
                .body("'message'", containsString("No message available"))
                .body("'path'", containsString("/api/pat/;l7D_9K"));
    }
    
    
    @Test(timeout = 60000)
    public void test_15_getOnPatReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/pat/{txt} -> No API path found that matches request '/api/pat/gopher//:s/y9'.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/pat/gopher//:s/y9")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(404.0))
                .body("'error'", containsString("Not Found"))
                .body("'message'", containsString("No message available"))
                .body("'path'", containsString("/api/pat/gopher//:s/y9"));
    }
    
    
    @Test(timeout = 60000)
    public void test_16_getOnPatReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/pat/{txt} -> No API path found that matches request '/api/pat/http//:t/y9e'.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/pat/http//:t/y9e")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(404.0))
                .body("'error'", containsString("Not Found"))
                .body("'message'", containsString("No message available"))
                .body("'path'", containsString("/api/pat/http//:t/y9e"));
    }
    
    
    @Test(timeout = 60000)
    public void test_17_getOnPatReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/pat/{txt} -> No API path found that matches request '/api/pat/http//:ud/y9f'.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/pat/http//:ud/y9f")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(404.0))
                .body("'error'", containsString("Not Found"))
                .body("'message'", containsString("No message available"))
                .body("'path'", containsString("/api/pat/http//:ud/y9f"));
    }
    
    
    @Test(timeout = 60000)
    public void test_18_getOnPatReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/pat/{txt} -> No API path found that matches request '/api/pat/http//:ue/y9f'.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/pat/http//:ue/y9f")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(404.0))
                .body("'error'", containsString("Not Found"))
                .body("'message'", containsString("No message available"))
                .body("'path'", containsString("/api/pat/http//:ue/y9f"));
    }
    
    
    @Test(timeout = 60000)
    public void test_19_getOnPatReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/pat/{txt} -> No API path found that matches request '/api/pat/http//:u8/y9f'.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/pat/http//:u8/y9f")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(404.0))
                .body("'error'", containsString("Not Found"))
                .body("'message'", containsString("No message available"))
                .body("'path'", containsString("/api/pat/http//:u8/y9f"));
    }
    
    
    @Test(timeout = 60000)
    public void test_20_getOnPatReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/pat/{txt} -> No API path found that matches request '/api/pat/ftp//:f/b86'.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/pat/ftp//:f/b86")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(404.0))
                .body("'error'", containsString("Not Found"))
                .body("'message'", containsString("No message available"))
                .body("'path'", containsString("/api/pat/ftp//:f/b86"));
    }
    
    
    @Test(timeout = 60000)
    public void test_21_getOnPatReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/pat/{txt} -> No API path found that matches request '/api/pat/http//:q/g'.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/pat/http//:q/g")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(404.0))
                .body("'error'", containsString("Not Found"))
                .body("'message'", containsString("No message available"))
                .body("'path'", containsString("/api/pat/http//:q/g"));
    }
    
    
    @Test(timeout = 60000)
    public void test_22_getOnText2txtReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/text2txt/{word1}/{word2}/{word3} -> No response body is expected but one was found.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/text2txt/6AwMmNS2uMVzI/;EMUe9885_XY%5B_/_EM_39886_XYZ_")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(404.0))
                .body("'error'", containsString("Not Found"))
                .body("'message'", containsString("No message available"))
                .body("'path'", containsString("/api/text2txt/6AwMmNS2uMVzI/;EMUe9885_XY%5B_/_EM_39886_XYZ_"));
    }
    
    
    @Test(timeout = 60000)
    public void test_23_getOnPatReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/pat/{txt} -> No API path found that matches request '/api/pat/gopher//:a6/vm'.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/pat/gopher//:a6/vm")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(404.0))
                .body("'error'", containsString("Not Found"))
                .body("'message'", containsString("No message available"))
                .body("'path'", containsString("/api/pat/gopher//:a6/vm"));
    }
    
    
    @Test(timeout = 60000)
    public void test_24_getOnPatReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/pat/{txt} -> No API path found that matches request '/api/pat/gopher//:b7/vm'.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/pat/gopher//:b7/vm")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(404.0))
                .body("'error'", containsString("Not Found"))
                .body("'message'", containsString("No message available"))
                .body("'path'", containsString("/api/pat/gopher//:b7/vm"));
    }
    
    
    @Test(timeout = 60000)
    public void test_25_getOnPatReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/pat/{txt} -> No API path found that matches request '/api/pat/gopher//:c7/vm'.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/pat/gopher//:c7/vm")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(404.0))
                .body("'error'", containsString("Not Found"))
                .body("'message'", containsString("No message available"))
                .body("'path'", containsString("/api/pat/gopher//:c7/vm"));
    }
    
    
    @Test(timeout = 60000)
    public void test_26_getOnPatReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/pat/{txt} -> No API path found that matches request '/api/pat/gopher//:c73/vn'.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/pat/gopher//:c73/vn")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(404.0))
                .body("'error'", containsString("Not Found"))
                .body("'message'", containsString("No message available"))
                .body("'path'", containsString("/api/pat/gopher//:c73/vn"));
    }
    
    
    @Test(timeout = 60000)
    public void test_27_getOnPatReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/pat/{txt} -> No API path found that matches request '/api/pat/http//:d73/vn'.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/pat/http//:d73/vn")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(404.0))
                .body("'error'", containsString("Not Found"))
                .body("'message'", containsString("No message available"))
                .body("'path'", containsString("/api/pat/http//:d73/vn"));
    }
    
    
    @Test(timeout = 60000)
    public void test_28_getOnPatReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/pat/{txt} -> No API path found that matches request '/api/pat/http//:e73/vn'.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/pat/http//:e73/vn")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(404.0))
                .body("'error'", containsString("Not Found"))
                .body("'message'", containsString("No message available"))
                .body("'path'", containsString("/api/pat/http//:e73/vn"));
    }
    
    
    @Test(timeout = 60000)
    public void test_29_getOnPatReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/pat/{txt} -> No API path found that matches request '/api/pat/http//:e73/wn'.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/pat/http//:e73/wn")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(404.0))
                .body("'error'", containsString("Not Found"))
                .body("'message'", containsString("No message available"))
                .body("'path'", containsString("/api/pat/http//:e73/wn"));
    }
    
    
    @Test(timeout = 60000)
    public void test_30_getOnPatReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/pat/{txt} -> No API path found that matches request '/api/pat/http//:e3/xn'.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/pat/http//:e3/xn")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(404.0))
                .body("'error'", containsString("Not Found"))
                .body("'message'", containsString("No message available"))
                .body("'path'", containsString("/api/pat/http//:e3/xn"));
    }
    
    
    @Test(timeout = 60000)
    public void test_31_getOnCostfunReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/costfuns/{i}/{s} -> No response body is expected but one was found.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/costfuns/27/;TMReQU")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(404.0))
                .body("'error'", containsString("Not Found"))
                .body("'message'", containsString("No message available"))
                .body("'path'", containsString("/api/costfuns/27/;TMReQU"));
    }


}
