package kr.amaranth.springbootpractice;

import jakarta.annotation.PostConstruct;
import kr.amaranth.springbootpractice.properties.MyProperties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;

@ConfigurationPropertiesScan
@SpringBootApplication
public class SpringBootPracticeApplication {


    private final Integer height;
    private final Environment environment;
    private final ApplicationContext applicationContext;
    private final MyProperties myProperties;

    public SpringBootPracticeApplication(
            @Value("${my.height}") Integer height,
            Environment environment,
            ApplicationContext applicationContext,
            MyProperties myProperties
    ) {
        this.height = height;
        this.environment = environment;
        this.applicationContext = applicationContext;
        this.myProperties = myProperties;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootPracticeApplication.class, args);

    }

    @PostConstruct
    public void init() {
        System.out.println("[@Value]: " + height);
        System.out.println("[@Environment]: " + environment.getProperty("my.height"));
        System.out.println("[@ApplicationContext]: " + applicationContext.getEnvironment().getProperty("my.height"));
        System.out.println("[@configurationProps]: " + myProperties.getHeight());
    }

}
