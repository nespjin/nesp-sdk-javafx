package com.nesp.sdk.javafx;


/**
 * Team: NESP Technology
 * Author: <a href="mailto:1756404649@qq.com">JinZhaolu Email:1756404649@qq.com</a>
 * Time: Created 2021/8/8 22:13
 * Project: JavaFx SDK
 * Description:
 **/
public class ContextWrapper implements Context {

    private final Resource mResource;
    private final ClassLoader mContextClassLoader;

    public ContextWrapper() {
        mContextClassLoader = Thread.currentThread().getContextClassLoader();
        mResource = new Resource(this);
    }

    @Override
    public Resource getResource() {
        return mResource;
    }

    @Override
    public ClassLoader getContextClassLoader() {
        return mContextClassLoader;
    }

    @Override
    public String getPackageName() {
        throw new UnsupportedOperationException("This method is not implements yet!!");
    }


}
