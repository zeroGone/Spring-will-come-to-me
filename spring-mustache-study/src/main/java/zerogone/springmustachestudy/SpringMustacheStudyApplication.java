package zerogone.springmustachestudy;

import com.samskivert.mustache.Mustache;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mustache.MustacheEnvironmentCollector;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class SpringMustacheStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMustacheStudyApplication.class, args);
    }

    @Bean
    public Mustache.Compiler mustacheCompiler(
            Mustache.TemplateLoader templateLoader,
            Environment environment) {

        MustacheEnvironmentCollector collector
                = new MustacheEnvironmentCollector();
        collector.setEnvironment(environment);

        return Mustache.compiler()
                .defaultValue("디폴트 값이 출력됩니다.")
                .withLoader(templateLoader)
                .withCollector(collector);
    }

}
