package org.acme.service;

import org.acme.dto.response.ResultDTO;
import org.acme.exception.ValidationException;

public interface HelloService {
    String sayHello() throws ValidationException;
}
