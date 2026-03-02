import android.content.Context;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public final class eqme implements eqmc, eqmd {
    public static final baun a;
    public final Context b;
    public final eqmh c;
    public eqlw d;
    public eqmg e;
    public final ProtoLiteBuilder f;
    public final ProtoLiteBuilder g;
    public final ProtoLiteBuilder h;
    public ProtoLiteBuilder i;
    public final ProtoLiteBuilder j;
    public final ProtoLiteBuilder k;
    public final ProtoLiteBuilder l;
    private final AtomicBoolean m;
    private final ayud n;
    private eqmf o;
    private final gjna p;
    private eqmi q;
    private long r;
    private final List s;
    private long t;
    private eqtz u;
    private ProtoLiteBuilder v;
    private ProtoLiteBuilder w;

    static {
        eqme.a = new erqc(new String[]{"D2D", "Metrics", "TargetApiLogManager"});
    }

    public eqme(Context context0) {
        ayud ayud0 = new aytt(context0, "SMART_SETUP").a();
        eqlt eqlt0 = eqlt.g(context0);
        super();
        this.m = new AtomicBoolean(false);
        this.k = ((ProtoLiteMessage)gjng.a).v_newBuilder();
        this.l = ((ProtoLiteMessage)gjoc.a).v_newBuilder();
        Context context1 = context0.getApplicationContext();
        this.b = context1;
        this.n = ayud0;
        this.r = SystemClock.elapsedRealtime();
        if(hygo.c()) {
            this.u = new eqtz(context0, ayud0, eqlt0);
        }
        eqlw eqlw0 = new eqlw();
        this.d = eqlw0;
        eqlv eqlv0 = eqlw0.b();
        this.f = ((ProtoLiteMessage)gjmz.a).v_newBuilder();
        this.o = new eqmf(((gjna)((ProtoLiteMessage)gjnb.a).v_newBuilder()));
        this.q = new eqmi(eqlv0.a);
        this.c = new eqmh(context1);
        this.h = ((ProtoLiteMessage)gjpf.a).v_newBuilder();
        this.v = ((ProtoLiteMessage)gjpc.a).v_newBuilder();
        this.w = ((ProtoLiteMessage)gjnq.a).v_newBuilder();
        this.e = new eqmg();
        this.p = (gjna)((ProtoLiteMessage)gjnb.a).v_newBuilder();
        this.g = ((ProtoLiteMessage)gjmq.a).v_newBuilder();
        this.i = eqlv0.a;
        this.j = ((ProtoLiteMessage)gjoa.a).v_newBuilder();
        this.s = new ArrayList(0);
    }

    public final void A() {
        int v = eqsh.w(this.b) ? 3 : 2;
        ProtoLiteBuilder hftp0 = this.f;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gjmz)hftp0.b_message).l = v - 1;
        ((gjmz)hftp0.b_message).b |= 0x400;
    }

    public final void B(long v) {
        ProtoLiteBuilder hftp0 = this.i;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjob gjob0 = (gjob)hftp0.b_message;
        gjob0.b |= 1;
        gjob0.c = v;
    }

    public final void C() {
        this.q.a(SystemClock.elapsedRealtime() - this.t);
    }

    public final void D(int v) {
        ProtoLiteBuilder hftp0 = this.k;
        ProtoLiteMessage hftv0 = hftp0.b_message;
        if(gjnd.a(((gjng)hftv0).c) == 4 && v == 3) {
            return;
        }
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gjng)hftp0.b_message).c = v - 1;
        ((gjng)hftp0.b_message).b |= 1;
    }

    public final void E(int v) {
        ProtoLiteBuilder hftp0 = this.f;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gjmz)hftp0.b_message).c = v - 1;
        ((gjmz)hftp0.b_message).b |= 1;
    }

    public final void F(int v) {
        ProtoLiteBuilder hftp0 = this.f;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gjmz)hftp0.b_message).e = v - 1;
        ((gjmz)hftp0.b_message).b |= 4;
    }

    public final void G(int v) {
        ProtoLiteBuilder hftp0 = this.k;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjng gjng0 = (gjng)hftp0.b_message;
        if(v == 0) {
            throw null;
        }
        gjng0.e = v - 1;
        gjng0.b |= 4;
    }

    public final void H(int v) {
        ProtoLiteBuilder hftp0 = this.w;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gjnq)hftp0.b_message).d = v - 1;
        ((gjnq)hftp0.b_message).b |= 2;
    }

    public final void I(int v) {
        ProtoLiteBuilder hftp0 = this.f;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gjmz)hftp0.b_message).j = v - 1;
        ((gjmz)hftp0.b_message).b |= 0x100;
    }

    public final void J(int v) {
        ProtoLiteBuilder hftp0 = this.f;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gjmz)hftp0.b_message).g = v - 1;
        ((gjmz)hftp0.b_message).b |= 16;
    }

    public final void K(int v) {
        ProtoLiteBuilder hftp0 = this.f;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gjmz)hftp0.b_message).k = v - 1;
        ((gjmz)hftp0.b_message).b |= 0x200;
    }

    public final void L(int v) {
        ProtoLiteBuilder hftp0 = this.h;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gjpf)hftp0.b_message).i = v - 1;
        ((gjpf)hftp0.b_message).b |= 0x20;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gjpd.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gjpd)hftp1.b_message).c = v - 1;
        ((gjpd)hftp1.b_message).b |= 1;
        int v1 = glwy.a(SystemClock.elapsedRealtime() - this.r);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gjpd gjpd0 = (gjpd)hftp1.b_message;
        gjpd0.b |= 2;
        gjpd0.d = v1;
        gjpd gjpd1 = (gjpd)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjpf gjpf0 = (gjpf)hftp0.b_message;
        gjpd1.getClass();
        hfuo hfuo0 = gjpf0.j;
        if(!hfuo0.c()) {
            gjpf0.j = ProtoLiteMessage.E(hfuo0);
        }
        gjpf0.j.add(gjpd1);
        long v2 = SystemClock.elapsedRealtime();
        this.r = v2;
        if(v == 16) {
            this.t = v2;
        }
    }

    @Override  // eqmd
    public final void a(int v) {
        this.q(v);
    }

    @Override  // eqmd
    public final void b(int v) {
        this.s(v);
    }

    @Override  // eqmd
    public final void c(List list0) {
        ProtoLiteBuilder hftp0 = this.v;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gjpc)hftp0.b_message).e = hfty.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjpc gjpc0 = (gjpc)hftp0.b_message;
        hfuf hfuf0 = gjpc0.e;
        if(!hfuf0.c()) {
            gjpc0.e = ProtoLiteMessage.C(hfuf0);
        }
        hfrj.E(list0, gjpc0.e);
    }

    @Override  // eqmd
    public final void d(int v) {
        ProtoLiteBuilder hftp0 = this.v;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjpc gjpc0 = (gjpc)hftp0.b_message;
        gjpc0.b |= 1;
        gjpc0.c = v;
    }

    @Override  // eqmd
    public final void e(List list0) {
        ProtoLiteBuilder hftp0 = this.v;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gjpc)hftp0.b_message).d = hfty.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjpc gjpc0 = (gjpc)hftp0.b_message;
        hfuf hfuf0 = gjpc0.d;
        if(!hfuf0.c()) {
            gjpc0.d = ProtoLiteMessage.C(hfuf0);
        }
        hfrj.E(list0, gjpc0.d);
    }

    @Override  // eqmd
    public final void f(int v) {
        this.L(v);
    }

    @Override  // eqmd
    public final void g(int v) {
        this.p(v);
    }

    @Override  // eqmd
    public final void h(int v) {
        this.r(v);
    }

    public final void i() {
        if(this.m.compareAndSet(false, true)) {
            baun baun0 = eqme.a;
            baun0.j("Sending Target API logs with Clearcut.", new Object[0]);
            this.o.a();
            gjna gjna0 = this.p;
            if(!gjna0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gjna0).ensureMutable();
            }
            ((gjnb)gjna0.b_message).e = hfty.a;
            gjna0.a(this.s);
            eqlv eqlv0 = this.d.b();
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gjpg.a).v_newBuilder();
            ProtoLiteBuilder hftp1 = this.h;
            ProtoLiteBuilder hftp2 = eqlv0.b;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gjpf gjpf0 = (gjpf)hftp1.b_message;
            gjpb gjpb0 = (gjpb)hftp2.N_build();
            gjpb0.getClass();
            gjpf0.f = gjpb0;
            gjpf0.b |= 8;
            gjpc gjpc0 = (gjpc)this.v.N_build();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gjpf gjpf1 = (gjpf)hftp1.b_message;
            gjpc0.getClass();
            gjpf1.l = gjpc0;
            gjpf1.b |= 0x80;
            ProtoLiteBuilder hftp3 = this.f;
            ProtoLiteBuilder hftp4 = this.g;
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            gjmz gjmz0 = (gjmz)hftp3.b_message;
            gjmq gjmq0 = (gjmq)hftp4.N_build();
            gjmq0.getClass();
            gjmz0.d = gjmq0;
            gjmz0.b |= 2;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gjpg gjpg0 = (gjpg)hftp0.b_message;
            gjpf gjpf2 = (gjpf)hftp1.N_build();
            gjpf2.getClass();
            gjpg0.h = gjpf2;
            gjpg0.b |= 0x20;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gjpg gjpg1 = (gjpg)hftp0.b_message;
            gjmz gjmz1 = (gjmz)hftp3.N_build();
            gjmz1.getClass();
            gjpg1.d = gjmz1;
            gjpg1.b |= 2;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gjpg gjpg2 = (gjpg)hftp0.b_message;
            gjnb gjnb0 = (gjnb)((ProtoLiteBuilder)gjna0).N_build();
            gjnb0.getClass();
            gjpg2.c = gjnb0;
            gjpg2.b |= 1;
            List list0 = Arrays.asList(eqlv0.a());
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gjpg gjpg3 = (gjpg)hftp0.b_message;
            hfuo hfuo0 = gjpg3.i;
            if(!hfuo0.c()) {
                gjpg3.i = ProtoLiteMessage.E(hfuo0);
            }
            hfrj.E(list0, gjpg3.i);
            ProtoLiteBuilder hftp5 = eqlv0.a;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gjpg gjpg4 = (gjpg)hftp0.b_message;
            gjob gjob0 = (gjob)hftp5.N_build();
            gjob0.getClass();
            gjpg4.e = gjob0;
            gjpg4.b |= 4;
            ProtoLiteBuilder hftp6 = this.k;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gjpg gjpg5 = (gjpg)hftp0.b_message;
            gjng gjng0 = (gjng)hftp6.N_build();
            gjng0.getClass();
            gjpg5.g = gjng0;
            gjpg5.b |= 16;
            gjnn gjnn0 = this.c.a();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gjpg gjpg6 = (gjpg)hftp0.b_message;
            gjnn0.getClass();
            gjpg6.f = gjnn0;
            gjpg6.b |= 8;
            gjpj gjpj0 = (gjpj)this.e.b.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            gjpj0.getClass();
            ((gjpg)hftv0).j = gjpj0;
            ((gjpg)hftv0).b |= 0x40;
            ProtoLiteBuilder hftp7 = this.w;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            gjpg gjpg7 = (gjpg)hftp0.b_message;
            gjnq gjnq0 = (gjnq)hftp7.N_build();
            gjnq0.getClass();
            gjpg7.k = gjnq0;
            gjpg7.b |= 0x80;
            ProtoLiteBuilder hftp8 = this.l;
            if(!hftp8.b_message.isImmutable()) {
                hftp8.ensureMutable();
            }
            gjoc gjoc0 = (gjoc)hftp8.b_message;
            gjpg gjpg8 = (gjpg)hftp0.N_build();
            gjpg8.getClass();
            gjoc0.f = gjpg8;
            gjoc0.b |= 8;
            gjoc gjoc1 = (gjoc)hftp8.N_build();
            baun0.j(((ProtoLiteMessage)gjoc1).toString(), new Object[0]);
            if(hygo.d()) {
                new eqtx(this.b).a(gjoc1);
                return;
            }
            if(hygo.c()) {
                eqtz eqtz0 = this.u;
                if(eqtz0 != null) {
                    eqtz0.d(((MessageLite)gjoc1));
                    return;
                }
            }
            if(hygu.c()) {
                zdi zdi0 = new zdi();
                ayvm ayvm0 = fhbe.b(this.b, zdi0);
                ayuc ayuc0 = this.n.i(((MessageLite)gjoc1));
                ayuc0.o = ayvm0;
                ayuc0.d();
                return;
            }
            this.n.i(((MessageLite)gjoc1)).d();
            return;
        }
        eqme.a.m("Logs already sent to Clearcut. Ignoring call to log().", new Object[0]);
    }

    public final void j() {
        this.m.set(false);
        eqlw eqlw0 = new eqlw();
        this.d = eqlw0;
        eqlv eqlv0 = eqlw0.b();
        this.o = new eqmf(((gjna)((ProtoLiteMessage)gjnb.a).v_newBuilder()));
        ProtoLiteBuilder hftp0 = eqlv0.a;
        this.q = new eqmi(hftp0);
        ProtoLiteBuilder hftp1 = this.h;
        if(hftp1.a_defaultInstance.isImmutable()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        hftp1.b_message = hftp1.P_newInstance();
        ProtoLiteBuilder hftp2 = this.f;
        if(hftp2.a_defaultInstance.isImmutable()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        hftp2.b_message = hftp2.P_newInstance();
        ProtoLiteBuilder hftp3 = this.k;
        if(hftp3.a_defaultInstance.isImmutable()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        hftp3.b_message = hftp3.P_newInstance();
        this.e = new eqmg();
        gjna gjna0 = this.p;
        if(gjna0.a_defaultInstance.isImmutable()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        gjna0.b_message = ((ProtoLiteBuilder)gjna0).P_newInstance();
        this.i = hftp0;
        ProtoLiteBuilder hftp4 = this.j;
        if(hftp4.a_defaultInstance.isImmutable()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        hftp4.b_message = hftp4.P_newInstance();
        this.s.clear();
        this.v = ((ProtoLiteMessage)gjpc.a).v_newBuilder();
        this.w = ((ProtoLiteMessage)gjnq.a).v_newBuilder();
    }

    public final void k(int v) {
        gjna gjna0 = this.p;
        if(!gjna0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gjna0).ensureMutable();
        }
        gjnb gjnb0 = (gjnb)gjna0.b_message;
        gjnb0.b |= 2;
        gjnb0.d = v;
        this.s.add(Integer.valueOf(v));
    }

    public final void l(boolean z, int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gjnl.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gjnl)hftv0).b |= 2;
        ((gjnl)hftv0).d = v;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjnl gjnl0 = (gjnl)hftp0.b_message;
        gjnl0.b |= 1;
        gjnl0.c = z;
        gjnl gjnl1 = (gjnl)hftp0.N_build();
        ProtoLiteBuilder hftp1 = this.c.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gjnn gjnn0 = (gjnn)hftp1.b_message;
        gjnl1.getClass();
        gjnn0.i = gjnl1;
        gjnn0.b |= 0x80;
    }

    public final void m(String s, boolean z, boolean z1) {
        ProtoLiteBuilder hftp0 = this.g;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjmq gjmq0 = (gjmq)hftp0.b_message;
        s.getClass();
        gjmq0.b |= 1;
        gjmq0.c = s;
        if("com.google.android.gms".equals(s)) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gjmq)hftp0.b_message).d = 1;
        }
        else if(z) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gjmq)hftp0.b_message).d = 2;
        }
        else {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gjmq)hftp0.b_message).d = 4;
        }
        ((gjmq)hftp0.b_message).b |= 2;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjmq gjmq1 = (gjmq)hftp0.b_message;
        gjmq1.b |= 4;
        gjmq1.e = z1;
    }

    public final void n(eqoc eqoc0) {
        if(eqoc0 == null) {
            return;
        }
        gjna gjna0 = this.p;
        if(!gjna0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gjna0).ensureMutable();
        }
        ((gjnb)gjna0.b_message).f = eqoc0;
        ((gjnb)gjna0.b_message).b |= 8;
    }

    public final void o(gjno gjno0) {
        ProtoLiteBuilder hftp0 = this.h;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjpf gjpf0 = (gjpf)hftp0.b_message;
        gjno0.getClass();
        gjpf0.k = gjno0;
        gjpf0.b |= 0x40;
    }

    public final void p(int v) {
        ProtoLiteBuilder hftp0 = this.h;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjpf gjpf0 = (gjpf)hftp0.b_message;
        gjpf0.b |= 2;
        gjpf0.d = v;
    }

    public final void q(int v) {
        ProtoLiteBuilder hftp0 = this.h;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjpf gjpf0 = (gjpf)hftp0.b_message;
        gjpf0.b |= 16;
        gjpf0.h = v;
    }

    public final void r(int v) {
        ProtoLiteBuilder hftp0 = this.h;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjpf gjpf0 = (gjpf)hftp0.b_message;
        gjpf0.b |= 1;
        gjpf0.c = v;
    }

    public final void s(int v) {
        ProtoLiteBuilder hftp0 = this.h;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjpf gjpf0 = (gjpf)hftp0.b_message;
        gjpf0.b |= 4;
        gjpf0.e = v;
    }

    public final void t(String s) {
        ProtoLiteBuilder hftp0 = this.w;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjnq gjnq0 = (gjnq)hftp0.b_message;
        gjnq0.b |= 4;
        gjnq0.e = s;
    }

    public final void u(String s) {
        ProtoLiteBuilder hftp0 = this.w;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjnq gjnq0 = (gjnq)hftp0.b_message;
        gjnq0.b |= 1;
        gjnq0.c = s;
    }

    public final void v(gjmw gjmw0) {
        ProtoLiteBuilder hftp0 = this.f;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gjmz)hftp0.b_message).f = gjmw0.e;
        ((gjmz)hftp0.b_message).b |= 8;
    }

    public final void w(long v) {
        ProtoLiteBuilder hftp0 = this.l;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjoc gjoc0 = (gjoc)hftp0.b_message;
        gjoc0.b |= 1;
        gjoc0.c = v;
    }

    public final void x(boolean z) {
        ProtoLiteBuilder hftp0 = this.k;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjng gjng0 = (gjng)hftp0.b_message;
        gjng0.b |= 2;
        gjng0.d = z;
    }

    public final void y(boolean z) {
        ProtoLiteBuilder hftp0 = this.f;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjmz gjmz0 = (gjmz)hftp0.b_message;
        gjmz0.b |= 0x40;
        gjmz0.i = z;
    }

    public final void z(boolean z) {
        gjna gjna0 = this.p;
        if(!gjna0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gjna0).ensureMutable();
        }
        gjnb gjnb0 = (gjnb)gjna0.b_message;
        gjnb0.b |= 1;
        gjnb0.c = z;
    }
}

