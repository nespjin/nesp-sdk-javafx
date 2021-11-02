package com.nesp.sdk.javafx.utils;

import javafx.scene.Node;

/**
 * Team: NESP Technology
 * Author: <a href="mailto:1756404649@qq.com">JinZhaolu Email:1756404649@qq.com</a>
 * Time: Created 2021/11/2 上午11:38
 * Project: PasswordManagerJavaFx
 * Description:
 **/
public interface OnItemClickListener<T> {
    void onItemClick(Node owner, T item, int position);
}
