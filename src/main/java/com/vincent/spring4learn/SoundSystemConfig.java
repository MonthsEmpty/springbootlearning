package com.vincent.spring4learn;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by dell on 2017/4/13.
 */
//实现xml和JavaConfig混合配置
//@Configuration
@Import(CDPlayerConfig.class)
@ImportResource("classpath:cd-config.xml")
public class SoundSystemConfig {
}
