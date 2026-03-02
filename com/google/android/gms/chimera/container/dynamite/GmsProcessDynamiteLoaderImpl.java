package com.google.android.gms.chimera.container.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode;
import android.os.SystemClock;
import android.util.Log;
import awaq;
import awar;
import awer;
import awfg;
import bbqq;
import bjii;
import bjil;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.gms.dynamite.RequestStats;
import gftb;
import hrnf;
import wxp;
import wxr;
import wyc;
import wzt;
import xed;
import xej;
import xeo;

public class GmsProcessDynamiteLoaderImpl implements awar {
    @Override  // awar
    public final Context loadModule(Context context0, String s, int v, Cursor cursor0) {
        wyc wyc1;
        long v7;
        bjii bjii0;
        long v6;
        int v5;
        Context context3;
        int v4;
        xed xed0;
        byte[] arr_b;
        Context context2;
        Context context1;
        xej xej0;
        int v1 = cursor0.getInt(5);
        long v2 = cursor0.getLong(6);
        wxp.b();
        awaq awaq0 = awaq.a(context0);
        if(awaq0 == null) {
            Log.e("GmsDynamiteLoaderImpl", "Failed to create dynamite context.");
            return null;
        }
        wyc wyc0 = wyc.f();
        wxr wxr0 = new wxr();
        StrictMode.ThreadPolicy strictMode$ThreadPolicy0 = bbqq.a();
        try {
            xej0 = xeo.b(bjil.c());
        }
        catch(InvalidConfigException invalidConfigException0) {
            context1 = null;
            xej0 = null;
            goto label_81;
        }
        catch(Throwable throwable0) {
            context2 = null;
            xej0 = null;
            goto label_93;
        }
        try {
            try {
                int v3 = cursor0.getColumnIndex("requestStats");
                arr_b = v3 < 0 ? null : cursor0.getBlob(v3);
                xed0 = wyc0.l(wxr0);
            }
            catch(InvalidConfigException invalidConfigException0) {
                context1 = null;
                goto label_81;
            }
            try {
                if(v2 != wxr0.a) {
                    throw new InvalidConfigException("module configuration is not current");
                }
                v4 = v1;
                goto label_32;
            }
            catch(InvalidConfigException invalidConfigException1) {
                try {
                    v4 = awer.a(xed0, s, v, "com.google.android.gms");
                    if(v4 < 0) {
                        awfg.e().b(context0, 0x5F, invalidConfigException1.getMessage());
                        throw invalidConfigException1;
                    }
                label_32:
                    boolean z = hrnf.d();
                    context3 = null;
                    v5 = 2;
                    goto label_42;
                }
                catch(InvalidConfigException invalidConfigException0) {
                }
            }
            context1 = null;
            goto label_81;
        }
        catch(Throwable throwable0) {
            context2 = null;
            goto label_93;
        }
        while(true) {
            try {
            label_42:
                v6 = SystemClock.uptimeMillis();
                gftb.q(v4 >= 0 && v4 < xed0.e());
                wzt wzt0 = wyc0.h(awaq0, xed0, xed0.j(v4), null);
                context3 = wzt0 == null ? null : wzt0.b;
                if(!z || arr_b == null || context3 == null) {
                    goto label_98;
                }
                bjii0 = RequestStats.a(arr_b);
                goto label_52;
            }
            catch(InvalidConfigException invalidConfigException2) {
            }
            catch(Throwable throwable0) {
                goto label_92;
            }
            awaq awaq1 = awaq0;
            wyc1 = wyc0;
            goto label_66;
        label_52:
            if(bjii0 == null) {
                goto label_98;
            }
            try {
                awaq1 = awaq0;
                v7 = SystemClock.uptimeMillis();
                wyc1 = wyc0;
                goto label_60;
            }
            catch(InvalidConfigException invalidConfigException2) {
            }
            catch(Throwable throwable0) {
                goto label_92;
            }
            wyc1 = wyc0;
            goto label_66;
            try {
            label_60:
                bjii0.g = v6 - v7;
                bjii0.h = v7;
                try {
                    bjii0.f = 2;
                    bjii0.a();
                    goto label_98;
                }
                catch(InvalidConfigException invalidConfigException2) {
                }
            }
            catch(Throwable throwable0) {
                goto label_92;
            }
            try {
            label_66:
                if(v5 == 0) {
                    throw invalidConfigException2;
                }
                xed xed1 = wyc1.l(wxr0);
                int v8 = awer.a(xed1, s, v, "com.google.android.gms");
                if(v8 < 0) {
                    awfg.e().b(context0, 0x5F, invalidConfigException2.getMessage());
                    throw invalidConfigException2;
                }
                --v5;
                xed0 = xed1;
                awaq0 = awaq1;
                v4 = v8;
                wyc0 = wyc1;
            }
            catch(InvalidConfigException invalidConfigException0) {
                context1 = context3;
                break;
            }
            catch(Throwable throwable0) {
                goto label_92;
            }
        }
        try {
        label_81:
            Log.e("GmsDynamiteLoaderImpl", "Failed to load module from gms config:" + invalidConfigException0.getMessage());
        }
        catch(Throwable throwable0) {
            context2 = context1;
            goto label_93;
        }
        if(context1 == null) {
            awfg.e().a(context0, 101);
        }
        xeo.b(xej0);
        StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
        return null;
    label_92:
        context2 = context3;
    label_93:
        if(context2 == null) {
            awfg.e().a(context0, 101);
        }
        xeo.b(xej0);
        StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
        throw throwable0;
    label_98:
        if(context3 == null) {
            awfg.e().a(context0, 101);
        }
        xeo.b(xej0);
        StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
        return context3;
    }

    @Override  // awar
    public final Cursor queryForDynamiteModule(Context context0, String s, boolean z) {
        return awer.b(awer.d().e(context0, null, 0L, s, z, false, "com.google.android.gms"));
    }
}

