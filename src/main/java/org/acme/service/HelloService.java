package org.acme.service;

import org.acme.exception.ValidationException;

public interface HelloService {
    String sayHello() throws ValidationException;
}
