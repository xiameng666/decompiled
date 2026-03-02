package com.google.android.gms.common.util;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Handler;
import bbps;
import bbsr;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import gftb;
import gfuy;
import hrle;
import jwe;

public class PackageResetHelper extends TracingBroadcastReceiver {
    private final Context a;
    private final boolean b;
    private bbps c;

    public PackageResetHelper(Context context0) {
        super("common-base");
        this.a = context0;
        this.b = true;
    }

    public final void b(bbps bbps0, Handler handler0) {
        Context context0;
        IntentFilter intentFilter0;
        PackageResetHelper packageResetHelper0;
        Throwable throwable2;
        __monitor_enter(this);
        try {
            if(hrle.g()) {
                try {
                    gftb.q(this.c == null);
                }
                catch(Throwable throwable1) {
                    throwable2 = throwable1;
                    packageResetHelper0 = this;
                    goto label_30;
                }
            }
            this.c = bbps0;
            intentFilter0 = new IntentFilter();
            intentFilter0.addAction("android.intent.action.PACKAGE_CHANGED");
            intentFilter0.addAction("android.intent.action.PACKAGE_REMOVED");
            intentFilter0.addAction("android.intent.action.PACKAGE_RESTARTED");
            intentFilter0.addAction("android.intent.action.QUERY_PACKAGE_RESTART");
            intentFilter0.addDataScheme("package");
            context0 = this.a;
            packageResetHelper0 = this;
        }
        catch(Throwable throwable0) {
            packageResetHelper0 = this;
            goto label_29;
        }
        try {
            jwe.c(context0, packageResetHelper0, intentFilter0, null, handler0, 2);
            if(packageResetHelper0.b) {
                IntentFilter intentFilter1 = new IntentFilter();
                intentFilter1.addAction("com.google.android.gms.INSTANT_APP_STOPPED");
                try {
                    jwe.c(context0, packageResetHelper0, intentFilter1, "com.google.android.gms.permission.INTERNAL_BROADCAST", handler0, 4);
                    goto label_35;
                }
                catch(Throwable throwable0) {
                    packageResetHelper0 = packageResetHelper0;
                }
                while(true) {
                label_29:
                    throwable2 = throwable0;
                label_30:
                    __monitor_exit(packageResetHelper0);
                    throw throwable2;
                }
            }
            goto label_37;
        }
        catch(Throwable throwable0) {
            goto label_29;
        }
        throw throwable2;
    label_35:
        __monitor_exit(packageResetHelper0);
        return;
    label_37:
        __monitor_exit(packageResetHelper0);
    }

    public final void c() {
        synchronized(this) {
            if(hrle.g()) {
                gftb.q(this.c != null);
                this.c = null;
            }
            this.a.unregisterReceiver(this);
        }
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        __monitor_enter(this);
        bbps bbps0 = this.c;
        __monitor_exit(this);
        if(bbps0 != null) {
            Uri uri0 = intent0.getData();
            String s = uri0 == null ? null : uri0.getSchemeSpecificPart();
            if(s != null) {
                String s1 = intent0.getAction();
                gfuy.e(s1);
            alab1:
                switch(s1.hashCode()) {
                    case -1072806502: {
                        if(s1.equals("android.intent.action.QUERY_PACKAGE_RESTART")) {
                            String[] arr_s = intent0.getStringArrayExtra("android.intent.extra.PACKAGES");
                            if(arr_s != null) {
                                for(int v = 0; v < arr_s.length; ++v) {
                                    if(bbps0.mB(arr_s[v])) {
                                        this.setResultCode(-1);
                                        return;
                                    }
                                }
                                return;
                            }
                        }
                        break;
                    }
                    case 0xD2D52FD0: {
                        if(s1.equals("android.intent.action.PACKAGE_RESTARTED")) {
                            bbps0.mA(s);
                            return;
                        }
                        break;
                    }
                    case 0xA480416: {
                        if(s1.equals("android.intent.action.PACKAGE_CHANGED")) {
                            String[] arr_s1 = intent0.getStringArrayExtra("android.intent.extra.changed_component_name_list");
                            if(arr_s1 != null) {
                                for(int v1 = 0; v1 < arr_s1.length; ++v1) {
                                    if(s.equals(arr_s1[v1])) {
                                        try {
                                            if(bbsr.b(context0).d(s, 0).enabled) {
                                                break alab1;
                                            }
                                            bbps0.mA(s);
                                            return;
                                        }
                                        catch(PackageManager.NameNotFoundException unused_ex) {
                                            break alab1;
                                        }
                                    }
                                }
                                return;
                            }
                        }
                        break;
                    }
                    case 0x1F50B9C2: {
                        if(s1.equals("android.intent.action.PACKAGE_REMOVED")) {
                            bbps0.mA(s);
                            return;
                        }
                        break;
                    }
                    case 0x27BFBBA9: {
                        if(s1.equals("com.google.android.gms.INSTANT_APP_STOPPED") && this.b) {
                            bbps0.mA(s);
                            return;
                        }
                        break;
                    }
                    default: {
                        return;
                    }
                }
            }
        }
        try {
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        }
    }
}

