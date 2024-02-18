package com.example.spring.objectfactory;

import lombok.ToString;
import org.reflections.Reflections;

import java.util.Map;
import java.util.Set;
@ToString

public class JavaConfig implements Config {

    private Reflections scanner;
    private Map<Class, Class> intf2implClass;

    public JavaConfig(String packageToScan, Map<Class, Class> intf2implClass) {
        this.intf2implClass = intf2implClass;
        this.scanner = new Reflections(packageToScan);
    }

    @Override
    public <T> Class<? extends T> getImplClass(Class<T> intf) {
        return intf2implClass.computeIfAbsent(intf, aClass -> {
            Set<Class<? extends T>> classes = scanner.getSubTypesOf(intf);
            if (classes.size() != 1) {
                System.out.println("ti chto dolbaedaasdb? 1<class!");
                throw new RuntimeException(intf + " has 0 or more than one impl");
            }
            return classes.iterator().next();
        });
    }
}
