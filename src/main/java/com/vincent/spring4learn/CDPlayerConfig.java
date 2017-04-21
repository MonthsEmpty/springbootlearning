package com.vincent.spring4learn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2017/4/12.
 */
@Configuration
//@ComponentScan //这个注解能够在Spring中启用组件扫描。 ，因此Spring将会扫描这个包以及这个包下的所有子包，查找带有@Component注解的类。
//@ComponentScan(basePackages = {"xxx","xxx"}) //设置多个基础包
public class CDPlayerConfig {

    @Bean //@Bean注解会告诉Spring这个方法将会返回一个对象，该对象要注册为Spring应用上下文中的bean。方法体中包含了最终产生bean实例的逻辑。
    //默认情况下，bean的ID与带有@Bean注解的方法名是一样的。在本例中，bean的名字将会是sgtPeppers。
//    @Bean(name = "aaa") //通过name属性指定一个不同的名字
    //这是单例吗？
    public CompactDisc sgtPeppers(){
        return new SgtPeppers();
    }

    @Bean
    public CDPlayer cdPlayer(){
        return new CDPlayer(sgtPeppers());//看起来，CompactDisc是通过调用sgtPeppers()得到的，但情况并非完全如此。因为sgtPeppers()方法上添加了@Bean注解，Spring将会拦截所有对它的调用，并确保直接返回该方法所创建的bean，而不是每次都对其进行实际的调用。
    }

   /* @Bean
    //这个CDPlayer持有的SgtPeppers和上面一个CDPlayer是同一个
    public CDPlayer anotherCdPlayer(){
        return new CDPlayer(sgtPeppers());//默认情况下，Spring中的bean都是单例的.所以，Spring会拦截对sgtPeppers()的调用并确保返回的是Spring所创建的bean，也就是Spring本身在调用sgtPeppers()时所创建的CompactDiscbean。因此，两个CDPlayer bean会得到相同的SgtPeppers实例。
    }*/

    /*@Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc){
        return new CDPlayer(compactDisc);
    }*/
}
