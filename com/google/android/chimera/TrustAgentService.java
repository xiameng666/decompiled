package com.google.android.chimera;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.IBinder;
import android.util.Log;
import com.google.android.chimera.annotation.ChimeraApiVersion;
import java.util.List;
import java.util.function.Consumer;
import wwt;

@ChimeraApiVersion(added = 0L)
public abstract class TrustAgentService extends Service {
    public static final int FLAG_GRANT_TRUST_DISMISS_KEYGUARD = 2;
    @ChimeraApiVersion(added = 0x7EL)
    public static final int FLAG_GRANT_TRUST_DISPLAY_MESSAGE = 8;
    public static final int FLAG_GRANT_TRUST_INITIATED_BY_USER = 1;
    @ChimeraApiVersion(added = 0x7EL)
    public static final int FLAG_GRANT_TRUST_TEMPORARY_AND_RENEWABLE = 4;
    public static final String SERVICE_INTERFACE = "android.service.trust.TrustAgentService";
    public static final String TRUST_AGENT_META_DATA = "android.service.trust.trustagent";
    private wwt a;

    public final void grantTrust(CharSequence charSequence0, long v, int v1) {
        this.a.grantTrust(charSequence0, v, v1);
    }

    @ChimeraApiVersion(added = 0x7EL)
    public final void grantTrust(CharSequence charSequence0, long v, int v1, Consumer consumer0) {
        this.a.grantTrust(charSequence0, v, v1, consumer0);
    }

    public final void grantTrust(CharSequence charSequence0, long v, boolean z) {
        this.a.grantTrust(charSequence0, v, z);
    }

    @ChimeraApiVersion(added = 0x7EL)
    public final void lockUser() {
        this.a.lockUser();
    }

    @Override  // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent0) {
        return this.a.onBind(intent0);
    }

    public boolean onConfigure(List list0) {
        return false;
    }

    @Override  // com.google.android.chimera.Service
    public void onCreate() {
        super.onCreate();
        ComponentName componentName0 = new ComponentName(this, this.getContainerServiceClassName());
        try {
            if("android.permission.BIND_TRUST_AGENT".equals(this.getPackageManager().getServiceInfo(componentName0, 0).permission)) {
                return;
            }
            throw new IllegalStateException(componentName0.flattenToShortString() + " is not declared with the permission \"android.permission.BIND_TRUST_AGENT\"");
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            Log.e("TrustAgentService", "Can\'t get ServiceInfo for " + componentName0.toShortString());
        }
    }

    public void onDeviceLocked() {
    }

    public void onDeviceUnlockLockout(long v) {
    }

    public void onDeviceUnlocked() {
    }

    @Override  // com.google.android.chimera.Service
    public void onRebind(Intent intent0) {
        this.a.onRebind(intent0);
    }

    public void onTrustTimeout() {
    }

    @Override  // com.google.android.chimera.Service
    public boolean onUnbind(Intent intent0) {
        return this.a.onUnbind(intent0);
    }

    public void onUnlockAttempt(boolean z) {
    }

    @ChimeraApiVersion(added = 0x7EL)
    public void onUserMayRequestUnlock() {
    }

    @ChimeraApiVersion(added = 0x7EL)
    public void onUserRequestedUnlock(boolean z) {
    }

    public final void revokeTrust() {
        this.a.revokeTrust();
    }

    public final void setManagingTrust(boolean z) {
        this.a.setManagingTrust(z);
    }

    @Override  // com.google.android.chimera.Service
    public void setProxyCallbacks(Service.ProxyCallbacks service$ProxyCallbacks0, Context context0) {
        super.setProxyCallbacks(service$ProxyCallbacks0, context0);
        wwt wwt0 = new wwt(this);
        this.a = wwt0;
        wwt0.attachBaseContext(context0);
    }

    @Override  // com.google.android.chimera.Service
    public void setProxyCallbacks(Object object0, Context context0) {
        this.setProxyCallbacks(((Service.ProxyCallbacks)object0), context0);
    }

    @ChimeraApiVersion(added = 0x7EL)
    public final void showKeyguardErrorMessage(CharSequence charSequence0) {
        this.a.showKeyguardErrorMessage(charSequence0);
    }
}

