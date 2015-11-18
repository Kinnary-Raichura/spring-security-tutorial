package hello;

import hello.model.Account;
import hello.repository.AccountRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Arrays;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner init(final AccountRepository accountRepository) {

        return new CommandLineRunner() {

            @Override
            public void run(String... arg0) throws Exception {
                accountRepository.save(new Account("user", "password", "ROLE_USER"));
                accountRepository.save(new Account("admin", "password","ROLE_USER,ROLE_ADMIN"));
            }

        };

    }
}