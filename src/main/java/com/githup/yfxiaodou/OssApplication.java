package com.githup.yfxiaodou;

import com.aliyun.oss.OSSClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableConfigurationProperties(OssClientProperties.class)
@Configuration
public class OssApplication {

	@Autowired
	private OssClientProperties ossClientProperties;
	@Bean
	public OSSClient ossClient(){
		return new OSSClient(ossClientProperties.getEndpoint(),ossClientProperties.getAccessId(),ossClientProperties.getAccessKey());
	}

	public static void main(String[] args) {
		SpringApplication.run(OssApplication.class, args);
	}
}
