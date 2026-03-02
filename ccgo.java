import android.content.Context;
import android.net.Uri;
import com.google.android.gms.learning.InAppTrainerOptions;
import com.google.android.gms.learning.InAppTrainingConstraints;
import com.google.android.gms.learning.TrainingInterval;
import com.google.android.libraries.micore.learning.base.ErrorStatusException;
import j..util.DesugarCollections;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class ccgo {
    public static final fnaa a;
    public final Context b;
    public final cbyw c;
    public final cbzh d;
    public final fmzy e;
    public final ccgp f;
    private static final Executor g;
    private final Random h;
    private final frli i;

    static {
        ccgo.a = fmzv.b("brella", "InAppTrngSchdlr");
        ccgo.g = gmap.a;
    }

    public ccgo(Context context0, cbyw cbyw0, cbzh cbzh0, frli frli0, fmzy fmzy0, ccgp ccgp0) {
        Random random0 = new Random();
        super();
        this.b = context0;
        this.c = cbyw0;
        this.d = cbzh0;
        this.i = frli0;
        this.e = fmzy0;
        this.f = ccgp0;
        this.h = random0;
    }

    public final long a(long v, long v1) {
        long v2 = Math.max(0L, v);
        return v2 + ((long)(((double)(Math.max(v2, v1) - v2)) * this.h.nextDouble()));
    }

    public static long b(fnah fnah0) {
        if(!ccgo.o(fnah0)) {
            fnal fnal0 = fnah0.f == null ? fnal.a : fnah0.f;
            return hfyf.e((fnal0.d == null ? hfst.a : fnal0.d));
        }
        return 0L;
    }

    public static fnan c(fnao fnao0, int v) {
        return ccgo.d(fnao0, new ccgl(v));
    }

    public static fnan d(fnao fnao0, gftc gftc0) {
        int v = 0;
        for(Object object0: DesugarCollections.unmodifiableList(((fnap)fnao0.b_message).b)) {
            fnan fnan0 = (fnan)object0;
            if(gftc0.a(fnan0)) {
                if(!fnao0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)fnao0).ensureMutable();
                }
                fnap fnap0 = (fnap)fnao0.b_message;
                fnap0.b();
                fnap0.b.remove(v);
                return fnan0;
            }
            ++v;
        }
        return null;
    }

    public static fnan e(fnao fnao0, String s) {
        return ccgo.d(fnao0, new ccgh(s));
    }

    public static fnan f(fnao fnao0, String s, cccq cccq0, int v) {
        return cccq0.b() - 1 == 0 ? ccgo.d(fnao0, new ccgb(s, cccq0, v)) : ccgo.d(fnao0, new ccgc(s, cccq0, v));
    }

    public final gmcd g() {
        gmcd gmcd0;
        synchronized(this) {
            gmcd0 = this.x(new ccfr(this));
        }
        return gmcd0;
    }

    public final gmcd h(InAppTrainerOptions inAppTrainerOptions0) {
        gmcd gmcd0;
        synchronized(this) {
            String s = inAppTrainerOptions0.a;
            String s1 = inAppTrainerOptions0.d;
            String s2 = fnar.a(("com.google.android.gms/" + s), gfta.b(s1));
            int v1 = cccg.f(inAppTrainerOptions0.e);
            List list0 = cccg.e(inAppTrainerOptions0.l);
            long v2 = this.c.C() ? inAppTrainerOptions0.h : 0L;
            if(v2 > 0L) {
                this.d.c(0x481);
            }
            gftb.checkTrue(s1 != null || inAppTrainerOptions0.i != null && (inAppTrainerOptions0.k != null || !list0.isEmpty()));
            gmcd0 = this.x(new ccft(this, s, s1 != null, inAppTrainerOptions0.b, s1, inAppTrainerOptions0.f, inAppTrainerOptions0.i, inAppTrainerOptions0.k, list0, inAppTrainerOptions0, s2, v1, v2));
        }
        return gmcd0;
    }

    public final gmcd i(String s) {
        gmcd gmcd0;
        synchronized(this) {
            gmcd0 = this.x(new ccfq(this, s));
        }
        return gmcd0;
    }

    public final gmcd j(int v, String s, cccq cccq0, grhj grhj0, int v1) {
        gmcd gmcd1;
        synchronized(this) {
            gmcd gmcd0 = glzd.f((cccq0.b() == 1 ? this.v(v, s, cccq0, grhj0, v1) : this.w(v, s, cccq0, v1)), new ccfy(this), ccgo.g);
            ccfz ccfz0 = new ccfz();
            gmcd1 = glyi.f(gmcd0, IOException.class, ccfz0, ccgo.g);
        }
        return gmcd1;
    }

    public final gmcd k(int v) {
        gmcd gmcd0;
        synchronized(this) {
            gmbt gmbt0 = this.x(new ccfu(this, v));
            ccfv ccfv0 = new ccfv();
            gmcd0 = glyi.f(gmbt0, IOException.class, ccfv0, ccgo.g);
        }
        return gmcd0;
    }

    public final hfwn l(long v, long v1, InAppTrainerOptions inAppTrainerOptions0) {
        return this.u(v, v1, inAppTrainerOptions0, true);
    }

    public final hfwn m(long v, long v1, InAppTrainerOptions inAppTrainerOptions0) {
        return this.u(v, v1, inAppTrainerOptions0, false);
    }

    public final void n(int v, fnao fnao0) {
        if(ccgo.c(fnao0, v) != null) {
            this.d.c(0x48E);
        }
    }

    public static boolean o(fnah fnah0) {
        return fnak.a((fnah0.f == null ? fnal.a : fnah0.f).c) == 4;
    }

    public final boolean p(fnah fnah0) {
        File file0;
        String s2;
        boolean z = true;
        if(!fnah0.e.isEmpty()) {
            try {
                URI uRI0 = ccgw.b(fnah0.e);
                String s = ccgw.a(this.b, uRI0).getPath();
                String s1 = uRI0.getScheme();
                if("appdir".equals(s1)) {
                    String[] arr_s = ccgw.c(uRI0.getPath());
                    s2 = glyf.a(new String[]{s, glyf.a(((String[])Arrays.copyOfRange(arr_s, 1, arr_s.length)))});
                }
                else {
                    if(!"appfiles".equals(s1) && !"appcache".equals(s1)) {
                        throw ErrorStatusException.a("Unsupported URI scheme: %s", new Object[]{s1});
                    }
                    s2 = glyf.a(new String[]{s, uRI0.getPath()});
                }
                file0 = new File(s2);
            }
            catch(ErrorStatusException errorStatusException0) {
                throw new IllegalStateException(errorStatusException0);
            }
            z = ccbr.b(file0);
        }
        if(!z) {
            this.d.c(0x46E);
        }
        return z;
    }

    public static boolean q(Uri uri0, String s) {
        return uri0 == null ? s.isEmpty() : s.equals(uri0.toString());
    }

    public final long r(long v, int v1, boolean z) {
        if(z) {
            return v1 == 3 ? Math.max(TimeUnit.SECONDS.toMillis(this.c.v()), Math.min(TimeUnit.SECONDS.toMillis(this.c.s()), v)) : Math.max(0L, Math.min(TimeUnit.SECONDS.toMillis(this.c.n()), v));
        }
        return Math.max(TimeUnit.SECONDS.toMillis(this.c.w()), Math.min(TimeUnit.SECONDS.toMillis(this.c.r()), v));
    }

    public final ProtoLiteBuilder s(InAppTrainerOptions inAppTrainerOptions0, String s) {
        ProtoLiteBuilder hftp0;
        InAppTrainingConstraints inAppTrainingConstraints0 = inAppTrainerOptions0.g;
        boolean z = false;
        if(inAppTrainingConstraints0 == null) {
            hftp0 = ((ProtoLiteMessage)fnaj.a).v_newBuilder();
            cbyw cbyw0 = this.c;
            if(!cbyw0.T() && !cbyw0.F(s)) {
                z = true;
            }
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((fnaj)hftp0.b_message).d = z;
            int v = cbyw0.I() ^ 1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp0.b_message;
            ((fnaj)hftv2).e = v;
            if(!hftv2.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((fnaj)hftp0.b_message).f = true;
            hfrr hfrr1 = hfrr.b(true);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            fnaj fnaj1 = (fnaj)hftp0.b_message;
            hfrr1.getClass();
            fnaj1.g = hfrr1;
            fnaj1.b |= 2;
        }
        else {
            boolean z1 = inAppTrainingConstraints0.a;
            if(!z1) {
                this.d.c(1150);
            }
            boolean z2 = inAppTrainingConstraints0.b;
            if(!z2) {
                this.d.c(0x47D);
            }
            boolean z3 = inAppTrainingConstraints0.c;
            if(!z3) {
                this.d.c(0x47C);
            }
            hftp0 = ((ProtoLiteMessage)fnaj.a).v_newBuilder();
            if(!this.c.T() && !this.c.F(s)) {
                z = true;
            }
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((fnaj)hftv0).d = z;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            ((fnaj)hftv1).e = z2;
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((fnaj)hftp0.b_message).f = z3;
            hfrr hfrr0 = hfrr.b(z1);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            fnaj fnaj0 = (fnaj)hftp0.b_message;
            hfrr0.getClass();
            fnaj0.g = hfrr0;
            fnaj0.b |= 2;
        }
        long v1 = this.c.h();
        if(v1 > 0L) {
            hfst hfst0 = hfyf.k(v1);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            fnaj fnaj2 = (fnaj)hftp0.b_message;
            hfst0.getClass();
            fnaj2.c = hfst0;
            fnaj2.b |= 1;
        }
        return hftp0;
    }

    public final void t(gfsx gfsx0, gfsx gfsx1) {
        if(this.c.N()) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gkdf.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gkdf)hftp0.b_message).c = 1;
            ((gkdf)hftp0.b_message).b |= 1;
            if(gfsx0.i()) {
                Object object0 = gfsx0.d();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gkdf gkdf0 = (gkdf)hftp0.b_message;
                gkdf0.d = ((gkdj)object0).f;
                gkdf0.b |= 2;
            }
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gkdo.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gkdo gkdo0 = (gkdo)hftp1.b_message;
            gkdf gkdf1 = (gkdf)hftp0.N_build();
            gkdf1.getClass();
            gkdo0.f = gkdf1;
            gkdo0.e = 4;
            Object object1 = ((gftm)gfsx1).a;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gkdo gkdo1 = (gkdo)hftp1.b_message;
            ((InAppTrainerOptions)object1).a.getClass();
            gkdo1.b |= 1;
            gkdo1.g = ((InAppTrainerOptions)object1).a;
            String s = ((InAppTrainerOptions)object1).d;
            if(s == null) {
                gkdm gkdm0 = gkdm.a;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gkdo gkdo3 = (gkdo)hftp1.b_message;
                gkdm0.getClass();
                gkdo3.d = gkdm0;
                gkdo3.c = 2;
            }
            else {
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gkdk.a).v_newBuilder();
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                gkdk gkdk0 = (gkdk)hftp2.b_message;
                gkdk0.b |= 1;
                gkdk0.c = s;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gkdo gkdo2 = (gkdo)hftp1.b_message;
                gkdk gkdk1 = (gkdk)hftp2.N_build();
                gkdk1.getClass();
                gkdo2.d = gkdk1;
                gkdo2.c = 1;
            }
            cbzh cbzh0 = this.d;
            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gkdb.a).v_newBuilder();
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            gkdb gkdb0 = (gkdb)hftp3.b_message;
            gkdo gkdo4 = (gkdo)hftp1.N_build();
            gkdo4.getClass();
            gkdb0.f = gkdo4;
            gkdb0.b |= 0x2000;
            cbzh0.a(((gkdb)hftp3.N_build()));
        }
    }

    private final hfwn u(long v, long v1, InAppTrainerOptions inAppTrainerOptions0, boolean z) {
        long v2 = TimeUnit.SECONDS.toMillis(this.c.l()) + v;
        TrainingInterval trainingInterval0 = inAppTrainerOptions0.j;
        if(trainingInterval0 != null && cccg.g(trainingInterval0.a) == 3) {
            long v3 = this.r(trainingInterval0.b, 3, z);
            long v4 = Math.min(v + v3, v2);
            return v1 == 0L ? hfyn.h(v4) : hfyn.h(Math.max(v1 + v3, v4));
        }
        return hfyn.h(v2);
    }

    private final gmbt v(int v, String s, cccq cccq0, grhj grhj0, int v1) {
        gmbt gmbt0;
        synchronized(this) {
            gmbt0 = this.x(new ccgg(this, s, cccq0, v, v1, grhj0));
        }
        return gmbt0;
    }

    private final gmbt w(int v, String s, cccq cccq0, int v1) {
        gmbt gmbt0;
        synchronized(this) {
            gmbt0 = this.x(new ccfx(this, s, cccq0, v, v1));
        }
        return gmbt0;
    }

    private final gmbt x(ccgn ccgn0) {
        AtomicReference atomicReference0 = new AtomicReference(null);
        AtomicReference atomicReference1 = new AtomicReference(null);
        ccgi ccgi0 = new ccgi(this, ccgn0, atomicReference0, atomicReference1);
        gmcd gmcd0 = glzd.f(gmbt.h(this.i.c(ccgi0, ccgo.g)), new ccgj(atomicReference1, atomicReference0), ccgo.g);
        ccgk ccgk0 = new ccgk(this);
        return (gmbt)glyi.g(gmcd0, IOException.class, ccgk0, ccgo.g);
    }
}

