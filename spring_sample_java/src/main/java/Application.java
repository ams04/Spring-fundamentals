import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pluralsight.service.CustomerService;

public class Application {

	public static void main(String[] args) {
		
		ApplicationContext appCon = new AnnotationConfigApplicationContext(AppConfig.class);
		
		CustomerService custser = appCon.getBean("customerService",CustomerService.class);
		System.out.println(custser.findAll().get(0).getFirstname());

	}

}
