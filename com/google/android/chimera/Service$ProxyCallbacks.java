package com.google.android.chimera;

import android.app.Application;
import android.app.Notification;
import android.app.Service;
import android.content.Intent;

public interface Service.ProxyCallbacks {
    Service getContainerService();

    String getContainerServiceClassName();

    Application superGetApplication();

    int superGetForegroundServiceType();

    void superOnCreate();

    void superOnDestroy();

    int superOnStartCommand(Intent arg1, int arg2, int arg3);

    void superStartForeground(int arg1, Notification arg2);

    void superStartForeground(int arg1, Notification arg2, int arg3);

    void superStopForeground(int arg1);

    void superStopForeground(boolean arg1);

    void superStopSelf();

    void superStopSelf(int arg1);

    boolean superStopSelfResult(int arg1);
}

