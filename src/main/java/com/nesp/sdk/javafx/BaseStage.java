package com.nesp.sdk.javafx;

import javafx.stage.WindowEvent;

/**
 * Team: NESP Technology
 * Author: <a href="mailto:1756404649@qq.com">JinZhaolu Email:1756404649@qq.com</a>
 * Time: Created 2021/8/29 12:16
 * Description:
 **/
public abstract class BaseStage extends StageContext {

    private static final String TAG = "BaseStage";

    public void fireCloseEvent() {
        fireEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSE_REQUEST));
    }

}
