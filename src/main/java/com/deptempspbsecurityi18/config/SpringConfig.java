
package com.deptempspbsecurityi18.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.access.AccessDeniedHandler;

import com.deptempspbsecurityi18.service.CustomAccessDenied;
import com.deptempspbsecurityi18.service.UserDetailsServices;

@EnableWebSecurity
public class SpringConfig extends WebSecurityConfigurerAdapter {

	
	
	@Autowired 
	UserDetailsServices userDetailsService;
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("first");
		//auth.userDetailsService(userDetailsService);
		
		auth.userDetailsService(userDetailsService);
		
	}
	
	
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		
		// TODO Auto-generated method stub
		
		http.csrf().disable().authorizeRequests()
       
		.antMatchers("/home").permitAll().antMatchers("/").hasAnyRole("ADMIN","USER","HR").antMatchers("/homeserv").hasAnyRole("ADMIN","USER","HR").antMatchers("/listEmp").hasAnyRole("ADMIN","USER","HR").antMatchers("/hrtab").hasRole("HR").antMatchers("/**").hasAnyRole("HR","ADMIN")
        
        .and().formLogin().loginPage("/login").usernameParameter("userName").passwordParameter("password").loginProcessingUrl("/usercheck").defaultSuccessUrl("/homeserv").permitAll().and()
		/* .exceptionHandling().accessDeniedPage("/WEB-INF/jsp/accessdenied.jsp") */;
		
		/*
		 * http .authorizeRequests() .antMatchers("/resources/**",
		 * "/WEB-INF/jsps/*").permitAll() .anyRequest().authenticated() .and()
		 * .formLogin()
		 * 
		 * 
		 * .permitAll() ;
		 */
		
		
		
		/*
		 * http .csrf() .disable() .authorizeRequests()
		 * .antMatchers("/**").hasAnyRole("USER") .and()
		 * .formLogin().loginPage("/login").permitAll();
		 */

		/*
		 * System.out.println("hello");
		 * http.authorizeRequests().antMatchers("/login").permitAll().
		 * anyRequest().authenticated().and().formLogin().loginPage("/login");
		 */
		
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub
		
		/*
		 * http.authorizeRequests().antMatchers("/admin").hasRole("ADMIN").antMatchers(
		 * "/user").hasRole("USER").antMatchers("/home").permitAll().and().formLogin();
		 * super.configure(http);
		 */
	}
	
	
	@Bean
	
	public PasswordEncoder passEncode()
	{
		return NoOpPasswordEncoder.getInstance();
	}
	@Bean
	public AccessDeniedHandler accessDeniedHandler(){
	    return new CustomAccessDenied();
	}
	 
	
	/*
	 * @Override protected void configure(AuthenticationManagerBuilder auth) throws
	 * Exception { // TODO Auto-generated method stub
	 * auth.inMemoryAuthentication().withUser("admin").password("admin123#").roles(
	 * "ADMIN") .and().withUser("udhay").password("udhay123#").roles("USER"); }
	 * 
	 * @Bean
	 * 
	 * public PasswordEncoder psd() {
	 * 
	 * return NoOpPasswordEncoder.getInstance(); }
	 * 
	 * @Override protected void configure(HttpSecurity http) throws Exception { //
	 * 
	 * http.authorizeRequests().antMatchers("/**").hasRole("ADMIN").anyRequest().
	 * authenticated().and().formLogin().loginPage("/login").permitAll();
	 * super.configure(http); }
	 */
}

/*
 * package com.deptempspb.config;
 * 
 * import org.springframework.context.annotation.Bean; import
 * org.springframework.security.config.annotation.authentication.builders.
 * AuthenticationManagerBuilder; import
 * org.springframework.security.config.annotation.web.builders.HttpSecurity;
 * import org.springframework.security.config.annotation.web.configuration.
 * EnableWebSecurity; import
 * org.springframework.security.config.annotation.web.configuration.
 * WebSecurityConfigurerAdapter; import
 * org.springframework.security.core.userdetails.User; import
 * org.springframework.security.core.userdetails.UserDetailsService; import
 * org.springframework.security.provisioning.InMemoryUserDetailsManager; import
 * org.springframework.security.web.util.matcher.AntPathRequestMatcher;
 * 
 * @EnableWebSecurity public class Springconfig extends
 * WebSecurityConfigurerAdapter {
 * 
 * @Override protected void configure(AuthenticationManagerBuilder auth) throws
 * Exception { // TODO Auto-generated method stub
 * 
 * auth.inMemoryAuthentication(); super.configure(auth); }
 * 
 * 
 * @Override protected void configure(HttpSecurity http) throws Exception { //
 * 
 * 
 * 
 * }
 * 
 * }
 */