package com.github.chabanenk0.Service;

import com.github.chabanenk0.Annotation.Clone;

import java.lang.Object;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/**
 * Created by dmitry on 21.12.16.
 */
public class CloneCreator
{
    public Object clone(Object sourceObject) throws IllegalAccessException, InstantiationException {
        Class classObject = sourceObject.getClass();
        Object newObject = classObject.newInstance();
        Field[] fields = classObject.getDeclaredFields();
        for (Field field : fields) {
            String fieldName = field.getName();
            if (field.isAnnotationPresent(Clone.class)) {
                this.transferObjectValue(newObject, sourceObject, fieldName);
            } else {
                this.transferFieldValue(newObject, sourceObject, fieldName);
            }
        }

        return newObject;
    }

    private void transferFieldValue(Object destination, Object source, String fieldName)
    {
        Class classObject = source.getClass();
        String fieldCamelized = fieldName.substring(0,1).toUpperCase() + fieldName.substring(1);
        String fieldGetter = "get" + fieldCamelized;
        String fieldSetter = "set" + fieldCamelized;
        try {
            Method getter = classObject.getMethod(fieldGetter);
            Method setter = classObject.getMethod(fieldSetter, getter.getReturnType());
            setter.invoke(destination, getter.invoke(source));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    private void transferObjectValue(Object destination, Object source, String fieldName)
    {
        Class classObject = source.getClass();
        String fieldCamelized = fieldName.substring(0,1).toUpperCase() + fieldName.substring(1);
        String fieldGetter = "get" + fieldCamelized;
        String fieldSetter = "set" + fieldCamelized;
        try {
            Method getter = classObject.getMethod(fieldGetter);
            Object subObject = getter.invoke(source);
            Object clonnedSubObject = this.clone(subObject);
            classObject.getMethod(fieldSetter, getter.getReturnType()).invoke(destination, clonnedSubObject);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
