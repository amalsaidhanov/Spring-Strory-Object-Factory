package com.example.spring.objectfactory;

public interface Config {
    <T> Class<? extends T> getImplClass(Class<T> intf );
}
