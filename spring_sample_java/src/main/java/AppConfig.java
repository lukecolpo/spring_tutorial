import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan({"com.pluralsight"})
public class AppConfig {

	// We use concrete class to return interface
	//@Bean(name="customerService")
	//public CustomerService getCustomerService() {
		// constructor injection example
		//CustomerServiceImpl service = 
		//		new CustomerServiceImpl(getCustomerRepository());
		
	//	CustomerServiceImpl service = new CustomerServiceImpl();
		// setter injection example
		// service.setCustomerRepository(getCustomerRepository());
	//	return service;
	//}
	
	//@Bean(name="customerRepository")
	//public CustomerRepository getCustomerRepository() {
	//	return new HibernateCustomerRepositoryImpl();
	//}
}
