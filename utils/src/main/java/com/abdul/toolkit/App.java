package com.abdul.toolkit;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * Hello world!
 */
@SpringBootApplication
@Import(
        FeignApp.class
)
public class App {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
