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
*  This file was automatically generated by EvoMaster on 2024-10-17T18:24:46.907-03:00[America/Argentina/Buenos_Aires]
 * <br>
*  The generated test suite contains 34 tests
 * <br>
*  Covered targets: 707
 * <br>
*  Used time: 0h 13m 31s
 * <br>
*  Needed budget for current results: 73%
 * <br>
*  This file contains test cases that represent failed calls, but not indicative of faults.
*/
public class EvoMaster_ScsService_Iface_others_Test {

    
    private static final SutHandler controller = new em.external.org.rpc.thriftscs.ExternalEvoMasterController("/run/datad/facultad/tesis/EMB/jdk_8_maven/cs/rpc/thrift/artificial/thrift-scs/target/rpc-thrift-scs-sut.jar");
    private static String baseUrlOfSut;
    private static org.thrift.scs.client.ScsService.Client var_client0_ScsService_Iface;
    
    
    @BeforeClass
    public static void initClass() {
        controller.setupForGeneratedTest();
        baseUrlOfSut = controller.startSut();
        controller.registerOrExecuteInitSqlCommandsIfNeeded();
        controller.extractRPCSchema();
        assertNotNull(baseUrlOfSut);
        var_client0_ScsService_Iface = (org.thrift.scs.client.ScsService.Client) controller.getRPCClient("org.thrift.scs.client.ScsService$Iface");
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
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.thrift.scs.client.ScsService$Iface:ordered4
    // 			Action parameters:
    // 				arg0: 'K'
    // 				arg1: 'PZc'
    // 				arg2: '_EM_94_XYZ_'
    // 				arg3: '_EM_125_XYZ_'
    // 			Genes:
    // 				org.evomaster.core.search.gene.string.StringGene = arg0:'K'
    // 				org.evomaster.core.search.gene.string.StringGene = arg1:'PZc'
    // 				org.evomaster.core.search.gene.string.StringGene = arg2:'_EM_94_XYZ_'
    // 				org.evomaster.core.search.gene.string.StringGene = arg3:'_EM_125_XYZ_'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.thrift.scs.client.ScsService$Iface:ordered4
    @Test(timeout = 60000)
    public void test_0_ifaceOnOrdered4WithParams_K_PZc__EM_94_XYZ___EM_125_XYZ__ReturnsSuccess() throws Exception {
        
        
        String res_0 = null;
        {
         String arg0 = "K";
         String arg1 = "PZc";
         String arg2 = "_EM_94_XYZ_";
         String arg3 = "_EM_125_XYZ_";
         res_0 = var_client0_ScsService_Iface.ordered4(arg0,arg1,arg2,arg3);
        }
        //assertEquals("unordered", res_0);
        
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.thrift.scs.client.ScsService$Iface:ordered4
    // 			Action parameters:
    // 				arg0: 'FZjOYCpyLFie5_'
    // 				arg1: '_EM_3_XYZ_'
    // 				arg2: '_EM_4_XYZ_'
    // 				arg3: 'JV7WiHus'
    // 			Genes:
    // 				org.evomaster.core.search.gene.string.StringGene = arg0:'FZjOYCpyLFie5_'
    // 				org.evomaster.core.search.gene.string.StringGene = arg1:'_EM_3_XYZ_'
    // 				org.evomaster.core.search.gene.string.StringGene = arg2:'_EM_4_XYZ_'
    // 				org.evomaster.core.search.gene.string.StringGene = arg3:'JV7WiHus'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.thrift.scs.client.ScsService$Iface:ordered4
    @Test(timeout = 60000)
    public void test_1_ifaceOnOrdered4WithParams_FZjOYCpyLFie5___EM_3_XYZ___EM_4_XYZ__JV7WiHus_ReturnsSuccess() throws Exception {
        
        
        String res_0 = null;
        {
         String arg0 = "FZjOYCpyLFie5_";
         String arg1 = "_EM_3_XYZ_";
         String arg2 = "_EM_4_XYZ_";
         String arg3 = "JV7WiHus";
         res_0 = var_client0_ScsService_Iface.ordered4(arg0,arg1,arg2,arg3);
        }
        //assertEquals("unordered", res_0);
        
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.thrift.scs.client.ScsService$Iface:ordered4
    // 			Action parameters:
    // 				arg0: '1stJk'
    // 				arg1: 'PXc'
    // 				arg2: 'dWOQu'
    // 				arg3: '_EM_125_XYZ_'
    // 			Genes:
    // 				org.evomaster.core.search.gene.string.StringGene = arg0:'1stJk'
    // 				org.evomaster.core.search.gene.string.StringGene = arg1:'PXc'
    // 				org.evomaster.core.search.gene.string.StringGene = arg2:'dWOQu'
    // 				org.evomaster.core.search.gene.string.StringGene = arg3:'_EM_125_XYZ_'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.thrift.scs.client.ScsService$Iface:ordered4
    @Test(timeout = 60000)
    public void test_2_ifaceOnOrdered4WithParams__1stJk_PXc_dWOQu__EM_125_XYZ__ReturnsSuccess() throws Exception {
        
        
        String res_0 = null;
        {
         String arg0 = "1stJk";
         String arg1 = "PXc";
         String arg2 = "dWOQu";
         String arg3 = "_EM_125_XYZ_";
         res_0 = var_client0_ScsService_Iface.ordered4(arg0,arg1,arg2,arg3);
        }
        //assertEquals("unordered", res_0);
        
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.thrift.scs.client.ScsService$Iface:fileSuffix
    // 			Action parameters:
    // 				arg0: '_EM_2_XYZ_'
    // 				arg1: 'wwf1Qpeq'
    // 			Genes:
    // 				org.evomaster.core.search.gene.string.StringGene = arg0:'_EM_2_XYZ_'
    // 				org.evomaster.core.search.gene.string.StringGene = arg1:'wwf1Qpeq'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.thrift.scs.client.ScsService$Iface:fileSuffix
    @Test(timeout = 60000)
    public void test_3_ifaceOnFileSuffixReturnsSuccess() throws Exception {
        
        
        String res_0 = null;
        {
         String arg0 = "_EM_2_XYZ_";
         String arg1 = "wwf1Qpeq";
         res_0 = var_client0_ScsService_Iface.fileSuffix(arg0,arg1);
        }
        assertEquals("0", res_0);
        
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.thrift.scs.client.ScsService$Iface:pat
    // 			Action parameters:
    // 				arg0: 'wLNY0G6fZZBwlS'
    // 				arg1: ''
    // 			Genes:
    // 				org.evomaster.core.search.gene.string.StringGene = arg0:'wLNY0G6fZZBwlS'
    // 				org.evomaster.core.search.gene.string.StringGene = arg1:''
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.thrift.scs.client.ScsService$Iface:pat
    @Test(timeout = 60000)
    public void test_4_ifaceOnPatWithParams_wLNY0G6fZZBwlS_ReturnsSuccess() throws Exception {
        
        
        String res_0 = null;
        {
         String arg0 = "wLNY0G6fZZBwlS";
         String arg1 = "";
         res_0 = var_client0_ScsService_Iface.pat(arg0,arg1);
        }
        assertEquals("0", res_0);
        
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.thrift.scs.client.ScsService$Iface:calc
    // 			Action parameters:
    // 				arg0: 'e'
    // 				arg1: '0.0'
    // 				arg2: '8.988465674311579E307'
    // 			Genes:
    // 				org.evomaster.core.search.gene.string.StringGene = arg0:'e'
    // 				org.evomaster.core.search.gene.numeric.DoubleGene = arg1:'0.0'
    // 				org.evomaster.core.search.gene.numeric.DoubleGene = arg2:'8.988465674311579E307'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.thrift.scs.client.ScsService$Iface:calc
    @Test(timeout = 60000)
    public void test_5_ifaceOnCalcWithParams_e__0_0__8_988465674311579E307_ReturnsSuccess() throws Exception {
        
        
        String res_0 = null;
        {
         String arg0 = "e";
         double arg1 = 0.0;
         double arg2 = 8.988465674311579E307;
         res_0 = var_client0_ScsService_Iface.calc(arg0,arg1,arg2);
        }
        //assertEquals("2.718281828459045", res_0);
        
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.thrift.scs.client.ScsService$Iface:cookie
    // 			Action parameters:
    // 				arg0: 'zktPauC2hGW2kZ8s'
    // 				arg1: '1r2wH3'
    // 				arg2: '_EM_17_XYZ_'
    // 			Genes:
    // 				org.evomaster.core.search.gene.string.StringGene = arg0:'zktPauC2hGW2kZ8s'
    // 				org.evomaster.core.search.gene.optional.OptionalGene = arg1:'1r2wH3'
    // 				org.evomaster.core.search.gene.optional.OptionalGene = arg2:'_EM_17_XYZ_'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.thrift.scs.client.ScsService$Iface:cookie
    @Test(timeout = 60000)
    public void test_6_ifaceOnCookieWithParams_zktPauC2hGW2kZ8s__1r2wH3__EM_17_XYZ__ReturnsSuccess() throws Exception {
        
        
        String res_0 = null;
        {
         String arg0 = "zktPauC2hGW2kZ8s";
         String arg1 = "1r2wH3";
         String arg2 = "_EM_17_XYZ_";
         res_0 = var_client0_ScsService_Iface.cookie(arg0,arg1,arg2);
        }
        assertEquals("0", res_0);
        
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.thrift.scs.client.ScsService$Iface:title
    // 			Action parameters:
    // 				arg0: 'sHFzO_ogJ_7'
    // 				arg1: 'zh9krDhzd'
    // 			Genes:
    // 				org.evomaster.core.search.gene.string.StringGene = arg0:'sHFzO_ogJ_7'
    // 				org.evomaster.core.search.gene.string.StringGene = arg1:'zh9krDhzd'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.thrift.scs.client.ScsService$Iface:title
    @Test(timeout = 60000)
    public void test_7_ifaceOnTitleWithParams_sHFzO_ogJ_7_zh9krDhzd_ReturnsSuccess() throws Exception {
        
        
        String res_0 = null;
        {
         String arg0 = "sHFzO_ogJ_7";
         String arg1 = "zh9krDhzd";
         res_0 = var_client0_ScsService_Iface.title(arg0,arg1);
        }
        assertEquals("-1", res_0);
        
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.thrift.scs.client.ScsService$Iface:notyPevar
    // 			Action parameters:
    // 				arg0: '56'
    // 				arg1: '45KFSCeBGH'
    // 			Genes:
    // 				org.evomaster.core.search.gene.numeric.IntegerGene = arg0:'56'
    // 				org.evomaster.core.search.gene.string.StringGene = arg1:'45KFSCeBGH'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.thrift.scs.client.ScsService$Iface:notyPevar
    @Test(timeout = 60000)
    public void test_8_ifaceOnNotyPevarWithParams__56__45KFSCeBGH_ReturnsSuccess() throws Exception {
        
        
        String res_0 = null;
        {
         int arg0 = 56;
         String arg1 = "45KFSCeBGH";
         res_0 = var_client0_ScsService_Iface.notyPevar(arg0,arg1);
        }
        assertEquals("3", res_0);
        
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.thrift.scs.client.ScsService$Iface:notyPevar
    // 			Action parameters:
    // 				arg0: '-1599992674'
    // 				arg1: 'uDhINnC_1B7TT'
    // 			Genes:
    // 				org.evomaster.core.search.gene.numeric.IntegerGene = arg0:'-1599992674'
    // 				org.evomaster.core.search.gene.string.StringGene = arg1:'uDhINnC_1B7TT'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.thrift.scs.client.ScsService$Iface:notyPevar
    @Test(timeout = 60000)
    public void test_9_ifaceOnNotyPevarWithParams__1599992674_uDhINnC_1B7TT_ReturnsSuccess() throws Exception {
        
        
        String res_0 = null;
        {
         int arg0 = -1599992674;
         String arg1 = "uDhINnC_1B7TT";
         res_0 = var_client0_ScsService_Iface.notyPevar(arg0,arg1);
        }
        assertEquals("2", res_0);
        
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.thrift.scs.client.ScsService$Iface:cookie
    // 			Action parameters:
    // 				arg0: 'session'
    // 				arg1: '8WMBYJhmxOxDu4Z'
    // 				arg2: 'VVdmmbDlNK6U'
    // 			Genes:
    // 				org.evomaster.core.search.gene.string.StringGene = arg0:'session'
    // 				org.evomaster.core.search.gene.optional.OptionalGene = arg1:'8WMBYJhmxOxDu4Z'
    // 				org.evomaster.core.search.gene.optional.OptionalGene = arg2:'VVdmmbDlNK6U'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.thrift.scs.client.ScsService$Iface:cookie
    @Test(timeout = 60000)
    public void test_10_ifaceOnCookieWithParams_session__8WMBYJhmxOxDu4Z_VVdmmbDlNK6U_ReturnsSuccess() throws Exception {
        
        
        String res_0 = null;
        {
         String arg0 = "session";
         String arg1 = "8WMBYJhmxOxDu4Z";
         String arg2 = "VVdmmbDlNK6U";
         res_0 = var_client0_ScsService_Iface.cookie(arg0,arg1,arg2);
        }
        assertEquals("2", res_0);
        
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.thrift.scs.client.ScsService$Iface:notyPevar
    // 			Action parameters:
    // 				arg0: '113'
    // 				arg1: 'rw3td3ATTtC96FX'
    // 			Genes:
    // 				org.evomaster.core.search.gene.numeric.IntegerGene = arg0:'113'
    // 				org.evomaster.core.search.gene.string.StringGene = arg1:'rw3td3ATTtC96FX'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.thrift.scs.client.ScsService$Iface:notyPevar
    @Test(timeout = 60000)
    public void test_11_ifaceOnNotyPevarWithParams__113_rw3td3ATTtC96FX_ReturnsSuccess() throws Exception {
        
        
        String res_0 = null;
        {
         int arg0 = 113;
         String arg1 = "rw3td3ATTtC96FX";
         res_0 = var_client0_ScsService_Iface.notyPevar(arg0,arg1);
        }
        assertEquals("3", res_0);
        
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.thrift.scs.client.ScsService$Iface:text2txt
    // 			Action parameters:
    // 				arg0: 'are'
    // 				arg1: 'you'
    // 				arg2: '_EM_126_XYZ_'
    // 			Genes:
    // 				org.evomaster.core.search.gene.string.StringGene = arg0:'are'
    // 				org.evomaster.core.search.gene.string.StringGene = arg1:'you'
    // 				org.evomaster.core.search.gene.string.StringGene = arg2:'_EM_126_XYZ_'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.thrift.scs.client.ScsService$Iface:text2txt
    @Test(timeout = 60000)
    public void test_12_ifaceOnText2txtWithParams_are_you__EM_126_XYZ__ReturnsSuccess() throws Exception {
        
        
        String res_0 = null;
        {
         String arg0 = "are";
         String arg1 = "you";
         String arg2 = "_EM_126_XYZ_";
         res_0 = var_client0_ScsService_Iface.text2txt(arg0,arg1,arg2);
        }
        assertEquals("r", res_0);
        
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.thrift.scs.client.ScsService$Iface:calc
    // 			Action parameters:
    // 				arg0: 'cosine'
    // 				arg1: '0.0'
    // 				arg2: '0.255825348'
    // 			Genes:
    // 				org.evomaster.core.search.gene.string.StringGene = arg0:'cosine'
    // 				org.evomaster.core.search.gene.numeric.DoubleGene = arg1:'0.0'
    // 				org.evomaster.core.search.gene.numeric.DoubleGene = arg2:'0.255825348'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.thrift.scs.client.ScsService$Iface:calc
    @Test(timeout = 60000)
    public void test_13_ifaceOnCalcWithParams_cosine__0_0__0_255825348_ReturnsSuccess() throws Exception {
        
        
        String res_0 = null;
        {
         String arg0 = "cosine";
         double arg1 = 0.0;
         double arg2 = 0.255825348;
         res_0 = var_client0_ScsService_Iface.calc(arg0,arg1,arg2);
        }
        assertEquals("1.0", res_0);
        
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.thrift.scs.client.ScsService$Iface:text2txt
    // 			Action parameters:
    // 				arg0: 'for'
    // 				arg1: '_EM_32_XYZ_'
    // 				arg2: '_EM_108_XYZ_'
    // 			Genes:
    // 				org.evomaster.core.search.gene.string.StringGene = arg0:'for'
    // 				org.evomaster.core.search.gene.string.StringGene = arg1:'_EM_32_XYZ_'
    // 				org.evomaster.core.search.gene.string.StringGene = arg2:'_EM_108_XYZ_'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.thrift.scs.client.ScsService$Iface:text2txt
    @Test(timeout = 60000)
    public void test_14_ifaceOnText2txtWithParams_for__EM_32_XYZ___EM_108_XYZ__ReturnsSuccess() throws Exception {
        
        
        String res_0 = null;
        {
         String arg0 = "for";
         String arg1 = "_EM_32_XYZ_";
         String arg2 = "_EM_108_XYZ_";
         res_0 = var_client0_ScsService_Iface.text2txt(arg0,arg1,arg2);
        }
        assertEquals("4", res_0);
        
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.thrift.scs.client.ScsService$Iface:title
    // 			Action parameters:
    // 				arg0: 'none'
    // 				arg1: '_EM_168_XYZ_'
    // 			Genes:
    // 				org.evomaster.core.search.gene.string.StringGene = arg0:'none'
    // 				org.evomaster.core.search.gene.string.StringGene = arg1:'_EM_168_XYZ_'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.thrift.scs.client.ScsService$Iface:title
    @Test(timeout = 60000)
    public void test_15_ifaceOnTitleWithParams_none__EM_168_XYZ__ReturnsSuccess() throws Exception {
        
        
        String res_0 = null;
        {
         String arg0 = "none";
         String arg1 = "_EM_168_XYZ_";
         res_0 = var_client0_ScsService_Iface.title(arg0,arg1);
        }
        assertEquals("-1", res_0);
        
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.thrift.scs.client.ScsService$Iface:title
    // 			Action parameters:
    // 				arg0: 'male'
    // 				arg1: '_EM_167_XYZ_'
    // 			Genes:
    // 				org.evomaster.core.search.gene.string.StringGene = arg0:'male'
    // 				org.evomaster.core.search.gene.string.StringGene = arg1:'_EM_167_XYZ_'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.thrift.scs.client.ScsService$Iface:title
    @Test(timeout = 60000)
    public void test_16_ifaceOnTitleWithParams_male__EM_167_XYZ__ReturnsSuccess() throws Exception {
        
        
        String res_0 = null;
        {
         String arg0 = "male";
         String arg1 = "_EM_167_XYZ_";
         res_0 = var_client0_ScsService_Iface.title(arg0,arg1);
        }
        assertEquals("-1", res_0);
        
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.thrift.scs.client.ScsService$Iface:text2txt
    // 			Action parameters:
    // 				arg0: 'see'
    // 				arg1: 'you'
    // 				arg2: '6l46aDFM'
    // 			Genes:
    // 				org.evomaster.core.search.gene.string.StringGene = arg0:'see'
    // 				org.evomaster.core.search.gene.string.StringGene = arg1:'you'
    // 				org.evomaster.core.search.gene.string.StringGene = arg2:'6l46aDFM'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.thrift.scs.client.ScsService$Iface:text2txt
    @Test(timeout = 60000)
    public void test_17_ifaceOnText2txtWithParams_see_you__6l46aDFM_ReturnsSuccess() throws Exception {
        
        
        String res_0 = null;
        {
         String arg0 = "see";
         String arg1 = "you";
         String arg2 = "6l46aDFM";
         res_0 = var_client0_ScsService_Iface.text2txt(arg0,arg1,arg2);
        }
        assertEquals("cu", res_0);
        
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.thrift.scs.client.ScsService$Iface:text2txt
    // 			Action parameters:
    // 				arg0: 'four'
    // 				arg1: 'the'
    // 				arg2: '_EM_108_XYZ_'
    // 			Genes:
    // 				org.evomaster.core.search.gene.string.StringGene = arg0:'four'
    // 				org.evomaster.core.search.gene.string.StringGene = arg1:'the'
    // 				org.evomaster.core.search.gene.string.StringGene = arg2:'_EM_108_XYZ_'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.thrift.scs.client.ScsService$Iface:text2txt
    @Test(timeout = 60000)
    public void test_18_ifaceOnText2txtWithParams_four_the__EM_108_XYZ__ReturnsSuccess() throws Exception {
        
        
        String res_0 = null;
        {
         String arg0 = "four";
         String arg1 = "the";
         String arg2 = "_EM_108_XYZ_";
         res_0 = var_client0_ScsService_Iface.text2txt(arg0,arg1,arg2);
        }
        assertEquals("4", res_0);
        
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.thrift.scs.client.ScsService$Iface:pat
    // 			Action parameters:
    // 				arg0: '_EM_165_XYZ_'
    // 				arg1: '_EM_64_XYZ_'
    // 			Genes:
    // 				org.evomaster.core.search.gene.string.StringGene = arg0:'_EM_165_XYZ_'
    // 				org.evomaster.core.search.gene.string.StringGene = arg1:'_EM_64_XYZ_'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.thrift.scs.client.ScsService$Iface:pat
    @Test(timeout = 60000)
    public void test_19_ifaceOnPatWithParams__EM_165_XYZ___EM_64_XYZ__ReturnsSuccess() throws Exception {
        
        
        String res_0 = null;
        {
         String arg0 = "_EM_165_XYZ_";
         String arg1 = "_EM_64_XYZ_";
         res_0 = var_client0_ScsService_Iface.pat(arg0,arg1);
        }
        assertEquals("0", res_0);
        
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.thrift.scs.client.ScsService$Iface:text2txt
    // 			Action parameters:
    // 				arg0: 'see'
    // 				arg1: '_EM_115_XYZ_'
    // 				arg2: '6l46aDFM'
    // 			Genes:
    // 				org.evomaster.core.search.gene.string.StringGene = arg0:'see'
    // 				org.evomaster.core.search.gene.string.StringGene = arg1:'_EM_115_XYZ_'
    // 				org.evomaster.core.search.gene.string.StringGene = arg2:'6l46aDFM'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.thrift.scs.client.ScsService$Iface:text2txt
    @Test(timeout = 60000)
    public void test_20_ifaceOnText2txtWithParams_see__EM_115_XYZ___6l46aDFM_ReturnsSuccess() throws Exception {
        
        
        String res_0 = null;
        {
         String arg0 = "see";
         String arg1 = "_EM_115_XYZ_";
         String arg2 = "6l46aDFM";
         res_0 = var_client0_ScsService_Iface.text2txt(arg0,arg1,arg2);
        }
        assertEquals("", res_0);
        
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.thrift.scs.client.ScsService$Iface:text2txt
    // 			Action parameters:
    // 				arg0: 'by'
    // 				arg1: '_EM_32_XYZ_'
    // 				arg2: 'XyyIFrQUXIjLtAK'
    // 			Genes:
    // 				org.evomaster.core.search.gene.string.StringGene = arg0:'by'
    // 				org.evomaster.core.search.gene.string.StringGene = arg1:'_EM_32_XYZ_'
    // 				org.evomaster.core.search.gene.string.StringGene = arg2:'XyyIFrQUXIjLtAK'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.thrift.scs.client.ScsService$Iface:text2txt
    @Test(timeout = 60000)
    public void test_21_ifaceOnText2txtWithParams_by__EM_32_XYZ__XyyIFrQUXIjLtAK_ReturnsSuccess() throws Exception {
        
        
        String res_0 = null;
        {
         String arg0 = "by";
         String arg1 = "_EM_32_XYZ_";
         String arg2 = "XyyIFrQUXIjLtAK";
         res_0 = var_client0_ScsService_Iface.text2txt(arg0,arg1,arg2);
        }
        assertEquals("", res_0);
        
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.thrift.scs.client.ScsService$Iface:pat
    // 			Action parameters:
    // 				arg0: '_EM_102_XYZ_'
    // 				arg1: 'fzX2znCM'
    // 			Genes:
    // 				org.evomaster.core.search.gene.string.StringGene = arg0:'_EM_102_XYZ_'
    // 				org.evomaster.core.search.gene.string.StringGene = arg1:'fzX2znCM'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.thrift.scs.client.ScsService$Iface:pat
    @Test(timeout = 60000)
    public void test_22_ifaceOnPatWithParams__EM_102_XYZ__fzX2znCM_ReturnsSuccess() throws Exception {
        
        
        String res_0 = null;
        {
         String arg0 = "_EM_102_XYZ_";
         String arg1 = "fzX2znCM";
         res_0 = var_client0_ScsService_Iface.pat(arg0,arg1);
        }
        assertEquals("0", res_0);
        
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.thrift.scs.client.ScsService$Iface:text2txt
    // 			Action parameters:
    // 				arg0: 'by'
    // 				arg1: 'the'
    // 				arg2: 'XyyIFrQUXIjLtAK'
    // 			Genes:
    // 				org.evomaster.core.search.gene.string.StringGene = arg0:'by'
    // 				org.evomaster.core.search.gene.string.StringGene = arg1:'the'
    // 				org.evomaster.core.search.gene.string.StringGene = arg2:'XyyIFrQUXIjLtAK'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.thrift.scs.client.ScsService$Iface:text2txt
    @Test(timeout = 60000)
    public void test_23_ifaceOnText2txtWithParams_by_the_XyyIFrQUXIjLtAK_ReturnsSuccess() throws Exception {
        
        
        String res_0 = null;
        {
         String arg0 = "by";
         String arg1 = "the";
         String arg2 = "XyyIFrQUXIjLtAK";
         res_0 = var_client0_ScsService_Iface.text2txt(arg0,arg1,arg2);
        }
        assertEquals("", res_0);
        
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.thrift.scs.client.ScsService$Iface:costfuns
    // 			Action parameters:
    // 				arg0: '1530628663'
    // 				arg1: 'Q4Y'
    // 			Genes:
    // 				org.evomaster.core.search.gene.numeric.IntegerGene = arg0:'1530628663'
    // 				org.evomaster.core.search.gene.string.StringGene = arg1:'Q4Y'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.thrift.scs.client.ScsService$Iface:costfuns
    @Test(timeout = 60000)
    public void test_24_ifaceOnCostfunsWithParams__1530628663_Q4Y_ReturnsSuccess() throws Exception {
        
        
        String res_0 = null;
        {
         int arg0 = 1530628663;
         String arg1 = "Q4Y";
         res_0 = var_client0_ScsService_Iface.costfuns(arg0,arg1);
        }
        assertEquals("10", res_0);
        
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.thrift.scs.client.ScsService$Iface:costfuns
    // 			Action parameters:
    // 				arg0: '-1562585963'
    // 				arg1: 'Vm7PY'
    // 			Genes:
    // 				org.evomaster.core.search.gene.numeric.IntegerGene = arg0:'-1562585963'
    // 				org.evomaster.core.search.gene.string.StringGene = arg1:'Vm7PY'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.thrift.scs.client.ScsService$Iface:costfuns
    @Test(timeout = 60000)
    public void test_25_ifaceOnCostfunsWithParams__1562585963_Vm7PY_ReturnsSuccess() throws Exception {
        
        
        String res_0 = null;
        {
         int arg0 = -1562585963;
         String arg1 = "Vm7PY";
         res_0 = var_client0_ScsService_Iface.costfuns(arg0,arg1);
        }
        assertEquals("10", res_0);
        
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.thrift.scs.client.ScsService$Iface:costfuns
    // 			Action parameters:
    // 				arg0: '57'
    // 				arg1: 'baab'
    // 			Genes:
    // 				org.evomaster.core.search.gene.numeric.IntegerGene = arg0:'57'
    // 				org.evomaster.core.search.gene.string.StringGene = arg1:'baab'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.thrift.scs.client.ScsService$Iface:costfuns
    @Test(timeout = 60000)
    public void test_26_ifaceOnCostfunsWithParams__57_baab_ReturnsSuccess() throws Exception {
        
        
        String res_0 = null;
        {
         int arg0 = 57;
         String arg1 = "baab";
         res_0 = var_client0_ScsService_Iface.costfuns(arg0,arg1);
        }
        assertEquals("10", res_0);
        
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.thrift.scs.client.ScsService$Iface:costfuns
    // 			Action parameters:
    // 				arg0: '2097432'
    // 				arg1: 'qWvae5rbk8mwf10'
    // 			Genes:
    // 				org.evomaster.core.search.gene.numeric.IntegerGene = arg0:'2097432'
    // 				org.evomaster.core.search.gene.string.StringGene = arg1:'qWvae5rbk8mwf10'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.thrift.scs.client.ScsService$Iface:costfuns
    @Test(timeout = 60000)
    public void test_27_ifaceOnCostfunsWithParams__2097432_qWvae5rbk8mwf10_ReturnsSuccess() throws Exception {
        
        
        String res_0 = null;
        {
         int arg0 = 2097432;
         String arg1 = "qWvae5rbk8mwf10";
         res_0 = var_client0_ScsService_Iface.costfuns(arg0,arg1);
        }
        assertEquals("10", res_0);
        
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.thrift.scs.client.ScsService$Iface:regex
    // 			Action parameters:
    // 				arg0: '_EM_7_XYZ_'
    // 			Genes:
    // 				org.evomaster.core.search.gene.string.StringGene = arg0:'_EM_7_XYZ_'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.thrift.scs.client.ScsService$Iface:regex
    @Test(timeout = 60000)
    public void test_28_ifaceOnRegexReturnsSuccess() throws Exception {
        
        
        String res_0 = null;
        {
         String arg0 = "_EM_7_XYZ_";
         res_0 = var_client0_ScsService_Iface.regex(arg0);
        }
        assertEquals("none", res_0);
        
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.thrift.scs.client.ScsService$Iface:title
    // 			Action parameters:
    // 				arg0: 'female'
    // 				arg1: '_EM_164_XYZ_'
    // 			Genes:
    // 				org.evomaster.core.search.gene.string.StringGene = arg0:'female'
    // 				org.evomaster.core.search.gene.string.StringGene = arg1:'_EM_164_XYZ_'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.thrift.scs.client.ScsService$Iface:title
    @Test(timeout = 60000)
    public void test_29_ifaceOnTitleWithParams_female__EM_164_XYZ__ReturnsSuccess() throws Exception {
        
        
        String res_0 = null;
        {
         String arg0 = "female";
         String arg1 = "_EM_164_XYZ_";
         res_0 = var_client0_ScsService_Iface.title(arg0,arg1);
        }
        assertEquals("-1", res_0);
        
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.thrift.scs.client.ScsService$Iface:calc
    // 			Action parameters:
    // 				arg0: 'cxz'
    // 				arg1: '0.3558429944070878'
    // 				arg2: '0.5086323054814821'
    // 			Genes:
    // 				org.evomaster.core.search.gene.string.StringGene = arg0:'cxz'
    // 				org.evomaster.core.search.gene.numeric.DoubleGene = arg1:'0.3558429944070878'
    // 				org.evomaster.core.search.gene.numeric.DoubleGene = arg2:'0.5086323054814821'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.thrift.scs.client.ScsService$Iface:calc
    @Test(timeout = 60000)
    public void test_30_ifaceOnCalcWithParams_cxz__0_3558429944070878__0_5086323054814821_ReturnsSuccess() throws Exception {
        
        
        String res_0 = null;
        {
         String arg0 = "cxz";
         double arg1 = 0.3558429944070878;
         double arg2 = 0.5086323054814821;
         res_0 = var_client0_ScsService_Iface.calc(arg0,arg1,arg2);
        }
        assertEquals("0.0", res_0);
        
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.thrift.scs.client.ScsService$Iface:calc
    // 			Action parameters:
    // 				arg0: 'divide'
    // 				arg1: '0.1503660019797452'
    // 				arg2: '0.2558'
    // 			Genes:
    // 				org.evomaster.core.search.gene.string.StringGene = arg0:'divide'
    // 				org.evomaster.core.search.gene.numeric.DoubleGene = arg1:'0.1503660019797452'
    // 				org.evomaster.core.search.gene.numeric.DoubleGene = arg2:'0.2558'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.thrift.scs.client.ScsService$Iface:calc
    @Test(timeout = 60000)
    public void test_31_ifaceOnCalcWithParams_divide__0_1503660019797452__0_2558_ReturnsSuccess() throws Exception {
        
        
        String res_0 = null;
        {
         String arg0 = "divide";
         double arg1 = 0.1503660019797452;
         double arg2 = 0.2558;
         res_0 = var_client0_ScsService_Iface.calc(arg0,arg1,arg2);
        }
        //assertEquals("0.5878264346354386", res_0);
        
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.thrift.scs.client.ScsService$Iface:dateParse
    // 			Action parameters:
    // 				arg0: '_EM_0_XYZ_'
    // 				arg1: '_EM_1_XYZ_'
    // 			Genes:
    // 				org.evomaster.core.search.gene.string.StringGene = arg0:'_EM_0_XYZ_'
    // 				org.evomaster.core.search.gene.string.StringGene = arg1:'_EM_1_XYZ_'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.thrift.scs.client.ScsService$Iface:dateParse
    @Test(timeout = 60000)
    public void test_32_ifaceOnDateParseWithParams__EM_0_XYZ___EM_1_XYZ__ReturnsSuccess() throws Exception {
        
        
        String res_0 = null;
        {
         String arg0 = "_EM_0_XYZ_";
         String arg1 = "_EM_1_XYZ_";
         res_0 = var_client0_ScsService_Iface.dateParse(arg0,arg1);
        }
        assertEquals("0", res_0);
        
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.thrift.scs.client.ScsService$Iface:dateParse
    // 			Action parameters:
    // 				arg0: 'wrCI2'
    // 				arg1: 'aug'
    // 			Genes:
    // 				org.evomaster.core.search.gene.string.StringGene = arg0:'wrCI2'
    // 				org.evomaster.core.search.gene.string.StringGene = arg1:'aug'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.thrift.scs.client.ScsService$Iface:dateParse
    @Test(timeout = 60000)
    public void test_33_ifaceOnDateParseWithParams_wrCI2_aug_ReturnsSuccess() throws Exception {
        
        
        String res_0 = null;
        {
         String arg0 = "wrCI2";
         String arg1 = "aug";
         res_0 = var_client0_ScsService_Iface.dateParse(arg0,arg1);
        }
        assertEquals("8", res_0);
        
    }


}
