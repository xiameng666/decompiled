import android.content.Context;
import android.os.SystemClock;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public final class erav {
    public static final baun a;
    public final bbng b;
    public long c;
    public boolean d;
    public final eros e;
    public gjld f;
    public final Deque g;
    private static final ggeo h;
    private static erav i;
    private final ccmg j;
    private final eqtz k;
    private final eqtx l;
    private final Executor m;

    static {
        erav.a = new erqc(new String[]{"QuickStart", "Metrics", "SourceQuickStartLogManager"});
        erav.h = ggeo.r(gjkj.b, bbdg.kw, gjkj.j, bbdg.kx, gjkj.l, bbdg.kC, gjkj.r, bbdg.ky, gjkj.y, bbdg.kz, gjkj.B, bbdg.kA, gjkj.P, bbdg.kB);
    }

    public erav(Context context0) {
        this.f = gjld.a;
        this.g = new ArrayDeque();
        this.b = bbnk.a;
        this.l = new eqtx(context0);
        this.k = new eqtz(context0, new aytt(context0, "SMART_SETUP").a(), eqlt.g(context0));
        this.e = new eros(context0);
        this.m = Executors.newSingleThreadExecutor();
        this.j = new ccmp();
    }

    public static erav a(Context context0) {
        synchronized(erav.class) {
            if(erav.i == null) {
                erav.i = new erav(context0);
            }
        }
        return erav.i;
    }

    public final void b(gjkn gjkn0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gjkn0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gjkn0));
        long v = this.c;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjkn gjkn1 = (gjkn)hftp0.b_message;
        gjkn1.b |= 0x1000;
        gjkn1.n = v;
        gjld gjld0 = this.f;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gjkn)hftp0.b_message).e = gjld0.f;
        ((gjkn)hftp0.b_message).b |= 8;
        gjkn gjkn2 = (gjkn)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gjll.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gjll gjll0 = (gjll)hftp1.b_message;
        gjkn2.getClass();
        gjll0.d = gjkn2;
        gjll0.b |= 2;
        gjll gjll1 = (gjll)hftp1.N_build();
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gjoc.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gjoc gjoc0 = (gjoc)hftp2.b_message;
        gjll1.getClass();
        gjoc0.k = gjll1;
        gjoc0.b |= 0x200;
        gjoc gjoc1 = (gjoc)hftp2.N_build();
        erav.a.j(((ProtoLiteMessage)gjoc1).toString(), new Object[0]);
        this.i(gjoc1, true);
    }

    public final void c() {
        erav.i = null;
    }

    public final void d(long v) {
        if(!this.d) {
            this.c = v;
            this.d = true;
        }
        Deque deque0 = this.g;
        synchronized(deque0) {
            erav.a.d("Flush %d events to Clearcut.", new Object[]{deque0.size()});
            while(!deque0.isEmpty()) {
                this.b(((gjkn)deque0.pop()));
            }
        }
    }

    public final void e(gjkj gjkj0) {
        this.f(((gjkn)this.o(gjkj0).N_build()));
    }

    public final void f(gjkn gjkn0) {
        ggeo ggeo0 = erav.h;
        if(ggeo0.containsKey((gjkj.b(gjkn0.f) == null ? gjkj.a : gjkj.b(gjkn0.f)))) {
            gjkj gjkj0 = gjkj.b(gjkn0.f) == null ? gjkj.a : gjkj.b(gjkn0.f);
            this.j.a(((bbdg)ggeo0.get(gjkj0)));
        }
        erau erau0 = new erau(this, gjkn0);
        this.m.execute(erau0);
    }

    public final void g(int v, eqoc eqoc0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gjjk.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gjjk)hftv0).b |= 1;
        ((gjjk)hftv0).c = v;
        if(eqoc0 != null) {
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gjjk)hftp0.b_message).d = eqoc0;
            ((gjjk)hftp0.b_message).b |= 2;
        }
        ProtoLiteBuilder hftp1 = this.o(gjkj.Q);
        gjjk gjjk0 = (gjjk)hftp0.N_build();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gjkn gjkn0 = (gjkn)hftp1.b_message;
        gjjk0.getClass();
        gjkn0.i = gjjk0;
        gjkn0.b |= 0x80;
        this.f(((gjkn)hftp1.N_build()));
    }

    public final void h(int v, int v1) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gjjd.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gjjd)hftv0).b |= 2;
        ((gjjd)hftv0).d = v1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjjd gjjd0 = (gjjd)hftp0.b_message;
        gjjd0.b |= 1;
        gjjd0.c = v;
        gjjd gjjd1 = (gjjd)hftp0.N_build();
        ProtoLiteBuilder hftp1 = this.o(gjkj.L);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gjkn gjkn0 = (gjkn)hftp1.b_message;
        gjjd1.getClass();
        gjkn0.q = gjjd1;
        gjkn0.b |= 0x8000;
        this.f(((gjkn)hftp1.N_build()));
    }

    public final void i(gjoc gjoc0, boolean z) {
        if(hygo.d()) {
            this.l.a(gjoc0);
            return;
        }
        if(z) {
            this.k.d(((MessageLite)gjoc0));
            return;
        }
        this.k.c(((MessageLite)gjoc0));
    }

    public final void j(long v) {
        erav.a.d("Set session id.", new Object[0]);
        this.d(v);
    }

    public final void k(int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gjoc.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gjll.a).v_newBuilder();
        ProtoLiteBuilder hftp2 = this.p(4);
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((gjkq)hftp2.b_message).f = v - 1;
        ((gjkq)hftp2.b_message).b |= 8;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gjll gjll0 = (gjll)hftp1.b_message;
        gjkq gjkq0 = (gjkq)hftp2.N_build();
        gjkq0.getClass();
        gjll0.e = gjkq0;
        gjll0.b |= 4;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjoc gjoc0 = (gjoc)hftp0.b_message;
        gjll gjll1 = (gjll)hftp1.N_build();
        gjll1.getClass();
        gjoc0.k = gjll1;
        gjoc0.b |= 0x200;
        gjoc gjoc1 = (gjoc)hftp0.N_build();
        erav.a.j(((ProtoLiteMessage)gjoc1).toString(), new Object[0]);
        this.i(gjoc1, false);
    }

    public final void l(int v) {
        ProtoLiteBuilder hftp0 = this.o(gjkj.i);
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gjkg.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gjkg)hftp1.b_message).f = v - 1;
        ((gjkg)hftp1.b_message).b |= 8;
        gjkg gjkg0 = (gjkg)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjkn gjkn0 = (gjkn)hftp0.b_message;
        gjkg0.getClass();
        gjkn0.t = gjkg0;
        gjkn0.b |= 0x40000;
        this.f(((gjkn)hftp0.N_build()));
    }

    public final void m(int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gjkh.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gjkh)hftp0.b_message).c = v - 1;
        ((gjkh)hftp0.b_message).b |= 1;
        gjkh gjkh0 = (gjkh)hftp0.N_build();
        ProtoLiteBuilder hftp1 = this.o(gjkj.y);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gjkn gjkn0 = (gjkn)hftp1.b_message;
        gjkh0.getClass();
        gjkn0.l = gjkh0;
        gjkn0.b |= 0x400;
        this.f(((gjkn)hftp1.N_build()));
    }

    public final void n(int v) {
        if(hyis.a.k().aa() && v == 3) {
            this.j.a(bbdg.kD);
            v = 3;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gjoc.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gjll.a).v_newBuilder();
        ProtoLiteBuilder hftp2 = this.p(v);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gjll gjll0 = (gjll)hftp1.b_message;
        gjkq gjkq0 = (gjkq)hftp2.N_build();
        gjkq0.getClass();
        gjll0.e = gjkq0;
        gjll0.b |= 4;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjoc gjoc0 = (gjoc)hftp0.b_message;
        gjll gjll1 = (gjll)hftp1.N_build();
        gjll1.getClass();
        gjoc0.k = gjll1;
        gjoc0.b |= 0x200;
        gjoc gjoc1 = (gjoc)hftp0.N_build();
        erav.a.j(((ProtoLiteMessage)gjoc1).toString(), new Object[0]);
        this.i(gjoc1, false);
    }

    public final ProtoLiteBuilder o(gjkj gjkj0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gjkn.a).v_newBuilder();
        long v = this.c;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjkn gjkn0 = (gjkn)hftp0.b_message;
        gjkn0.b |= 0x1000;
        gjkn0.n = v;
        long v1 = System.currentTimeMillis();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjkn gjkn1 = (gjkn)hftp0.b_message;
        gjkn1.b |= 2;
        gjkn1.c = v1;
        long v2 = SystemClock.elapsedRealtime();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gjkn)hftv0).b |= 4;
        ((gjkn)hftv0).d = v2;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gjkn)hftp0.b_message).f = gjkj0.V;
        ((gjkn)hftp0.b_message).b |= 16;
        return hftp0;
    }

    private final ProtoLiteBuilder p(int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gjkq.a).v_newBuilder();
        long v1 = this.c;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjkq gjkq0 = (gjkq)hftp0.b_message;
        gjkq0.b |= 2;
        gjkq0.d = v1;
        long v2 = SystemClock.elapsedRealtime();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gjkq)hftv0).b |= 4;
        ((gjkq)hftv0).e = v2;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gjkq)hftp0.b_message).c = v - 1;
        ((gjkq)hftp0.b_message).b |= 1;
        return hftp0;
    }
}

