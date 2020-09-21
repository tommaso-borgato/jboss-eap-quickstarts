package org.jboss.as.quickstarts.ear.controller;

import javax.enterprise.context.ApplicationScoped;
import java.io.Serializable;

@ApplicationScoped
public class GreeterBean14 implements Serializable {
    public String sayHello(){
        return "CIAO!!!";
    }
}
