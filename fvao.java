import android.content.Context;
import android.net.Network;
import android.os.Build.VERSION;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

public final class fvao implements fvar {
    public static final bboh a;
    public final fwzd b;
    public final Context c;
    public final int d;
    public final boolean e;
    public final gful_cronetEngineProvider f;
    public final gful_cronetEngineProvider g;
    public Network h;
    public gxto i;
    private final gful_cronetEngineProvider j;
    private final Executor k;

    static {
        fvao.a = bboh.a("GmsCoreVoilaTileGrpc");
    }

    public fvao(Context context0, fwzd fwzd0, int v, int v1, boolean z, gful_cronetEngineProvider gful0) {
        this.c = context0;
        this.j = gfus.a(((gful_cronetEngineProvider)new fvak(context0, v, v1)));
        this.b = fwzd0;
        this.e = z;
        this.f = gfus.a(((gful_cronetEngineProvider)new fval(context0, v1)));
        this.k = new bblp(3, 10);
        this.d = v1;
        this.g = gful0;
    }

    public fvao(Context context0, fwzd fwzd0, int v, boolean z) {
        this(context0, fwzd0, -1, v, z, ((gful_cronetEngineProvider)new fvaj()));
    }

    public final void a(gxsw gxsw0) {
        for(Object object0: gxsw0.e) {
            if(((gxti)object0).c == 5) {
                int v = cjlz.a(this.c).k("android:coarse_location", Process.myUid(), "com.google.android.gms", "location_nlp_network", null);
                if(v != 0) {
                    throw new acse("Bluesky noteOp failed: " + v);
                }
                break;
            }
        }
    }

    @Override  // fvar
    public final gxsx b(gxsw gxsw0, int v, String s) {
        gxsx gxsx0;
        gxsw gxsw2;
        if(huvd.a.f().ab()) {
            try {
                long v1 = SystemClock.elapsedRealtime();
                return (gxsx)((glyq)glzd.f(gmbu.n(new fvah(this, gxsw0, v, s), this.k), new fvai(this, v1, s), gmap.a)).u();
            }
            catch(InterruptedException interruptedException0) {
                Thread.currentThread().interrupt();
                throw new iapl(iapk.m.e(interruptedException0));
            }
            catch(ExecutionException executionException0) {
                throw new iapl(iapk.d(executionException0));
            }
        }
        baqr baqr0 = new baqr();
        baqr0.e = "com.google.android.gms";
        String s1 = iaph.c.name();
        long v2 = SystemClock.elapsedRealtime();
        if((gxsw0.b & 1) == 0) {
            ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)gxsw0).jf(5, null);
            hftp2.X(((ProtoLiteMessage)gxsw0));
            ProtoLiteBuilder hftp3 = fvao.c();
            if(!((gxsv)hftp2).b_message.isImmutable()) {
                ((ProtoLiteBuilder)(((gxsv)hftp2))).ensureMutable();
            }
            gxsw gxsw3 = (gxsw)((gxsv)hftp2).b_message;
            gxsr gxsr1 = (gxsr)hftp3.N_build();
            gxsr1.getClass();
            gxsw3.c = gxsr1;
            gxsw3.b |= 1;
            gxsw2 = (gxsw)((ProtoLiteBuilder)(((gxsv)hftp2))).N_build();
        }
        else {
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gxsw0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)gxsw0));
            ProtoLiteBuilder hftp1 = fvao.c();
            hftp1.X(((ProtoLiteMessage)(gxsw0.c == null ? gxsr.a : gxsw0.c)));
            if(!((gxsv)hftp0).b_message.isImmutable()) {
                ((ProtoLiteBuilder)(((gxsv)hftp0))).ensureMutable();
            }
            gxsw gxsw1 = (gxsw)((gxsv)hftp0).b_message;
            gxsr gxsr0 = (gxsr)hftp1.N_build();
            gxsr0.getClass();
            gxsw1.c = gxsr0;
            gxsw1.b |= 1;
            gxsw2 = (gxsw)((ProtoLiteBuilder)(((gxsv)hftp0))).N_build();
        }
        try {
            try {
                if(this.e) {
                    this.a(gxsw2);
                }
                switch(v - 1) {
                    case 0: {
                        gxsx0 = new fvau(((fvau)this.j.mr()), cmlp.a, ckii.b).a(baqr0, gxsw2);
                        break;
                    }
                    case 2: {
                        gxsx0 = new fvau(((fvau)this.j.mr()), cmlp.a, ckij.b).a(baqr0, gxsw2);
                        break;
                    }
                    default: {
                        gxsx0 = new fvau(((fvau)this.j.mr()), cmlp.a, ckig.b).a(baqr0, gxsw2);
                    }
                }
            }
            catch(iapl iapl0) {
                s1 = iapk.d(iapl0).t.name();
                throw iapl0;
            }
            catch(acse acse0) {
                s1 = iaph.q.name();
                throw new iapl(iapk.j.e(acse0));
            }
        }
        catch(Throwable throwable0) {
            if(v2 != -1L) {
                long v3 = SystemClock.elapsedRealtime() - v2;
                this.b.b(s1, "voilatile", s);
                this.b.f(((double)v3), "voilatile", s);
            }
            throw throwable0;
        }
        String s2 = iaph.a.name();
        if(v2 != -1L) {
            long v4 = SystemClock.elapsedRealtime() - v2;
            this.b.b(s2, "voilatile", s);
            this.b.f(((double)v4), "voilatile", s);
        }
        return gxsx0;
    }

    public static final ProtoLiteBuilder c() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gxsq.a).v_newBuilder();
        String s = Build.VERSION.RELEASE;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        s.getClass();
        ((gxsq)hftv0).b = s;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gxsq)hftp0.b_message).c = "25.34.34 (190400-{{cl}})";
        if(Build.MANUFACTURER != null) {
            String s1 = Build.MANUFACTURER;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gxsq gxsq0 = (gxsq)hftp0.b_message;
            s1.getClass();
            gxsq0.d = s1;
        }
        if(Build.BRAND != null) {
            String s2 = Build.BRAND;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gxsq gxsq1 = (gxsq)hftp0.b_message;
            s2.getClass();
            gxsq1.e = s2;
        }
        if(Build.PRODUCT != null) {
            String s3 = Build.PRODUCT;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gxsq gxsq2 = (gxsq)hftp0.b_message;
            s3.getClass();
            gxsq2.f = s3;
        }
        if(Build.MODEL != null) {
            String s4 = Build.MODEL;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gxsq gxsq3 = (gxsq)hftp0.b_message;
            s4.getClass();
            gxsq3.g = s4;
        }
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gxsr.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gxsr gxsr0 = (gxsr)hftp1.b_message;
        gxsq gxsq4 = (gxsq)hftp0.N_build();
        gxsq4.getClass();
        gxsr0.c = gxsq4;
        gxsr0.b |= 1;
        return hftp1;
    }

    @Override
    public final void close() {
        ((fvau)this.j.mr()).b();
    }
}

