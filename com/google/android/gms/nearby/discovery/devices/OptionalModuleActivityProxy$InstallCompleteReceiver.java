package com.google.android.gms.nearby.discovery.devices;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import cust;
import cwfa;
import ggtj;
import java.lang.ref.WeakReference;
import jwe;
import xni;

public class OptionalModuleActivityProxy.InstallCompleteReceiver extends TracingBroadcastReceiver {
    private final Intent a;
    private final WeakReference b;

    public OptionalModuleActivityProxy.InstallCompleteReceiver(xni xni0, Intent intent0) {
        super("nearby");
        this.b = new WeakReference(xni0);
        this.a = intent0;
        jwe.b(xni0, this, new IntentFilter("com.google.location.nearby.common.fastpair.ACTION_FASTPAIR_MODULE_ENABLED"), 2);
    }

    public final void b(xni xni0) {
        synchronized(this) {
            xni0.unregisterReceiver(this);
        }
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        if(!"com.google.location.nearby.common.fastpair.ACTION_FASTPAIR_MODULE_ENABLED".equals(intent0.getAction())) {
            return;
        }
        cust cust0 = cwfa.a;
        cust0.d().x("loadFastPairModule: Receive fastpair module enable broadcast.");
        xni xni0 = (xni)this.b.get();
        if(xni0 == null) {
            cust0.d().x("loadFastPairModule completed but activity reference is missing!");
            return;
        }
        if(!xni0.isDestroyed() && !xni0.isFinishing()) {
            try {
                xni0.startActivity(this.a);
                xni0.finish();
            }
            catch(ActivityNotFoundException activityNotFoundException0) {
                ComponentName componentName0 = this.a.getComponent();
                if(componentName0 != null) {
                    ((ggtj)cwfa.a.g().s(activityNotFoundException0)).B("Optional module download completed but activity:%s not found!", componentName0.getClassName());
                    return;
                }
                ((ggtj)cwfa.a.g().s(activityNotFoundException0)).x("Optional module download completed but activity is not found!");
            }
            return;
        }
        cust0.d().x("loadFastPairModule completed but activity is finishing!");
    }
}

