package com.toyota.springcloudfunctions.functions;

import java.util.function.Function;

public class Greeter implements Function<String,String> {
    @Override
    public String apply(String s) {
        return "Hello " + s + ", and welcome to Spring Cloud Functions!";
    }
}
