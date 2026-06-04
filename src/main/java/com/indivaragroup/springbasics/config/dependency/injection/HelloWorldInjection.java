package com.indivaragroup.springbasics.config.dependency.injection;

import com.indivaragroup.springbasics.config.dependency.injection.dto.HelloInjection;
import com.indivaragroup.springbasics.config.dependency.injection.dto.WorldInjection;

public class HelloWorldInjection {
  private HelloInjection helloInjection;
  private WorldInjection worldInjection;

    public HelloWorldInjection(HelloInjection helloInjection, WorldInjection worldInjection) {
        this.helloInjection = helloInjection;
        this.worldInjection = worldInjection;
    }
}
