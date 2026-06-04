package com.indivaragroup.springbasics;

import com.indivaragroup.springbasics.config.*;
import com.indivaragroup.springbasics.config.dependency.injection.HelloWorldInjection;
import com.indivaragroup.springbasics.config.dependency.injection.HelloWorldWithInjection;
import com.indivaragroup.springbasics.config.dependency.injection.dto.HelloInjection;
import com.indivaragroup.springbasics.config.dependency.injection.dto.WorldInjection;
import com.indivaragroup.springbasics.dto.HelloDTO;
import com.indivaragroup.springbasics.dto.WorldDTO;
import com.indivaragroup.springbasics.exam.DistribusiService;
import com.indivaragroup.springbasics.exam.config.DistribusiConfiguration;
import com.indivaragroup.springbasics.exam.config.GudangConfiguration;
import com.indivaragroup.springbasics.exam.config.SalesConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringBasicsApplication {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JDTConfiguration.class);
    System.out.println(context.getBean("getInitialConfiguration"));
    context.close(); // saves memory

    // singleton
    // same signature
    var db = DatabaseConfiguration.getInstance();
    var db1 = DatabaseConfiguration.getInstance();

    System.out.println("db1 = " + db1);
    System.out.println("db = " + db);

    AnnotationConfigApplicationContext newContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
    System.out.println(newContext.getBean("helloDTO", HelloDTO.class));
    System.out.println(newContext.getBean("helloDTO1", HelloDTO.class));
    System.out.println(newContext.getBean("worldDTO", WorldDTO.class));
    newContext.close();

//    AnnotationConfigApplicationContext duplicateContext = new AnnotationConfigApplicationContext(DuplicateBeanConfiguration.class);
//    System.out.println(duplicateContext.getBean("helloDTO", HelloDTO.class));
//    System.out.println(duplicateContext.getBean("helloDTO1", HelloDTO.class));
//    System.out.println(duplicateContext.getBean("worldDTO", WorldDTO.class));
//    duplicateContext.close();

    var contextPrimaryBean = new AnnotationConfigApplicationContext(PrimaryBeanConfiguration.class);
    System.out.println(contextPrimaryBean.getBean("world"));
    System.out.println(contextPrimaryBean.getBean("world2"));

    var customBean = new AnnotationConfigApplicationContext(BeanNameConfiguration.class);
    System.out.println(customBean.getBean("fooBean"));
    System.out.println(customBean.getBean("barBean"));

    // no DI
    HelloInjection helloInjection = new HelloInjection();
    WorldInjection worldInjection = new WorldInjection();
    HelloWorldInjection helloWorldInjection = new HelloWorldInjection(helloInjection, worldInjection);

    // DI
    var helloWorldWithInjectionContext = new AnnotationConfigApplicationContext(HelloWorldWithInjection.class);
    HelloWorldWithInjection helloWorldWithInjection = helloWorldWithInjectionContext.getBean(HelloWorldWithInjection.class);
    System.out.println(helloWorldWithInjection.hello().name());
    System.out.println(helloWorldWithInjection.world().name());


    var dependsOnBean = new AnnotationConfigApplicationContext(
      DependsOnConfiguration.class
    );

    DependsOnConfiguration dependsOnConfiguration = dependsOnBean.getBean(DependsOnConfiguration.class);
    System.out.println(dependsOnConfiguration.foo());

    // can be simplified to Gudang -> Distribusi, Sales
    var examBean = new AnnotationConfigApplicationContext(DistribusiConfiguration.class, GudangConfiguration.class, SalesConfiguration.class);
    DistribusiService distribusiService = examBean.getBean(DistribusiService.class);
    distribusiService.distribusiBarang();
    System.out.println("Dengan pengurangan");
    distribusiService.distribusiBarangDenganPengurangan();
    examBean.close();

    SpringApplication.run(SpringBasicsApplication.class, args);
  }
}
