/*
 * JBoss, Home of Professional Open Source
 * Copyright 2015, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.as.quickstarts.ear.controller;

import org.jboss.as.quickstarts.ear.ejb.GreeterEJB20;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

/**
 * A simple managed bean that is used to invoke the GreeterEJB and store the
 * response. The response is obtained by invoking getMessage().
 *
 * @author paul.robinson@redhat.com, 2011-12-21
 */
@Named("greeter")
@SessionScoped
public class Greeter implements Serializable {

    /** Default value included to remove warning. **/
    private static final long serialVersionUID = 1L;

    /**
     * Injected GreeterEJB client
     */
    @EJB
    private GreeterEJB20 greeterEJB;

    @Inject
    private GreeterBean greeterBean;
    @Inject
    private GreeterBean1 greeterBean1;
    @Inject
    private GreeterBean2 greeterBean2;
    @Inject
    private GreeterBean3 greeterBean3;
    @Inject
    private GreeterBean4 greeterBean4;
    @Inject
    private GreeterBean5 greeterBean5;
    @Inject
    private GreeterBean6 greeterBean6;
    @Inject
    private GreeterBean7 greeterBean7;
    @Inject
    private GreeterBean8 greeterBean8;
    @Inject
    private GreeterBean9 greeterBean9;
    @Inject
    private GreeterBean10 greeterBean10;
    @Inject
    private GreeterBean11 greeterBean11;
    @Inject
    private GreeterBean12 greeterBean12;
    @Inject
    private GreeterBean13 greeterBean13;
    @Inject
    private GreeterBean14 greeterBean14;
    @Inject
    private GreeterBean15 greeterBean15;
    @Inject
    private GreeterBean16 greeterBean16;
    @Inject
    private GreeterBean17 greeterBean17;
    @Inject
    private GreeterBean18 greeterBean18;
    @Inject
    private GreeterBean19 greeterBean19;
    @Inject
    private GreeterBean20 greeterBean20;

    /**
     * Stores the response from the call to greeterEJB.sayHello(...)
     */
    private String message;

    /**
     * Invoke greeterEJB.sayHello(...) and store the message
     *
     * @param name
     *            The name of the person to be greeted
     */
    public void setName(String name) {
        message = greeterEJB.sayHello(name);
    }

    /**
     * Get the greeting message, customized with the name of the person to be
     * greeted.
     *
     * @return message. The greeting message.
     */
    public String getMessage() {
        return message;
    }

}
