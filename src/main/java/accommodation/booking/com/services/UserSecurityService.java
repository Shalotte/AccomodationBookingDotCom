/*package accommodation.booking.com.services;

import java.security.SecureRandom;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import accommodation.booking.com.security.Authority;
import accomodation.booking.com.entities.User;
import accomodation.booking.com.repositories.UserRepository;

@Service
public class UserSecurityService implements UserDetailsService{
	
	private static final Logger LOG = LoggerFactory.getLogger(UserSecurityService.class);
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
	
	BCryptPasswordEncoder encoder = passwordEncoder();
	User user = userRepository.findByUsername(username);
	
	if(null == user) {
		
	LOG.warn("Username {} not found", username);	
	throw new UsernameNotFoundException("Username"+ username+ "not found");	
	}
    return new org.springframework.security.core.userdetails.User(user.getUsername(),encoder.encode(user.getPassword()),getAuthorities());
	}
	
	
	//Authority with the role name will be added to authorities
		
		public Collection<? extends GrantedAuthority> getAuthorities(User user) {
		
		Set<GrantedAuthority> authorities = new HashSet<>();
		user.userRoles.forEach(ur -> authorities.add(new Authority(ur.getRole().getName())));
		
		return authorities;
		
		}
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
	    return new BCryptPasswordEncoder();
	}
	
	
	

}*/
