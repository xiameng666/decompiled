import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public final class fwun implements fwyl {
    public static final bboh a;
    public fwxq b;
    public fvar c;
    public final fwrk d;
    public final Context e;
    public final fwyb f;
    public final fvwz g;
    public final fwyj h;
    public final fwzd i;
    public final gful_cronetEngineProvider j;
    private final Random k;

    static {
        fwun.a = bboh.b("GlsClientGrpc", bbcu.g);
    }

    public fwun(Context context0, fwyb fwyb0, fwyj fwyj0, fwzd fwzd0, fvwz fvwz0, gful_cronetEngineProvider gful0) {
        this.k = new Random();
        this.e = context0;
        this.f = fwyb0;
        this.h = fwyj0;
        this.i = fwzd0;
        this.g = fvwz0;
        this.d = new fwrk();
        this.j = gful0;
    }

    @Override  // fwzv
    public final gmcd a(fvtr fvtr0) {
        List list0 = fvtr0.d.a();
        return glzd.f(this.h.c.e(new fwum(this, fvtr0, (list0.isEmpty() ? -1 : ((int)(((Integer)list0.get(this.k.nextInt(list0.size())))))))), new fwuk(this), this.h.a);
    }

    @Override  // fwyy
    public final gwts b() {
        boolean z = huvd.a.f().C();
        Locale locale0 = Locale.getDefault();
        String s = locale0 == null ? null : locale0.toString();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwts.a).v_newBuilder();
        String s1 = Integer.toString(bbrc.f());
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwts gwts0 = (gwts)hftp0.b_message;
        s1.getClass();
        gwts0.b |= 1;
        gwts0.c = s1;
        String s2 = Build.FINGERPRINT == null ? "android" : "android/" + Build.FINGERPRINT;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gwts)hftv0).b |= 2;
        ((gwts)hftv0).d = s2;
        if(s != null) {
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwts gwts1 = (gwts)hftp0.b_message;
            gwts1.b |= 16;
            gwts1.f = s;
        }
        if(!z) {
            String s3 = fwuf.a();
            if(!TextUtils.isEmpty(s3)) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gwts gwts2 = (gwts)hftp0.b_message;
                s3.getClass();
                gwts2.b |= 4;
                gwts2.e = s3;
            }
        }
        return (gwts)hftp0.N_build();
    }

    public final void c() {
        cjlz.a(this.e).k("android:fine_location", Process.myUid(), "com.google.android.gms", "location_nlp_network", null);
    }

    @Override  // fwyl
    public final void d(boolean z, boolean z1, boolean z2, boolean z3, boolean z4, int v) {
        fwrk fwrk0 = this.d;
        fwrk0.h = z4;
        int v1 = 0;
        int v2 = (fwrk0.f || fwrk0.d) && z || fwrk0.e && (z2 || z1 || z && fwrk0.k != v) ? 1 : 0;
        if(huvd.k()) {
            if(fwrk0.g != z3) {
                v1 = 1;
            }
            v2 |= v1;
        }
        if(v2 != 0) {
            fwrk0.c();
        }
        fwrk0.e = z;
        fwrk0.d = z1;
        fwrk0.f = z2;
        fwrk0.g = z3;
        if(z) {
            fwrk0.k = v;
        }
    }

    @Override  // fwyl
    public final void e(boolean z) {
        this.d.j = z;
    }

    @Override  // fwzn
    public final boolean f() {
        if(!huvd.a.f().y()) {
            fwrk fwrk0 = this.d;
            long v = SystemClock.elapsedRealtime();
            int v1 = fwrk0.e || fwrk0.d || fwrk0.f ? 1 : 0;
            if(huvd.k()) {
                v1 |= fwrk0.g;
            }
            if(v1 != 0) {
                long v2 = v - fwrk0.b;
                if(huxh.a.c().d()) {
                    return !fwrk0.c || v2 >= fwrk0.a() ? true : false;
                }
                return !fwrk0.i && fwrk0.c && v2 < fwrk0.a() ? false : true;
            }
            return false;
        }
        return true;
    }

    @Override  // fwyy
    public final gmcd g(int v, ByteString hfsf0, fwxu fwxu0) {
        Boolean boolean0 = Boolean.valueOf(false);
        if(huvd.k() && this.d.g) {
            return gmbu.i(boolean0);
        }
        int v1 = hfsf0.size();
        if(!fwxu0.b(((long)v1))) {
            return gmbu.i(boolean0);
        }
        this.c();
        fwuj fwuj0 = new fwuj(this, v, hfsf0, fwxu0, v1);
        return this.h.c.e(fwuj0);
    }
}

