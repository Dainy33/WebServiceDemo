package com.dainy33.practice.ProtoTypeWebService.service;

import javax.jws.WebMethod;

@javax.jws.WebService
public interface WebService {
    @WebMethod
    public String sayHello();
}
