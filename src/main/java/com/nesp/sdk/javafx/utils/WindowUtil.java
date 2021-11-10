package com.nesp.sdk.javafx.utils;

import javafx.stage.Window;
import javafx.stage.WindowEvent;

/**
 * Team: NESP Technology
 * Author: <a href="mailto:1756404649@qq.com">JinZhaolu Email:1756404649@qq.com</a>
 * Time: Created 2021/11/10 上午8:43
 * Description:
 **/
public final class WindowUtil {

    private WindowUtil() {/* no instance */}

    public static void fireCloseEvent(final Window window) {
        window.fireEvent(new WindowEvent(window, WindowEvent.WINDOW_CLOSE_REQUEST));
    }

}
