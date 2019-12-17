package com.imooc;


import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/7/24 9:34
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {
   // private final Logger logger = LoggerFactory.getLogger(LoggerTest.class);

    @Test
    public void test1(){
        String name = "imooc";
        String password = "123456";
        log.info("name:{},password:{}",name,password);
        log.info("info...");
        log.debug("debug...");
        log.error("error...");
    }
}
