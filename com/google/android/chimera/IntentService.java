package com.google.android.chimera;

import android.content.Intent;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import com.google.android.chimera.annotation.ChimeraApiVersion;
import wwn;

@ChimeraApiVersion(added = 0L)
public abstract class IntentService extends Service {
    private volatile Looper Vh;
    private volatile wwn b;
    private final String c;
    private boolean d;

    public IntentService(String s) {
        this.c = s;
    }

    @Override  // com.google.android.chimera.Service
    public IBinder onBind(Intent intent0) {
        return null;
    }

    @Override  // com.google.android.chimera.Service
    public void onCreate() {
        super.onCreate();
        HandlerThread handlerThread0 = new HandlerThread("IntentService[" + this.c + "]");
        handlerThread0.start();
        this.Vh = handlerThread0.getLooper();
        this.b = new wwn(this, this.Vh);
    }

    @Override  // com.google.android.chimera.Service
    public void onDestroy() {
        this.Vh.quit();
    }

    public abstract void onHandleIntent(Intent arg1);

    @Override  // com.google.android.chimera.Service
    public void onStart(Intent intent0, int v) {
        Message message0 = this.b.obtainMessage();
        message0.arg1 = v;
        message0.obj = intent0;
        this.b.sendMessage(message0);
    }

    @Override  // com.google.android.chimera.Service
    public int onStartCommand(Intent intent0, int v, int v1) {
        this.onStart(intent0, v1);
        return this.d ? 3 : 2;
    }

    public void setIntentRedelivery(boolean z) {
        this.d = z;
    }
}

