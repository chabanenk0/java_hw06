package com.github.chabanenk0.Service;

import com.github.chabanenk0.Annotation.Use;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by dmitry on 19.12.16.
 */
public class BeanRepresenter
{
    public Map<String,String> getBeanRepresentation(Object object)
    {
        Map<String, String > representation = new HashMap<String, String>();
        Class classObject = object.getClass();
        Field[] fields = classObject.getDeclaredFields();
        for(Field field: fields) {
            if (field.isAnnotationPresent(Use.class)) {
                String fieldName = field.getName();
                String fieldGetter = "get" + fieldName.substring(0,1).toUpperCase() + fieldName.substring(1);
                String value = "no value";
                try {
                    value = classObject.getMethod(fieldGetter).invoke(object).toString();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                }
                representation.put(field.getName(), value);
            }
        }

        return representation;
    }
}
