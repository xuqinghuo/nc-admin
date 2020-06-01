package com.nc.oa.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动器
 * @author qhxu
 * @date May 29, 2020
 */
@SpringBootApplication(scanBasePackages={"com.nc.oa"})
public class NcAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(NcAdminApplication.class, args);
	}
}
