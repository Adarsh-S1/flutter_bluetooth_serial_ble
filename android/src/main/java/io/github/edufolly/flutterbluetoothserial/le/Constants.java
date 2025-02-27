package io.github.edufolly.flutterbluetoothserial.le;

import io.github.edufolly.flutterbluetoothserial.BuildConfig;

public class Constants {

    // values have to be globally unique
    public static final String INTENT_ACTION_DISCONNECT = "io.github.edufolly.flutterbluetoothserial" + ".Disconnect";
    public static final String NOTIFICATION_CHANNEL = "io.github.edufolly.flutterbluetoothserial" + ".Channel";
    public static final String INTENT_CLASS_MAIN_ACTIVITY = "io.github.edufolly.flutterbluetoothserial" + ".MainActivity";

    // values have to be unique within each app
    public static final int NOTIFY_MANAGER_START_FOREGROUND_SERVICE = 1001;

    private Constants() {}
}
