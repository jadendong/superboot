package cloud.superboot.ops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jaden
 */
@RestController
@SpringBootApplication
public class OpsApplication {

    private static final String BUCKET_NAME = "superboot-ops";

    public static void main(String[] args) {
        SpringApplication.run(OpsApplication.class, args);
    }

    @GetMapping("/hello")
    public String demo(){
        return BUCKET_NAME;
    }
}
