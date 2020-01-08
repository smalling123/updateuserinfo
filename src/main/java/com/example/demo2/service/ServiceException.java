package com.example.demo2.service;

/**
 * @Description:
 * @Company:mamaway
 * @Author:smalling
 * @Data:2020/1/2
 * @Time:13:28
 */
public class ServiceException extends RuntimeException {
    private static final long serialVersionUID = -5598865415547474216L;

    public ServiceException() {
        super();
        // TODO Auto-generated constructor stub
    }

    public ServiceException(String message) {
        super(message);
        // TODO Auto-generated constructor stub
    }

    public ServiceException(Throwable cause) {
        super(cause);
        // TODO Auto-generated constructor stub
    }

}

