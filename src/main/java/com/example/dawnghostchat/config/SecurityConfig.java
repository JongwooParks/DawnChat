package com.example.dawnghostchat.config;

import com.example.dawnghostchat.auth.PrincipalOauth2UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientService;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.web.authentication.logout.LogoutHandler;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final PrincipalOauth2UserService principalOauth2UserService;
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/user/**").authenticated()
                .antMatchers("/manager/**").access("hasRole('MANAGER') or hasRole('ADMIN')")
                .antMatchers("/admin/**").hasRole("ADMIN")
                .anyRequest().permitAll()
                .and()
                .logout(logout ->
                                logout
                                .logoutUrl("/auth/logout")
                                .deleteCookies("JSESSIONID")
                                .invalidateHttpSession(true)
                                .clearAuthentication(true)
                                .logoutSuccessUrl("/loginForm"))
                .oauth2Login()				// OAuth2기반의 로그인인 경우
                .loginPage("/loginForm")		// 인증이 필요한 URL에 접근하면 /loginForm으로 이동
                .defaultSuccessUrl("/loginForm")			// 로그인 성공하면 "/" 으로 이동
                .failureUrl("/loginForm")		// 로그인 실패 시 /loginForm으로 이동
                .userInfoEndpoint()			// 로그인 성공 후 사용자정보를 가져온다
                .userService(principalOauth2UserService);	//사용자정보를 처리할 때 사용한다
    }

}