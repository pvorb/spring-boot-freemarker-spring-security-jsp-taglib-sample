package de.vorb.freemarkerjsptaglibsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import static java.util.Collections.singletonList;

@SpringBootApplication
@Controller
public class FreemarkerJspTaglibSampleApplication {

    public FreemarkerJspTaglibSampleApplication(FreeMarkerConfigurer freeMarkerConfigurer) {
        freeMarkerConfigurer.getTaglibFactory().setClasspathTlds(singletonList("/META-INF/security.tld"));
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(FreemarkerJspTaglibSampleApplication.class, args);
    }

}
