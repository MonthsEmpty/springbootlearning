package com.vincent.spring4learn;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2017/4/12.
 */
@Configuration
@ComponentScan //这个注解能够在Spring中启用组件扫描。 ，因此Spring将会扫描这个包以及这个包下的所有子包，查找带有@Component注解的类。
public class CDPlayerConfig {
}
