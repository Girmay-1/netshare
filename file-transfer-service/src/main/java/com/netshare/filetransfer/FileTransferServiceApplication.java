package com.netshare.filetransfer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FileTransferServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(FileTransferServiceApplication.class,args);
    }
}
