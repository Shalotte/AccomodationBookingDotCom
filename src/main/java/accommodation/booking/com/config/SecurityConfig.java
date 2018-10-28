/*package accommodation.booking.com.config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import accommodation.booking.com.services.UserSecurityService;

@Configuration
@EnableWebSecurity

public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Autowired
	private Environment env;
	
	@Autowired
	private UserSecurityService userSecurityService;
	
	private BCryptPasswordEncoder passwordEncoder() {
		return SecurityUtility.passwordEncoder();
	}
	
	private static final String[] PUBLIC_MATCHERS = {
			"/css/**",
			"/js/**",
			"/image/**",
			"/accommodation/**",
			"/user/**",
			"/booking/**",
			"/login/**"
	};
	
	
	//Cross-Site Request Forgery (CSRF) is an attack that forces an end user 
	//to execute unwanted actions on a web application in which they're currently 
	//authenticated.
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		
	http.csrf().disable().cors().disable().httpBasic().and().authorizeRequests().
	antMatchers(PUBLIC_MATCHERS).permitAll().anyRequest().authenticated();
		
	}
	
	@Autowired
	public void configuredGlobal(AuthenticationManagerBuilder auth) throws Exception{
	
	auth.userDetailsService(userSecurityService).passwordEncoder(passwordEncoder());
	
	}
	
	
	
	
}*/
