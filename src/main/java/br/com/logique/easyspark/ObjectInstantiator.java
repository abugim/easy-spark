package br.com.logique.easyspark;

import spark.Request;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * Created by gustavo on 28/04/2016.
 */
public interface ObjectInstantiator {

    Object resolveParameter(Method method, Parameter parameter, Request request);

}