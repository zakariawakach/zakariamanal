package ma.xproce.demo;

import ma.xproce.demo.entities.Creator;
import ma.xproce.demo.entities.Video;
import ma.xproce.demo.repositories.CreatorRepository;
import ma.xproce.demo.repositories.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}



	CommandLineRunner commandLineRunner(CreatorRepository creatorRepository , VideoRepository videoRepository){
		return args -> {
			List<Creator> creators = List.of(
					Creator.builder().id(00l).name("wakach zakaria").email("zakach@gmail.com").build(),
					Creator.builder().id(01l).name("saloum manal").email("saloum@gmail.com").build(),
					Creator.builder().id(02l).name("wakach saloum").email("zakach_saloum@gmail.com").build(),
					Creator.builder().id(03l).name("manal zakaria").email("manal@gmail.com").build()

			);

				creatorRepository.saveAll(creators);

			List<Video> videos = List.of(
					Video.builder().id(00l).name("wakach").url("zakac12hgmail.com").description("123").datePublication(new Date(10/01/2000)).build(),
					Video.builder().id(01l).name("saloum ").url("saloum12mail.com").description("1111").datePublication(new Date(16/01/2000)).build(),
					Video.builder().id(02l).name("wakac").url("zakach_sa12loumgmail.com").description("2222").datePublication(new Date(18/01/2000)).build(),
					Video.builder().id(03l).name("manal").url("mana11lgmail.com").description("3333").datePublication(new Date(20/01/2000)).build()

			);

			videoRepository.save(Video.builder().creator(creators.get(1)).build());
			videoRepository.save(Video.builder().creator(creators.get(2)).build());
			videoRepository.save(Video.builder().creator(creators.get(3)).build());
			videoRepository.save(Video.builder().creator(creators.get(4)).build());


		};
	}
}
