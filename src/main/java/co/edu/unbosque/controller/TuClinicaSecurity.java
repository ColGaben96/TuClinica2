package co.edu.unbosque.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class TuClinicaSecurity extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserDetailsService userDetailsService;

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(final AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("testCli").password(passwordEncoder().encode("user1Pass")).roles("Cliente")
                .and()
                .withUser("testVet").password(passwordEncoder().encode("user2Pass")).roles("Veterinario")
                .and()
                .withUser("admin").password(passwordEncoder().encode("adminPass")).roles("Admin");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/application/forgot", "/application/signup")
                .permitAll()
                .antMatchers("/application/**")
                .hasAnyRole("Cliente", "Veterinario")
                .antMatchers("/admin/**")
                .hasAnyRole("Admin")
                .and()
                .formLogin()
                .loginPage("/application/login").defaultSuccessUrl("/application/dashboard")
                .permitAll()
                .and()
                .logout().logoutSuccessUrl("/application/login");
        http.csrf().disable();
    }
}
