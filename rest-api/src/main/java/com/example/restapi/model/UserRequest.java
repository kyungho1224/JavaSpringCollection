package com.example.restapi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by KimKyungHo on 2023-11-30(030)
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)   // json 파일의 네이밍 타입
public class UserRequest {
    private String userName;
    private Integer userAge;
//    private String userPhone;

    @JsonProperty("user_email") // json key 지정
    private String email;
    private Boolean isKorean;

    @JsonIgnore // json으로 사용하지 않음
    public String getName() {
        return this.userName;
    }
}
