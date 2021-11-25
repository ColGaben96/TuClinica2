package co.edu.unbosque.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@Configuration
@EnableWebSecurity
public class TuClinicaSecurity extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    public void configurerGlobal(AuthenticationManagerBuilder build) throws Exception{
        build.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests()
                .antMatchers("/", "/application/forgot", "/application/signup").permitAll()
                .antMatchers("/admin/**").hasAnyRole("Admin")
                .antMatchers("/application/**").hasAnyRole("Cliente", "Veterinario")
                .anyRequest().authenticated()
                .and()
                .formLogin().loginPage("/application/login").permitAll()
                .loginProcessingUrl("/login")
                .failureUrl("/application/login?badCredentials=true")
                .defaultSuccessUrl("/application/dashboard")
                .and()
                .logout().permitAll();
        /*
        http.antMatcher("/admin*")
                .authorizeRequests().anyRequest().hasAnyRole("Admin")
                .and()
                .formLogin()
                .loginPage("/admin/login")
                .failureUrl("/admin/login?badcredentials=true")
                .defaultSuccessUrl("/admin/dashboard")
                .and()
                .logout()
                .logoutSuccessUrl("/")
                .and()
                .csrf().disable();

         */
    }
}
