import  org.junit.AfterClass;
import  org.junit.BeforeClass;
import  org.junit.Before;
import  org.junit.Test;
import static org.junit.Assert.*;
import  java.util.Map;
import  java.util.List;
import static org.evomaster.test.utils.EMTestUtils.*;
import  org.evomaster.client.java.controller.SutHandler;
import static org.hamcrest.Matchers.*;
import static org.evomaster.client.java.controller.contentMatchers.NumberMatcher.*;
import static org.evomaster.client.java.controller.contentMatchers.StringMatcher.*;
import static org.evomaster.client.java.controller.contentMatchers.SubStringMatcher.*;




/**
*  This file was automatically generated by EvoMaster on 2024-10-17T17:56:43.191-03:00[America/Argentina/Buenos_Aires]
 * <br>
*  The generated test suite contains 18 tests
 * <br>
*  Covered targets: 1441
 * <br>
*  Used time: 0h 12m 2s
 * <br>
*  Needed budget for current results: 93%
 * <br>
*  This file contains test cases that represent failed calls, but not indicative of faults.
*/
public class EvoMaster_ScsServiceGrpc_ScsServiceBlockingStub_others_Test {

    
    private static final SutHandler controller = new em.external.org.rpc.grpcscs.ExternalEvoMasterController("/run/datad/facultad/tesis/EMB/jdk_8_maven/cs/rpc/grpc/artificial/grpc-scs/target/rpc-grpc-scs-sut.jar");
    private static String baseUrlOfSut;
    private static org.grpc.scs.generated.ScsServiceGrpc.ScsServiceBlockingStub var_client0_ScsServiceGrpc_ScsServiceBlockingStub;
    
    
    @BeforeClass
    public static void initClass() {
        controller.setupForGeneratedTest();
        baseUrlOfSut = controller.startSut();
        controller.registerOrExecuteInitSqlCommandsIfNeeded();
        controller.extractRPCSchema();
        assertNotNull(baseUrlOfSut);
        var_client0_ScsServiceGrpc_ScsServiceBlockingStub = (org.grpc.scs.generated.ScsServiceGrpc.ScsServiceBlockingStub) controller.getRPCClient("org.grpc.scs.generated.ScsServiceGrpc$ScsServiceBlockingStub");
    }
    
    
    @AfterClass
    public static void tearDown() {
        controller.stopSut();
    }
    
    
    @Before
    public void initTest() {
        controller.resetStateOfSUT();
    }
    
    
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.grpc.scs.generated.ScsServiceGrpc$ScsServiceBlockingStub:pat
    // 			Action parameters:
    // 				arg0: ''
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.OptionalGene = arg0:''
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.grpc.scs.generated.ScsServiceGrpc$ScsServiceBlockingStub:pat
    @Test(timeout = 60000)
    public void test_0_scsServiceBlockingStubOnPatWithParam_ReturnsSuccess() throws Exception {
        
        
        org.grpc.scs.generated.DtoResponse res_0 = null;
        {
         org.grpc.scs.generated.PatRequest arg0 = null;
         res_0 = var_client0_ScsServiceGrpc_ScsServiceBlockingStub.pat(arg0);
        }
        assertEquals("0", res_0.getValue());
        
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.grpc.scs.generated.ScsServiceGrpc$ScsServiceBlockingStub:ordered4
    // 			Action parameters:
    // 				arg0: ''
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.OptionalGene = arg0:''
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.grpc.scs.generated.ScsServiceGrpc$ScsServiceBlockingStub:ordered4
    @Test(timeout = 60000)
    public void test_1_scsServiceBlockingStubOnOrdered4WithParam_ReturnsSuccess() throws Exception {
        
        
        org.grpc.scs.generated.DtoResponse res_0 = null;
        {
         org.grpc.scs.generated.Ordered4Request arg0 = null;
         res_0 = var_client0_ScsServiceGrpc_ScsServiceBlockingStub.ordered4(arg0);
        }
        //assertEquals("unordered", res_0.getValue());
        
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.grpc.scs.generated.ScsServiceGrpc$ScsServiceBlockingStub:notyPevar
    // 			Action parameters:
    // 				arg0: ''
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.OptionalGene = arg0:''
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.grpc.scs.generated.ScsServiceGrpc$ScsServiceBlockingStub:notyPevar
    @Test(timeout = 60000)
    public void test_2_scsServiceBlockingStubOnNotyPevarWithParam_ReturnsSuccess() throws Exception {
        
        
        org.grpc.scs.generated.DtoResponse res_0 = null;
        {
         org.grpc.scs.generated.NotyPevarRequest arg0 = null;
         res_0 = var_client0_ScsServiceGrpc_ScsServiceBlockingStub.notyPevar(arg0);
        }
        assertEquals("0", res_0.getValue());
        
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.grpc.scs.generated.ScsServiceGrpc$ScsServiceBlockingStub:costfuns
    // 			Action parameters:
    // 				arg0: ''
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.OptionalGene = arg0:''
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.grpc.scs.generated.ScsServiceGrpc$ScsServiceBlockingStub:costfuns
    @Test(timeout = 60000)
    public void test_3_scsServiceBlockingStubOnCostfunsWithParam_ReturnsSuccess() throws Exception {
        
        
        org.grpc.scs.generated.DtoResponse res_0 = null;
        {
         org.grpc.scs.generated.CostfunsRequest arg0 = null;
         res_0 = var_client0_ScsServiceGrpc_ScsServiceBlockingStub.costfuns(arg0);
        }
        assertEquals("10", res_0.getValue());
        
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.grpc.scs.generated.ScsServiceGrpc$ScsServiceBlockingStub:fileSuffix
    // 			Action parameters:
    // 				arg0: '{"directory":"vj", "file":"B_j3bC2khuZrtz"}'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.OptionalGene = arg0:'{"directory":"vj", "file":"B_j3bC2khuZrtz"}'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.grpc.scs.generated.ScsServiceGrpc$ScsServiceBlockingStub:fileSuffix
    @Test(timeout = 60000)
    public void test_4_scsServiceBlockingStubOnFileSuffixReturnsSuccess() throws Exception {
        
        
        org.grpc.scs.generated.DtoResponse res_0 = null;
        {
         org.grpc.scs.generated.FileSuffixRequest arg0 = null;
         {
          org.grpc.scs.generated.FileSuffixRequest.Builder arg0builder = org.grpc.scs.generated.FileSuffixRequest.newBuilder();
          arg0builder.setDirectory("vj");
          arg0builder.setFile("B_j3bC2khuZrtz");
          arg0 = arg0builder.build();
         }
         res_0 = var_client0_ScsServiceGrpc_ScsServiceBlockingStub.fileSuffix(arg0);
        }
        assertEquals("0", res_0.getValue());
        
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.grpc.scs.generated.ScsServiceGrpc$ScsServiceBlockingStub:notyPevar
    // 			Action parameters:
    // 				arg0: '{"i":811, "s":"_EM_27_XYZ_"}'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.OptionalGene = arg0:'{"i":811, "s":"_EM_27_XYZ_"}'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.grpc.scs.generated.ScsServiceGrpc$ScsServiceBlockingStub:notyPevar
    @Test(timeout = 60000)
    public void test_5_scsServiceBlockingStubOnNotyPevarWithParam___i__811___s____EM_27_XYZ____ReturnsSuccess() throws Exception {
        
        
        org.grpc.scs.generated.DtoResponse res_0 = null;
        {
         org.grpc.scs.generated.NotyPevarRequest arg0 = null;
         {
          org.grpc.scs.generated.NotyPevarRequest.Builder arg0builder = org.grpc.scs.generated.NotyPevarRequest.newBuilder();
          arg0builder.setI(811);
          arg0builder.setS("_EM_27_XYZ_");
          arg0 = arg0builder.build();
         }
         res_0 = var_client0_ScsServiceGrpc_ScsServiceBlockingStub.notyPevar(arg0);
        }
        assertEquals("3", res_0.getValue());
        
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.grpc.scs.generated.ScsServiceGrpc$ScsServiceBlockingStub:notyPevar
    // 			Action parameters:
    // 				arg0: '{"i":490, "s":"tkGOokcyEpq0Vz"}'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.OptionalGene = arg0:'{"i":490, "s":"tkGOokcyEpq0Vz"}'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.grpc.scs.generated.ScsServiceGrpc$ScsServiceBlockingStub:notyPevar
    @Test(timeout = 60000)
    public void test_6_scsServiceBlockingStubOnNotyPevarWithParam___i__490___s___tkGOokcyEpq0Vz___ReturnsSuccess() throws Exception {
        
        
        org.grpc.scs.generated.DtoResponse res_0 = null;
        {
         org.grpc.scs.generated.NotyPevarRequest arg0 = null;
         {
          org.grpc.scs.generated.NotyPevarRequest.Builder arg0builder = org.grpc.scs.generated.NotyPevarRequest.newBuilder();
          arg0builder.setI(490);
          arg0builder.setS("tkGOokcyEpq0Vz");
          arg0 = arg0builder.build();
         }
         res_0 = var_client0_ScsServiceGrpc_ScsServiceBlockingStub.notyPevar(arg0);
        }
        assertEquals("3", res_0.getValue());
        
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.grpc.scs.generated.ScsServiceGrpc$ScsServiceBlockingStub:title
    // 			Action parameters:
    // 				arg0: '{"sex":"_EM_40_XYZ_", "title":"HvfsR36RXhAoOIH"}'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.OptionalGene = arg0:'{"sex":"_EM_40_XYZ_", "title":"HvfsR36RXhAoOIH"}'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.grpc.scs.generated.ScsServiceGrpc$ScsServiceBlockingStub:title
    @Test(timeout = 60000)
    public void test_7_scsServiceBlockingStubOnTitleReturnsSuccess() throws Exception {
        
        
        org.grpc.scs.generated.DtoResponse res_0 = null;
        {
         org.grpc.scs.generated.TitleRequest arg0 = null;
         {
          org.grpc.scs.generated.TitleRequest.Builder arg0builder = org.grpc.scs.generated.TitleRequest.newBuilder();
          arg0builder.setSex("_EM_40_XYZ_");
          arg0builder.setTitle("HvfsR36RXhAoOIH");
          arg0 = arg0builder.build();
         }
         res_0 = var_client0_ScsServiceGrpc_ScsServiceBlockingStub.title(arg0);
        }
        assertEquals("-1", res_0.getValue());
        
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.grpc.scs.generated.ScsServiceGrpc$ScsServiceBlockingStub:ordered4
    // 			Action parameters:
    // 				arg0: '{"w":"9_RHWaReU50", "x":"_EM_58_XYZ_", "z":"U4Xkx54nJ", "y":"usS_ehvq"}'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.OptionalGene = arg0:'{"w":"9_RHWaReU50", "x":"_EM_58_XYZ_", "z":"U4Xkx54nJ", "y":"usS_ehvq"}'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.grpc.scs.generated.ScsServiceGrpc$ScsServiceBlockingStub:ordered4
    @Test(timeout = 60000)
    public void test_8_scsServiceBlockingStubOnOrdered4WithParam___w___9_RHWaReU50____x____EM_58_XYZ_____z___U4Xkx54nJ____y___usS_ehvq___ReturnsSuccess() throws Exception {
        
        
        org.grpc.scs.generated.DtoResponse res_0 = null;
        {
         org.grpc.scs.generated.Ordered4Request arg0 = null;
         {
          org.grpc.scs.generated.Ordered4Request.Builder arg0builder = org.grpc.scs.generated.Ordered4Request.newBuilder();
          arg0builder.setW("9_RHWaReU50");
          arg0builder.setX("_EM_58_XYZ_");
          arg0builder.setZ("U4Xkx54nJ");
          arg0builder.setY("usS_ehvq");
          arg0 = arg0builder.build();
         }
         res_0 = var_client0_ScsServiceGrpc_ScsServiceBlockingStub.ordered4(arg0);
        }
        //assertEquals("unordered", res_0.getValue());
        
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.grpc.scs.generated.ScsServiceGrpc$ScsServiceBlockingStub:cookie
    // 			Action parameters:
    // 				arg0: '{"name":"ir3FGc", "val":"7", "site":"A"}'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.OptionalGene = arg0:'{"name":"ir3FGc", "val":"7", "site":"A"}'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.grpc.scs.generated.ScsServiceGrpc$ScsServiceBlockingStub:cookie
    @Test(timeout = 60000)
    public void test_9_scsServiceBlockingStubOnCookieReturnsSuccess() throws Exception {
        
        
        org.grpc.scs.generated.DtoResponse res_0 = null;
        {
         org.grpc.scs.generated.CookieRequest arg0 = null;
         {
          org.grpc.scs.generated.CookieRequest.Builder arg0builder = org.grpc.scs.generated.CookieRequest.newBuilder();
          arg0builder.setName("ir3FGc");
          arg0builder.setVal("7");
          arg0builder.setSite("A");
          arg0 = arg0builder.build();
         }
         res_0 = var_client0_ScsServiceGrpc_ScsServiceBlockingStub.cookie(arg0);
        }
        assertEquals("0", res_0.getValue());
        
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.grpc.scs.generated.ScsServiceGrpc$ScsServiceBlockingStub:costfuns
    // 			Action parameters:
    // 				arg0: '{"i":920, "s":""}'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.OptionalGene = arg0:'{"i":920, "s":""}'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.grpc.scs.generated.ScsServiceGrpc$ScsServiceBlockingStub:costfuns
    @Test(timeout = 60000)
    public void test_10_scsServiceBlockingStubOnCostfunsWithParam___i__920___s______ReturnsSuccess() throws Exception {
        
        
        org.grpc.scs.generated.DtoResponse res_0 = null;
        {
         org.grpc.scs.generated.CostfunsRequest arg0 = null;
         {
          org.grpc.scs.generated.CostfunsRequest.Builder arg0builder = org.grpc.scs.generated.CostfunsRequest.newBuilder();
          arg0builder.setI(920);
          arg0builder.setS("");
          arg0 = arg0builder.build();
         }
         res_0 = var_client0_ScsServiceGrpc_ScsServiceBlockingStub.costfuns(arg0);
        }
        assertEquals("10", res_0.getValue());
        
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.grpc.scs.generated.ScsServiceGrpc$ScsServiceBlockingStub:regex
    // 			Action parameters:
    // 				arg0: '{"txt":"aGEBfLy"}'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.OptionalGene = arg0:'{"txt":"aGEBfLy"}'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.grpc.scs.generated.ScsServiceGrpc$ScsServiceBlockingStub:regex
    @Test(timeout = 60000)
    public void test_11_scsServiceBlockingStubOnRegexReturnsSuccess() throws Exception {
        
        
        org.grpc.scs.generated.DtoResponse res_0 = null;
        {
         org.grpc.scs.generated.RegexRequest arg0 = null;
         {
          org.grpc.scs.generated.RegexRequest.Builder arg0builder = org.grpc.scs.generated.RegexRequest.newBuilder();
          arg0builder.setTxt("aGEBfLy");
          arg0 = arg0builder.build();
         }
         res_0 = var_client0_ScsServiceGrpc_ScsServiceBlockingStub.regex(arg0);
        }
        assertEquals("none", res_0.getValue());
        
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.grpc.scs.generated.ScsServiceGrpc$ScsServiceBlockingStub:pat
    // 			Action parameters:
    // 				arg0: '{"txt":"KzsccUypZqCAm", "pat":"3ALUU"}'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.OptionalGene = arg0:'{"txt":"KzsccUypZqCAm", "pat":"3ALUU"}'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.grpc.scs.generated.ScsServiceGrpc$ScsServiceBlockingStub:pat
    @Test(timeout = 60000)
    public void test_12_scsServiceBlockingStubOnPatWithParam___txt___KzsccUypZqCAm____pat___3ALUU___ReturnsSuccess() throws Exception {
        
        
        org.grpc.scs.generated.DtoResponse res_0 = null;
        {
         org.grpc.scs.generated.PatRequest arg0 = null;
         {
          org.grpc.scs.generated.PatRequest.Builder arg0builder = org.grpc.scs.generated.PatRequest.newBuilder();
          arg0builder.setTxt("KzsccUypZqCAm");
          arg0builder.setPat("3ALUU");
          arg0 = arg0builder.build();
         }
         res_0 = var_client0_ScsServiceGrpc_ScsServiceBlockingStub.pat(arg0);
        }
        assertEquals("0", res_0.getValue());
        
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.grpc.scs.generated.ScsServiceGrpc$ScsServiceBlockingStub:pat
    // 			Action parameters:
    // 				arg0: '{"txt":"Kz953yHFJL1CU3cP", "pat":"3ETGx2"}'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.OptionalGene = arg0:'{"txt":"Kz953yHFJL1CU3cP", "pat":"3ETGx2"}'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.grpc.scs.generated.ScsServiceGrpc$ScsServiceBlockingStub:pat
    @Test(timeout = 60000)
    public void test_13_scsServiceBlockingStubOnPatWithParam___txt___Kz953yHFJL1CU3cP____pat___3ETGx2___ReturnsSuccess() throws Exception {
        
        
        org.grpc.scs.generated.DtoResponse res_0 = null;
        {
         org.grpc.scs.generated.PatRequest arg0 = null;
         {
          org.grpc.scs.generated.PatRequest.Builder arg0builder = org.grpc.scs.generated.PatRequest.newBuilder();
          arg0builder.setTxt("Kz953yHFJL1CU3cP");
          arg0builder.setPat("3ETGx2");
          arg0 = arg0builder.build();
         }
         res_0 = var_client0_ScsServiceGrpc_ScsServiceBlockingStub.pat(arg0);
        }
        assertEquals("0", res_0.getValue());
        
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.grpc.scs.generated.ScsServiceGrpc$ScsServiceBlockingStub:costfuns
    // 			Action parameters:
    // 				arg0: '{"i":733, "s":"ieJyb2L8"}'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.OptionalGene = arg0:'{"i":733, "s":"ieJyb2L8"}'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.grpc.scs.generated.ScsServiceGrpc$ScsServiceBlockingStub:costfuns
    @Test(timeout = 60000)
    public void test_14_scsServiceBlockingStubOnCostfunsWithParam___i__733___s___ieJyb2L8___ReturnsSuccess() throws Exception {
        
        
        org.grpc.scs.generated.DtoResponse res_0 = null;
        {
         org.grpc.scs.generated.CostfunsRequest arg0 = null;
         {
          org.grpc.scs.generated.CostfunsRequest.Builder arg0builder = org.grpc.scs.generated.CostfunsRequest.newBuilder();
          arg0builder.setI(733);
          arg0builder.setS("ieJyb2L8");
          arg0 = arg0builder.build();
         }
         res_0 = var_client0_ScsServiceGrpc_ScsServiceBlockingStub.costfuns(arg0);
        }
        assertEquals("10", res_0.getValue());
        
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.grpc.scs.generated.ScsServiceGrpc$ScsServiceBlockingStub:text2txt
    // 			Action parameters:
    // 				arg0: '{"word1":"HxVFtB2HAmbNVx", "word2":"_EM_73_XYZ_", "word3":"_EM_74_XYZ_"}'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.OptionalGene = arg0:'{"word1":"HxVFtB2HAmbNVx", "word2":"_EM_73_XYZ_", "word3":"_EM_74_XYZ_"}'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.grpc.scs.generated.ScsServiceGrpc$ScsServiceBlockingStub:text2txt
    @Test(timeout = 60000)
    public void test_15_scsServiceBlockingStubOnText2txtReturnsSuccess() throws Exception {
        
        
        org.grpc.scs.generated.DtoResponse res_0 = null;
        {
         org.grpc.scs.generated.Text2txtRequest arg0 = null;
         {
          org.grpc.scs.generated.Text2txtRequest.Builder arg0builder = org.grpc.scs.generated.Text2txtRequest.newBuilder();
          arg0builder.setWord1("HxVFtB2HAmbNVx");
          arg0builder.setWord2("_EM_73_XYZ_");
          arg0builder.setWord3("_EM_74_XYZ_");
          arg0 = arg0builder.build();
         }
         res_0 = var_client0_ScsServiceGrpc_ScsServiceBlockingStub.text2txt(arg0);
        }
        assertEquals("", res_0.getValue());
        
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.grpc.scs.generated.ScsServiceGrpc$ScsServiceBlockingStub:calc
    // 			Action parameters:
    // 				arg0: '{"op":"Iv6AVyfaha", "arg1":0.6116021178321303, "arg2":0.01075872018590629}'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.OptionalGene = arg0:'{"op":"Iv6AVyfaha", "arg1":0.6116021178321303, "arg2":0.01075872018590629}'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.grpc.scs.generated.ScsServiceGrpc$ScsServiceBlockingStub:calc
    @Test(timeout = 60000)
    public void test_16_scsServiceBlockingStubOnCalcReturnsSuccess() throws Exception {
        
        
        org.grpc.scs.generated.DtoResponse res_0 = null;
        {
         org.grpc.scs.generated.CalcRequest arg0 = null;
         {
          org.grpc.scs.generated.CalcRequest.Builder arg0builder = org.grpc.scs.generated.CalcRequest.newBuilder();
          arg0builder.setOp("Iv6AVyfaha");
          arg0builder.setArg1(0.6116021178321303);
          arg0builder.setArg2(0.01075872018590629);
          arg0 = arg0builder.build();
         }
         res_0 = var_client0_ScsServiceGrpc_ScsServiceBlockingStub.calc(arg0);
        }
        assertEquals("0.0", res_0.getValue());
        
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.grpc.scs.generated.ScsServiceGrpc$ScsServiceBlockingStub:dateParse
    // 			Action parameters:
    // 				arg0: '{"dayname":"afHgSbQ_oysxnU3", "monthname":"OkZyx"}'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.OptionalGene = arg0:'{"dayname":"afHgSbQ_oysxnU3", "monthname":"OkZyx"}'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.grpc.scs.generated.ScsServiceGrpc$ScsServiceBlockingStub:dateParse
    @Test(timeout = 60000)
    public void test_17_scsServiceBlockingStubOnDateParseReturnsSuccess() throws Exception {
        
        
        org.grpc.scs.generated.DtoResponse res_0 = null;
        {
         org.grpc.scs.generated.DateParseRequest arg0 = null;
         {
          org.grpc.scs.generated.DateParseRequest.Builder arg0builder = org.grpc.scs.generated.DateParseRequest.newBuilder();
          arg0builder.setDayname("afHgSbQ_oysxnU3");
          arg0builder.setMonthname("OkZyx");
          arg0 = arg0builder.build();
         }
         res_0 = var_client0_ScsServiceGrpc_ScsServiceBlockingStub.dateParse(arg0);
        }
        assertEquals("0", res_0.getValue());
        
    }


}
