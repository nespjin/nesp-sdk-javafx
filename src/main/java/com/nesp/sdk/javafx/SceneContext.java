package com.nesp.sdk.javafx;

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

}
