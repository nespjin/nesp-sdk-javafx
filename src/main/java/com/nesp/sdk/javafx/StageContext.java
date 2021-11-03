package com.nesp.sdk.javafx;

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
 * Project: PasswordManagerJavaFx
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

    private void initialize(){
        mContextWrapper = new ContextWrapper();
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


}
