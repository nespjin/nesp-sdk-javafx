package com.nesp.sdk.javafx.database;

/**
 * Team: NESP Technology
 * Author: <a href="mailto:1756404649@qq.com">JinZhaolu Email:1756404649@qq.com</a>
 * Time: Created 2021/10/30 10:05
 * Description:
 **/
public final class DatabaseUtils {

    private static final String TAG = "DatabaseUtils";

    private DatabaseUtils() {
    }

    public static String compileKeywords(final String keywords) {
        String keywordsTmp = keywords.replaceAll(" ", "");
        keywordsTmp = keywordsTmp.replaceAll("'", "");
        keywordsTmp = keywordsTmp.replaceAll("%", "");
        return "%" + keywordsTmp + "%";
    }

}
