package com.nesp.sdk.javafx;

import com.google.common.util.concurrent.ListenableFuture;
import com.nesp.sdk.javafx.concurrent.IThreadDispatcher;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.SceneAntialiasing;
import javafx.scene.paint.Paint;

/**
 * Team: NESP Technology
 * Author: <a href="mailto:1756404649@qq.com">JinZhaolu Email:1756404649@qq.com</a>
 * Time: Created 2021/8/29 11:41
 * Project: PasswordManagerJavaFx
 * Description:
 **/
public abstract class SceneContext extends Scene implements Context {

    private ContextWrapper mContextWrapper;

    public SceneContext(final Parent root) {
        super(root);
        initialize();
    }

    public SceneContext(final Parent root, final double width, final double height) {
        super(root, width, height);
        initialize();
    }

    public SceneContext(final Parent root, final Paint fill) {
        super(root, fill);
        initialize();
    }

    public SceneContext(final Parent root, final double width, final double height, final Paint fill) {
        super(root, width, height, fill);
        initialize();
    }

    public SceneContext(final Parent root, final double width, final double height, final boolean depthBuffer) {
        super(root, width, height, depthBuffer);
        initialize();
    }

    public SceneContext(final Parent root, final double width, final double height, final boolean depthBuffer, final SceneAntialiasing antiAliasing) {
        super(root, width, height, depthBuffer, antiAliasing);
        initialize();
    }

    protected void initialize() {
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
