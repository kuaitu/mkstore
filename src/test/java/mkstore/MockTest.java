package mkstore;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;
import com.alibaba.fastjson.JSONObject;
import com.mkstore.mk.model.SysLog;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;  
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;  
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;  

@RunWith(SpringJUnit4ClassRunner.class)  
@WebAppConfiguration  
@ContextConfiguration(locations = {"classpath*:/root-context.xml","file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"})  
@TransactionConfiguration(defaultRollback = true)  
@Transactional
public class MockTest {
	@Autowired  
    private WebApplicationContext wac;  
      
    private MockMvc mockMvc;  
    private MockHttpSession session;  
  
    @Before  
    public void setup() throws Exception {   
        this.mockMvc = webAppContextSetup(this.wac).build();  
       // this.session = getLoginSession();
    }
    
    private MockHttpSession getLoginSession() throws Exception{    
        MvcResult result = this.mockMvc  
                                .perform((post("/User/login.action"))
                                .param("userName", "lmk")
                                .param("password", "125114"))  
                                .andExpect(status().isOk())  
                                .andReturn();
        session = (MockHttpSession)result.getRequest().getSession(); 
        return  session;
    }
    
    //========================搜索单元测试模板====================
    
    @Test
    @Rollback(false)
    public void searchBankMsg() throws Exception {
    	//请求路径和分页
    	String post1 = "/SysLog/search.action";
    	String page = "0";
    	String rows = "-1";
    	
    	//请求参数
    	SysLog item = new SysLog();
    	item.setLogId(1);
    	
    	String requestJson = JSONObject.toJSONString(item);
    	this.mockMvc
                .perform((post(post1))
                		.param("page", page)
                		.param("rows", rows)
                		.param("exampleJson", requestJson)
                		.session(session)
                        .accept(MediaType.parseMediaType("application/json;charset=UTF-8")))
		                .andExpect(status().isOk())    
		                .andDo(print());
    }
    
    //========================编辑单元测试模板====================
    
    @Test
    public void findBankMsg() throws Exception {
    	//请求路径
    	String post1 = "/SysLog/findById.action";
    	
    	//请求参数
    	SysLog item = new SysLog();
    	item.setLogId(1);
    	
    	String requestJson = JSONObject.toJSONString(item);
    	this.mockMvc
                .perform((post(post1)
                		.contentType(MediaType.APPLICATION_JSON)
                		.content(requestJson))
                		//.session(session)
                		)
		                .andExpect(status().isOk())    
		                .andDo(print());
    }
    
}
