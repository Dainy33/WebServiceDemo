package com.dainy33.practice.ProtoTypeWebService.service.impl;

import com.dainy33.practice.ProtoTypeWebService.service.WebService;

import javax.jws.WebMethod;

@javax.jws.WebService
public class WebServiceImpl implements WebService {
    @WebMethod
    public String sayHello() {
        return "Hello WebService";
    }
}
/**
 * @program: webServiceDemo
 * @description:
 * @author: Dainy33
 * @create: 2018-12-27 15:05
 **/
