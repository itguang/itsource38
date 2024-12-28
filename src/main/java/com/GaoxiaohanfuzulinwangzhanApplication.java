package com;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.net.UnknownHostException;

@SpringBootApplication
@ServletComponentScan(value = "com.ServletContextListener")
@MapperScan(basePackages = {"com.dao"})
public class GaoxiaohanfuzulinwangzhanApplication extends SpringBootServletInitializer{

	public static void main(String[] args) throws UnknownHostException {
		Logger log = LoggerFactory.getLogger(GaoxiaohanfuzulinwangzhanApplication.class);
		ConfigurableApplicationContext applicationContext = SpringApplication.run(GaoxiaohanfuzulinwangzhanApplication.class, args);
		ConfigurableEnvironment env = applicationContext.getEnvironment();
		String contextPath = env.getProperty("server.servlet.context-path");
		log.info("\n\n====== \033[31;4m 关注微信公众号: \033[40;32;4m【ITSource每日分享】,一万个IT资源等你发现：项目源码，软件工具，面试面经，学习视频 应有尽有！！！\033[0m ==========================================\n\t" +
						"\033[31;4m点击下方链接扫码关注 \033[0m: https://mmbiz.qpic.cn/sz_mmbiz_jpg/JfvqwvA8e1vfT6fJAGV0hibeQY1Sia4iaCZ6iaicDl1joUxPsicXoiaeyWuAl8Vhmfiah9j0bjNYVuske8G3ZGopia92RyQ/640 \n" +
						"=============================================================================================================================================================\n" +
						"应用程序启动成功! 点击下方链接开始体验吧~:\n\t" +
						"管理后台地址: \thttp://localhost:{}{}/admin/dist/index.html\n\t" +
						"前台地址: \thttp://localhost:{}{}/front/index.html\n" +
						"===============================================================================================================================================================\n",
				env.getProperty("server.port"),contextPath,
				env.getProperty("server.port"),contextPath
		);
	}
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder applicationBuilder) {
        return applicationBuilder.sources(GaoxiaohanfuzulinwangzhanApplication.class);
    }
}
