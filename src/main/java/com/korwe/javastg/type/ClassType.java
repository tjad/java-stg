package com.korwe.javastg.type;

/**
 * @author <a href="mailto:tjad.clark@korwe.com>Tjad Clark</a>
 */
public interface ClassType extends Type{
    ClassType getSuperClass();

    void setSuperClass(ClassType superClass);

    boolean extendsFrom(ClassType classType);
}
