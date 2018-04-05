package testing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.plane4all.configuration.Plane4allConfiguration;
import com.plane4all.service.CompanyService;


//@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {Plane4allConfiguration.class})
@WebAppConfiguration
public class CompanyCrudTest extends AbstractTestNGSpringContextTests {

	
	@Autowired
	CompanyService companyService;
/*	
	@BeforeMethod
    protected void setUp() throws Exception {
        // 
    }*/

	
	
	@Test 
	public void testFindAll(){
		companyService.retriveAllCompanies();
	}
}
