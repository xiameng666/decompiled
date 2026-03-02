package com.google.android.gms.update.resumeonreboot;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import bbdg;
import ccmq;
import com.google.android.chimera.Service;
import fafy;

public final class ResumeOnRebootEscrowChimeraService.ChimeraServiceWrapper extends Service {
    private fafy a;

    @Override  // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent0) {
        return this.a.onBind(intent0);
    }

    @Override  // com.google.android.chimera.Service
    public final void onConfigurationChanged(Configuration configuration0) {
        this.a.onConfigurationChanged(configuration0);
    }

    @Override  // com.google.android.chimera.Service
    public final void onCreate() {
        ccmq.a().a(bbdg.nW);
        fafy fafy0 = new fafy();
        this.a = fafy0;
        fafy0.a(this);
        this.a.onCreate();
    }

    @Override  // com.google.android.chimera.Service
    public final void onDestroy() {
        this.a.onDestroy();
    }

    @Override  // com.google.android.chimera.Service
    public final void onLowMemory() {
        this.a.onLowMemory();
    }

    @Override  // com.google.android.chimera.Service
    public final void onRebind(Intent intent0) {
        this.a.onRebind(intent0);
    }

    @Override  // com.google.android.chimera.Service
    public final void onTaskRemoved(Intent intent0) {
        this.a.onTaskRemoved(intent0);
    }

    @Override  // com.google.android.chimera.Service
    public final void onTrimMemory(int v) {
        this.a.onTrimMemory(v);
    }

    @Override  // com.google.android.chimera.Service
    public final boolean onUnbind(Intent intent0) {
        return this.a.onUnbind(intent0);
    }
}

