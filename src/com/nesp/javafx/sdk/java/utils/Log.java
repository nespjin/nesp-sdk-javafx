/*
 * Copyright  2019.  靳兆鲁（1756404649@qq.com）
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.nesp.javafx.sdk.java.utils;

public class Log {

    public static void print(String message) {
        System.out.println("MSG:" + message + "\n");
    }

    public static void print(Integer message) {
        System.out.println("MSG:" + message + "\n");
    }

    public static void print(String TAG, String message) {
        System.out.println("TAG:" + TAG + "|| MSG:" + message + "\n");
    }

    public static void print(String TAG, double message) {
        System.out.println("TAG:" + TAG + "|| MSG:" + message + "\n");
    }

    public static void i(String tag, String s) {
        print(tag,s);
    }
}
