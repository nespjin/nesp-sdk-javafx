package com.nesp.sdk.javafx;

/**
 * Team: NESP Technology
 * Author: <a href="mailto:1756404649@qq.com">JinZhaolu Email:1756404649@qq.com</a>
 * Time: Created 2021/8/8 22:25
 * Project: JavaFx SDK
 * Description:
 **/
public interface Context {

    Resource getResource();

    ClassLoader getContextClassLoader();

    String getPackageName();

}
