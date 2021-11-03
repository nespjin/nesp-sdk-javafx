package com.nesp.sdk.javafx.concurrent;

import javafx.application.Platform;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Team: NESP Technology
 * Author: <a href="mailto:1756404649@qq.com">JinZhaolu Email:1756404649@qq.com</a>
 * Time: Created 2021/10/30 20:31
 * Project: PasswordManagerJavaFx
 * Description:
 **/
public final class ThreadDispatcher {

    @SuppressWarnings("unused")
    private static final String TAG = "ThreadManager";

    private final ExecutorService mIOThreadPool = Executors.newCachedThreadPool();
    private final ExecutorService mIODaemonThreadPool =
            Executors.newCachedThreadPool(new DaemonThreadFactory());

    private static volatile ThreadDispatcher sInstance;

    public static ThreadDispatcher getInstance() {
        if (sInstance == null) {
            synchronized (ThreadDispatcher.class) {
                if (sInstance == null) {
                    sInstance = new ThreadDispatcher();
                }
            }
        }
        return sInstance;
    }

    private ThreadDispatcher() {
    }

    public void runOnIOThread(final Runnable runnable) {
        runOnIOThread(false, runnable);
    }

    public void runOnDaemonIOThread(final Runnable runnable) {
        runOnIOThread(true, runnable);
    }

    public void runOnIOThread(boolean isDaemon, final Runnable runnable) {
        if (isDaemon) {
            mIODaemonThreadPool.submit(runnable);
        } else {
            mIOThreadPool.submit(runnable);
        }
    }

    public void runOnUIThread(final Runnable runnable) {
        Platform.runLater(runnable);
    }

    public void runOnUIThreadDelay(final long delay, final Runnable runnable) {
        new Timer(true).schedule(new TimerTask() {
            @Override
            public void run() {
                runOnUIThread(runnable);
            }
        }, delay);
    }


}
