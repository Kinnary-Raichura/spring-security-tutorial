package hello.config;

import hello.model.Account;
import hello.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

/**
 * Created by kraichura on 11/9/2015.
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .httpBasic().and()
                .authorizeRequests()
                .antMatchers(HttpMethod.POST, "/people").hasRole("USER")
                .antMatchers(HttpMethod.PUT, "/people/**").hasRole("USER")
                .antMatchers(HttpMethod.PATCH, "/people/**").hasRole("USER")
                .antMatchers(HttpMethod.POST, "/account").hasRole("ADMIN")
                .antMatchers(HttpMethod.PUT, "/account/**").hasRole("ADMIN")
                .antMatchers(HttpMethod.PATCH, "/account/**").hasRole("ADMIN")
                .antMatchers(HttpMethod.GET, "/account").hasRole("USER")
                .antMatchers(HttpMethod.GET, "/account/findById").hasRole("ADMIN")
                .and()
                .csrf().disable();
    }

}
