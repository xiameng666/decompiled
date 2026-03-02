package com.google.android.chimera;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.chimera.annotation.ChimeraApiVersion;
import java.util.List;
import wwl;

@ChimeraApiVersion(added = 0L)
public abstract class HostApduService extends Service {
    public static final int DEACTIVATION_DESELECTED = 1;
    public static final int DEACTIVATION_LINK_LOSS = 0;
    public static final String SERVICE_INTERFACE = "android.nfc.cardemulation.action.HOST_APDU_SERVICE";
    public static final String SERVICE_META_DATA = "android.nfc.cardemulation.host_apdu_service";
    private wwl a;

    public final void notifyUnhandled() {
        this.a.notifyUnhandled();
    }

    @Override  // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent0) {
        return this.a.onBind(intent0);
    }

    public abstract void onDeactivated(int arg1);

    public abstract byte[] processCommandApdu(byte[] arg1, Bundle arg2);

    @ChimeraApiVersion(added = 0x8BL)
    public void processPollingFrames(List list0) {
    }

    public final void sendResponseApdu(byte[] arr_b) {
        this.a.sendResponseApdu(arr_b);
    }

    @Override  // com.google.android.chimera.Service
    public void setProxyCallbacks(Service.ProxyCallbacks service$ProxyCallbacks0, Context context0) {
        super.setProxyCallbacks(service$ProxyCallbacks0, context0);
        wwl wwl0 = new wwl(this);
        this.a = wwl0;
        wwl0.attachBaseContext(context0);
    }

    @Override  // com.google.android.chimera.Service
    public void setProxyCallbacks(Object object0, Context context0) {
        this.setProxyCallbacks(((Service.ProxyCallbacks)object0), context0);
    }
}

