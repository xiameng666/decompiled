package com.google.android.gms.wearable.service;

import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings.Global;
import android.util.Log;
import batl;
import bbmq;
import bbqv;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import fczq;
import femf;
import ffgp;
import j..util.Objects;
import jwe;

public final class EmulatorBroadcastReceiver extends TracingBroadcastReceiver {
    public ContentObserver a;
    public Context b;
    private boolean c;

    public EmulatorBroadcastReceiver() {
        super("wearable");
        this.c = false;
    }

    public final void b() {
        if(this.g()) {
            if(!this.c) {
                if(Log.isLoggable("wearable.EmuReceiver", 3)) {
                    Log.d("wearable.EmuReceiver", "registerReceiver");
                }
                batl.s(this.b);
                jwe.b(this.b, this, new IntentFilter("com.google.android.gms.wearable.EMULATOR"), 2);
                this.c = true;
            }
            return;
        }
        this.d();
    }

    public final void d() {
        if(this.c) {
            if(Log.isLoggable("wearable.EmuReceiver", 3)) {
                Log.d("wearable.EmuReceiver", "unregisterReceiver");
            }
            batl.s(this.b);
            this.b.unregisterReceiver(this);
            this.c = false;
        }
    }

    private final void e(int v, String s) {
        this.f(v, s, null, null);
    }

    private final void f(int v, String s, Throwable throwable0, BroadcastReceiver.PendingResult broadcastReceiver$PendingResult0) {
        if(throwable0 != null) {
            Log.e("wearable.EmuReceiver", s, throwable0);
        }
        else if(Log.isLoggable("wearable.EmuReceiver", 3)) {
            Log.d("wearable.EmuReceiver", s);
        }
        if(broadcastReceiver$PendingResult0 != null) {
            broadcastReceiver$PendingResult0.setResult(v, s, null);
            broadcastReceiver$PendingResult0.finish();
            return;
        }
        if(this.isOrderedBroadcast()) {
            this.setResult(v, s, null);
        }
    }

    private final boolean g() {
        return !Objects.equals(Build.TYPE, "user") || bbmq.P() || Settings.Global.getInt(this.b.getContentResolver(), "development_settings_enabled", 0) != 0;
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        if(!Objects.equals(intent0.getAction(), "com.google.android.gms.wearable.EMULATOR")) {
            return;
        }
        if(Log.isLoggable("wearable.EmuReceiver", 3)) {
            Log.d("wearable.EmuReceiver", "Received broadcast.");
        }
        if(!this.g()) {
            this.e(4, "Debug broadcast receiver is disabled.");
            return;
        }
        Bundle bundle0 = intent0.getExtras();
        if(bundle0 == null) {
            this.e(3, "No intent extras specified.");
            return;
        }
        String s = bundle0.getString("operation");
        if(s == null) {
            this.e(3, "no extra keyed with operation.");
            return;
        }
        switch(s) {
            case "get-pairing-status": {
                if(ffgp.f() != null && ffgp.o() != null) {
                    try {
                        fczq[] arr_fczq = ffgp.f().v("");
                        StringBuilder stringBuilder0 = new StringBuilder();
                        stringBuilder0.append(String.format("Local:[%s]\n", ffgp.o().a().a));
                        for(int v = 0; v < arr_fczq.length; ++v) {
                            fczq fczq0 = arr_fczq[v];
                            if(fczq0.d == 2) {
                                stringBuilder0.append(String.format("Peer:[%s,%b,%b]\n", fczq0.j, Boolean.valueOf(fczq0.g), Boolean.valueOf(fczq0.f)));
                            }
                        }
                        this.e(1, stringBuilder0.toString());
                    }
                    catch(RuntimeException runtimeException0) {
                        this.f(2, "Get pairing status failed.", runtimeException0, null);
                    }
                    return;
                }
                this.e(5, "WearableService not initialized yet.");
                return;
            }
            case "refresh-emulator-connection": {
                if(ffgp.f() == null) {
                    this.e(5, "WearableService not initialized yet.");
                    return;
                }
                bbqv.a(() -> try {
                    femf femf0 = ffgp.f().t;
                    if(femf0 != null) {
                        femf0.a();
                    }
                    this.f(1, "Emulator connection refresh succeeded.", null, this.goAsync());
                }
                catch(SecurityException | IllegalStateException | IllegalThreadStateException exception0) {
                    this.f(2, "Emulator connection refresh failed.", exception0, this.goAsync());
                });
                return;
            }
            case "version": {
                this.e(1, "1");
                return;
            }
            default: {
                this.e(3, "Unrecognized operation " + s);
            }
        }
    }
}

