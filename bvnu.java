import android.app.ActivityManager.MemoryInfo;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build.VERSION;
import android.os.Build;
import android.util.DisplayMetrics;
import j..time.Duration;
import j..util.DesugarCollections;
import j..util.Map.-EL;
import java.util.TimeZone;

public final class bvnu {
    public static final bboh a;
    public final Context b;
    public final bvpl c;
    public final bwbs d;
    public final bvqi e;
    public final frli f;

    static {
        bvnu.a = bboh.b("FeatureDrops", bbcu.eN);
    }

    public bvnu(Context context0, bvpl bvpl0, bvqi bvqi0, bwbs bwbs0, frli frli0) {
        ibuq.f(context0, "context");
        ibuq.f(bvqi0, "screenRepository");
        ibuq.f(bwbs0, "assetUtil");
        super();
        this.b = context0;
        this.c = bvpl0;
        this.e = bvqi0;
        this.d = bwbs0;
        this.f = frli0;
    }

    public final hgnp a() {
        int v3;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hgnp.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        Context context0 = this.b;
        int v = 0;
        String s = jyw.a(context0.getResources().getConfiguration()).g(0).toLanguageTag();
        ibuq.e(s, "getLocaleLanguageTag(...)");
        ibuq.f(s, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hgnp hgnp0 = (hgnp)hftp0.b_message;
        s.getClass();
        hgnp0.d = s;
        String s1 = Build.MANUFACTURER;
        ibuq.e(s1, "getManufacturer(...)");
        ibuq.f(s1, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hgnp hgnp1 = (hgnp)hftp0.b_message;
        s1.getClass();
        hgnp1.k = s1;
        String s2 = Build.BRAND;
        ibuq.e(s2, "getBrand(...)");
        ibuq.f(s2, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hgnp hgnp2 = (hgnp)hftp0.b_message;
        s2.getClass();
        hgnp2.i = s2;
        String s3 = Build.MODEL;
        ibuq.e(s3, "getModel(...)");
        ibuq.f(s3, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hgnp hgnp3 = (hgnp)hftp0.b_message;
        s3.getClass();
        hgnp3.j = s3;
        int v1 = Build.VERSION.SDK_INT;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hgnp)hftp0.b_message).b = v1;
        String s4 = Build.VERSION.RELEASE;
        ibuq.e(s4, "RELEASE");
        ibuq.f(s4, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        s4.getClass();
        ((hgnp)hftv0).c = s4;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hgnp)hftp0.b_message).e = 0xF1B18AD;
        boolean z = bbnp.j(context0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hgnp)hftp0.b_message).f = z;
        ActivityManager activityManager0 = (ActivityManager)context0.getSystemService("activity");
        ActivityManager.MemoryInfo activityManager$MemoryInfo0 = new ActivityManager.MemoryInfo();
        activityManager0.getMemoryInfo(activityManager$MemoryInfo0);
        long v2 = activityManager$MemoryInfo0.totalMem / 0x400L;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hgnp)hftp0.b_message).g = (int)(v2 / 0x400L);
        String s5 = TimeZone.getDefault().getID();
        ibuq.e(s5, "getID(...)");
        ibuq.f(s5, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hgnp hgnp4 = (hgnp)hftp0.b_message;
        s5.getClass();
        hgnp4.h = s5;
        DisplayManager displayManager0 = (DisplayManager)context0.getSystemService("display");
        if(displayManager0 == null) {
            v3 = 0;
        }
        else {
            Point point0 = displayManager0.getStableDisplaySize();
            v3 = Math.max(point0.x, point0.y);
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hgnp)hftp0.b_message).m = v3;
        DisplayManager displayManager1 = (DisplayManager)context0.getSystemService("display");
        if(displayManager1 != null) {
            Point point1 = displayManager1.getStableDisplaySize();
            v = Math.min(point1.x, point1.y);
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hgnp)hftp0.b_message).n = v;
        String s6 = htwe.a.b().a();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hgnp)hftp0.b_message).p = s6;
        String s7 = bweg.c(context0);
        ibuq.e(s7, "getDeviceCountry(...)");
        ibuq.f(s7, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hgnp hgnp5 = (hgnp)hftp0.b_message;
        s7.getClass();
        hgnp5.q = s7;
        String s8 = htwe.c();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hgnp)hftp0.b_message).r = s8;
        if(htwh.a.b().e()) {
            String s9 = bwex.b(context0);
            ibuq.e(s9, "getLocaleCountryCode(...)");
            ibuq.f(s9, "value");
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hgnp hgnp6 = (hgnp)hftp0.b_message;
            s9.getClass();
            hgnp6.l = s9;
        }
        int v4 = DisplayMetrics.DENSITY_DEVICE_STABLE;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hgnp)hftp0.b_message).o = v4;
        ProtoLiteMessage hftv1 = hftp0.N_build();
        ibuq.e(hftv1, "build(...)");
        return (hgnp)hftv1;
    }

    public final hgny b() {
        switch(this.b.getResources().getConfiguration().uiMode & 0x30) {
            case 16: {
                return hgny.b;
            }
            case 0x20: {
                return hgny.c;
            }
            default: {
                return hgny.a;
            }
        }
    }

    static Object c(bvnu bvnu0, String s, String s1, ibrl ibrl0) {
        Object object4;
        hfwn hfwn1;
        bvnu bvnu1;
        bvnt bvnt0;
        if((ibrl0 instanceof bvnt)) {
            bvnt0 = (bvnt)ibrl0;
            int v = bvnt0.d;
            if((v & 0x80000000) == 0) {
                bvnt0 = new bvnt(bvnu0, ibrl0);
            }
            else {
                bvnt0.d = v - 0x80000000;
            }
        }
        else {
            bvnt0 = new bvnt(bvnu0, ibrl0);
        }
        Object object0 = bvnt0.b;
        Object object1 = ibrx.a;
        switch(bvnt0.d) {
            case 0: {
                ibnx.b(object0);
                if(bbpr.c(bvnu0.b)) {
                    hfwn hfwn0 = hfyn.h(System.currentTimeMillis());
                    ibuq.e(hfwn0, "fromMillis(...)");
                    gmcd gmcd0 = bvnu0.f.a();
                    ibuq.e(gmcd0, "getData(...)");
                    bvnt0.a = bvnu0;
                    bvnt0.e = s;
                    bvnt0.f = s1;
                    bvnt0.g = hfwn0;
                    bvnt0.d = 1;
                    Object object2 = icpu.c(gmcd0, bvnt0);
                    if(object2 != object1) {
                        bvnu1 = bvnu0;
                        hfwn1 = hfwn0;
                        object0 = object2;
                        goto label_37;
                    }
                    return object1;
                }
                return null;
            }
            case 1: {
                hfwn1 = bvnt0.g;
                s1 = bvnt0.f;
                s = bvnt0.e;
                bvnu1 = (bvnu)bvnt0.a;
                ibnx.b(object0);
            label_37:
                hgnv hgnv0 = (hgnv)Map.-EL.getOrDefault(DesugarCollections.unmodifiableMap(((hgnx)object0).c), s, hgnv.a);
                hfwn hfwn2 = hgnv0.d == null ? hfwn.a : hgnv0.d;
                ibuq.e(hfwn2, "getTimestamp(...)");
                Duration duration0 = Duration.between(hfyo.d(hfwn2), hfyo.d(hfwn1));
                ibuq.e(duration0, "between(...)");
                if(duration0.compareTo(Duration.ofSeconds(htwh.a.b().a())) < 0) {
                    Object object3 = hgnv0.c;
                    return object3 == null ? hgnr.a : object3;
                }
                if(htwh.c()) {
                    gdqb gdqb0 = gdsp.d("getCurrentDropsCampaignStatusFromBackend", gdsq.a);
                    try {
                        object4 = bvnu1.e(s, s1);
                    }
                    catch(Throwable throwable0) {
                        ibsx.a(gdqb0, throwable0);
                        throw throwable0;
                    }
                    ibsx.a(gdqb0, null);
                }
                else {
                    object4 = bvnu1.e(s, s1);
                }
                if(object4 != null) {
                    bvno bvno0 = new bvno(new bvnn(s, ((hgnr)object4), hfwn1));
                    gmcd gmcd1 = bvnu1.f.b(bvno0, gmap.a);
                    bvnt0.a = object4;
                    bvnt0.e = null;
                    bvnt0.f = null;
                    bvnt0.g = null;
                    bvnt0.d = 2;
                    return icpu.c(gmcd1, bvnt0) == object1 ? object1 : object4;
                }
                return null;
            }
            case 2: {
                Object object5 = (hgnr)bvnt0.a;
                ibnx.b(object0);
                return object5;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final Object d(String s, ibrl ibrl0) {
        return bvnu.c(this, s, "GOOGLE_SETTINGS", ibrl0);
    }

    private final hgnr e(String s, String s1) {
        hgnr hgnr0;
        try {
            bvpl bvpl0 = this.c;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hgnq.a).v_newBuilder();
            ibuq.f(hftp0, "builder");
            hgnp hgnp0 = this.a();
            ibuq.f(hgnp0, "value");
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hgnq hgnq0 = (hgnq)hftp0.b_message;
            hgnp0.getClass();
            hgnq0.c = hgnp0;
            hgnq0.b |= 1;
            ibuq.f(s1, "value");
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hgnq hgnq1 = (hgnq)hftp0.b_message;
            s1.getClass();
            hgnq1.d = s1;
            ProtoLiteMessage hftv0 = hftp0.N_build();
            ibuq.e(hftv0, "build(...)");
            hgnq hgnq2 = (hgnq)hftv0;
            ibuq.f(hgnq2, "request");
            ibuq.f(s, "accountName");
            bvpn bvpn0 = new bvpn(bvpl0.a, cmlp.a, ckhq.b);
            if(!htwh.c()) {
                return bvpn0.a(bvpl.a(s), hgnq2);
            }
            gdqb gdqb0 = gdsp.d("flexagonApiClient.getCurrentDropsCampaignStatus", gdsq.a);
            try {
                hgnr0 = bvpn0.a(bvpl.a(s), hgnq2);
            }
            catch(Throwable throwable0) {
                ibsx.a(gdqb0, throwable0);
                throw throwable0;
            }
            ibsx.a(gdqb0, null);
            return hgnr0;
        }
        catch(iapl | acse | IllegalArgumentException unused_ex) {
            return null;
        }
    }
}

