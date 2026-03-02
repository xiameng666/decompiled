package com.google.android.gms.appstate.service;

import android.content.Intent;
import android.os.IBinder;
import android.os.Message;
import avyk;
import avym;
import bbcu;
import bboh;

public final class AppStateIntentChimeraService extends avyk {
    public static final bboh a;
    public static final avym b;

    static {
        AppStateIntentChimeraService.a = bboh.b("AppStateIntentService", bbcu.h);
        AppStateIntentChimeraService.b = new avym();
    }

    public AppStateIntentChimeraService() {
        super("AppStateIntentService", AppStateIntentChimeraService.b);
    }

    @Override  // avyk
    public final boolean handleMessage(Message message0) {
        super.handleMessage(message0);
        return true;
    }

    @Override  // avyk
    public final IBinder onBind(Intent intent0) {
        return null;
    }

    @Override  // avyk
    public final int onStartCommand(Intent intent0, int v, int v1) {
        super.onStartCommand(intent0, v, v1);
        return 2;
    }
}

