package lt.mrekev.hw.top;

import org.springframework.boot.SpringApplication;

public class TestTopApplication {

	public static void main(String[] args) {
		SpringApplication.from(TopApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
