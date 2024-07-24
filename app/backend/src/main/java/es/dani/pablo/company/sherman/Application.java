package es.dani.pablo.company.sherman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@SpringBootApplication
public class Application {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
    public BCryptPasswordEncoder passwordEncoder() {
    	return new BCryptPasswordEncoder();
    }
	
    @Bean
    public MessageSource messageSource() {
    	
        ReloadableResourceBundleMessageSource bean = new ReloadableResourceBundleMessageSource();
        
        bean.setBasename("classpath:messages");
        bean.setDefaultEncoding("UTF-8");
        
        return bean;
    }
    
    @Bean
    public LocalValidatorFactoryBean validator() {
    	
        LocalValidatorFactoryBean bean = new LocalValidatorFactoryBean();
        
        bean.setValidationMessageSource(messageSource());
        
        return bean;
    }

}