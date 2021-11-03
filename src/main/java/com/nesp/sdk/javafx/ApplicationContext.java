package com.nesp.sdk.javafx;

import javafx.application.Application;

/**
 * Team: NESP Technology
 * Author: <a href="mailto:1756404649@qq.com">JinZhaolu Email:1756404649@qq.com</a>
 * Time: Created 2021/8/8 22:12
 * Project: JavaFx SDK
 * Description:
 **/
public abstract class ApplicationContext extends Application implements Context {

    private static final String TAG = "BaseApplication";

    private final ContextWrapper mContextWrapper;

    public ApplicationContext() {
        mContextWrapper = new ContextWrapper();
    }

    @Override
    public Resource getResource() {
        return mContextWrapper.getResource();
    }

    @Override
    public ClassLoader getContextClassLoader() {
        return mContextWrapper.getContextClassLoader();
    }

    @Override
    public String getPackageName() {
        return mContextWrapper.getPackageName();
    }
}
