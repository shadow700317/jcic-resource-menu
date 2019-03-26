package com.asi.microservice.junit;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import com.asi.microservice.entity.Menu;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MenuControllerTest {
	@Autowired
    private TestRestTemplate restTemplate;
	
	@Autowired
	ObjectMapper objectMapper;
	
	@Test
    public void getMenu() {
		String uri = "/jcic/menu";
        String result = restTemplate.getForObject(uri, String.class);
        System.out.println(result);
        try {
			List<Menu> menu = objectMapper.readValue(result,new TypeReference<List<Menu>>(){});
			Assert.assertTrue("Menu長度", menu.size()==6);
		} catch (IOException e) {
			e.printStackTrace();
			assert(false);
		}
    }
}
