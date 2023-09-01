//package com.delmas.gestiondestock.Config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configurers.LogoutConfigurer;
//import org.springframework.security.web.SecurityFilterChain;
//import static org.springframework.security.config.Customizer.withDefaults;
//
//@Configuration
//public class SecurityConfig {
//
////    @Bean
////    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
////        http
////                .authorizeHttpRequests(requests -> requests
////                        .requestMatchers("/public/**").permitAll()
////                        .requestMatchers("/swagger-ui").permitAll()
////                        .anyRequest().authenticated()
////                )
////                .formLogin(form -> form
////                        .loginPage("/login")
////                        .permitAll()
////                )
////                .logout(LogoutConfigurer::permitAll);
////
////        return http.build();
////    }
//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .requestMatchers("/public/**")
//                .permitAll()
//                .and()
//                .authorizeRequests()
//                .requestMatchers("/swagger-ui")
//                .hasRole("ADMIN")
//                .anyRequest()
//                .authenticated()
//                .and();
//        return http.build();
//    }
//
////    @Bean
////    public SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
////        http
////                .authorizeRequests(authorizeRequests ->
////                        authorizeRequests
////                                .requestMatchers("/public/**").permitAll() // Autoriser l'accès public
////                                .requestMatchers("/swagger-ui/**").permitAll() // Autoriser l'accès à Swagger UI
////                                .anyRequest().authenticated()
////                )
////
////                .formLogin(withDefaults());
////        return http.build();
////    }
////
////    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
////        auth.inMemoryAuthentication()
////                .withUser("abcd")
////                .password("{noop}abcd") // "{noop}" indique que le mot de passe n'est pas encodé
////                .roles("USER");
////    }
//}
