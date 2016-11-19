package com.example;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Retainer {
    private static final String SUFFIX = "$$Proxy";
    public static <Caller, Bundle> void save(Caller caller, Bundle outState){
        String className = caller.getClass().getCanonicalName() + SUFFIX;
        try {
            Class clazz = Class.forName(className);
            Constructor obj = clazz.getConstructor(caller.getClass());
            Object callerProxyInstance = obj.newInstance(caller);
            Method save = callerProxyInstance.getClass().getDeclaredMethod("save", outState.getClass());
            save.invoke(callerProxyInstance, outState);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public static <Caller, Bundle> void load(Caller caller, Bundle outState){
        String className = caller.getClass().getCanonicalName() + SUFFIX;
        try {
            Class clazz = Class.forName(className);
            Constructor obj = clazz.getConstructor(caller.getClass());
            Object callerProxyInstance = obj.newInstance(caller);
            Method save = callerProxyInstance.getClass().getDeclaredMethod("load", outState.getClass());
            save.invoke(callerProxyInstance, outState);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
