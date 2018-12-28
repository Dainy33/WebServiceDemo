package com.dainy33.practice.publish;

import com.dainy33.practice.service.impl.WebServiceImpl;

import javax.xml.ws.Endpoint;

public class WebServicePublish {
    private static final String PROTOCAL = "http";
    private static final String IP = "localhost";
    private static final String PORT = "8989";

    public static void main(String[] args) {
        String address = PROTOCAL + "://" + IP + ":" + PORT + "/" + "WS_Server/WebService";
        Endpoint.publish(address, new WebServiceImpl());
        System.out.println("发布成功!");
        System.out.println("WSDL地址为: " + address + "?wsdl");
    }
}
/**
 * @program: webServiceDemo
 * @description:
 * @author: Dainy33
 * @create: 2018-12-27 15:06
 **/
