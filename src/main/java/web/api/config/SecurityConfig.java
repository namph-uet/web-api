package web.api.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable().authorizeRequests()
                // No need authentication.
                .antMatchers("/hello").permitAll() //
                .antMatchers(HttpMethod.POST, "/hello").permitAll() //
                .antMatchers(HttpMethod.GET, "/hello").permitAll() // For Test on Browser
                // Need authentication.
                .anyRequest().authenticated();

    }


}
