package kr.amaranth.springbootpractice.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Created by KimKyungHo on 2023-11-30(030)
 */

@Configuration
public class DataSourceConfig {

//    @Bean
//    public DataSource getDataSource() {
//        DataSourceBuilder<?> builder = DataSourceBuilder.create();
//        builder.username("asdf");
//        builder.password("asdfasdf");
//        builder.url("jdbc:h2:mem:test");
//        builder.driverClassName("org.h2.Driver");
//        return builder.build();
//    }

}
