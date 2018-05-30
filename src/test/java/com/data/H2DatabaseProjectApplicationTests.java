package com.data;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest
public class H2DatabaseProjectApplicationTests {

	@Test
	public void contextLoads() throws URISyntaxException {
		RestTemplate template=new RestTemplate();
		URI url=new URI("http://localhost:7080/test/save");
		Student st=new Student();
		st.setSadd("gwl");
		st.setSname("jai");
		ResponseEntity<String> res=template.postForEntity(url, st, String.class);
		System.out.println(res);
	}

}
