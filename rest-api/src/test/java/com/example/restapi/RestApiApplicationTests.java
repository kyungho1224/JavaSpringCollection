package com.example.restapi;

import com.example.restapi.model.UserRequest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RestApiApplicationTests {

	@Autowired    // 스프링에서 관리하는 빈 중에 자동으로 생성되는 오브젝트 매퍼를 가져온다
	private ObjectMapper objectMapper;

	@Test
	void contextLoads() throws JsonProcessingException {
		var user = new UserRequest();
		user.setUserName("홍길동");
		user.setUserAge(20);
		user.setEmail("hong@gmail.com");
		user.setIsKorean(true);

		// objectMapper(직렬화) = 변수가 아닌 get 메서드의 이름으로 매핑시킴
		var json = objectMapper.writeValueAsString(user);
		System.out.println("json = " + json);

		// objectMapper(역직렬화) = 변수가 아닌 set -> get 메서드의 이름으로 매핑시킴
		var dto = objectMapper.readValue(json, UserRequest.class);
		System.out.println("dto = " + dto);
	}

}
