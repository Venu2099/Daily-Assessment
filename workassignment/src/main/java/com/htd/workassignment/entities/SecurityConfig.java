package com.htd.workassignment.entities;

import javax.activation.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
    private DataSource dataSource;
 
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable().authorizeRequests().anyRequest().authenticated().and().httpBasic().and()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
    }
 
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
         String password = passwordEncoder().encode("aaaAAA123");
         String adminpassword = passwordEncoder().encode("admin@123");
        auth.inMemoryAuthentication().withUser("tarkesh").password(password).roles("USER").and()
                                     .withUser("admin").password(adminpassword).roles("ADMIN")
                                     //credentialsExpired(false)
                                     //.accountExpired(true).accountLocked(true)
                .authorities("WRITE_PRIVILEGES", "READ_PRIVILEGES").roles("ADMIN");
        //auth.jdbcAuthentication().dataSource(datasource).passwordEncoder(passwordEncoder());
    }
    @Bean 
    public PasswordEncoder passwordEncoder() {
         PasswordEncoder encoder = new BCryptPasswordEncoder();
         return encoder;
     }
}
