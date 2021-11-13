package com.nesp.sdk.javafx.platform;

import com.nesp.sdk.javafx.utils.Log;

/**
 * ProjectName: NespManager
 * Author: jinzhaolu
 * Date: 19-2-15
 * Time: 上午2:44
 * FileName: Platform
 * <p>
 * Description:
 */
public class PlatformUtil {

    public static Platform getPlatform() {
        String osName = System.getProperty("os.name", "");
        Log.print(osName);
        if (osName.startsWith("Mac OS")) {
            return Platform.MAC_OSX;
        } else if (osName.startsWith("Windows")) {
            return Platform.WINDOWS;
        } else if (osName.startsWith("Linux")) {
            return Platform.LINUX;
        } else {
            return Platform.UNKNOWN;
        }
    }

}
