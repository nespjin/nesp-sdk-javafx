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
public class Platform {

    public static Platforms getPlatformName() throws ClassNotFoundException, NoSuchMethodException {
        String osName = System.getProperty("os.name", "");
        Log.print(osName);
        if (osName.startsWith("Mac OS")) {
            return Platforms.MAC_OSX;
        } else if (osName.startsWith("Windows")) {
            return Platforms.WINDOWS;
        } else if (osName.startsWith("Linux")) {
            return Platforms.LINUX;
        } else {
            return Platforms.UNKNOWN;
        }
    }

    public enum Platforms {
        WINDOWS,
        MAC_OSX,
        LINUX,
        UNKNOWN;
    }
}
