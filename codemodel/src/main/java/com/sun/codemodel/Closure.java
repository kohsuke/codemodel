package com.sun.codemodel;

/**
 * @author Kohsuke Kawaguchi
 */
public interface Closure<T> {
    void call(T t);
}
