package com.github.chabanenk0.Entity.BeanComparator;

/**
 * Created by dmitry on 21.12.16.
 */
public class CompareResult
{
    public String fieldName;
    public String value1;
    public String value2;
    public boolean isEqual;

    public String toString()
    {
        return this.fieldName + "\t" + this.value1 + "\t" + this.value2 + (this.isEqual ? "True" : "False");
    }
}
