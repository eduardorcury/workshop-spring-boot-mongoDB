package com.eduardorib.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.eduardorib.domain.Post;
import com.eduardorib.domain.User;
import com.eduardorib.dto.AuthorDTO;
import com.eduardorib.repository.PostRepository;
import com.eduardorib.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private PostRepository postRepository;

	@Override
	public void run(String... args) throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

		userRepository.deleteAll();
		postRepository.deleteAll();

		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");

		userRepository.saveAll(Arrays.asList(maria, alex, bob));

		Post post1 = new Post(null, sdf.parse("21/03/2020"), "Partiu viagem", "Viajando para São Paulo, abçs",
				new AuthorDTO(maria));
		Post post2 = new Post(null, sdf.parse("24/06/2020"), "Bom dia", "Estudando mongoDB", new AuthorDTO(maria));

		postRepository.saveAll(Arrays.asList(post1, post2));

	}

}
