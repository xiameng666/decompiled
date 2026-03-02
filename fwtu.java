import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationRequest;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.net.wifi.rtt.WifiRttManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings.Global;
import android.provider.Settings.System;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.location.os.real.CallbackRunner.MyBroadcastReceiver;
import java.util.List;

public final class fwtu {
    private int A;
    private boolean B;
    private boolean C;
    private boolean D;
    public final fvtk a;
    public final Context b;
    public final Context c;
    public final Context d;
    public final fvwz e;
    final fwts f;
    final fwts g;
    public final fwtm h;
    public final fwtl i;
    public final fwvn j;
    public volatile boolean k;
    public final Handler l;
    public final fwwt m;
    public boolean n;
    public boolean o;
    public boolean p;
    public fxby q;
    public futl r;
    public fwxs s;
    public boolean t;
    public fyat u;
    private final Context v;
    private CallbackRunner.MyBroadcastReceiver w;
    private fwtp x;
    private long y;
    private int z;

    public fwtu(Context context0, fwvn fwvn0, fvwz fvwz0, fwwt fwwt0) {
        fxby fxby0 = new fxby(new fwth());
        super();
        this.k = false;
        this.o = false;
        this.p = false;
        this.z = -1;
        this.A = -1;
        this.D = false;
        this.b = context0;
        this.c = ModuleManager.requireSubmoduleContext(context0, "network_location_provider");
        this.d = ModuleManager.requireSubmoduleContext(context0, "network_location_calibration");
        this.v = ModuleManager.requireSubmoduleContext(context0, "activity_recognition_provider");
        this.j = fwvn0;
        this.e = fvwz0;
        this.q = fxby0;
        fvtk fvtk0 = new fvtk(fwvn0);
        fvtk0.b();
        this.a = fvtk0;
        this.f = new fwts(this, 5);
        this.g = new fwts(this, 7);
        this.h = new fwtm();
        this.i = new fwtl();
        this.m = fwwt0;
        this.l = new fwtr(this, Looper.myLooper());
    }

    public final Handler a() {
        synchronized(this) {
        }
        return this.l;
    }

    public final void b(fwzf fwzf0, int v) {
        if(fwzf0 == fwzf.a) {
            fwwq.b(this.b);
        }
        fwso.d(this.e, fwzf0, v, this.t);
        this.j.k.f(fwzf0);
        this.q.b(fwzf0);
    }

    public final void c(fxbx fxbx0) {
        Context context0 = this.b;
        WifiManager wifiManager0 = (WifiManager)context0.getSystemService("wifi");
        if(wifiManager0 == null) {
            return;
        }
        boolean z = wifiManager0.isWifiEnabled();
        boolean z1 = fwvx.d(wifiManager0, context0);
        fwso.m(this.e, z1);
        fxbx0.A(z1, z);
    }

    public final void d(fxbx fxbx0, boolean z) {
        boolean z2;
        boolean z1;
        Context context0 = this.c;
        WifiManager wifiManager0 = (WifiManager)context0.getSystemService("wifi");
        if(wifiManager0 == null) {
            z2 = false;
            z1 = false;
        }
        else {
            z1 = wifiManager0.isWifiEnabled();
            z2 = fwvx.d(wifiManager0, this.b);
        }
        fvwz fvwz0 = this.e;
        fwso.m(fvwz0, z2);
        fxbx0.A(z2, z1);
        PowerManager powerManager0 = (PowerManager)context0.getSystemService("power");
        if(powerManager0 != null) {
            this.k(powerManager0.isScreenOn());
            this.j(powerManager0.isPowerSaveMode());
        }
        boolean z3 = fwtu.o(context0);
        fwso.a(fvwz0, z3);
        fxbx0.a(z3);
        if(!this.p()) {
            this.h(((ConnectivityManager)context0.getSystemService("connectivity")), wifiManager0, fxbx0);
        }
        fwvn fwvn0 = this.j;
        if(fwvn0.mT()) {
            fxbx0.x();
            this.n = true;
        }
        else {
            fxbx0.w();
            this.n = false;
        }
        boolean z4 = fwwn.h().d(powerManager0);
        this.t = z4;
        fwso.g(fvwz0, z4);
        fxbx0.e(this.t);
        fwvn0.j.e(this.t);
        if(z) {
            this.g(fxbx0);
        }
        fwtu.f(fvwz0, context0);
    }

    public final void e() {
        fwzf fwzf0 = fwzf.q;
        fwux fwux0 = this.j.k;
        fwwo fwwo0 = fwux0.a[fwzf0.ordinal()];
        while(fwwo0.b()) {
            fwux0.j(fwzf0);
        }
    }

    public static void f(fvwz fvwz0, Context context0) {
        WifiRttManager wifiRttManager0 = (WifiRttManager)context0.getSystemService("wifirtt");
        fwso.n(fvwz0, 0x83, (wifiRttManager0 == null ? false : wifiRttManager0.isAvailable()));
    }

    public final void g(fxbx fxbx0) {
        if(fxbx0 != null) {
            IntentFilter intentFilter0 = new IntentFilter("android.intent.action.BATTERY_CHANGED");
            Intent intent0 = jwe.b(this.b, null, intentFilter0, 2);
            if(intent0 != null) {
                Bundle bundle0 = intent0.getExtras();
                if(bundle0 != null) {
                    int v = bundle0.getInt("scale", 100);
                    boolean z = false;
                    int v1 = bundle0.getInt("level", 0);
                    if(bundle0.getInt("plugged", 0) != 0) {
                        z = true;
                    }
                    if(v != this.z || v1 != this.A || z != this.B) {
                        this.B = z;
                        this.A = v1;
                        this.z = v;
                        fwsn fwsn0 = new fwsn(this.e.f(), v, v1, ((int)z), v, v1, z);
                        this.e.a(fwsn0);
                        fxbx0.c(v, v1, z);
                    }
                }
            }
        }
    }

    public final void h(ConnectivityManager connectivityManager0, WifiManager wifiManager0, fxbx fxbx0) {
        boolean z2;
        boolean z1;
        boolean z;
        String s1;
        int v3;
        NetworkInfo networkInfo0 = connectivityManager0.getActiveNetworkInfo();
        int v = 16;
        int v1 = -1;
        String s = null;
        int v2 = 0;
        if(networkInfo0 != null && networkInfo0.isConnectedOrConnecting()) {
            switch(networkInfo0.getType()) {
                case 1: {
                    WifiInfo wifiInfo0 = wifiManager0.getConnectionInfo();
                    if(wifiInfo0 != null) {
                        v1 = wifiInfo0.getNetworkId();
                    }
                    if(wifiInfo0 != null && hupk.j()) {
                        s = wifiInfo0.getBSSID();
                    }
                    v3 = v1;
                    s1 = s;
                    z1 = true;
                    z = false;
                    z2 = false;
                    break;
                }
                case 0: 
                case 9: {
                    v3 = -1;
                    s1 = null;
                    z = true;
                    z1 = false;
                    z2 = false;
                    break;
                }
                case 16: {
                    v3 = -1;
                    s1 = null;
                    z2 = true;
                    z1 = false;
                    z = false;
                    break;
                }
                default: {
                    return;
                }
            }
        }
        else {
            v3 = -1;
            s1 = null;
            z1 = false;
            z = false;
            z2 = false;
        }
        fwvn fwvn0 = this.j;
        fvwz fvwz0 = this.e;
        if(!z) {
            v = 0;
        }
        if(z1) {
            v2 = 8;
        }
        fwso.i(fvwz0, 2, (z2 ? 0x20 : 0) | (v | v2));
        fxbx0.d(z1, z, z2, v3, s1);
        fwvn0.j.d(z1, z, z2, false, false, v3);
    }

    public final void i(fwzf fwzf0, long v, long v1) {
        this.r(new fwtf(this, fwzf0, new fvsx(v, v1)));
    }

    public final void j(boolean z) {
        fwso.o(this.e, 24, z);
        this.q.r(z);
    }

    public final void k(boolean z) {
        fwso.o(this.e, 18, z);
        this.q.t(z);
        ((fwun)this.j.j).d.i = z;
        long v = SystemClock.elapsedRealtime();
        this.a.d(z, v);
    }

    public final void l(boolean z) {
        synchronized(this) {
            if(this.k) {
                return;
            }
            this.t(1, ((int)z), null, false);
            this.k = true;
        }
    }

    public final void m(fvvj[] arr_fvvj, boolean z) {
        this.t(6, ((int)z), new fwtt(arr_fvvj), false);
    }

    public final void n() {
        synchronized(this) {
            CallbackRunner.MyBroadcastReceiver callbackRunner$MyBroadcastReceiver0 = this.w;
            if(callbackRunner$MyBroadcastReceiver0 != null) {
                try {
                    this.b.unregisterReceiver(callbackRunner$MyBroadcastReceiver0);
                }
                catch(IllegalArgumentException unused_ex) {
                }
            }
            fwtp fwtp0 = this.x;
            if(fwtp0 != null) {
                this.b.getContentResolver().unregisterContentObserver(fwtp0);
                this.x = null;
            }
        }
    }

    static boolean o(Context context0) {
        return Settings.System.getInt(context0.getContentResolver(), "airplane_mode_on", 0) == 1;
    }

    public final boolean p() {
        return huvd.A() && bbnp.k(this.c);
    }

    public final void q(fvsu fvsu0) {
        Looper looper0;
        LocationListener locationListener0;
        LocationManager locationManager0;
        synchronized(this) {
            Context context0 = this.b;
            fyar fyar0 = new fyar(context0);
            fuyw fuyw0 = new fuyw(context0);
            Context context1 = this.c;
            ConnectivityManager connectivityManager0 = (ConnectivityManager)context1.getSystemService("connectivity");
            this.r = new futl(fyar0, this.j, this.j.u, fvsu0, this.j, this.j, this.j, fuyw0, connectivityManager0);
            this.q = new fxby(this.r);
            this.s = this.r.a;
            IntentFilter intentFilter0 = new IntentFilter();
            intentFilter0.addAction("android.intent.action.AIRPLANE_MODE");
            if(humr.r()) {
                intentFilter0.addAction("android.intent.action.ACTION_POWER_CONNECTED");
                intentFilter0.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
            }
            intentFilter0.addAction("android.intent.action.SCREEN_OFF");
            intentFilter0.addAction("android.intent.action.SCREEN_ON");
            intentFilter0.addAction("android.intent.action.USER_PRESENT");
            intentFilter0.addAction("com.google.android.location.ALARM_WAKEUP_ACTIVITY_DETECTION");
            fwwn.h();
            if(context0.getSystemService("wifiscanner") == null) {
                intentFilter0.addAction("android.net.wifi.SCAN_RESULTS");
            }
            intentFilter0.addAction("android.net.wifi.WIFI_STATE_CHANGED");
            if(!this.p()) {
                intentFilter0.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
            intentFilter0.addAction("android.intent.action.USER_FOREGROUND");
            intentFilter0.addAction("android.intent.action.USER_BACKGROUND");
            intentFilter0.addAction("android.location.MODE_CHANGED");
            intentFilter0.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
            intentFilter0.addAction("android.app.action.NOTIFICATION_POLICY_ACCESS_GRANTED_CHANGED");
            intentFilter0.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            intentFilter0.addAction("android.app.action.NEXT_ALARM_CLOCK_CHANGED");
            intentFilter0.addAction("com.google.android.location.internal.intent.action.NLP_TESTING");
            IntentFilter intentFilter1 = new IntentFilter();
            intentFilter1.addAction("android.bluetooth.device.action.ACL_CONNECTED");
            intentFilter1.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
            intentFilter1.addAction("android.bluetooth.device.action.ACL_DISCONNECT_REQUESTED");
            intentFilter1.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
            if(!this.k) {
                CallbackRunner.MyBroadcastReceiver callbackRunner$MyBroadcastReceiver0 = new CallbackRunner.MyBroadcastReceiver(this, this.q);
                this.w = callbackRunner$MyBroadcastReceiver0;
                jwe.b(context0, callbackRunner$MyBroadcastReceiver0, intentFilter0, 2);
                jwe.b(this.v, this.w, intentFilter1, 2);
                fwtp fwtp0 = new fwtp(this, this.l, this.q);
                this.x = fwtp0;
                context0.getContentResolver().registerContentObserver(Settings.Global.getUriFor("wifi_scan_always_enabled"), false, fwtp0);
            }
            try {
                locationManager0 = (LocationManager)context1.getSystemService("location");
                if(locationManager0 != null) {
                    jym.c(locationManager0, gmap.a, this.h);
                    if(locationManager0.isProviderEnabled("passive") && locationManager0.getProvider("passive") != null) {
                        locationListener0 = this.f.c;
                        looper0 = Looper.getMainLooper();
                        if(this.C) {
                            locationManager0.requestLocationUpdates("passive", 0L, 0.0f, locationListener0);
                        }
                        if(this.D) {
                            goto label_57;
                        }
                        else {
                            boolean z = bbsr.b(context0).a("android.permission.UPDATE_APP_OPS_STATS") == 0;
                            this.D = z;
                            if(z) {
                                goto label_57;
                            }
                            else {
                                goto label_61;
                            }
                        }
                    }
                }
            }
            catch(NullPointerException | SecurityException | IllegalStateException unused_ex) {
            }
            goto label_64;
            try {
            label_57:
                LocationRequest locationRequest0 = LocationRequest.createFromDeprecatedProvider("passive", 0L, 0.0f, false);
                locationRequest0.setHideFromAppOps(true);
                locationManager0.requestLocationUpdates(locationRequest0, locationListener0, looper0);
            }
            catch(Exception unused_ex) {
                try {
                    try {
                    label_61:
                        locationManager0.requestLocationUpdates("passive", 0L, 0.0f, locationListener0);
                    }
                    catch(NullPointerException unused_ex) {
                        try {
                            this.C = true;
                        }
                        catch(NullPointerException unused_ex) {
                        }
                    }
                }
                catch(SecurityException | IllegalStateException unused_ex) {
                }
            }
        label_64:
            this.e.g(1);
            this.q.j();
            this.d(this.q, false);
        }
    }

    public final void r(Runnable runnable0) {
        this.t(11, 0, runnable0, true);
    }

    final void s(List list0) {
        synchronized(this) {
            int v1 = list0.size();
            fvvj[] arr_fvvj = new fvvj[v1];
            long v2 = SystemClock.elapsedRealtime();
            for(int v3 = 0; v3 < v1; ++v3) {
                long v4 = this.y;
                fwvy[] arr_fwvy = (fwvy[])list0.get(v3);
                arr_fvvj[v3] = fwvr.a(v2, v4, this.m, arr_fwvy, null, true, 0, 0, this.e);
            }
            if(v1 > 0) {
                this.y = arr_fvvj[v1 - 1].m();
            }
            this.j.p.g(1, 0, v1, 0, false, -1, 0, -1, 0, true, 0L);
            this.m(arr_fvvj, false);
            lvj.a(this.b).e(fwwq.a("com.google.android.location.internal.WIFI_SCAN_RECEIVED"));
        }
    }

    public final void t(int v, int v1, Object object0, boolean z) {
        int v2;
        if(this.k) {
            return;
        }
        if(z) {
            this.j.k.i(fwzf.q, 60000L, null);
            v2 = 0x10E1;
        }
        else {
            v2 = 8534;
        }
        if(object0 != null) {
            Message.obtain(this.l, v, v1, v2, object0).sendToTarget();
            return;
        }
        Message.obtain(this.l, v, v1, v2).sendToTarget();
    }
}

