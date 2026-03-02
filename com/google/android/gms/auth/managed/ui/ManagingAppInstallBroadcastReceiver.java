package com.google.android.gms.auth.managed.ui;

import akna;
import akre;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.util.Log;
import batl;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import hlxd;
import java.util.Locale;
import jwe;

public class ManagingAppInstallBroadcastReceiver extends TracingBroadcastReceiver {
    static final IntentFilter a;
    static final IntentFilter b;
    private final Context c;
    private final hlxd d;
    private boolean e;
    private boolean f;
    private boolean g;
    private final akna h;

    static {
        ManagingAppInstallBroadcastReceiver.a = new IntentFilter("com.google.android.gms.auth.DM_PACKAGE_INSTALLED");
        IntentFilter intentFilter0 = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        ManagingAppInstallBroadcastReceiver.b = intentFilter0;
        intentFilter0.addDataScheme("package");
    }

    public ManagingAppInstallBroadcastReceiver(Context context0, akna akna0, hlxd hlxd0) {
        super("auth_managed");
        batl.s(context0);
        this.c = context0;
        this.h = akna0;
        batl.s(hlxd0);
        this.d = hlxd0;
    }

    public final void b() {
        synchronized(this) {
            if(!this.g) {
                akre.a();
                Context context0 = this.c;
                if(jwe.a(context0, "com.google.android.gms.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION") == 0) {
                    Log.i("Auth", "[AuthManaged, ManagingAppInstallReceiver] Register with new receiver");
                    jwe.b(context0, this, ManagingAppInstallBroadcastReceiver.a, 4);
                    jwe.b(context0, this, ManagingAppInstallBroadcastReceiver.b, 4);
                }
                else {
                    Log.i("Auth", "[AuthManaged, ManagingAppInstallReceiver] Register with legacy receiver");
                    jwe.b(context0, this, ManagingAppInstallBroadcastReceiver.a, 2);
                    jwe.b(context0, this, ManagingAppInstallBroadcastReceiver.b, 2);
                }
                this.g = true;
                Log.i("Auth", String.format(Locale.US, "[AuthManaged, ManagingAppInstallReceiver] receiver is registered"));
            }
        }
    }

    public final void c() {
        synchronized(this) {
            if(this.g) {
                this.c.unregisterReceiver(this);
                this.g = false;
            }
        }
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        Log.i("Auth", String.format(Locale.US, "[AuthManaged, ManagingAppInstallReceiver] received " + intent0.getAction()));
        if("com.google.android.gms.auth.DM_PACKAGE_INSTALLED".equals(intent0.getAction())) {
            int v = intent0.getIntExtra("android.content.pm.extra.STATUS", 1);
            if(v == 0) {
                this.e = true;
                goto label_28;
            }
            else {
                switch(v) {
                    case -1: {
                        akna akna0 = this.h;
                        Intent intent1 = (Intent)intent0.getParcelableExtra("android.intent.extra.INTENT");
                        if(intent1 == null) {
                            Log.e("Auth", String.format(Locale.US, "[AuthManaged, ManagingAppInstallLoader] User action intent missing!"));
                            akna0.a(Integer.valueOf(-1));
                        }
                        else if(akna0.isStarted()) {
                            akna0.b(intent1);
                        }
                        else {
                            akna0.b = intent1;
                        }
                        goto label_28;
                    }
                    case 3: {
                        this.h.a(Integer.valueOf(-2));
                        goto label_28;
                    }
                    default: {
                        Log.e("Auth", String.format(Locale.US, "[AuthManaged, ManagingAppInstallLoader] Managing app installation failed."));
                        this.h.a(Integer.valueOf(-1));
                        goto label_28;
                    }
                }
            }
        }
        else if("android.intent.action.PACKAGE_ADDED".equals(intent0.getAction())) {
            Uri uri0 = intent0.getData();
            String s = uri0 == null ? null : uri0.getSchemeSpecificPart();
            if(this.d.c.equals(s)) {
                this.f = true;
            }
        label_28:
            if(this.f && this.e) {
                this.c();
                Log.i("Auth", String.format(Locale.US, "[AuthManaged, ManagingAppInstallLoader] onInstallCompleted"));
                this.h.a(Integer.valueOf(101));
            }
        }
    }
}

