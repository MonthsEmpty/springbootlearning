package com.vincent.filter;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;

/**
 * Created by dell on 2017/4/11.
 */
public class ControllerInterceptor implements MethodInterceptor {
    private final static ObjectMapper jsonMapper = new ObjectMapper();

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("Before: interceptor name: {}" + invocation.getMethod().getName());

        System.out.println("Arguments: {}" + jsonMapper.writeValueAsString(invocation.getArguments()));

        Object result = invocation.proceed();

        System.out.println("After: result: {}" + jsonMapper.writeValueAsString(result));

        return result;
    }
}
