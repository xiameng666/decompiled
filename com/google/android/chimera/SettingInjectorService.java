package com.google.android.chimera;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.annotation.ChimeraApiVersion;
import wwr;

@ChimeraApiVersion(added = 0L)
public abstract class SettingInjectorService extends Service {
    public static final String ACTION_INJECTED_SETTING_CHANGED = "android.location.InjectedSettingChanged";
    public static final String ACTION_SERVICE_INTENT = "android.location.SettingInjectorService";
    public static final String ATTRIBUTES_NAME = "injected-location-setting";
    public static final String META_DATA_NAME = "android.location.SettingInjectorService";
    private wwr a;
    private final String b;

    public SettingInjectorService(String s) {
        this.b = s;
    }

    @Override  // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent0) {
        return this.a.onBind(intent0);
    }

    public abstract boolean onGetEnabled();

    public abstract String onGetSummary();

    @Override  // com.google.android.chimera.Service
    public final void onStart(Intent intent0, int v) {
        this.a.onStart(intent0, v);
    }

    @Override  // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent0, int v, int v1) {
        return this.a.onStartCommand(intent0, v, v1);
    }

    public static void refreshSettings(Context context0) {
        android.location.SettingInjectorService.refreshSettings(context0);
    }

    @Override  // com.google.android.chimera.Service
    public void setProxyCallbacks(Service.ProxyCallbacks service$ProxyCallbacks0, Context context0) {
        super.setProxyCallbacks(service$ProxyCallbacks0, context0);
        wwr wwr0 = new wwr(this, this.b);
        this.a = wwr0;
        wwr0.attachBaseContext(context0);
    }

    @Override  // com.google.android.chimera.Service
    public void setProxyCallbacks(Object object0, Context context0) {
        this.setProxyCallbacks(((Service.ProxyCallbacks)object0), context0);
    }
}

