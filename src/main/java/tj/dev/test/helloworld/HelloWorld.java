package tj.dev.test.helloworld;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(produces=APPLICATION_JSON_UTF8_VALUE)
public class HelloWorld {
	
	@GetMapping(path="/")
	public String helloWorld() {
		return "Hello World";
	}

}
