package com.google.android.chimera;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.google.android.chimera.annotation.ChimeraApiVersion;
import com.google.android.chimera.config.InvalidConfigException;
import ggfp;
import gpgh;
import hrjj;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import wxp;
import wyc;
import xed;
import xei;
import xjc;
import xls;
import xly;

@ChimeraApiVersion(added = 0L)
public abstract class BoundService extends ContextWrapper implements xjc {
    private static final ggfp Vd;
    private boolean Ve;
    private boolean c;
    private volatile boolean d;

    static {
        BoundService.Vd = ggfp.O("com.google.android.gms.wallet.service.BIND", "com.google.android.gms.wallet.service.ia.IIaService", "com.google.android.gms.wallet.service.ib.IIbService", "com.google.android.gms.wallet.service.orchestration.IOrchestrationService", "com.google.android.gms.wallet.service.ow.IOwInternalService", "com.google.android.gms.wallet.service.reauth.IReauthService", new String[]{"com.google.android.gms.checkin.START", "com.google.android.gms.ads.service.START", "com.google.android.gms.ads.service.CACHE", "com.google.android.gms.ads.measurement.service.START", "com.google.android.gms.appinvite.service.START", "com.google.android.gms.appinvite.service.START_INTERNAL", "com.google.android.gms.appstate.service.START", "com.google.android.gms.auth.service.START", "com.google.firebase.auth.api.gms.service.START", "com.google.android.gms.fido.u2f.zeroparty.START", "com.google.android.gms.fido.u2f.privileged.START", "com.google.android.gms.fido.u2f.thirdparty.START", "com.google.android.gms.nearby.connection.service.START", "com.google.android.gms.googlehelp.service.GoogleHelpService.START", "com.google.android.gms.instantapps.START", "com.google.android.gms.measurement.START"});
    }

    public BoundService() {
        super(null);
        this.Ve = false;
        this.c = true;
        this.d = true;
    }

    @Override  // android.content.ContextWrapper
    protected void attachBaseContext(Context context0) {
        super.attachBaseContext(context0);
        this.Ve = true;
    }

    @Override  // xjc
    public void callDump(FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
        throw new UnsupportedOperationException("Call the dump method directly.");
    }

    public void dump(FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
    }

    @Override  // xjc
    public BoundService getBoundService() {
        return this;
    }

    public static Intent getStartIntent(Context context0, String s) {
        xed xed0;
        wxp.b();
        if(!hrjj.d() && BoundService.Vd.contains(s)) {
            return null;
        }
        wyc wyc0 = wyc.f();
        try {
            xed0 = wyc0.k();
        }
        catch(InvalidConfigException invalidConfigException0) {
            Log.w("BoundService", "Failed to get Chimera config", invalidConfigException0);
            return null;
        }
        Intent intent0 = new Intent("com.google.android.chimera.BoundService.START").setData(Uri.fromParts("chimera-action", s, null));
        try {
            gpgh gpgh0 = xed0.s();
            String s1 = gpgh0.X();
            xly xly0 = gpgh0.S(xls.c(s1, s));
            if(xly0 == null) {
                return null;
            }
            intent0.setClassName(context0, xls.b(s1, xly0.b()));
            int v = xly0.__offset(12);
            if(v != 0 && xly0.bb.get(v + xly0.bb_pos) != 0) {
                Bundle bundle0 = new Bundle();
                bundle0.putBinder("__chimera_isolation_binder", xei.a);
                intent0.putExtras(bundle0);
            }
            return intent0;
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            Log.w("BoundService", "Possible corrupt config", indexOutOfBoundsException0);
            return null;
        }
    }

    public boolean getWantIntentExtras() {
        return this.c;
    }

    public boolean isStopped() {
        return this.d;
    }

    @Override  // xjc
    public abstract IBinder onBind(Intent arg1);

    @Override  // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration0) {
    }

    @Override  // xjc
    public void onCreate() {
    }

    @Override  // xjc
    public void onDestroy() {
    }

    @Override  // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override  // xjc
    public void onRebind(Intent intent0) {
    }

    @Override  // android.content.ComponentCallbacks2
    public void onTrimMemory(int v) {
    }

    @Override  // xjc
    public boolean onUnbind(Intent intent0) {
        return false;
    }

    public final void setModuleContext(Context context0) {
        this.attachBaseContext(context0);
    }

    @ChimeraApiVersion(added = 110L)
    protected final void setWantIntentExtras(boolean z) {
        if(this.Ve) {
            throw new IllegalStateException("Setting intent extras when context already set.");
        }
        this.c = z;
    }

    @Override  // xjc
    public void startBoundService() {
        this.d = false;
    }

    @Override  // xjc
    public void stopBoundService() {
        this.d = true;
    }
}

