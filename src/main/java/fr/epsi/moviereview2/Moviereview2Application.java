package fr.epsi.moviereview2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import fr.epsi.moviereview2.apifetch.MovieRestTemplate;

@SpringBootApplication
public class Moviereview2Application {

	private static final Logger log = LoggerFactory.getLogger(Moviereview2Application.class);
	
	public static void main(String[] args) {
		SpringApplication.run(Moviereview2Application.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	
	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			MovieRestTemplate mvrr = restTemplate.getForObject(
					"https://api.themoviedb.org/3/movie/550?api_key=719886a0b8020a1ae30c9c5d174c01d3", MovieRestTemplate.class);
			log.info(mvrr.toString());
		};
	}
}
