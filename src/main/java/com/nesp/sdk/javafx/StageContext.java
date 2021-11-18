package com.nesp.sdk.javafx;

import com.google.common.util.concurrent.ListenableFuture;
import com.nesp.sdk.java.lang.AppObjRecycleWatcher;
import com.nesp.sdk.javafx.concurrent.IThreadDispatcher;
import com.nesp.sdk.javafx.lifecycle.Lifecycle;
import com.nesp.sdk.javafx.lifecycle.LifecycleOwner;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.Window;

/**
 * Team: NESP Technology
 * Author: <a href="mailto:1756404649@qq.com">JinZhaolu Email:1756404649@qq.com</a>
 * Time: Created 2021/8/29 12:15
 * Description:
 **/
public abstract class StageContext extends Stage implements Context, Lifecycle, LifecycleOwner {

    private static final String TAG = "StageContext";
    private ContextWrapper mContextWrapper;

    public StageContext() {
        super();
        initialize();
    }

    public StageContext(final StageStyle style) {
        super(style);
        initialize();
    }

    private void initialize() {
        mContextWrapper = new ContextWrapper();
        AppObjRecycleWatcher.getSingleton().observeIfStarted(this);
    }

    @Override
    public void onCreate(final Node root) {

    }

    @Override
    public void onAttachScene(final Scene scene, final Window window) {

    }

    @Override
    public void onDestroy() {

    }

    @Override
    public void observe(final Node node) {

    }

    @Override
    public void destroy() {

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
