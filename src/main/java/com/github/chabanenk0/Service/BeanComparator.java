package com.github.chabanenk0.Service;

import com.github.chabanenk0.Annotation.Compare;
import com.github.chabanenk0.Entity.BeanComparator.CompareResult;
import java.lang.Object;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.security.InvalidParameterException;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by dmitry on 21.12.16.
 */
public class BeanComparator
{
    public List<CompareResult> compare(Object object1, Object object2)
    {
        List<CompareResult> results = new LinkedList<CompareResult>();
        Class object1Class = object1.getClass();
        Class object2Class = object2.getClass();

        if (object1Class != object2Class) {
            throw new InvalidParameterException("Cannot compare objects");
        }

        for(Field field: object1Class.getDeclaredFields()) {
            if (field.isAnnotationPresent(Compare.class)) {
                CompareResult compareResult = new CompareResult();
                String fieldName = field.getName();
                compareResult.fieldName = fieldName;
                String getterMethodName = "get" + fieldName.substring(0,1).toUpperCase() + fieldName.substring(1);
                try {
                    compareResult.value1 = object1Class.getMethod(getterMethodName).invoke(object1).toString();
                    compareResult.value2 = object2Class.getMethod(getterMethodName).invoke(object2).toString();
                    compareResult.isEqual = compareResult.value1 == compareResult.value2;

                    results.add(compareResult);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                }
            }
        }

        return results;
    }
}
