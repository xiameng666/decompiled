import android.content.Context;
import android.os.Process;
import j..util.Objects;
import java.util.concurrent.ScheduledExecutorService;

public final class atrp {
    public static atrp a;
    public static atrp b;
    public static final avjh c;
    public final long d;
    public final atxp e;
    public final auiz f;
    public final auhn g;
    public final augl h;
    public final aveu i;
    public final auum j;
    public final auha k;
    public final aubk l;
    public final autw m;
    public final aulm n;
    public final auzt o;
    public final auvd p;
    public final avep q;
    public final ausg r;
    private static int s;
    private final avaa t;
    private Thread u;

    static {
        atrp.c = new avjh("CastComponent");
    }

    private atrp(Context context0) {
        avaa avaa0;
        this.d = hqqp.a.b().f();
        Context context1 = context0.getApplicationContext();
        ibuq.f(context1, "context");
        synchronized(avaa.class) {
            avaa0 = avaa.b;
            if(avaa0 == null) {
                Context context2 = context1.getApplicationContext();
                ibuq.e(context2, "getApplicationContext(...)");
                avaa0 = new avaa(context2);
                avaa.b = avaa0;
            }
        }
        this.t = avaa0;
        ausg ausg0 = new ausg(context1, avaa0);
        this.r = ausg0;
        avjn.e(context1);
        auiz auiz0 = new auiz(context1, ausg0);
        this.f = auiz0;
        ScheduledExecutorService scheduledExecutorService0 = atzn.a();
        Objects.requireNonNull(auiz0);
        scheduledExecutorService0.execute(new atrn(auiz0));
        aulm aulm0 = new aulm(auiz0);
        this.n = aulm0;
        auhn auhn0 = new auhn(scheduledExecutorService0);
        this.g = auhn0;
        atxp atxp0 = new atxp(context1, ausg0, bbnk.a, auiz0, auhn0);
        this.e = atxp0;
        atxp0.a();
        bbfe_BaseGrpcServer bbfe0 = new bbfe_BaseGrpcServer(context1, hqqv.a.c().d(), ((int)hqqv.a.c().a()), Process.myUid(), 0x901);
        aveu aveu0 = new aveu(context1, auiz0, bbfe0);
        this.i = aveu0;
        auca auca0 = new auca(context1, scheduledExecutorService0, atxp0, aulm0, bbnk.a, aveu0, auhn0);
        auum auum0 = new auum(context1, auhn0, scheduledExecutorService0, atxp0, aulm0, ausg0, aveu0, auca0);
        this.j = auum0;
        augl augl0 = new augl(context1, scheduledExecutorService0, auiz0, aulm0, auhn0, auum0, bbfe0, ausg0, avaa0, atxp0);
        this.h = augl0;
        augl0.r = new auha(augl0.h, augl0.c, augl0.e, augl0.j, augl0.f, augl0, augl0.t, augl0.i, augl0.u);
        auaj auaj0 = new auaj();
        augl0.m = new auie(augl0, augl0.h, auaj0, augl0.i, augl0.j, augl0.u, augl0.d, augl0.e, augl0.f);
        auie auie0 = augl0.m;
        auie0.d = new auid(auie0);
        auie0.b.a(auie0.d);
        augl0.l = new augf(augl0, augl0.h, augl0.f, augl0.g, augl0.u, augl0.d, augl0.e, augl0.i);
        augf augf0 = augl0.l;
        augf0.c = new auge(augf0);
        augf0.b.a(augf0.c);
        if(((Boolean)augl0.b.mr()).booleanValue()) {
            aufi aufi0 = new aufi(augl0, augl0.u);
            aufi0.e = new aufh(aufi0);
            aufi0.d.a(aufi0.e);
        }
        aulm0.b = augl0.l;
        this.q = new avep(aulm0, aveu0, scheduledExecutorService0);
        this.k = augl0.r;
        this.p = new auvd();
        this.l = new aubk(auca0, new aucr(auhn0, auca0, scheduledExecutorService0), auhn0);
        auxo auxo0 = new auxo();
        auxn auxn0 = new auxn();
        this.m = new autw(context0, scheduledExecutorService0, auum0.a, auhn0, auxo0, auxn0, atxp0);
        this.o = new auzt(new auzr(auhn0, auum0.a, auca0, scheduledExecutorService0), ausg0);
        avjn avjn0 = avjn.d();
        if(avjn0.a == null) {
            cjpc cjpc0 = avjn.e(context0);
            avjn0.k(cjpd.i(cjpc0, "com.google.android.gms.cast.SETTINGS_KEY_CAST_ENABLE_FULL_DEVICE_NAME", false));
            cjpc0.g(avjn0);
        }
        if(avjn0.a.booleanValue()) {
            atrp.c.m("logcat includes full device name for debugging");
        }
    }

    public static atrp a(Context context0, String s) {
        atrp atrp1;
        synchronized(atrp.class) {
            if(atrp.s == 0) {
                if(atrp.b == null) {
                    atrp.c.m("creating a new instance");
                    atrp.a = new atrp(context0);
                }
                else {
                    atrp.c.m("reusing a lame duck state instance");
                    atrp atrp0 = atrp.b;
                    gftb.check(atrp0);
                    Thread thread0 = atrp0.u;
                    if(thread0 != null) {
                        thread0.interrupt();
                        atrp0.u = null;
                    }
                    atrp.a = atrp.b;
                    atrp.b = null;
                }
            }
            int v1 = atrp.s + 1;
            atrp.s = v1;
            atrp.c.p("acquireReference from %s, ref = %d", s, Integer.valueOf(v1));
            atrp1 = atrp.a;
            gftb.check(atrp1);
        }
        return atrp1;
    }

    public static final void b(String s) {
        synchronized(atrp.class) {
            int v1 = atrp.s;
            if(v1 == 0) {
                atrp.c.d("releaseReference from %s when ref count is zero!", new Object[]{s});
                return;
            }
            atrp.s = v1 - 1;
            avjh avjh0 = atrp.c;
            avjh0.p("releaseReference from %s, ref = %d", s, Integer.valueOf(v1 - 1));
            if(atrp.s == 0 && atrp.a != null) {
                avjh0.m("entering lame duck mode");
                atrp atrp0 = atrp.a;
                gftb.check(atrp0);
                atrp.b = atrp0;
                atro atro0 = new atro(atrp0);
                atrp0.u = atro0;
                atro0.start();
                atrp.a = null;
            }
        }
    }
}

