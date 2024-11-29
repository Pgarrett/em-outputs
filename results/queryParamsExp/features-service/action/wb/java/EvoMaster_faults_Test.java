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
*  This file was automatically generated by EvoMaster on 2024-11-28T21:58:01.423-03:00[America/Argentina/Buenos_Aires]
 * <br>
*  The generated test suite contains 15 tests
 * <br>
*  Covered targets: 84
 * <br>
*  Used time: 0h 10m 0s
 * <br>
*  Needed budget for current results: 97%
 * <br>
*  This file contains test cases that are likely to indicate faults.
*/
public class EvoMaster_faults_Test {

    
    private static final SutHandler controller = new em.embedded.org.javiermf.features.EmbeddedEvoMasterController();
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
        controller.resetDatabase(Arrays.asList("CONSTRAINT_EXCLUDES","CONSTRAINT_REQUIRES","FEATURE","PRODUCT","PRODUCT_CONFIGURATION","PRODUCT_CONFIGURATION_ACTIVED_FEATURES","product"));
        controller.resetStateOfSUT();
    }
    
    
    
    
    @Test(timeout = 60000)
    public void test_0_deleteOnConfigurFeaturCauses500_internalServerError() throws Exception {
        
        // Fault100. HTTP Status 500. org/javiermf/features/services/ProductsConfigurationsService_70_removeFeatureFromConfiguration DELETE:/products/{productName}/configurations/{configurationName}/features/{featureName}
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .delete(baseUrlOfSut + "/products/agNC4ko5mS/configurations/nPl/features/_EM_0_XYZ_")
                .then()
                .statusCode(500)// org/javiermf/features/services/ProductsConfigurationsService_70_removeFeatureFromConfiguration
                .assertThat()
                .contentType("text/html");
    }
    
    
    @Test(timeout = 60000)
    public void test_1_postOnConfigurFeaturCauses500_internalServerError() throws Exception {
        
        // Fault100. HTTP Status 500. org/javiermf/features/services/ProductsConfigurationsService_79_addFeatureFromConfiguration POST:/products/{productName}/configurations/{configurationName}/features/{featureName}
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .post(baseUrlOfSut + "/products/lrxT9Mo__vtQ/configurations/GnnqJJUpwgKx/features/_EM_23_XYZ_")
                .then()
                .statusCode(500)// org/javiermf/features/services/ProductsConfigurationsService_79_addFeatureFromConfiguration
                .assertThat()
                .contentType("text/html");
    }
    
    
    @Test(timeout = 60000)
    public void test_2_postOnConfigurCauses500_internalServerError() throws Exception {
        
        // Fault100. HTTP Status 500. org/javiermf/features/daos/ProductsDAO_41_findByName POST:/products/{productName}/configurations/{configurationName}
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .post(baseUrlOfSut + "/products/P2Eq4gfiX9zhqDv/configurations/w?EMextraParam123=42")
                .then()
                .statusCode(500)// org/javiermf/features/daos/ProductsDAO_41_findByName
                .assertThat()
                .contentType("text/html");
    }
    
    
    @Test(timeout = 60000)
    public void test_3_postOnProductCauses500_internalServerError() throws Exception {
        
        // Fault100. HTTP Status 500. org/javiermf/features/daos/ProductsDAO_64_insert POST:/products/{productName}
        given().accept("*/*")
                .header("x-EMextraHeader123", "42")
                .post(baseUrlOfSut + "/products/gpZf3F4NHI_AXXKB?EMextraParam123=42")
                .then()
                .statusCode(500)// org/javiermf/features/daos/ProductsDAO_64_insert
                .assertThat()
                .contentType("text/html");
    }
    
    
    @Test(timeout = 60000)
    public void test_4_postOnProductCauses500_internalServerErrorUsingSql() throws Exception {
        List<InsertionDto> insertions = sql().insertInto("PRODUCT", 109L)
                .d("NAME", "\"BJ6vQzd5VzBWXMwp\"")
            .and().insertInto("PRODUCT_CONFIGURATION", 108L)
                .d("NAME", "\"F\"")
                .d("VALID", "NULL")
                .d("PRODUCT_ID", "1")
            .and().insertInto("PRODUCT", 159L)
                .d("NAME", "\"t7qn\"")
            .and().insertInto("CONSTRAINT_EXCLUDES", 158L)
                .d("ID", "368")
                .d("FOR_PRODUCT_ID", "NULL")
                .d("EXCLUDED_FEATURE_NAME", "NULL")
                .d("SOURCE_FEATURE_NAME", "NULL")
            .and().insertInto("PRODUCT", 161L)
                .d("NAME", "\"ssdakn\"")
            .and().insertInto("CONSTRAINT_REQUIRES", 160L)
                .d("ID", "585")
                .d("FOR_PRODUCT_ID", "NULL")
                .d("REQUIRED_FEATURE_NAME", "NULL")
                .d("SOURCE_FEATURE_NAME", "NULL")
            .dtos();
        InsertionResultsDto insertionsresult = controller.execInsertionsIntoDatabase(insertions);
        
        // Fault100. HTTP Status 500. org/javiermf/features/services/rest/ProductsResource_58_addProduct POST:/products/{productName}
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .post(baseUrlOfSut + "/products/yMpZHq%60HSeOS")
                .then()
                .statusCode(500)// org/javiermf/features/services/rest/ProductsResource_58_addProduct
                .assertThat()
                .contentType("text/html");
    }
    
    
    @Test(timeout = 60000)
    public void test_5_deleteOnProductFeaturCauses500_internalServerError() throws Exception {
        
        // Fault100. HTTP Status 500. org/javiermf/features/daos/ProductsDAO_41_findByName DELETE:/products/{productName}/features/{featureName}
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .delete(baseUrlOfSut + "/products/_EM_13_XYZ_/features/jZOKnlfizow")
                .then()
                .statusCode(500)// org/javiermf/features/daos/ProductsDAO_41_findByName
                .assertThat()
                .contentType("text/html");
    }
    
    
    @Test(timeout = 60000)
    public void test_6_getOnProductFeaturesCauses500_internalServerError() throws Exception {
        
        // Fault100. HTTP Status 500. org/javiermf/features/daos/ProductsDAO_41_findByName GET:/products/{productName}/features
        given().accept("*/*")
                .header("x-EMextraHeader123", "_EM_17_XYZ_")
                .get(baseUrlOfSut + "/products/_EM_15_XYZ_/features?EMextraParam123=_EM_16_XYZ_")
                .then()
                .statusCode(500)// org/javiermf/features/daos/ProductsDAO_41_findByName
                .assertThat()
                .contentType("text/html");
    }
    
    
    @Test(timeout = 60000)
    public void test_7_getOnProductCauses500_internalServerError() throws Exception {
        
        // Fault100. HTTP Status 500. org/javiermf/features/daos/ProductsDAO_41_findByName GET:/products/{productName}
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/products/_EM_18_XYZ_")
                .then()
                .statusCode(500)// org/javiermf/features/daos/ProductsDAO_41_findByName
                .assertThat()
                .contentType("text/html");
    }
    
    
    @Test(timeout = 60000)
    public void test_8_deleteOnProductCauses500_internalServerError() throws Exception {
        
        // Fault100. HTTP Status 500. org/javiermf/features/daos/ProductsDAO_41_findByName DELETE:/products/{productName}
        given().accept("*/*")
                .header("x-EMextraHeader123", "_EM_21_XYZ_")
                .delete(baseUrlOfSut + "/products/_EM_20_XYZ_?EMextraParam123=42")
                .then()
                .statusCode(500)// org/javiermf/features/daos/ProductsDAO_41_findByName
                .assertThat()
                .contentType("text/html");
    }
    
    
    @Test(timeout = 60000)
    public void test_9_postOnRequiresCauses500_internalServerError() throws Exception {
        
        // Fault100. HTTP Status 500. org/javiermf/features/daos/ProductsDAO_41_findByName POST:/products/{productName}/constraints/requires
        given().accept("*/*")
                .header("x-EMextraHeader123", "42")
                .contentType("application/x-www-form-urlencoded")
                .body("sourceFeature=u")
                .post(baseUrlOfSut + "/products/zMjq/constraints/requires?EMextraParam123=42")
                .then()
                .statusCode(500)// org/javiermf/features/daos/ProductsDAO_41_findByName
                .assertThat()
                .contentType("text/html");
    }
    
    
    @Test(timeout = 60000)
    public void test_10_postOnExcludesCauses500_internalServerError() throws Exception {
        
        // Fault100. HTTP Status 500. org/javiermf/features/daos/ProductsDAO_41_findByName POST:/products/{productName}/constraints/excludes
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .contentType("application/x-www-form-urlencoded")
                .body("")
                .post(baseUrlOfSut + "/products/gAQonCfl/constraints/excludes?EMextraParam123=_EM_26_XYZ_")
                .then()
                .statusCode(500)// org/javiermf/features/daos/ProductsDAO_41_findByName
                .assertThat()
                .contentType("text/html");
    }
    
    
    @Test(timeout = 60000)
    public void test_11_putOnFeaturCauses500_internalServerError() throws Exception {
        
        // Fault100. HTTP Status 500. org/javiermf/features/daos/ProductsDAO_41_findByName PUT:/products/{productName}/features/{featureName}
        given().accept("*/*")
                .header("x-EMextraHeader123", "_EM_37_XYZ_")
                .contentType("application/x-www-form-urlencoded")
                .body("description=lb2fPhqIW")
                .put(baseUrlOfSut + "/products/t/features/_EM_36_XYZ_")
                .then()
                .statusCode(500)// org/javiermf/features/daos/ProductsDAO_41_findByName
                .assertThat()
                .contentType("text/html");
    }
    
    
    @Test(timeout = 60000)
    public void test_12_getOnConfigurFeaturesCauses500_internalServerError() throws Exception {
        
        // Fault100. HTTP Status 500. org/javiermf/features/services/ProductsConfigurationsService_46_getConfigurationActivedFeaturesNames GET:/products/{productName}/configurations/{configurationName}/features
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/products/_EM_3_XYZ_/configurations/_EM_4_XYZ_/features")
                .then()
                .statusCode(500)// org/javiermf/features/services/ProductsConfigurationsService_46_getConfigurationActivedFeaturesNames
                .assertThat()
                .contentType("text/html");
    }
    
    
    @Test(timeout = 60000)
    public void test_13_deleteOnConfigurCauses500_internalServerErrorUsingSql() throws Exception {
        List<InsertionDto> insertions = sql().insertInto("PRODUCT", 109L)
                .d("NAME", "\"BJ6vQzd5VzBWXMwp\"")
            .and().insertInto("PRODUCT_CONFIGURATION", 108L)
                .d("NAME", "\"F\"")
                .d("VALID", "NULL")
                .d("PRODUCT_ID", "1")
            .dtos();
        InsertionResultsDto insertionsresult = controller.execInsertionsIntoDatabase(insertions);
        
        // Fault100. HTTP Status 500. org/javiermf/features/daos/ProductsConfigurationsDAO_71_deleteConfigurationForProduct DELETE:/products/{productName}/configurations/{configurationName}
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .delete(baseUrlOfSut + "/products/_EM_10_XYZ_/configurations/EKX8RSSU")
                .then()
                .statusCode(500)// org/javiermf/features/daos/ProductsConfigurationsDAO_71_deleteConfigurationForProduct
                .assertThat()
                .contentType("text/html");
    }
    
    
    @Test(timeout = 60000)
    public void test_14_postOnProductFeaturCauses500_internalServerError() throws Exception {
        
        // Fault100. HTTP Status 500. org/javiermf/features/daos/ProductsDAO_41_findByName POST:/products/{productName}/features/{featureName}
        given().accept("*/*")
                .header("x-EMextraHeader123", "42")
                .contentType("application/x-www-form-urlencoded")
                .body("")
                .post(baseUrlOfSut + "/products/_EM_28_XYZ_/features/HKkX2ihhV6qpW?EMextraParam123=_EM_30_XYZ_")
                .then()
                .statusCode(500)// org/javiermf/features/daos/ProductsDAO_41_findByName
                .assertThat()
                .contentType("text/html");
    }


}
