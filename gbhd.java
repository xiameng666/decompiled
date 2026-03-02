import android.accounts.Account;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.location.Location;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.nfc.NfcAdapter;
import android.os.Build.VERSION;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.provider.Settings.Global;
import android.provider.Settings.Secure;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

final class gbhd {
    private static long A;
    private static hhdd B;
    private static long C;
    private static Boolean D;
    private static long E;
    private static Boolean F;
    private static long G;
    private static gged_interceptors H;
    private static long I;
    private static int[] J;
    private dkhw K;
    public final Context a;
    public hckk b;
    public boolean c;
    public int d;
    public Long e;
    public String f;
    public boolean g;
    public boolean h;
    public List i;
    public boolean j;
    public bmei k;
    public long l;
    public Account m;
    public Account[] n;
    public hcke o;
    public ExecutorService p;
    public byte[] q;
    public gctm r;
    public int s;
    public int t;
    public int u;
    private static final bboh v;
    private static final byk w;
    private static Boolean x;
    private static Boolean y;
    private static Integer z;

    static {
        gbhd.v = bboh.a("O2RequestContextBuilder");
        gbhd.w = new byk(5);
    }

    public gbhd(Context context0) {
        this.s = 1;
        this.a = context0.getApplicationContext();
        this.j = true;
    }

    public final dkhw a() {
        synchronized(this) {
            if(this.K == null) {
                this.K = new dklu(this.a);
            }
        }
        return this.K;
    }

    public final hckh b() {
        heal heal0;
        gcvp gcvp2;
        PackageInfo packageInfo2;
        long v19;
        byk byk2;
        gbhc gbhc2;
        PackageInfo packageInfo0;
        int v8;
        String s6;
        gmcd gmcd1;
        gmcd gmcd0;
        long v = SystemClock.elapsedRealtime();
        long v1 = SystemClock.uptimeMillis();
        hcjt hcjt0 = (hcjt)((ProtoLiteMessage)hckh.a).v_newBuilder();
        int[] arr_v = gbhd.J;
        if(arr_v == null) {
            if(this.p == null) {
                this.p = new bblp(0x7FFFFFFF, 9);
            }
            gmcd0 = ((bblp)this.p).e(new gbgz(this));
        }
        else {
            gmcd0 = gmbu.i(arr_v);
        }
        gaxl.a();
        if(hzmb.h()) {
            TelephonyManager telephonyManager0 = (TelephonyManager)this.a.getSystemService("phone");
            try {
                if(this.j && telephonyManager0 != null) {
                    gaxl.a();
                    gmcd1 = gcun.a(telephonyManager0, hzks.e());
                }
                else {
                    gmcd1 = null;
                }
            }
            catch(SecurityException | UnsupportedOperationException unused_ex) {
                gmcd1 = null;
            }
        }
        else {
            gmcd1 = null;
        }
        hciy hciy0 = (hciy)((ProtoLiteMessage)hcji.b).v_newBuilder();
        int v2 = this.s;
        if(!hciy0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hciy0).ensureMutable();
        }
        hcji hcji0 = (hcji)hciy0.b_message;
        if(v2 == 0) {
            throw null;
        }
        hcji0.R = v2 - 1;
        hcji0.d |= 16;
        String s = Integer.toString(Build.VERSION.SDK_INT);
        if(!hciy0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hciy0).ensureMutable();
        }
        hcji hcji1 = (hcji)hciy0.b_message;
        s.getClass();
        hcji1.c |= 0x100;
        hcji1.n = s;
        if(!hciy0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hciy0).ensureMutable();
        }
        ((hcji)hciy0.b_message).c |= 0x2000;
        ((hcji)hciy0.b_message).r = v1;
        String s1 = TimeZone.getDefault().getDisplayName();
        if(!hciy0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hciy0).ensureMutable();
        }
        hcji hcji2 = (hcji)hciy0.b_message;
        s1.getClass();
        hcji2.c |= 0x4000;
        hcji2.s = s1;
        if(!TextUtils.isEmpty(Build.DEVICE)) {
            String s2 = Build.DEVICE;
            if(!hciy0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hciy0).ensureMutable();
            }
            hcji hcji3 = (hcji)hciy0.b_message;
            s2.getClass();
            hcji3.c |= 0x200;
            hcji3.o = s2;
        }
        if(!TextUtils.isEmpty(Build.MODEL)) {
            String s3 = Build.MODEL;
            if(!hciy0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hciy0).ensureMutable();
            }
            hcji hcji4 = (hcji)hciy0.b_message;
            s3.getClass();
            hcji4.c |= 0x400;
            hcji4.p = s3;
        }
        gaxl.a();
        long v3 = gaxm.n();
        if(!hciy0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hciy0).ensureMutable();
        }
        ((hcji)hciy0.b_message).c |= 0x800;
        ((hcji)hciy0.b_message).q = v3;
        gaxl.a();
        if(!TextUtils.isEmpty(null)) {
            new clht(Looper.getMainLooper()).post(new gbha(this));
            if(!hciy0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hciy0).ensureMutable();
            }
            hcji hcji5 = (hcji)hciy0.b_message;
            throw null;
        }
        gaxl.a();
        if(!TextUtils.isEmpty(gaxm.p())) {
            gaxl.a();
            String s4 = gaxm.p();
            if(!hciy0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hciy0).ensureMutable();
            }
            hcji hcji6 = (hcji)hciy0.b_message;
            s4.getClass();
            hcji6.c |= 0x10000000;
            hcji6.H = s4;
        }
        List list0 = this.i;
        if(list0 != null) {
            hciy0.k(list0);
        }
        gaxl.a();
        String s5 = gaxm.q();
        List list1 = ggna.a;
        if(!TextUtils.isEmpty(s5)) {
            list1 = gfud.h("\\s*,\\s*").n(s5.trim());
        }
        int v4 = list1.size();
        if(v4 != 0) {
            new clht(Looper.getMainLooper()).post(new gbhb(this, s5));
        }
        gaxl.a();
        boolean z = gaxm.s();
        gaxl.a();
        long v5 = gaxm.u();
        gcvo gcvo0 = gcvn.b(this.a, v5);
        gged_interceptors gged0 = gcvo0.a;
        int v6 = ((ggna)gged0).c;
        if(v4 == 0) {
            s6 = s5;
            v8 = 0;
        }
        else {
            ggdy ggdy0 = new ggdy();
            s6 = s5;
            int v7 = 0;
            while(v7 < v4) {
                gcvp gcvp0 = v7 >= v6 ? new gcvp() : ((gcvp)gged0.get(v7));
                gcvp0.e = (String)list1.get(v7);
                ggdy0.i(gcvp0);
                ++v7;
                v4 = v4;
            }
            v8 = v4;
            gged0 = ggdy0.h();
        }
        for(int v9 = 0; v9 < ((ggna)gged0).c; ++v9) {
            hciy0.n(gbhd.d(((gcvp)gged0.get(v9)), z, this.j));
        }
        gcvp gcvp1 = gcvo0.a();
        if(gcvp1 != null) {
            if(!TextUtils.isEmpty(gcvp1.b)) {
                String s7 = gcut.e(gcvp1.b);
                if(!hciy0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hciy0).ensureMutable();
                }
                hcji hcji7 = (hcji)hciy0.b_message;
                s7.getClass();
                hcji7.c |= 4;
                hcji7.h = s7;
                if(TextUtils.isEmpty(s6)) {
                    try {
                        long v10 = Long.parseLong(gcvp1.b) / 100000L * 100000L;
                        if(!hciy0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)hciy0).ensureMutable();
                        }
                        ((hcji)hciy0.b_message).c |= 0x40;
                        ((hcji)hciy0.b_message).l = v10;
                    }
                    catch(NumberFormatException unused_ex) {
                    }
                }
            }
            if(v8 != 0) {
                String s8 = (String)list1.get(0);
                if(!hciy0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hciy0).ensureMutable();
                }
                hcji hcji8 = (hcji)hciy0.b_message;
                s8.getClass();
                hcji8.c |= 8;
                hcji8.i = s8;
            }
            else if(!TextUtils.isEmpty(gcvp1.c())) {
                String s9 = gcvp1.c();
                if(!hciy0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hciy0).ensureMutable();
                }
                hcji hcji9 = (hcji)hciy0.b_message;
                s9.getClass();
                hcji9.c |= 8;
                hcji9.i = s9;
            }
            if(!TextUtils.isEmpty(gcvp1.d)) {
                String s10 = gcvp1.d;
                if(!hciy0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hciy0).ensureMutable();
                }
                hcji hcji10 = (hcji)hciy0.b_message;
                s10.getClass();
                hcji10.c |= 16;
                hcji10.j = s10;
            }
            if(!TextUtils.isEmpty(gcvp1.g)) {
                String s11 = gcvp1.g;
                if(!hciy0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hciy0).ensureMutable();
                }
                hcji hcji11 = (hcji)hciy0.b_message;
                s11.getClass();
                hcji11.c |= 0x20;
                hcji11.k = s11;
            }
            int v11 = gcvo0.f ? 2 : 3;
            if(!hciy0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hciy0).ensureMutable();
            }
            ((hcji)hciy0.b_message).e = v11 - 1;
            ((hcji)hciy0.b_message).c |= 1;
            if(z) {
                if(!TextUtils.isEmpty(gcvp1.j)) {
                    String s12 = gcvp1.j;
                    if(!hciy0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)hciy0).ensureMutable();
                    }
                    hcji hcji12 = (hcji)hciy0.b_message;
                    s12.getClass();
                    hcji12.c |= 0x80;
                    hcji12.m = s12;
                }
                boolean z1 = gcvo0.c;
                if(!hciy0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hciy0).ensureMutable();
                }
                ((hcji)hciy0.b_message).c |= 0x20000000;
                ((hcji)hciy0.b_message).J = z1;
                int v12 = gcvo0.d;
                if(!hciy0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hciy0).ensureMutable();
                }
                ((hcji)hciy0.b_message).c |= 0x40000000;
                ((hcji)hciy0.b_message).K = v12;
            }
        }
        else if(v8 != 0) {
            String s13 = (String)list1.get(0);
            if(!hciy0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hciy0).ensureMutable();
            }
            hcji hcji13 = (hcji)hciy0.b_message;
            s13.getClass();
            hcji13.c |= 8;
            hcji13.i = s13;
            String s14 = gcut.e(s13);
            if(!hciy0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hciy0).ensureMutable();
            }
            hcji hcji14 = (hcji)hciy0.b_message;
            s14.getClass();
            hcji14.c |= 4;
            hcji14.h = s14;
        }
        Context context0 = this.a;
        int v13 = gcvj.f(context0, "android.permission.CAMERA") ? 2 : 3;
        if(!hciy0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hciy0).ensureMutable();
        }
        ((hcji)hciy0.b_message).f = v13 - 1;
        ((hcji)hciy0.b_message).c |= 2;
        DisplayMetrics displayMetrics0 = gcvx.a(context0);
        int v14 = displayMetrics0.widthPixels;
        if(!hciy0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hciy0).ensureMutable();
        }
        ((hcji)hciy0.b_message).c |= 0x8000;
        ((hcji)hciy0.b_message).t = v14;
        int v15 = displayMetrics0.heightPixels;
        if(!hciy0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hciy0).ensureMutable();
        }
        ((hcji)hciy0.b_message).c |= 0x10000;
        ((hcji)hciy0.b_message).u = v15;
        float f = displayMetrics0.xdpi;
        if(!hciy0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hciy0).ensureMutable();
        }
        ((hcji)hciy0.b_message).c |= 0x20000;
        ((hcji)hciy0.b_message).v = f;
        float f1 = displayMetrics0.ydpi;
        if(!hciy0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hciy0).ensureMutable();
        }
        ((hcji)hciy0.b_message).c |= 0x40000;
        ((hcji)hciy0.b_message).w = f1;
        int v16 = displayMetrics0.densityDpi;
        if(!hciy0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hciy0).ensureMutable();
        }
        ((hcji)hciy0.b_message).c |= 0x80000;
        ((hcji)hciy0.b_message).x = v16;
        if(this.t == 3) {
            long v17 = (long)this.d;
            if(!hciy0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hciy0).ensureMutable();
            }
            ((hcji)hciy0.b_message).c |= 0x8000000;
            ((hcji)hciy0.b_message).F = v17;
        }
        int v18 = this.t;
        if(!hciy0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hciy0).ensureMutable();
        }
        hcji hcji15 = (hcji)hciy0.b_message;
        if(v18 == 0) {
            throw null;
        }
        hcji15.y = v18 - 1;
        hcji15.c |= 0x100000;
        hcke hcke0 = this.o;
        if(hcke0 != null) {
            if(!hcjt0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hcjt0).ensureMutable();
            }
            ((hckh)hcjt0.b_message).q = hcke0;
            ((hckh)hcjt0.b_message).b |= 0x2000;
        }
        PackageManager packageManager0 = context0.getPackageManager();
        byk byk0 = gbhd.w;
        gbhc gbhc0 = (gbhc)byk0.d("com.google.android.gms");
        if(gbhc0 == null) {
            try {
                packageInfo0 = null;
                packageInfo0 = context0.getPackageManager().getPackageInfo("com.google.android.gms", 0);
                if(packageInfo0 != null) {
                    byk0.e("com.google.android.gms", new gbhc(v, packageInfo0));
                }
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
            }
        }
        else {
            packageInfo0 = gbhc0.b;
        }
        if(packageInfo0 != null) {
            if(!hciy0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hciy0).ensureMutable();
            }
            hcji hcji16 = (hcji)hciy0.b_message;
            "com.google.android.gms".getClass();
            hcji16.c |= 0x200000;
            hcji16.z = "com.google.android.gms";
            String s15 = Integer.toString(packageInfo0.versionCode);
            if(!hciy0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hciy0).ensureMutable();
            }
            hcji hcji17 = (hcji)hciy0.b_message;
            s15.getClass();
            hcji17.c |= 0x400000;
            hcji17.A = s15;
            if(!TextUtils.isEmpty(packageInfo0.versionName)) {
                String s16 = packageInfo0.versionName;
                if(!hciy0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hciy0).ensureMutable();
                }
                hcji hcji18 = (hcji)hciy0.b_message;
                s16.getClass();
                hcji18.c |= 0x800000;
                hcji18.B = s16;
            }
        }
        if(TextUtils.isEmpty(this.f)) {
            v19 = v1;
            gcvp2 = gcvp1;
            packageInfo2 = null;
        }
        else {
            String s17 = this.f;
            if(!hciy0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hciy0).ensureMutable();
            }
            hcji hcji19 = (hcji)hciy0.b_message;
            s17.getClass();
            hcji19.c |= 0x1000000;
            hcji19.C = s17;
            String s18 = this.f;
            byk byk1 = gbhd.w;
            gbhc gbhc1 = (gbhc)byk1.d(s18);
            if(gbhc1 == null) {
                v19 = v1;
                byk2 = byk1;
                try {
                label_314:
                    PackageInfo packageInfo1 = packageManager0.getPackageInfo(s18, 0);
                    if(packageInfo1 != null) {
                        gbhc2 = new gbhc(v, packageInfo1);
                        goto label_317;
                    }
                }
                catch(PackageManager.NameNotFoundException unused_ex) {
                }
                goto label_319;
                try {
                label_317:
                    byk2.e(s18, gbhc2);
                }
                catch(PackageManager.NameNotFoundException unused_ex) {
                }
                gbhc1 = gbhc2;
            }
            else {
                byk2 = byk1;
                gaxl.a();
                v19 = v1;
                long v20 = (long)(((int)(((Integer)gcjh.q.a()))));
                if(v - gbhc1.a > v20) {
                    goto label_314;
                }
            }
        label_319:
            if(gbhc1 == null) {
                gcvp2 = gcvp1;
                packageInfo2 = null;
            }
            else {
                packageInfo2 = gbhc1.b;
                String s19 = String.valueOf(packageInfo2.getLongVersionCode());
                if(!hciy0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hciy0).ensureMutable();
                }
                hcji hcji20 = (hcji)hciy0.b_message;
                s19.getClass();
                hcji20.c |= 0x2000000;
                hcji20.D = s19;
                gcvp2 = gcvp1;
            }
        }
        Context context1 = this.a;
        hciy0.a(gbhd.k(packageManager0, v));
        if(gbhd.y == null) {
            gbhd.y = Boolean.valueOf(packageManager0.hasSystemFeature("android.software.leanback"));
        }
        if(gbhd.y.booleanValue()) {
            hciy0.m(hcjg.b);
        }
        if(gbhd.x == null) {
            gbhd.x = Boolean.valueOf(packageManager0.hasSystemFeature("android.hardware.type.watch"));
        }
        if(gbhd.x.booleanValue()) {
            hciy0.m(hcjg.d);
        }
        gaxl.a();
        if(gbhd.h(context1)) {
            hciy0.m(hcjg.h);
        }
        gaxl.a();
        if(hzmb.j() && bbmq.U(context1, "com.felicanetworks.mfc")) {
            hciy0.m(hcjg.i);
        }
        gaxl.a();
        if(hzmb.i() && cmcu.b(context1, gbhd.v)) {
            hciy0.m(hcjg.j);
        }
        Intent intent0 = new Intent("com.google.android.gms.ocr.ACTION_CARD_CAPTURE");
        intent0.setPackage("com.google.android.gms");
        if(this.c && packageManager0.resolveActivity(intent0, 0x10000) != null) {
            hciy0.m(hcjg.c);
        }
        ConnectivityManager connectivityManager0 = (ConnectivityManager)context1.getSystemService("connectivity");
        gcvf gcvf0 = gcvg.d(connectivityManager0);
        long v21 = gcvf0.a;
        if(!hciy0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hciy0).ensureMutable();
        }
        ((hcji)hciy0.b_message).c |= 0x80000000;
        ((hcji)hciy0.b_message).L = v21;
        long v22 = gcvf0.b;
        if(!hciy0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hciy0).ensureMutable();
        }
        ((hcji)hciy0.b_message).d |= 1;
        ((hcji)hciy0.b_message).M = v22;
        boolean z2 = connectivityManager0 != null && connectivityManager0.isActiveNetworkMetered();
        if(!hciy0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hciy0).ensureMutable();
        }
        ((hcji)hciy0.b_message).d |= 2;
        ((hcji)hciy0.b_message).N = z2;
        hckk hckk0 = this.b;
        if(hckk0 != null) {
            if(!hcjt0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hcjt0).ensureMutable();
            }
            ((hckh)hcjt0.b_message).e = hckk0;
            ((hckh)hcjt0.b_message).b |= 1;
        }
        Long long0 = this.e;
        if(long0 != null) {
            long v23 = (long)long0;
            if(!hcjt0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hcjt0).ensureMutable();
            }
            hckh hckh0 = (hckh)hcjt0.b_message;
            hckh0.b |= 0x20;
            hckh0.j = v23;
        }
        String s20 = gcut.b(context1);
        if(!hcjt0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hcjt0).ensureMutable();
        }
        hckh hckh1 = (hckh)hcjt0.b_message;
        hckh1.b |= 2;
        hckh1.f = s20;
        if(!hcjt0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hcjt0).ensureMutable();
        }
        ((hckh)hcjt0.b_message).g = 2;
        ((hckh)hcjt0.b_message).b |= 4;
        long v24 = packageInfo0 == null ? 0L : ((long)packageInfo0.versionCode);
        if(!hcjt0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hcjt0).ensureMutable();
        }
        hckh hckh2 = (hckh)hcjt0.b_message;
        hckh2.b |= 8;
        hckh2.h = v24;
        long v25 = UUID.randomUUID().getLeastSignificantBits();
        if(!hcjt0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hcjt0).ensureMutable();
        }
        hckh hckh3 = (hckh)hcjt0.b_message;
        hckh3.b |= 16;
        hckh3.i = v25;
        boolean z3 = this.h;
        if(!hcjt0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hcjt0).ensureMutable();
        }
        hckh hckh4 = (hckh)hcjt0.b_message;
        hckh4.b |= 0x80;
        hckh4.k = z3;
        int v26 = this.u;
        if(v26 != 0) {
            if(!hcjt0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hcjt0).ensureMutable();
            }
            ((hckh)hcjt0.b_message).o = v26 - 1;
            ((hckh)hcjt0.b_message).b |= 0x800;
        }
        int v27 = this.g || this.j ? this.n.length : -1;
        int v28 = this.n.length;
        if(!hcjt0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hcjt0).ensureMutable();
        }
        hckh hckh5 = (hckh)hcjt0.b_message;
        hckh5.b |= 0x200;
        hckh5.m = v28;
        int v29 = gcuq.a(this.n, this.m);
        if(!hcjt0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hcjt0).ensureMutable();
        }
        hckh hckh6 = (hckh)hcjt0.b_message;
        hckh6.b |= 0x400;
        hckh6.n = v29;
        if(this.g) {
            for(int v30 = 0; v30 < v27; ++v30) {
                String s21 = this.n[v30].name;
                if(!hcjt0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hcjt0).ensureMutable();
                }
                hckh hckh7 = (hckh)hcjt0.b_message;
                s21.getClass();
                hckh7.b();
                hckh7.l.add(s21);
            }
        }
        if(this.j) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hhdg.a).v_newBuilder();
            hhda hhda0 = gbhd.e(gcvp2);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hhdg hhdg0 = (hhdg)hftp0.b_message;
            hhda0.getClass();
            hhdg0.c = hhda0;
            hhdg0.b |= 1;
            hhdb hhdb0 = gbhd.f(context1, packageInfo0, packageInfo2, gcvp2, v, v19);
            if(v27 >= 0) {
                if(!hhdb0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hhdb0).ensureMutable();
                }
                hhdf hhdf0 = (hhdf)hhdb0.b_message;
                hhdf0.b |= 0x100000;
                hhdf0.t = v27;
            }
            gaxl.a();
            if(hzmb.h()) {
                if(gmcd1 == null) {
                    heal0 = null;
                }
                else {
                    try {
                        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)heal.a).v_newBuilder();
                        ByteString hfsf0 = ((helx)gmcd1.get()).getDefaultInstanceForType();
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        heal heal1 = (heal)hftp1.b_message;
                        heal1.b = 1;
                        heal1.c = hfsf0;
                        heal0 = (heal)hftp1.N_build();
                    label_478:
                        if(heal0 != null) {
                            if(!hhdb0.b_message.isImmutable()) {
                                ((ProtoLiteBuilder)hhdb0).ensureMutable();
                            }
                            ((hhdf)hhdb0.b_message).z = heal0;
                            ((hhdf)hhdb0.b_message).b |= 0x4000000;
                        }
                    }
                    catch(ExecutionException | InterruptedException unused_ex) {
                    }
                    goto label_483;
                }
                goto label_478;
            }
        label_483:
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hhdg hhdg1 = (hhdg)hftp0.b_message;
            hhdf hhdf1 = (hhdf)((ProtoLiteBuilder)hhdb0).N_build();
            hhdf1.getClass();
            hhdg1.d = hhdf1;
            hhdg1.b |= 2;
            if(!hciy0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hciy0).ensureMutable();
            }
            hcji hcji21 = (hcji)hciy0.b_message;
            hhdg hhdg2 = (hhdg)hftp0.N_build();
            hhdg2.getClass();
            hcji21.O = hhdg2;
            hcji21.d |= 4;
        }
        gctm gctm0 = this.r;
        if(gctm0 != null) {
            hcjd hcjd0 = gctm0.i() ? hcjd.c : hcjd.b;
            if(!hciy0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hciy0).ensureMutable();
            }
            ((hcji)hciy0.b_message).S = hcjd0.d;
            ((hcji)hciy0.b_message).d |= 0x20;
        }
        Context context2 = this.a;
        ArrayList arrayList0 = new ArrayList();
        if(gcut.h(context2)) {
            arrayList0.add(hcix.b);
        }
        if(gcut.f(context2)) {
            arrayList0.add(hcix.d);
        }
        if(gcut.g(context2)) {
            arrayList0.add(hcix.c);
        }
        hciy0.l(arrayList0);
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hcjs.a).v_newBuilder();
        if(this.k != null) {
            this.l(hftp2);
        }
        byte[] arr_b = this.q;
        if(arr_b != null) {
            ByteString hfsf1 = ByteString.copyFrom(arr_b);
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            hcjs hcjs0 = (hcjs)hftp2.b_message;
            hcjs0.b |= 2;
            hcjs0.e = hfsf1;
        }
        int v31 = ((hcjs)hftp2.b_message).b;
        if((v31 & 1) != 0 || (v31 & 2) != 0) {
            if(!hcjt0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hcjt0).ensureMutable();
            }
            hckh hckh8 = (hckh)hcjt0.b_message;
            hcjs hcjs1 = (hcjs)hftp2.N_build();
            hcjs1.getClass();
            hckh8.p = hcjs1;
            hckh8.b |= 0x1000;
        }
        try {
            gaxl.a();
            gbhd.J = (int[])gmcd0.get(hvud.b(), TimeUnit.MILLISECONDS);
            if(!hciy0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hciy0).ensureMutable();
            }
            ((hcji)hciy0.b_message).d |= 0x40;
            ((hcji)hciy0.b_message).U = false;
            int[] arr_v1 = gbhd.J;
            if(arr_v1 != null) {
                hcja[] arr_hcja = gbhd.i(arr_v1);
                for(int v32 = 0; v32 < arr_hcja.length; ++v32) {
                    hcja hcja0 = arr_hcja[v32];
                    hciy0.o(hcja0);
                    if(hcja0.equals(hcja.b)) {
                        if(!hciy0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)hciy0).ensureMutable();
                        }
                        ((hcji)hciy0.b_message).d |= 0x40;
                        ((hcji)hciy0.b_message).U = true;
                    }
                }
            }
        }
        catch(ExecutionException | InterruptedException | TimeoutException exception0) {
            Log.w("O2RequestContextBuilder", "Availability check via ocr service failed: ", exception0);
            Context context3 = this.a;
            if(new dkhl(context3).a() != null) {
                if(!hciy0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hciy0).ensureMutable();
                }
                ((hcji)hciy0.b_message).d |= 0x40;
                ((hcji)hciy0.b_message).U = true;
                hciy0.o(hcja.b);
            }
            NfcAdapter nfcAdapter0 = NfcAdapter.getDefaultAdapter(context3);
            if(gbhd.h(context3) && nfcAdapter0.isEnabled()) {
                hciy0.o(hcja.c);
            }
        }
        if(!hcjt0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hcjt0).ensureMutable();
        }
        hckh hckh9 = (hckh)hcjt0.b_message;
        hcji hcji22 = (hcji)((ProtoLiteBuilder)hciy0).N_build();
        hcji22.getClass();
        hckh9.d = hcji22;
        hckh9.c = 10;
        return (hckh)((ProtoLiteBuilder)hcjt0).N_build();
    }

    final void c() {
        synchronized(this) {
            this.K = null;
        }
    }

    private static hcje d(gcvp gcvp0, boolean z, boolean z1) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hcje.a).v_newBuilder();
        String s = gcvp0.b();
        if(s != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hcje hcje0 = (hcje)hftp0.b_message;
            hcje0.b |= 1;
            hcje0.c = s;
        }
        long v = gcvp0.a();
        if(v != -1L) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hcje hcje1 = (hcje)hftp0.b_message;
            hcje1.b |= 4;
            hcje1.e = v;
        }
        if(!TextUtils.isEmpty(gcvp0.c())) {
            String s1 = gcvp0.c();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hcje hcje2 = (hcje)hftp0.b_message;
            s1.getClass();
            hcje2.b |= 2;
            hcje2.d = s1;
        }
        if(!TextUtils.isEmpty(gcvp0.d)) {
            String s2 = gcvp0.d;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hcje hcje3 = (hcje)hftp0.b_message;
            s2.getClass();
            hcje3.b |= 8;
            hcje3.f = s2;
        }
        if(!TextUtils.isEmpty(gcvp0.g)) {
            String s3 = gcvp0.g;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hcje hcje4 = (hcje)hftp0.b_message;
            s3.getClass();
            hcje4.b |= 16;
            hcje4.g = s3;
        }
        int v1 = gcvp0.l;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((hcje)hftv0).b |= 0x80;
        ((hcje)hftv0).j = v1;
        int v2 = gcvp0.k;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        hcje hcje5 = (hcje)hftp0.b_message;
        hcje5.b |= 0x40;
        hcje5.i = v2;
        if(z && !TextUtils.isEmpty(gcvp0.j)) {
            String s4 = gcvp0.j;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hcje hcje6 = (hcje)hftp0.b_message;
            s4.getClass();
            hcje6.b |= 0x20;
            hcje6.h = s4;
        }
        if(z1 && !TextUtils.isEmpty(gcvp0.i)) {
            String s5 = gcvp0.i;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hcje hcje7 = (hcje)hftp0.b_message;
            s5.getClass();
            hcje7.b |= 0x100;
            hcje7.k = s5;
        }
        return (hcje)hftp0.N_build();
    }

    private static hhda e(gcvp gcvp0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hhda.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hhda)hftp0.b_message).c = 0;
        ((hhda)hftp0.b_message).b |= 1;
        if(gcvp0 != null) {
            String s = gcvp0.h;
            if(!TextUtils.isEmpty(s)) {
                switch(gcvp0.a) {
                    case 1: {
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        hhda hhda0 = (hhda)hftp0.b_message;
                        s.getClass();
                        hhda0.b |= 2;
                        hhda0.d = s;
                        break;
                    }
                    case 2: {
                        if(s.length() <= 8) {
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            hhda hhda1 = (hhda)hftp0.b_message;
                            s.getClass();
                            hhda1.b |= 16;
                            hhda1.f = s;
                        }
                        else {
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            hhda hhda2 = (hhda)hftp0.b_message;
                            s.getClass();
                            hhda2.b |= 4;
                            hhda2.e = s;
                        }
                    }
                }
            }
            if(!TextUtils.isEmpty(gcvp0.i)) {
                String s1 = gcvp0.i;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hhda hhda3 = (hhda)hftp0.b_message;
                s1.getClass();
                hhda3.b |= 0x20;
                hhda3.g = s1;
            }
        }
        gaxl.a();
        long v = gaxm.n();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hhda hhda4 = (hhda)hftp0.b_message;
        hhda4.b |= 0x40;
        hhda4.h = v;
        if(!TextUtils.isEmpty(Build.DEVICE)) {
            String s2 = Build.DEVICE;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hhda hhda5 = (hhda)hftp0.b_message;
            s2.getClass();
            hhda5.b |= 0x100;
            hhda5.i = s2;
        }
        if(!TextUtils.isEmpty(Build.PRODUCT)) {
            String s3 = Build.PRODUCT;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hhda hhda6 = (hhda)hftp0.b_message;
            s3.getClass();
            hhda6.b |= 0x200;
            hhda6.j = s3;
        }
        if(!TextUtils.isEmpty(Build.MODEL)) {
            String s4 = Build.MODEL;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hhda hhda7 = (hhda)hftp0.b_message;
            s4.getClass();
            hhda7.b |= 0x400;
            hhda7.k = s4;
        }
        if(!TextUtils.isEmpty(Build.MANUFACTURER)) {
            String s5 = Build.MANUFACTURER;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hhda hhda8 = (hhda)hftp0.b_message;
            s5.getClass();
            hhda8.b |= 0x800;
            hhda8.l = s5;
        }
        if(!TextUtils.isEmpty(Build.FINGERPRINT)) {
            String s6 = Build.FINGERPRINT;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hhda hhda9 = (hhda)hftp0.b_message;
            s6.getClass();
            hhda9.b |= 0x1000;
            hhda9.m = s6;
        }
        if(!TextUtils.isEmpty(Build.VERSION.RELEASE)) {
            String s7 = Build.VERSION.RELEASE;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hhda hhda10 = (hhda)hftp0.b_message;
            s7.getClass();
            hhda10.b |= 0x4000;
            hhda10.n = s7;
        }
        if(!TextUtils.isEmpty(Build.BRAND)) {
            String s8 = Build.BRAND;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hhda hhda11 = (hhda)hftp0.b_message;
            s8.getClass();
            hhda11.b |= 0x100000;
            hhda11.o = s8;
        }
        if(!TextUtils.isEmpty(Build.SERIAL)) {
            String s9 = gcut.c();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hhda hhda12 = (hhda)hftp0.b_message;
            s9.getClass();
            hhda12.b |= 0x200000;
            hhda12.p = s9;
        }
        boolean z = gcvl.e();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hhda hhda13 = (hhda)hftp0.b_message;
        hhda13.b |= 0x800000;
        hhda13.q = z;
        return (hhda)hftp0.N_build();
    }

    private static hhdb f(Context context0, PackageInfo packageInfo0, PackageInfo packageInfo1, gcvp gcvp0, long v, long v1) {
        int v4;
        ProtoLiteBuilder hftp0;
        IllegalArgumentException illegalArgumentException2;
        SecurityException securityException2;
        NullPointerException nullPointerException2;
        hhdb hhdb0 = (hhdb)((ProtoLiteMessage)hhdf.a).v_newBuilder();
        if(packageInfo0 != null) {
            gbhd.g(hhdb0, packageInfo0);
        }
        if(packageInfo1 != null) {
            gbhd.g(hhdb0, packageInfo1);
        }
        boolean z = true;
        if(gbhd.B == null) {
        label_15:
            if(gcvj.e(context0)) {
                try {
                    LocationManager locationManager0 = (LocationManager)context0.getSystemService("location");
                    if(locationManager0 == null) {
                        hftp0 = null;
                        goto label_93;
                    label_77:
                        hftp0 = null;
                    }
                    else {
                        Location location0 = locationManager0.getLastKnownLocation("network");
                        if(location0 == null) {
                            hftp0 = null;
                        }
                        else {
                            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hhdd.a).v_newBuilder();
                            try {
                                double f = location0.getLatitude();
                                if(!hftp1.b_message.isImmutable()) {
                                    hftp1.ensureMutable();
                                }
                                hhdd hhdd1 = (hhdd)hftp1.b_message;
                                hhdd1.b |= 2;
                                hhdd1.d = f;
                                double f1 = location0.getLongitude();
                                if(!hftp1.b_message.isImmutable()) {
                                    hftp1.ensureMutable();
                                }
                                hhdd hhdd2 = (hhdd)hftp1.b_message;
                                hhdd2.b |= 4;
                                hhdd2.e = f1;
                                double f2 = (double)location0.getTime();
                                if(!hftp1.b_message.isImmutable()) {
                                    hftp1.ensureMutable();
                                }
                                hhdd hhdd3 = (hhdd)hftp1.b_message;
                                hhdd3.b |= 16;
                                hhdd3.g = f2;
                                double f3 = location0.getAltitude();
                                if(!hftp1.b_message.isImmutable()) {
                                    hftp1.ensureMutable();
                                }
                                hhdd hhdd4 = (hhdd)hftp1.b_message;
                                hhdd4.b |= 1;
                                hhdd4.c = f3;
                                float f4 = location0.getAccuracy();
                                if(!hftp1.b_message.isImmutable()) {
                                    hftp1.ensureMutable();
                                }
                                hhdd hhdd5 = (hhdd)hftp1.b_message;
                                hhdd5.b |= 8;
                                hhdd5.f = f4;
                                boolean z1 = gcvl.f(context0);
                                if(!hftp1.b_message.isImmutable()) {
                                    hftp1.ensureMutable();
                                }
                                hhdd hhdd6 = (hhdd)hftp1.b_message;
                                hhdd6.b |= 0x20;
                                hhdd6.h = z1;
                                gbhd.B = (hhdd)hftp1.N_build();
                                gbhd.C = v;
                                hftp0 = hftp1;
                            }
                            catch(NullPointerException nullPointerException1) {
                                nullPointerException2 = nullPointerException1;
                                hftp0 = hftp1;
                                goto label_82;
                            }
                            catch(SecurityException securityException1) {
                                securityException2 = securityException1;
                                hftp0 = hftp1;
                                goto label_87;
                            }
                            catch(IllegalArgumentException illegalArgumentException1) {
                                illegalArgumentException2 = illegalArgumentException1;
                                hftp0 = hftp1;
                                goto label_92;
                            }
                        }
                    }
                }
                catch(NullPointerException nullPointerException0) {
                    nullPointerException2 = nullPointerException0;
                    hftp0 = null;
                    Log.e("O2RequestContextBuilder", "NullPointerException getting risk info", nullPointerException2);
                }
                catch(SecurityException securityException0) {
                    securityException2 = securityException0;
                    hftp0 = null;
                    Log.e("O2RequestContextBuilder", "SecurityException getting risk info", securityException2);
                }
                catch(IllegalArgumentException illegalArgumentException0) {
                    goto label_90;
                }
            }
            else {
                goto label_77;
            label_82:
                Log.e("O2RequestContextBuilder", "NullPointerException getting risk info", nullPointerException2);
                goto label_93;
            label_87:
                Log.e("O2RequestContextBuilder", "SecurityException getting risk info", securityException2);
                goto label_93;
            label_90:
                illegalArgumentException2 = illegalArgumentException0;
                hftp0 = null;
            label_92:
                Log.e("O2RequestContextBuilder", "IllegalArgumentException getting risk info", illegalArgumentException2);
            }
        }
        else {
            long v2 = v - gbhd.C;
            gaxl.a();
            if(v2 <= gaxm.t()) {
                hhdd hhdd0 = gbhd.B;
                gftb.check(hhdd0);
                hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hhdd0).jf(5, null);
                hftp0.X(((ProtoLiteMessage)hhdd0));
                goto label_93;
            }
            goto label_15;
        }
    label_93:
        if(hftp0 != null) {
            if(!hhdb0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hhdb0).ensureMutable();
            }
            hhdf hhdf0 = (hhdf)hhdb0.b_message;
            hhdd hhdd7 = (hhdd)hftp0.N_build();
            hhdd7.getClass();
            hhdf0.g = hhdd7;
            hhdf0.b |= 16;
        }
        if(gbhd.z == null) {
        label_109:
            Intent intent0 = jwe.b(context0, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"), 2);
            if(intent0 == null) {
                v4 = -1;
            }
            else {
                int v5 = intent0.getIntExtra("level", -1);
                int v6 = intent0.getIntExtra("scale", -1);
                if(v6 > 0) {
                    Integer integer1 = (int)(v5 * 100 / v6);
                    gbhd.z = integer1;
                    gbhd.A = v;
                    v4 = (int)integer1;
                }
                else {
                    v4 = -1;
                }
            }
        }
        else {
            long v3 = v - gbhd.A;
            gaxl.a();
            if(v3 <= ((long)(((int)(((Integer)gcjh.o.a())))))) {
                Integer integer0 = gbhd.z;
                gftb.check(integer0);
                v4 = (int)integer0;
                goto label_122;
            }
            goto label_109;
        }
    label_122:
        if(v4 != -1) {
            if(!hhdb0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hhdb0).ensureMutable();
            }
            hhdf hhdf1 = (hhdf)hhdb0.b_message;
            hhdf1.b |= 1;
            hhdf1.d = v4;
        }
        long v7 = (long)TimeZone.getDefault().getRawOffset();
        if(!hhdb0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hhdb0).ensureMutable();
        }
        hhdf hhdf2 = (hhdf)hhdb0.b_message;
        hhdf2.b |= 4;
        hhdf2.f = v7;
        String s = TimeZone.getDefault().getDisplayName();
        if(!hhdb0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hhdb0).ensureMutable();
        }
        hhdf hhdf3 = (hhdf)hhdb0.b_message;
        s.getClass();
        hhdf3.b |= 0x80000;
        hhdf3.s = s;
        if(gbhd.D == null) {
        label_155:
            boolean z3 = Settings.Global.getInt(context0.getContentResolver(), "adb_enabled", 0) == 1;
            if(!hhdb0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hhdb0).ensureMutable();
            }
            hhdf hhdf5 = (hhdf)hhdb0.b_message;
            hhdf5.b |= 0x20;
            hhdf5.h = z3;
            gbhd.D = Boolean.valueOf(z3);
            gbhd.E = v;
        }
        else {
            long v9 = v - gbhd.E;
            gaxl.a();
            if(v9 <= gaxm.r()) {
                Boolean boolean0 = gbhd.D;
                gftb.check(boolean0);
                boolean z2 = boolean0.booleanValue();
                if(!hhdb0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hhdb0).ensureMutable();
                }
                hhdf hhdf4 = (hhdf)hhdb0.b_message;
                hhdf4.b |= 0x20;
                hhdf4.h = z2;
                goto label_163;
            }
            goto label_155;
        }
    label_163:
        if(gbhd.F == null) {
        label_176:
            if(Settings.Secure.getInt(context0.getContentResolver(), "install_non_market_apps", 0) != 1) {
                z = false;
            }
            if(!hhdb0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hhdb0).ensureMutable();
            }
            hhdf hhdf7 = (hhdf)hhdb0.b_message;
            hhdf7.b |= 0x40;
            hhdf7.i = z;
            gbhd.F = Boolean.valueOf(z);
            gbhd.G = v;
        }
        else {
            long v10 = v - gbhd.G;
            gaxl.a();
            if(v10 <= gaxm.r()) {
                Boolean boolean1 = gbhd.F;
                gftb.check(boolean1);
                boolean z4 = boolean1.booleanValue();
                if(!hhdb0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hhdb0).ensureMutable();
                }
                hhdf hhdf6 = (hhdf)hhdb0.b_message;
                hhdf6.b |= 0x40;
                hhdf6.i = z4;
                goto label_185;
            }
            goto label_176;
        }
    label_185:
        Locale locale0 = context0.getResources().getConfiguration().locale;
        try {
            String s1 = locale0.getISO3Language();
            if(!hhdb0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hhdb0).ensureMutable();
            }
            hhdf hhdf8 = (hhdf)hhdb0.b_message;
            s1.getClass();
            hhdf8.b |= 0x80;
            hhdf8.j = s1;
        }
        catch(MissingResourceException unused_ex) {
        }
        String s2 = locale0.getLanguage();
        if(!hhdb0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hhdb0).ensureMutable();
        }
        hhdf hhdf9 = (hhdf)hhdb0.b_message;
        s2.getClass();
        hhdf9.b |= 0x100;
        hhdf9.k = s2;
        String s3 = locale0.getCountry();
        if(!hhdb0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hhdb0).ensureMutable();
        }
        hhdf hhdf10 = (hhdf)hhdb0.b_message;
        s3.getClass();
        hhdf10.b |= 0x400;
        hhdf10.n = s3;
        String s4 = locale0.toString();
        if(!hhdb0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hhdb0).ensureMutable();
        }
        hhdf hhdf11 = (hhdf)hhdb0.b_message;
        s4.getClass();
        hhdf11.b |= 0x200;
        hhdf11.m = s4;
        ArrayList arrayList0 = gcvg.b();
        int v11 = arrayList0.size();
        for(int v8 = 0; v8 < v11; ++v8) {
            hhdb0.k(((InetAddress)arrayList0.get(v8)).getHostAddress());
        }
        if(gcvp0 != null) {
            if(!TextUtils.isEmpty(gcvp0.f)) {
                String s5 = gcvp0.f;
                if(!hhdb0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hhdb0).ensureMutable();
                }
                hhdf hhdf12 = (hhdf)hhdb0.b_message;
                s5.getClass();
                hhdf12.b |= 0x2000;
                hhdf12.o = s5;
            }
            if(!TextUtils.isEmpty(gcvp0.c())) {
                String s6 = gcvp0.c();
                if(!hhdb0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hhdb0).ensureMutable();
                }
                hhdf hhdf13 = (hhdf)hhdb0.b_message;
                s6.getClass();
                hhdf13.b |= 0x4000;
                hhdf13.p = s6;
            }
            int v12 = gcvp0.a;
            if(!hhdb0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hhdb0).ensureMutable();
            }
            hhdf hhdf14 = (hhdf)hhdb0.b_message;
            hhdf14.b |= 0x20000;
            hhdf14.q = v12;
        }
        if(!hhdb0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hhdb0).ensureMutable();
        }
        hhdf hhdf15 = (hhdf)hhdb0.b_message;
        hhdf15.b |= 0x40000;
        hhdf15.r = v1;
        boolean z5 = gcvl.c(context0);
        if(!hhdb0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hhdb0).ensureMutable();
        }
        hhdf hhdf16 = (hhdf)hhdb0.b_message;
        hhdf16.b |= 0x400000;
        hhdf16.v = z5;
        boolean z6 = gcvl.g(context0);
        if(!hhdb0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hhdb0).ensureMutable();
        }
        hhdf hhdf17 = (hhdf)hhdb0.b_message;
        hhdf17.b |= 0x800000;
        hhdf17.w = z6;
        boolean z7 = gcvl.d(context0);
        if(!hhdb0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hhdb0).ensureMutable();
        }
        hhdf hhdf18 = (hhdf)hhdb0.b_message;
        hhdf18.b |= 2;
        hhdf18.e = z7;
        boolean z8 = ActivityManager.isUserAMonkey();
        if(!hhdb0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hhdb0).ensureMutable();
        }
        hhdf hhdf19 = (hhdf)hhdb0.b_message;
        hhdf19.b |= 0x200000;
        hhdf19.u = z8;
        int v13 = gcvl.a(context0);
        if(!hhdb0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hhdb0).ensureMutable();
        }
        hhdf hhdf20 = (hhdf)hhdb0.b_message;
        hhdf20.b |= 0x1000000;
        hhdf20.x = v13;
        hhdc hhdc0 = gcvl.b(context0);
        if(!hhdb0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hhdb0).ensureMutable();
        }
        hhdf hhdf21 = (hhdf)hhdb0.b_message;
        hhdc0.getClass();
        hhdf21.y = hhdc0;
        hhdf21.b |= 0x2000000;
        return hhdb0;
    }

    private static void g(hhdb hhdb0, PackageInfo packageInfo0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hhde.a).v_newBuilder();
        if(!TextUtils.isEmpty(packageInfo0.packageName)) {
            String s = packageInfo0.packageName;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hhde hhde0 = (hhde)hftp0.b_message;
            s.getClass();
            hhde0.b |= 1;
            hhde0.c = s;
        }
        String s1 = Integer.toString(packageInfo0.versionCode);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hhde hhde1 = (hhde)hftp0.b_message;
        s1.getClass();
        hhde1.b |= 2;
        hhde1.d = s1;
        long v = packageInfo0.firstInstallTime;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hhde hhde2 = (hhde)hftp0.b_message;
        hhde2.b |= 8;
        hhde2.f = v;
        long v1 = packageInfo0.lastUpdateTime;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hhde hhde3 = (hhde)hftp0.b_message;
        hhde3.b |= 4;
        hhde3.e = v1;
        ApplicationInfo applicationInfo0 = packageInfo0.applicationInfo;
        if(applicationInfo0 != null && !TextUtils.isEmpty(applicationInfo0.sourceDir)) {
            String s2 = applicationInfo0.sourceDir;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hhde hhde4 = (hhde)hftp0.b_message;
            s2.getClass();
            hhde4.b |= 16;
            hhde4.g = s2;
        }
        hhdb0.l(hftp0);
    }

    private static boolean h(Context context0) {
        return NfcAdapter.getDefaultAdapter(context0) != null;
    }

    private static hcja[] i(int[] arr_v) {
        hcja[] arr_hcja = new hcja[arr_v.length];
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            if(v1 == 1) {
                arr_hcja[v] = hcja.b;
            }
            else if(v1 == 2) {
                arr_hcja[v] = hcja.c;
            }
        }
        return arr_hcja;
    }

    private static void j(HashMap hashMap0, List list0, hciq hciq0) {
        if(!list0.isEmpty()) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hcir.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((hcir)hftv0).c = hciq0.f;
            ((hcir)hftv0).b |= 1;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            hcir.b(((hcir)hftp0.b_message));
            hcir hcir0 = (hcir)hftp0.N_build();
            int v = list0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                String s = ((ResolveInfo)list0.get(v1)).activityInfo.packageName;
                List list1 = (List)hashMap0.get(s);
                if(list1 == null) {
                    list1 = new ArrayList();
                    hashMap0.put(s, list1);
                }
                list1.add(hcir0);
            }
        }
    }

    private static gged_interceptors k(PackageManager packageManager0, long v) {
        gged_interceptors gged0 = gbhd.H;
        if(gged0 != null) {
            long v1 = v - gbhd.I;
            gaxl.a();
            if(v1 > ((long)(((int)(((Integer)gcjh.s.a())))))) {
                return gged0;
            }
        }
        List list0 = packageManager0.queryIntentActivities(new Intent("com.google.android.payments.standard.AUTHENTICATE_V1"), 0);
        List list1 = packageManager0.queryIntentActivities(new Intent("com.google.android.payments.standard.REDIRECT_CAPTURE_V1"), 0);
        List list2 = packageManager0.queryIntentServices(new Intent("com.google.android.wallet.carrierbilling.operatorproperties.BIND"), 0);
        gaxl.a();
        List list3 = hzlj.c() ? packageManager0.queryIntentActivities(new Intent("android.intent.action.VIEW").setData(Uri.parse("upi://pay")), 0) : ggna.a;
        HashMap hashMap0 = ggkm.k(list0.size() + list1.size() + list2.size() + list3.size());
        gbhd.j(hashMap0, list0, hciq.b);
        gbhd.j(hashMap0, list1, hciq.d);
        hciq hciq0 = hciq.c;
        if(!list2.isEmpty()) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hcir.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((hcir)hftv0).c = hciq0.f;
            ((hcir)hftv0).b |= 1;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            hcir.b(((hcir)hftp0.b_message));
            hcir hcir0 = (hcir)hftp0.N_build();
            int v2 = list2.size();
            for(int v3 = 0; v3 < v2; ++v3) {
                String s = ((ResolveInfo)list2.get(v3)).serviceInfo.packageName;
                List list4 = (List)hashMap0.get(s);
                if(list4 == null) {
                    list4 = new ArrayList();
                    hashMap0.put(s, list4);
                }
                list4.add(hcir0);
            }
        }
        gbhd.j(hashMap0, list3, hciq.e);
        ggdy ggdy0 = new ggdy();
        for(Object object0: hashMap0.keySet()) {
            String s1 = (String)object0;
            hcis hcis0 = (hcis)((ProtoLiteMessage)hcit.a).v_newBuilder();
            if(!hcis0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hcis0).ensureMutable();
            }
            hcit hcit0 = (hcit)hcis0.b_message;
            s1.getClass();
            hcit0.b |= 1;
            hcit0.c = s1;
            try {
                String s2 = Integer.toString(packageManager0.getPackageInfo(s1, 0).versionCode);
                if(!hcis0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hcis0).ensureMutable();
                }
                hcit hcit1 = (hcit)hcis0.b_message;
                s2.getClass();
                hcit1.b |= 2;
                hcit1.d = s2;
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
            }
            hcis0.a(((List)hashMap0.get(s1)));
            ggdy0.i(((hcit)((ProtoLiteBuilder)hcis0).N_build()));
        }
        gged_interceptors gged1 = ggdy0.h();
        gbhd.H = gged1;
        gbhd.I = v;
        return gged1;
    }

    private final void l(ProtoLiteBuilder hftp0) {
        bmei bmei0 = this.k;
        if(bmei0 != null) {
            evql evql0 = bmei0.g();
            try {
                boolean z = ((Boolean)evrg.o(evql0, this.l, TimeUnit.MILLISECONDS)).booleanValue();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hcjs hcjs0 = (hcjs)hftp0.b_message;
                hcjs0.b |= 1;
                hcjs0.d = z;
            }
            catch(ExecutionException | InterruptedException | TimeoutException exception0) {
                Log.e("O2RequestContextBuilder", "IsUVPAA call failed", exception0.getCause());
            }
        }
    }
}

