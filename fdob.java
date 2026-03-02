import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

public final class fdob {
    public static final AtomicReference a;
    public final ccza b;
    public fdnd c;
    public fdoe d;
    final ayvb e;
    public final ayvf f;
    public final fdoa g;
    private static final fhaj h;
    private final ayud i;
    private final Context j;
    private final fdmz k;

    static {
        fdob.h = new icyj();
        fdob.a = new AtomicReference();
    }

    public fdob(Context context0, boolean z) {
        ayud ayud0;
        if(hzvg.a.b().b()) {
            aytt aytt0 = ayud.m(context0, "CW");
            aytt0.d(hlqe.c);
            ayud0 = aytt0.a();
        }
        else {
            ayud0 = ayud.k(context0, "CW");
        }
        fdmz fdmz0 = new fdmz(context0, z);
        super();
        ccza ccza0 = new ccza(0x800, ciqc.b);
        this.b = ccza0;
        this.j = context0;
        this.i = ayud0;
        ayvf ayvf0 = new ayvf(ayud0, "CW_COUNTERS", ((int)hzzi.a.i().N()));
        this.f = ayvf0;
        ayvf0.j();
        ayvf0.n = new fdnz(fdmz0);
        this.k = fdmz0;
        fdmz0.b();
        this.e = ayvf0.f("connection-connected");
        this.g = new fdoa();
        ccza0.k();
    }

    @Deprecated
    public final ayux a(fdoc fdoc0) {
        String s = fdoc0.a();
        return this.f.d(s);
    }

    public static fdob b() {
        fdob fdob0 = (fdob)fdob.a.get();
        batl.s(fdob0);
        return fdob0;
    }

    public final void c(String s, ffaw ffaw0, long v, boolean z) {
        if(hzxv.a.d().j() && hzxv.g()) {
            long v1 = System.currentTimeMillis();
            hftr hftr0 = (hftr)((ProtoLiteMessage)gild.a).v_newBuilder();
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gilq.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((gilq)hftv0).b |= 1;
            ((gilq)hftv0).c = v1;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            gilq gilq0 = (gilq)hftp0.b_message;
            gilq0.b |= 2;
            gilq0.d = v1;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gilp.a).v_newBuilder();
            String s1 = gfta.b(s);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp1.b_message;
            ((gilp)hftv1).b |= 2;
            ((gilp)hftv1).d = s1;
            if(ffaw0 != null) {
                if(!hftv1.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gilp gilp0 = (gilp)hftp1.b_message;
                int v2 = ffaw0.p;
                if(v2 == 0) {
                    throw null;
                }
                gilp0.c = v2 - 1;
                gilp0.b |= 1;
            }
            if(z) {
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv2 = hftp1.b_message;
                ((gilp)hftv2).b |= 4;
                ((gilp)hftv2).e = v;
                if(!hftv2.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gilp gilp1 = (gilp)hftp1.b_message;
                gilp1.b |= 16;
                gilp1.g = 1L;
            }
            else {
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv3 = hftp1.b_message;
                ((gilp)hftv3).b |= 8;
                ((gilp)hftv3).f = v;
                if(!hftv3.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gilp gilp2 = (gilp)hftp1.b_message;
                gilp2.b |= 0x20;
                gilp2.h = 1L;
            }
            gilp gilp3 = (gilp)hftp1.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gilq gilq1 = (gilq)hftp0.b_message;
            gilp3.getClass();
            gilq1.e = gilp3;
            gilq1.b |= 4;
            gilq gilq2 = (gilq)hftp0.N_build();
            if(!hftr0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hftr0).ensureMutable();
            }
            gild gild0 = (gild)hftr0.b_message;
            gilq2.getClass();
            gild0.h = gilq2;
            gild0.c |= 0x200000;
            this.d(((gild)((ProtoLiteBuilder)hftr0).N_build()));
        }
    }

    public final void d(gild gild0) {
        if(hzxv.g()) {
            fdnd fdnd0 = this.c;
            if(fdnd0 == null) {
                goto label_13;
            }
            else {
                if(hzxv.g()) {
                    goto label_7;
                }
                if(Log.isLoggable("WearableEventLogger", 2)) {
                    Log.v("WearableEventLogger", "log: Logging with the GmsCoreLogger is disabled");
                    return;
                label_7:
                    ciqf ciqf0 = fdnd0.a;
                    if(ciqf0.s().b.booleanValue()) {
                        ciqf0.k(((ProtoLiteMessage)gild0), fdnd0.c);
                        return;
                    }
                    ciqf0.j(((ProtoLiteMessage)gild0));
                }
            }
        }
        else {
        label_13:
            if(this.k.f()) {
                if(Log.isLoggable("WearableLogger", 3)) {
                    Log.d("WearableLogger", "logEvent: [ClearcutLogger] " + gild0);
                }
                ayvm ayvm0 = fhbe.b(this.j, fdob.h);
                this.i.j(((MessageLite)gild0), ayvm0).d();
            }
        }
    }

    public final void e(gilr gilr0) {
        if(!this.k.f()) {
            return;
        }
        if(Log.isLoggable("WearableLogger", 3)) {
            Log.d("WearableLogger", "logEvent: " + gilr0);
        }
        gils gils0 = new gils();
        ayvm ayvm0 = fhbe.b(this.j, gils0);
        this.i.j(((MessageLite)gilr0), ayvm0).d();
    }

    public final void f(fdch fdch0) {
        fdnd fdnd0 = new fdnd();
        if(fdnd0.a.s().b.booleanValue()) {
            try {
                fdnd0.c(fdch0.l());
            }
            catch(RemoteException | azqj | azqi exception0) {
                Log.e("WearableEventLogger", "setActiveUserAccount: Cannot determine user account", exception0);
            }
            fdch0.k.add(fdnd0);
        }
        this.c = fdnd0;
    }

    public static void g(int v, boolean z, boolean z1) {
        long v1 = 2L;
        if(hzvg.a.b().a()) {
            if(z1) {
                v1 = 1L;
            }
            ayvb ayvb0 = fdob.b().e;
            ayvb0.a(ayvb0.g.a(v1 << 8 | (z ? 1L : 2L) | ((long)(v - 1 << 16))), 1L, ayvf.b);
        }
    }

    public static void h(int v, String s) {
        if(!hzzi.a.i().aa()) {
            return;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gilr.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gilg.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gilg)hftp1.b_message).c = v - 1;
        ((gilg)hftp1.b_message).b |= 1;
        String s1 = ffmr.a(s);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gilg gilg0 = (gilg)hftp1.b_message;
        s1.getClass();
        gilg0.b |= 2;
        gilg0.d = s1;
        gilg gilg1 = (gilg)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gilr gilr0 = (gilr)hftp0.b_message;
        gilg1.getClass();
        gilr0.c = gilg1;
        gilr0.b |= 1;
        fdob.b().e(((gilr)hftp0.N_build()));
    }

    public static void i(int v, String s) {
        if(!hzzi.a.i().ab()) {
            return;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gilr.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gili.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gili)hftp1.b_message).c = v - 1;
        ((gili)hftp1.b_message).b |= 1;
        if(s != null) {
            String s1 = ffmr.a(s);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gili gili0 = (gili)hftp1.b_message;
            s1.getClass();
            gili0.b |= 2;
            gili0.d = s1;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gilr gilr0 = (gilr)hftp0.b_message;
        gili gili1 = (gili)hftp1.N_build();
        gili1.getClass();
        gilr0.d = gili1;
        gilr0.b |= 8;
        fdob.b().e(((gilr)hftp0.N_build()));
    }

    public static void j(int v, long v1, int v2, int v3) {
        if(!hzzi.a.i().ac()) {
            return;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gilr.a).v_newBuilder();
        long v4 = SystemClock.elapsedRealtime() - v1;
        long v5 = System.currentTimeMillis() - v4;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gill.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((gill)hftv0).c = v - 1;
        ((gill)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((gill)hftv1).b |= 4;
        ((gill)hftv1).e = v4;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp1.b_message;
        ((gill)hftv2).b |= 2;
        ((gill)hftv2).d = v5;
        if(!hftv2.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp1.b_message;
        ((gill)hftv3).g = v2;
        ((gill)hftv3).b |= 16;
        if(!hftv3.isImmutable()) {
            hftp1.ensureMutable();
        }
        gill gill0 = (gill)hftp1.b_message;
        gill0.b |= 8;
        gill0.f = v3;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gilr gilr0 = (gilr)hftp0.b_message;
        gill gill1 = (gill)hftp1.N_build();
        gill1.getClass();
        gilr0.e = gill1;
        gilr0.b |= 16;
        fdob.b().e(((gilr)hftp0.N_build()));
    }

    public static void k(int v) {
        if(!hzzi.a.i().af()) {
            return;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giln.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((giln)hftp0.b_message).c = v - 1;
        ((giln)hftp0.b_message).b |= 1;
        giln giln0 = (giln)hftp0.N_build();
        hftr hftr0 = (hftr)((ProtoLiteMessage)gild.a).v_newBuilder();
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        gild gild0 = (gild)hftr0.b_message;
        giln0.getClass();
        gild0.g = giln0;
        gild0.c |= 0x20000;
        fdob.b().d(((gild)((ProtoLiteBuilder)hftr0).N_build()));
    }

    public final void l(fdoc fdoc0, ayuv ayuv0) {
        this.f.m(((fdnl)fdoc0).C, ayuv0);
    }
}

