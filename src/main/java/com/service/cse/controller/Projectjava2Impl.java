package com.service.cse.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-09-08T07:22:03.351Z")

@RestSchema(schemaId = "projectjava2")
@RequestMapping(path = "/cse", produces = MediaType.APPLICATION_JSON)
public class Projectjava2Impl {

    @Autowired
    private Projectjava2Delegate userProjectjava2Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userProjectjava2Delegate.helloworld(name);
    }

}
