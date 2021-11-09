package com.nesp.sdk.javafx;

import com.google.common.util.concurrent.ListenableFuture;
import com.nesp.sdk.javafx.concurrent.IThreadDispatcher;
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

    @Override
    public IThreadDispatcher newThreadDispatcher() {
        return mContextWrapper.newThreadDispatcher();
    }

    @Override
    public <R> ListenableFuture<R> runOnIOThread(final Runnable runnable) {
        return mContextWrapper.runOnIOThread(runnable);
    }

    @Override
    public <R> ListenableFuture<R> runOnDaemonIOThread(final Runnable runnable) {
        return mContextWrapper.runOnDaemonIOThread(runnable);
    }

    @Override
    public <R> ListenableFuture<R> runOnIOThread(final boolean isDaemon, final Runnable runnable) {
        return mContextWrapper.runOnIOThread(isDaemon, runnable);
    }

    @Override
    public void runOnUIThread(final Runnable runnable) {
        mContextWrapper.runOnUIThread(runnable);
    }

    @Override
    public void runOnUIThreadDelay(final long delay, final Runnable runnable) {
        mContextWrapper.runOnUIThreadDelay(delay, runnable);
    }

}
