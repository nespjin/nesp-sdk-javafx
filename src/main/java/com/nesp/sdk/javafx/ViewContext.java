package com.nesp.sdk.javafx;

import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

/**
 * Team: NESP Technology
 * Author: <a href="mailto:1756404649@qq.com">JinZhaolu Email:1756404649@qq.com</a>
 * Time: Created 2021/10/30 14:20
 * Project: PasswordManagerJavaFx
 * Description:
 **/
public abstract class ViewContext extends AnchorPane implements Context {

    private static final String TAG = "ViewContext";

    private ContextWrapper mContextWrapper;
    private Node mRootNode;

    public ViewContext() {
        initialize();
        onCreate();
    }

    protected abstract void onCreate();

    protected void setContentView(final String fxmlFile) {
        setContentView(fxmlFile, this);
    }

    protected void setContentView(final String fxmlFile, final Object controller) {
        try {
            mRootNode = Resource.tryLoadFxml(fxmlFile, this, controller);
            if (controller instanceof ControllerContext context) {
                context.onCreate(mRootNode);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void initialize() {
        mContextWrapper = new ContextWrapper();
    }

    public Node getRootNode() {
        return mRootNode;
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
