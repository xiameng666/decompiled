package com.google.android.gms.gcm.http;

import android.content.Intent;
import android.os.IBinder;
import avza;

public class GoogleHttpService extends avza {
    @Override  // avza
    public final IBinder onBind(Intent intent0) {
        return this.b == null ? null : this.b.onBind(intent0);
    }
}

