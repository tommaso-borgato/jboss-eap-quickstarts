package org.jboss.as.quickstarts.ear.controller;

import javax.inject.Named;
import java.io.Serializable;

@Named
public class GreeterBean implements Serializable {
    public String sayHello(){
        return "CIAO!!!";
    }
}
