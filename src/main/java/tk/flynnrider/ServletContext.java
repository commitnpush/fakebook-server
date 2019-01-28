package tk.flynnrider;

import javax.servlet.Filter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import tk.flynnrider.interceptor.CORSInterceptor;

@Configuration
public class ServletContext implements WebMvcConfigurer{
	@Autowired
	private  CORSInterceptor corsInterceptor;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(corsInterceptor).addPathPatterns("/**");
	}
	
}
