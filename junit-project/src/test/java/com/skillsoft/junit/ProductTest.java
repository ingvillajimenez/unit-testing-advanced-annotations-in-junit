package com.skillsoft.junit;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
//import org.junit.jupiter.api.TestMethodOrder;
//import org.junit.jupiter.api.MethodOrderer;
//import org.junit.jupiter.api.Order;

import static org.junit.jupiter.api.Assertions.assertEquals;

//import org.junit.jupiter.api.Disabled;
//import org.junit.jupiter.api.condition.EnabledOnOs;
//import org.junit.jupiter.api.condition.OS;
//import org.junit.jupiter.api.condition.DisabledOnOs;
//import org.junit.jupiter.api.condition.EnabledOnJre;
//import org.junit.jupiter.api.condition.DisabledOnJre;
//import org.junit.jupiter.api.condition.JRE;
//import org.junit.jupiter.api.condition.EnabledForJreRange;
//import org.junit.jupiter.api.condition.DisabledForJreRange;
//import org.junit.jupiter.api.condition.DisabledIfSystemProperty;
//import org.junit.jupiter.api.condition.EnabledIfSystemProperty;
//import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
//import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
//import java.lang.annotation.Retention;
//import java.lang.annotation.RetentionPolicy;

@Execution(ExecutionMode.CONCURRENT)
//@TestMethodOrder(MethodOrderer.DisplayName.class)
//@TestMethodOrder(MethodOrderer.MethodName.class)
//@TestMethodOrder(MethodOrderer.Random.class)
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ProductTest {

    static Product tv;

    @BeforeAll
    static void init() {
        tv = new Product("Diallonic", "Delta", 13423,
                800, "Electronics");

//        System.out.println("Environment variables:");
//        System.out.println("PWD: " + System.getenv("PWD"));
//        System.out.println("USER: " + System.getenv("USER"));
//        System.out.println("ALL: " + System.getenv());

//        System.out.println("System properties:");
//        System.out.println("os.arch: " + System.getProperty("os.arch"));
//        System.out.println("os.version: " + System.getProperty("os.version"));
//        System.out.println("os.name: " + System.getProperty("os.name"));
//        System.out.println("user.name: " + System.getProperty("user.name"));
    }

//    @Retention(RetentionPolicy.RUNTIME)
//    @Test
//    @EnabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_17)
//    @EnabledOnOs(OS.MAC)
//    @EnabledIfSystemProperty(named = "os.arch", matches = "x86_64")
//    public @interface MyCustomTestConditions {
//    }

    @Test
//    @MyCustomTestConditions
    @DisplayName("Brand Name Check")
    @Timeout(4)
//    @Order(2)
//    @EnabledIfEnvironmentVariable(named = "PWD", matches = ".*junit.*")
//    @EnabledForJreRange(max = JRE.JAVA_11)
//    @EnabledIfSystemProperty(named = "os.arch", matches = "x86_64")
//    @DisabledForJreRange(max = JRE.JAVA_11)
//    @EnabledOnJre(JRE.JAVA_13)
//    @EnabledOnOs(OS.MAC)
//    @Disabled
    void brandNameTest() throws InterruptedException {

        Thread.sleep(4000);

        assertEquals("Diallonic",
                tv.getBrandName(),
                "Brand Name Test");
    }

    @Test
//    @MyCustomTestConditions
//    @EnabledIfEnvironmentVariable(named = "USER", matches = "juan.*")
    @DisplayName("Price Check")
    @Timeout(4)
//    @Order(1)
//    @EnabledIfEnvironmentVariable(named = "USER", matches = "loonycorn")
//    @EnabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_17)
//    @EnabledIfSystemProperty(named = "os.version", matches = "9\\..*")
//    @DisabledForJreRange(min = JRE.JAVA_9, max = JRE.JAVA_13)
//    @EnabledForJreRange(min = JRE.JAVA_9, max = JRE.JAVA_13)
//    @EnabledOnJre(JRE.JAVA_9)
//    @DisabledOnOs(OS.MAC)
//    @EnabledOnOs(OS.MAC)
//    @EnabledOnOs(OS.WINDOWS)
//    @Disabled
    void priceTest() throws InterruptedException {

        Thread.sleep(3000);

        assertEquals(800,
                tv.getPrice(),
                "Price Test");
    }

    @Test
//    @MyCustomTestConditions
//    @DisabledIfEnvironmentVariable(named = "USER", matches = "juan.*")
    @DisplayName("Category Check")
    @Timeout(4)
//    @Order(3)
//    @DisabledIfEnvironmentVariable(named = "USER", matches = "juan.*")
//    @EnabledOnOs(OS.MAC)
//    @EnabledIfSystemProperty(named = "os.name", matches = "Windows 10")
//    @EnabledForJreRange(min = JRE.JAVA_13)
//    @DisabledOnJre(JRE.JAVA_13)
//    @DisabledOnOs(OS.LINUX)
//    @EnabledOnOs(OS.LINUX)
    void categoryTest() throws InterruptedException {

        Thread.sleep(3000);

        assertEquals("Electronics",
                tv.getCategory(),
                "Category Test");
    }

    @Test
    @DisplayName("Model Check")
    @Timeout(4)
//    @Order(3)
//    @MyCustomTestConditions
//    @EnabledIfEnvironmentVariable(named = "USER", matches = "skill.*")
//    @DisabledIfEnvironmentVariable(named = "LANG", matches = "de_DE*")
//    @DisabledForJreRange(min = JRE.JAVA_13)
//    @DisabledIfSystemProperty(named = "os.arch", matches = ".*_64")
    void modelTest() throws InterruptedException {

        Thread.sleep(5000);

        assertEquals("Delta",
                tv.getModel(),
                "Model Test");
    }
}