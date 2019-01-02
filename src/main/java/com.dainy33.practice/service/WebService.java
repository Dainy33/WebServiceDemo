package com.dainy33.practice.service;

import javax.jws.WebMethod;

@javax.jws.WebService
public interface WebService {
    @WebMethod
    public String sayHello();
}
