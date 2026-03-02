import android.accounts.Account;
import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.PowerManager;
import android.provider.Settings.Global;
import android.util.Pair;
import com.google.android.gms.location.reporting.UploadRequest;
import com.google.android.gms.location.reporting.UploadRequestResult;
import com.google.android.location.reporting.state.update.AccountConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public final class fxrc {
    public static fxrb a;
    private static final int[] b;

    static {
        fxrc.b = new int[]{13, 6, 20, 11, 8, 12, 5, 15, 16, 9, 4, 14, 19, 10, 18, 7, 17};
    }

    public static void a(Context context0) {
        synchronized(fxrc.class) {
            if(fxrc.a == null) {
                fxrc.a = new fxrb(context0);
            }
        }
    }

    public static void b(Boolean boolean0, List list0) {
        Objects.toString(boolean0);
        if(!fxrc.s()) {
            return;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gzlq.a).v_newBuilder();
        boolean z = boolean0.booleanValue();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gzlq gzlq0 = (gzlq)hftp0.b_message;
        gzlq0.b |= 0x100;
        gzlq0.j = z;
        gzlq gzlq1 = (gzlq)hftp0.N_build();
        fxrc.a.f(gzlq1, (boolean0.booleanValue() ? gzww.du : gzww.dv), list0);
    }

    public static void c(String s, String s1, int v) {
        if(fxrc.q() && fxrc.r()) {
            fxrc.a.b(gzwj.f, s, s1, v);
        }
    }

    public static void d(String s, String s1, int v) {
        if(fxrc.q() && fxrc.r()) {
            fxrc.a.b(gzwj.b, s, s1, v);
        }
    }

    public static void e(String s, String s1, UploadRequest uploadRequest0, UploadRequestResult uploadRequestResult0) {
        if(fxrc.q() && fxrc.r()) {
            fxrc.a.m(gzwj.e, s, s1, uploadRequest0, uploadRequestResult0);
        }
    }

    public static void f(String s, String s1, int v) {
        if(fxrc.q() && fxrc.r()) {
            fxrc.a.b(gzwj.h, s, s1, v);
        }
    }

    public static void g(String s, String s1, int v) {
        if(fxrc.q() && fxrc.r()) {
            fxrc.a.b(gzwj.c, s, s1, v);
        }
    }

    public static void h(String s, String s1, int v) {
        if(fxrc.q() && fxrc.r()) {
            fxrc.a.b(gzwj.d, s, s1, v);
        }
    }

    public static void i(boolean z) {
        if(!fxrc.q()) {
            return;
        }
        fxrc.a.e(z);
    }

    public static void j(boolean z) {
        if(!fxrc.q()) {
            return;
        }
        fxrc.a.g(z);
    }

    public static void k(boolean z) {
        if(!fxrc.q()) {
            return;
        }
        fxrc.a.h(z);
    }

    public static void l(boolean z) {
        if(!fxrc.q()) {
            return;
        }
        fxrc.a.l(z);
    }

    public static void m(boolean z) {
        if(!fxrc.q()) {
            return;
        }
        fxrc.a.n(z);
    }

    public static void n(boolean z) {
        if(!fxrc.q()) {
            return;
        }
        fxrc.a.o(z);
    }

    public static void o(Boolean boolean0, List list0) {
        Objects.toString(boolean0);
        if(!fxrc.s()) {
            return;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gzlq.a).v_newBuilder();
        boolean z = boolean0.booleanValue();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gzlq gzlq0 = (gzlq)hftp0.b_message;
        gzlq0.b |= 0x40;
        gzlq0.h = z;
        gzlq gzlq1 = (gzlq)hftp0.N_build();
        fxrc.a.f(gzlq1, (boolean0.booleanValue() ? gzww.dn : gzww.do), list0);
    }

    public static void p(Account account0, Context context0) {
        boolean z7;
        fxtr fxtr0 = fxtr.b(context0);
        AccountConfig accountConfig0 = fxtr0.c(account0);
        boolean z = bbpg.b(context0);
        int v = cjer_LocationSettings.p(context0) ^ 1;
        int v1 = bbpg.c(context0) ^ 1;
        boolean z1 = fxtu.a(context0).k();
        String s = fxva.c(context0);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gzlq.a).v_newBuilder();
        boolean z2 = fxva.o(context0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gzlq)hftv0).b |= 1;
        ((gzlq)hftv0).c = z2;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((gzlq)hftv1).b |= 2;
        ((gzlq)hftv1).d = true;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        gzlq gzlq0 = (gzlq)hftp0.b_message;
        gzlq0.b |= 4;
        gzlq0.e = z;
        boolean z3 = false;
        boolean z4 = Settings.Global.getInt(context0.getContentResolver(), "low_power", 0) != 0;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gzlq gzlq1 = (gzlq)hftp0.b_message;
        gzlq1.b |= 16;
        gzlq1.f = z4;
        int v2 = Settings.Global.getInt(context0.getContentResolver(), "low_power_trigger_level", 0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gzlq gzlq2 = (gzlq)hftp0.b_message;
        gzlq2.b |= 0x20;
        gzlq2.g = v2;
        WifiManager wifiManager0 = (WifiManager)context0.getApplicationContext().getSystemService("wifi");
        boolean z5 = wifiManager0 != null && wifiManager0.getWifiState() == 3;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gzlq gzlq3 = (gzlq)hftp0.b_message;
        gzlq3.b |= 0x40;
        gzlq3.h = z5;
        int v3 = cjer_LocationSettings.a(context0);
        gzwr gzwr0 = (gzwr)new ArrayList(Arrays.asList(new gzwr[]{gzwr.b, gzwr.d, gzwr.c, gzwr.e})).get(v3);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gzlq)hftp0.b_message).i = gzwr0.f;
        ((gzlq)hftp0.b_message).b |= 0x80;
        boolean z6 = Settings.Global.getInt(context0.getContentResolver(), "airplane_mode_on", 0) != 0;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gzlq gzlq4 = (gzlq)hftp0.b_message;
        gzlq4.b |= 0x100;
        gzlq4.j = z6;
        PowerManager powerManager0 = (PowerManager)context0.getSystemService("power");
        if(powerManager0 == null) {
            fxqw.f("Can not obtain Power Manager");
            z7 = false;
        }
        else {
            z7 = powerManager0.isDeviceIdleMode();
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((gzlq)hftv2).b |= 0x200;
        ((gzlq)hftv2).k = z7;
        boolean z8 = accountConfig0.e;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp0.b_message;
        ((gzlq)hftv3).b |= 0x400;
        ((gzlq)hftv3).l = z8;
        boolean z9 = accountConfig0.g;
        if(!hftv3.isImmutable()) {
            hftp0.ensureMutable();
        }
        gzlq gzlq5 = (gzlq)hftp0.b_message;
        gzlq5.b |= 0x800;
        gzlq5.m = z9;
        if(account0 == null || !fvru.a(context0).d(account0)) {
            z3 = true;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv4 = hftp0.b_message;
        ((gzlq)hftv4).b |= 0x2000;
        ((gzlq)hftv4).n = z3;
        int v4 = accountConfig0.k ^ 1;
        if(!hftv4.isImmutable()) {
            hftp0.ensureMutable();
        }
        gzlq gzlq6 = (gzlq)hftp0.b_message;
        gzlq6.b |= 0x4000;
        gzlq6.o = v4;
        boolean z10 = azqk.g(context0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv5 = hftp0.b_message;
        ((gzlq)hftv5).b |= 0x8000;
        ((gzlq)hftv5).p = z10;
        if(!hftv5.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv6 = hftp0.b_message;
        ((gzlq)hftv6).b |= 0x10000;
        ((gzlq)hftv6).q = v;
        if(!hftv6.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv7 = hftp0.b_message;
        ((gzlq)hftv7).b |= 0x20000;
        ((gzlq)hftv7).r = v1;
        if(!hftv7.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv8 = hftp0.b_message;
        ((gzlq)hftv8).b |= 0x40000;
        ((gzlq)hftv8).s = z1;
        if(!hftv8.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv9 = hftp0.b_message;
        ((gzlq)hftv9).b |= 0x100000;
        ((gzlq)hftv9).u = true;
        if(s != null) {
            if(!hftv9.isImmutable()) {
                hftp0.ensureMutable();
            }
            gzlq gzlq7 = (gzlq)hftp0.b_message;
            gzlq7.b |= 0x80000;
            gzlq7.t = s;
        }
        int v5 = fxtr0.a(account0);
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(Pair.create(account0, Integer.valueOf(v5)));
        gzlq gzlq8 = (gzlq)hftp0.N_build();
        gzww gzww0 = gzww.dy;
        fxrb fxrb0 = fxrc.a;
        if(fxrb0 != null) {
            fxrb0.f(gzlq8, gzww0, arrayList0);
        }
    }

    public static boolean q() {
        return fxrc.a != null && hzek.a.i().ah();
    }

    public static boolean r() {
        return fxrc.a != null && hzek.k();
    }

    public static boolean s() {
        return fxrc.a != null && hzeb.c();
    }

    public static boolean t() {
        return fxrc.a != null && hzeq.f();
    }

    public static boolean u(Account account0, Context context0) {
        AccountConfig accountConfig0 = fxtr.b(context0).c(account0);
        return accountConfig0.b ? accountConfig0.e && accountConfig0.g : true;
    }

    static int v(Boolean boolean0) {
        return boolean0.booleanValue() ? 2 : 3;
    }

    public static int w(Throwable throwable0) {
        if((throwable0 instanceof acse)) {
            return 21;
        }
        if(hzeh.a.b().d() && (throwable0 instanceof iapl)) {
            int v = ((iapl)throwable0).a.t.r;
            if(v == 0) {
                fxqw.f("Received RPC response error but status code is OK.");
            }
            return fxrc.b[v];
        }
        return 1;
    }
}

