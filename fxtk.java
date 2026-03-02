import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.net.Uri;
import android.provider.Settings.Global;
import com.google.android.location.reporting.service.DispatchingChimeraService;
import com.google.android.location.reporting.service.UlrController.5;

public final class fxtk implements fxqj {
    public final Context a;
    public final fxtr b;
    public final fxtt c;
    public final fxts d;
    public final cmnh e;
    public final fxsk f;
    public final fxsw g;
    public final fxth h;
    public fxtj i;
    public final fxqn j;
    public BroadcastReceiver k;
    public ContentObserver l;
    public ContentObserver m;
    public ContentObserver n;
    public final DispatchingChimeraService o;
    public static final int p;
    private final bbng q;
    private final fxpz r;
    private final fxqd s;

    static {
        Uri.parse("content://com.google.settings/partner");
    }

    public fxtk(Context context0, fxqn fxqn0, DispatchingChimeraService dispatchingChimeraService0) {
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.a = context0;
        this.j = fxqn0;
        this.o = dispatchingChimeraService0;
        fxtr fxtr0 = fxtr.b(context0);
        this.b = fxtr0;
        fxtt fxtt0 = fxtt.a(context0);
        this.c = fxtt0;
        fxts fxts0 = new fxts();
        this.d = fxts0;
        this.q = bbnk.a;
        cnjv cnjv0 = new cnjv(context0);
        this.e = cnjv0;
        fxpz fxpz0 = new fxpz(context0);
        this.r = fxpz0;
        fxqd fxqd0 = new fxqd(context0);
        this.s = fxqd0;
        fxqk fxqk0 = new fxqk(context0, bbnk.a);
        fxsk fxsk0 = new fxsk(context0, fxts0, fxtt0, fxqn0, fxtr0);
        this.f = fxsk0;
        fxsw fxsw0 = new fxsw(context0, fxqn0, fxtt0, fxtr0, fxts0, cnjv0, fxpz0, fxqd0, fxsk0, new fxtp(context0), fxuh.c(context0), new fxpw(context0, fxts0, new fxpv(context0), new fxrk(context0)), fxqk0, new cniy(context0), this);
        this.g = fxsw0;
        fxth fxth0 = new fxth(this, ((fxts)fxsw0), fxtr0, fxtt0, fxsw0, fxqn0);
        this.h = fxth0;
        ContentResolver contentResolver0 = context0.getContentResolver();
        PackageManager packageManager0 = context0.getPackageManager();
        if(packageManager0 != null && packageManager0.hasSystemFeature("android.hardware.wifi") && contentResolver0 != null) {
            this.l = new fxtd(this, fxth0);
            contentResolver0.registerContentObserver(Settings.Global.getUriFor("wifi_scan_always_enabled"), false, this.l);
        }
        if(contentResolver0 != null) {
            this.m = new fxte(this, fxth0);
            contentResolver0.registerContentObserver(Settings.Global.getUriFor("low_power"), true, this.m);
        }
        if(contentResolver0 != null) {
            this.n = new fxtf(this, fxth0);
            contentResolver0.registerContentObserver(Settings.Global.getUriFor("low_power_trigger_level"), true, this.n);
        }
        IntentFilter intentFilter0 = new IntentFilter("android.intent.action.AIRPLANE_MODE");
        if(packageManager0 != null && packageManager0.hasSystemFeature("android.hardware.wifi")) {
            intentFilter0.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        }
        intentFilter0.addAction("android.location.MODE_CHANGED");
        intentFilter0.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
        UlrController.5 ulrController$50 = new UlrController.5(this);
        this.k = ulrController$50;
        jwe.b(context0, ulrController$50, intentFilter0, 2);
    }

    @Deprecated
    public static Intent a(Context context0, String s) {
        Intent intent0 = new Intent();
        intent0.setComponent(new ComponentName(context0, "com.google.android.location.reporting.service.DispatchingService"));
        intent0.setAction(s);
        return intent0;
    }

    public static Intent b(Context context0, String s, String s1) {
        Intent intent0 = fxtk.a(context0, s);
        intent0.putExtra("source", s1);
        return intent0;
    }

    public final fxtj c() {
        synchronized(this) {
            if(this.i == null) {
                this.i = new fxtj(this);
            }
        }
        return this.i;
    }

    public static String d(Intent intent0) {
        try {
            return intent0.hasExtra("source") ? intent0.getStringExtra("source") : null;
        }
        catch(RuntimeException unused_ex) {
        }
        return null;
    }

    public static void e(Context context0, String s) {
        fxva.p(context0, fxtk.b(context0, "com.google.android.location.reporting.ACTION_UPDATE_ACTIVE_STATE", s));
    }

    public static void f(Context context0) {
        fxva.p(context0, fxtk.a(context0, "com.google.android.location.reporting.UPLOAD"));
    }

    public static void g(Context context0) {
        fxva.p(context0, fxtk.a(context0, "com.google.android.location.reporting.WIFI_TRIGGERED_UPLOAD"));
    }

    public final void h() {
        fxva.b(this.a, "com.google.android.location.reporting.ACTION_WIFI_SCAN_RESULTS").cancel();
        Intent intent0 = fxtk.b(this.a, "com.google.android.location.reporting.ACTION_ACTIVITY", "Cancel");
        fxsw.a(this.a, intent0).cancel();
        Intent intent1 = fxtk.a(this.a, "com.google.android.location.reporting.ACTION_LOCATION");
        PendingIntent.getService(this.a, 0, intent1, 0xA000000).cancel();
        Intent intent2 = fxtk.a(this.a, "com.google.android.location.reporting.ACTION_IMMEDIATE_LOCATION");
        PendingIntent.getService(this.a, 0, intent2, 0xA000000).cancel();
    }
}

