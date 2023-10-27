package com.buildtmwlearning.springbootapipojo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx =new AnnotationConfigApplicationContext();
        ctx.register(Config.class);
        ctx.refresh();
        ctx.close();
    }
}
