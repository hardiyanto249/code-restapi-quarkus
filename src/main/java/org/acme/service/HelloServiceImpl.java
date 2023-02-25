package org.acme.service;

import javax.enterprise.context.ApplicationScoped;

import org.acme.common.CommonContants;
import org.acme.dto.response.ResultDTO;
import org.acme.exception.ValidationException;

@ApplicationScoped
public class HelloServiceImpl implements HelloService{
    
    @Override
    public String sayHello() throws ValidationException{
        ResultDTO result = new ResultDTO();
        result.message = CommonContants.SuccessMessage.FETCH_SUCCESS_HELLO;
        return result.message;
    }
}
