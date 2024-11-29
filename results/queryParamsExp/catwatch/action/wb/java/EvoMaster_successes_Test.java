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
*  This file was automatically generated by EvoMaster on 2024-11-28T21:36:07.750-03:00[America/Argentina/Buenos_Aires]
 * <br>
*  The generated test suite contains 15 tests
 * <br>
*  Covered targets: 151
 * <br>
*  Used time: 0h 12m 24s
 * <br>
*  Needed budget for current results: 100%
 * <br>
*  This file contains test cases that represent successful calls.
*/
public class EvoMaster_successes_Test {

    
    private static final SutHandler controller = new em.embedded.org.zalando.EmbeddedEvoMasterController();
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
        controller.resetDatabase(Arrays.asList("LANGUAGE_LIST","MAINTAINERS","PROJECT","STATISTICS"));
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
    public void test_1_getOnLanguagesWithQueryParamsReturnsEmptyList() throws Exception {
        
        given().accept("application/json")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/statistics/languages?EMextraParam123=42")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("size()", equalTo(0));
    }
    
    
    @Test(timeout = 60000)
    public void test_2_getOnLanguagesWithQueryParamsReturnsEmptyList() throws Exception {
        
        given().accept("application/json")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/statistics/languages?organizations=ChkleIt_Vk")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("size()", equalTo(0));
    }
    
    
    @Test(timeout = 60000)
    public void test_3_getOnStatisticsWithQueryParamsReturnsEmptyList() throws Exception {
        
        given().accept("application/json")
                .header("x-EMextraHeader123", "")
                .header("X-Organizations", "G")
                .get(baseUrlOfSut + "/statistics")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("size()", equalTo(0));
    }
    
    
    @Test(timeout = 60000)
    public void test_4_getOnStatisticsWithQueryParamsReturnsEmptyList() throws Exception {
        
        given().accept("application/json")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/statistics?" + 
                    "organizations=_EM_126_XYZ_&" + 
                    "EMextraParam123=_EM_127_XYZ_")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("size()", equalTo(0));
    }
    
    
    @Test(timeout = 60000)
    public void test_5_getOnLanguagesWithQueryParamsReturnsEmptyList() throws Exception {
        
        given().accept("application/json")
                .header("x-EMextraHeader123", "_EM_19_XYZ_")
                .get(baseUrlOfSut + "/languages?" + 
                    "organizations=_EM_16_XYZ_&" + 
                    "q=_EM_17_XYZ_")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("size()", equalTo(0));
    }
    
    
    @Test(timeout = 60000)
    public void test_6_getOnLanguagesWithQueryParamsReturnsEmptyList() throws Exception {
        
        given().accept("application/json")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/languages?" + 
                    "organizations=eHhd40yi34zHl&" + 
                    "offset=801")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("size()", equalTo(0));
    }
    
    
    @Test(timeout = 60000)
    public void test_7_getOnLanguagesWithQueryParamsReturnsEmptyList() throws Exception {
        
        given().accept("application/json")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/languages?" + 
                    "organizations=34pEn&" + 
                    "limit=444&" + 
                    "offset=201&" + 
                    "q=&" + 
                    "EMextraParam123=nGcd")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("size()", equalTo(0));
    }
    
    
    @Test(timeout = 60000)
    public void test_8_getOnProjectsWithQueryParamsReturnsEmptyListUsingSql() throws Exception {
        List<InsertionDto> insertions = sql().insertInto("PROJECT", 79L)
                .d("COMMITS_COUNT", "84")
                .d("CONTRIBUTORS_COUNT", "NULL")
                .d("DESCRIPTION", "\"_EM_914_XYZ_\"")
                .d("FORKS_COUNT", "887")
                .d("GIT_HUB_PROJECT_ID", "NULL")
                .d("LAST_PUSHED", "NULL")
                .d("NAME", "\"_EM_527_XYZ_\"")
                .d("ORGANIZATION_NAME", "\"S5lgSbQ436G\"")
                .d("PRIMARY_LANGUAGE", "NULL")
                .d("SCORE", "712")
                .d("SNAPSHOT_DATE", "\"1960-06-21 11:11:53\"")
                .d("STARS_COUNT", "NULL")
                .d("URL", "\"RarNjTZ\"")
                .d("TITLE", "\"OA7yb1bm\"")
                .d("IMAGE", "\"BVLCRgIgzI5_i2t\"")
                .d("EXTERNAL_CONTRIBUTORS_COUNT", "125")
            .dtos();
        InsertionResultsDto insertionsresult = controller.execInsertionsIntoDatabase(insertions);
        
        given().accept("application/json")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/projects?" + 
                    "organizations=g5l&" + 
                    "start_date=1954-07-27T05%3A48%3A14.570Z&" + 
                    "sortBy=hDf_YSHpw&" + 
                    "q=Y2d9AG")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("size()", equalTo(0));
    }
    
    
    @Test(timeout = 60000)
    public void test_9_getOnProjectsWithQueryParamsReturnsEmptyList() throws Exception {
        
        given().accept("application/json")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/projects?" + 
                    "organizations=raxo&" + 
                    "offset=911&" + 
                    "end_date=2043-07-12T14%3A47%3A06.430Z&" + 
                    "sortBy=_EM_206_XYZ_&" + 
                    "q=SsKM9Itd")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("size()", equalTo(0));
    }
    
    
    @Test(timeout = 60000)
    public void test_10_getOnProjectsWithQueryParamsReturnsEmptyList() throws Exception {
        
        given().accept("application/json")
                .header("x-EMextraHeader123", "42")
                .get(baseUrlOfSut + "/projects?" + 
                    "limit=261&" + 
                    "offset=938&" + 
                    "end_date=2095-02-16T11%3A28%3A09.903-05%3A44&" + 
                    "language=_ZHY")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("size()", equalTo(0));
    }
    
    
    @Test(timeout = 60000)
    public void test_11_getOnProjectsWithQueryParamsReturnsEmptyList() throws Exception {
        
        given().accept("application/json")
                .header("x-EMextraHeader123", "")
                .header("x-organizations", "Gi")
                .get(baseUrlOfSut + "/projects?" + 
                    "limit=963&" + 
                    "end_date=2026-04-02T02%3A47%3A02.211Z&" + 
                    "q=7ErqeCdNKOU8VB2&" + 
                    "language=_EM_709_XYZ_")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("size()", equalTo(0));
    }
    
    
    @Test(timeout = 60000)
    public void test_12_getOnProjectsWithQueryParamsReturnsEmptyListUsingSql() throws Exception {
        List<InsertionDto> insertions = sql().insertInto("PROJECT", 43L)
                .d("COMMITS_COUNT", "-261509")
                .d("CONTRIBUTORS_COUNT", "922")
                .d("DESCRIPTION", "\"FNlZDTgUot5YJt\"")
                .d("FORKS_COUNT", "762")
                .d("GIT_HUB_PROJECT_ID", "93")
                .d("LAST_PUSHED", "\"9zg2\"")
                .d("NAME", "\"_EM_527_XYZ_\"")
                .d("ORGANIZATION_NAME", "\"6Pjd\"")
                .d("PRIMARY_LANGUAGE", "NULL")
                .d("SCORE", "NULL")
                .d("SNAPSHOT_DATE", "NULL")
                .d("STARS_COUNT", "959")
                .d("URL", "\"_EM_528_XYZ_\"")
                .d("TITLE", "\"mdCC5cUn1sjXZ\"")
                .d("IMAGE", "\"6m3\"")
                .d("EXTERNAL_CONTRIBUTORS_COUNT", "NULL")
            .and().insertInto("STATISTICS", 44L)
                .d("ID", "884")
                .d("SNAPSHOT_DATE", "\"2012-07-15 08:17:06\"")
                .d("ALL_CONTRIBUTORS_COUNT", "NULL")
                .d("ALL_FORKS_COUNT", "622")
                .d("ALL_SIZE_COUNT", "NULL")
                .d("ALL_STARS_COUNT", "NULL")
                .d("MEMBERS_COUNT", "292")
                .d("ORGANIZATION_NAME", "NULL")
                .d("PRIVATE_PROJECT_COUNT", "NULL")
                .d("PROGRAM_LANGUAGES_COUNT", "635")
                .d("PUBLIC_PROJECT_COUNT", "NULL")
                .d("TAGS_COUNT", "126")
                .d("TEAMS_COUNT", "NULL")
                .d("EXTERNAL_CONTRIBUTORS_COUNT", "818")
            .dtos();
        InsertionResultsDto insertionsresult = controller.execInsertionsIntoDatabase(insertions);
        
        given().accept("application/json")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/projects?" + 
                    "start_date=2060-02-24T17%3A47%3A06%2B03%3A52&" + 
                    "end_date=1900-04-15T09%3A15%3A59.016Z&" + 
                    "q=q_5MtGr&" + 
                    "language=Rn4O0RL9c")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("size()", equalTo(0));
    }
    
    
    @Test(timeout = 60000)
    public void test_13_getOnProjectsWithQueryParamsReturnsEmptyList() throws Exception {
        
        given().accept("application/json")
                .header("x-EMextraHeader123", "")
                .header("x-organizations", "VNHjkF")
                .get(baseUrlOfSut + "/projects?" + 
                    "limit=702&" + 
                    "start_date=2011-07-04T12%3A16%3A24Z&" + 
                    "end_date=1911-10-09T18%3A12%3A00.172%2B13%3A16&" + 
                    "q=7EI8C7gHDhYRr")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("size()", equalTo(0));
    }
    
    
    @Test(timeout = 60000)
    public void test_14_getOnProjectsWithQueryParamsReturnsEmptyList() throws Exception {
        
        given().accept("application/json")
                .header("x-EMextraHeader123", "42")
                .get(baseUrlOfSut + "/projects?" + 
                    "limit=448&" + 
                    "offset=369&" + 
                    "start_date=2088-07-21T13%3A21%3A14-17%3A20&" + 
                    "end_date=1968-10-28T20%3A38%3A38.600%2B08%3A49")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("size()", equalTo(0));
    }


}
