package com.renlaApp.backend.Renla;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

@EnableJpaAuditing
@SpringBootApplication
public class RenlaApplication {

	public static void main(String[] args) {
		SpringApplication.run(RenlaApplication.class, args);
		
		try {
			FirebaseOptions options = new FirebaseOptions.Builder()
			  .setCredentials(GoogleCredentials.fromStream(new ClassPathResource("/firebase-authentication.json").getInputStream()))
			  .setDatabaseUrl("https://renla-3c6ff.firebaseio.com/")
			  .setStorageBucket("renla-3c6ff.appspot.com")
			  .build();
			FirebaseApp.initializeApp(options);
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}

}
