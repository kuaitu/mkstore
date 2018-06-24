package mkstore;


import java.util.List;
import com.alibaba.fastjson.JSONObject;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.mkstore.mk.model.SysLog;
import com.mkstore.mk.service.SysLogService;

@RunWith(SpringJUnit4ClassRunner.class)    
@ContextConfiguration(locations = {"classpath:root-context.xml","file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"})
public class JunitTest {
	
	@Autowired
	private SysLogService sysLogService;
	
	@Before  
    public void setUp() throws Exception {  
    }
	
	 @Test
	 public void test1() throws Exception {
		 SysLog a = new SysLog();
		 a.setLogId(1);
		 SysLog b = sysLogService.findById(1); 
	     String message = JSONObject.toJSONString(b); 
	     System.out.println("日志信息 ：" + message);
	 }
	 
	 @Test
	 public void test2() throws Exception {
		 SysLog a = new SysLog();
		 a.setLogId(1);
		 List<SysLog> b = sysLogService.search(0, -1, a);
	     String message = JSONObject.toJSONString(b); 
	     System.out.println("购汇信息 ：" + message);
	 }
}
