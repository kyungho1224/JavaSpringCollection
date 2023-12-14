package kr.amaranth.springbootpractice.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created by KimKyungHo on 2023-11-30(030)
 */

@ConfigurationProperties("my")
public class MyProperties {

    private Integer height;

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }
}
