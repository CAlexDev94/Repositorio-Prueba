package sv.example.fileloader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import sv.example.fileloeader.property.FileStorageProperties;

@SpringBootApplication
@EnableConfigurationProperties({
    FileStorageProperties.class
})
public class FileLoaderApplication {

	public static void main(String[] args) {
		SpringApplication.run(FileLoaderApplication.class, args);
	}

}
