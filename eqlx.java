import android.content.Context;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public final class eqlx implements eqma {
    public static final baun a;
    public final Context b;
    public final eqlw c;
    public final eqmh d;
    public final ProtoLiteBuilder e;
    public final ProtoLiteBuilder f;
    public final ProtoLiteBuilder g;
    public final ProtoLiteBuilder h;
    public final ProtoLiteBuilder i;
    public final ProtoLiteBuilder j;
    public final ProtoLiteBuilder k;
    private final ayud l;
    private final AtomicBoolean m;
    private final gjna n;
    private final eqmi o;
    private long p;
    private final List q;
    private long r;
    private eqtz s;
    private final ProtoLiteBuilder t;
    private final ProtoLiteBuilder u;
    private final ProtoLiteBuilder v;
    private final ProtoLiteBuilder w;
    private final ProtoLiteBuilder x;

    static {
        eqlx.a = new erqc(new String[]{"D2D", "Metrics", "SourceApiLogManager"});
    }

    public eqlx(Context context0) {
        ayud ayud0 = new aytt(context0, "SMART_SETUP").a();
        eqlt eqlt0 = eqlt.g(context0);
        super();
        this.m = new AtomicBoolean(false);
        this.h = ((ProtoLiteMessage)gjog.a).v_newBuilder();
        this.j = ((ProtoLiteMessage)gjng.a).v_newBuilder();
        this.x = ((ProtoLiteMessage)gjok.a).v_newBuilder();
        this.k = ((ProtoLiteMessage)gjoc.a).v_newBuilder();
        this.p = SystemClock.elapsedRealtime();
        gftb.check(context0);
        Context context1 = context0.getApplicationContext();
        this.b = context1;
        this.l = ayud0;
        if(hygo.c()) {
            this.s = new eqtz(context0, ayud0, eqlt0);
        }
        eqlw eqlw0 = new eqlw();
        this.c = eqlw0;
        this.e = ((ProtoLiteMessage)gjmz.a).v_newBuilder();
        this.o = new eqmi(eqlw0.a().a);
        this.f = ((ProtoLiteMessage)gjoj.a).v_newBuilder();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gjoh.a).v_newBuilder();
        this.g = hftp0;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjoh gjoh0 = (gjoh)hftp0.b_message;
        gjoh0.b |= 1;
        gjoh0.c = false;
        this.d = new eqmh(context1);
        this.i = ((ProtoLiteMessage)gjod.a).v_newBuilder();
        this.w = ((ProtoLiteMessage)gjnq.a).v_newBuilder();
        this.n = (gjna)((ProtoLiteMessage)gjnb.a).v_newBuilder();
        this.t = ((ProtoLiteMessage)gjmq.a).v_newBuilder();
        this.u = eqlw0.a().a;
        this.v = ((ProtoLiteMessage)gjoa.a).v_newBuilder();
        this.q = new ArrayList(0);
    }

    public final void a() {
        if(this.m.compareAndSet(false, true)) {
            baun baun0 = eqlx.a;
            baun0.j("Sending Source API logs with Clearcut.", new Object[0]);
            ProtoLiteBuilder hftp0 = this.e;
            ProtoLiteBuilder hftp1 = this.t;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gjmz gjmz0 = (gjmz)hftp0.b_message;
            gjmq gjmq0 = (gjmq)hftp1.N_build();
            gjmq0.getClass();
            gjmz0.d = gjmq0;
            gjmz0.b |= 2;
            gjna gjna0 = this.n;
            if(!gjna0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gjna0).ensureMutable();
            }
            ((gjnb)gjna0.b_message).e = hfty.a;
            gjna0.a(this.q);
            ProtoLiteBuilder hftp2 = this.x;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            gjok gjok0 = (gjok)hftp2.b_message;
            gjnb gjnb0 = (gjnb)((ProtoLiteBuilder)gjna0).N_build();
            gjnb0.getClass();
            gjok0.c = gjnb0;
            gjok0.b |= 1;
            eqlu eqlu0 = this.c.a();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            gjok gjok1 = (gjok)hftp2.b_message;
            gjmz gjmz1 = (gjmz)hftp0.N_build();
            gjmz1.getClass();
            gjok1.d = gjmz1;
            gjok1.b |= 2;
            ProtoLiteBuilder hftp3 = this.j;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            gjok gjok2 = (gjok)hftp2.b_message;
            gjng gjng0 = (gjng)hftp3.N_build();
            gjng0.getClass();
            gjok2.g = gjng0;
            gjok2.b |= 16;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ((gjok)hftp2.b_message).i = hfvv.a;
            List list0 = Arrays.asList(eqlu0.a());
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            gjok gjok3 = (gjok)hftp2.b_message;
            hfuo hfuo0 = gjok3.i;
            if(!hfuo0.c()) {
                gjok3.i = ProtoLiteMessage.E(hfuo0);
            }
            hfrj.E(list0, gjok3.i);
            ProtoLiteBuilder hftp4 = eqlu0.a;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            gjok gjok4 = (gjok)hftp2.b_message;
            gjob gjob0 = (gjob)hftp4.N_build();
            gjob0.getClass();
            gjok4.e = gjob0;
            gjok4.b |= 4;
            ProtoLiteBuilder hftp5 = this.h;
            ProtoLiteBuilder hftp6 = this.i;
            if(!hftp5.b_message.isImmutable()) {
                hftp5.ensureMutable();
            }
            gjog gjog0 = (gjog)hftp5.b_message;
            gjod gjod0 = (gjod)hftp6.N_build();
            gjod0.getClass();
            gjog0.f = gjod0;
            gjog0.b |= 8;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            gjok gjok5 = (gjok)hftp2.b_message;
            gjog gjog1 = (gjog)hftp5.N_build();
            gjog1.getClass();
            gjok5.h = gjog1;
            gjok5.b |= 0x20;
            gjnn gjnn0 = this.d.a();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            gjok gjok6 = (gjok)hftp2.b_message;
            gjnn0.getClass();
            gjok6.f = gjnn0;
            gjok6.b |= 8;
            ProtoLiteBuilder hftp7 = this.f;
            ProtoLiteBuilder hftp8 = this.g;
            if(!hftp7.b_message.isImmutable()) {
                hftp7.ensureMutable();
            }
            gjoj gjoj0 = (gjoj)hftp7.b_message;
            gjoh gjoh0 = (gjoh)hftp8.N_build();
            gjoh0.getClass();
            gjoj0.g = gjoh0;
            gjoj0.b |= 16;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            gjok gjok7 = (gjok)hftp2.b_message;
            gjoj gjoj1 = (gjoj)hftp7.N_build();
            gjoj1.getClass();
            gjok7.j = gjoj1;
            gjok7.b |= 0x40;
            ProtoLiteBuilder hftp9 = this.w;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            gjok gjok8 = (gjok)hftp2.b_message;
            gjnq gjnq0 = (gjnq)hftp9.N_build();
            gjnq0.getClass();
            gjok8.k = gjnq0;
            gjok8.b |= 0x80;
            ProtoLiteBuilder hftp10 = this.k;
            if(!hftp10.b_message.isImmutable()) {
                hftp10.ensureMutable();
            }
            gjoc gjoc0 = (gjoc)hftp10.b_message;
            gjok gjok9 = (gjok)hftp2.N_build();
            gjok9.getClass();
            gjoc0.e = gjok9;
            gjoc0.b |= 4;
            gjoc gjoc1 = (gjoc)hftp10.N_build();
            baun0.j(((ProtoLiteMessage)gjoc1).toString(), new Object[0]);
            if(hygo.d()) {
                new eqtx(this.b).a(gjoc1);
                return;
            }
            if(hygo.c()) {
                eqtz eqtz0 = this.s;
                if(eqtz0 != null) {
                    eqtz0.c(((MessageLite)gjoc1));
                    return;
                }
            }
            if(hygu.c()) {
                zdi zdi0 = new zdi();
                ayvm ayvm0 = fhbe.b(this.b, zdi0);
                ayuc ayuc0 = this.l.i(((MessageLite)gjoc1));
                ayuc0.o = ayvm0;
                ayuc0.d();
                return;
            }
            this.l.i(((MessageLite)gjoc1)).d();
            return;
        }
        eqlx.a.m("Logs already sent to Clearcut. Ignoring call to log().", new Object[0]);
    }

    public final void b(int v) {
        ProtoLiteBuilder hftp0 = this.h;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjog gjog0 = (gjog)hftp0.b_message;
        gjog0.b |= 16;
        gjog0.g = v;
    }

    public final void c(int v) {
        gjna gjna0 = this.n;
        if(!gjna0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gjna0).ensureMutable();
        }
        gjnb gjnb0 = (gjnb)gjna0.b_message;
        gjnb0.b |= 2;
        gjnb0.d = v;
        this.q.add(Integer.valueOf(v));
    }

    public final void d() {
        this.z(15);
    }

    public final void e(int v) {
        ProtoLiteBuilder hftp0 = this.v;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjoa gjoa0 = (gjoa)hftp0.b_message;
        gjoa0.b |= 2;
        gjoa0.d = v;
        ProtoLiteBuilder hftp1 = this.u;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gjob gjob0 = (gjob)hftp1.b_message;
        gjoa gjoa1 = (gjoa)hftp0.N_build();
        gjoa1.getClass();
        gjob0.d = gjoa1;
        gjob0.b |= 2;
    }

    public final void f(int v) {
        ProtoLiteBuilder hftp0 = this.v;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjoa gjoa0 = (gjoa)hftp0.b_message;
        gjoa0.b |= 1;
        gjoa0.c = v;
        ProtoLiteBuilder hftp1 = this.u;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gjob gjob0 = (gjob)hftp1.b_message;
        gjoa gjoa1 = (gjoa)hftp0.N_build();
        gjoa1.getClass();
        gjob0.d = gjoa1;
        gjob0.b |= 2;
    }

    public final void g(String s, boolean z, boolean z1) {
        ProtoLiteBuilder hftp0 = this.t;
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

    public final void h(eqoc eqoc0) {
        if(eqoc0 == null) {
            return;
        }
        gjna gjna0 = this.n;
        if(!gjna0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gjna0).ensureMutable();
        }
        ((gjnb)gjna0.b_message).f = eqoc0;
        ((gjnb)gjna0.b_message).b |= 8;
    }

    public final void i(gjno gjno0) {
        ProtoLiteBuilder hftp0 = this.h;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjog gjog0 = (gjog)hftp0.b_message;
        gjno0.getClass();
        gjog0.j = gjno0;
        gjog0.b |= 0x40;
    }

    public final void j(int v) {
        ProtoLiteBuilder hftp0 = this.h;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjog gjog0 = (gjog)hftp0.b_message;
        gjog0.b |= 1;
        gjog0.c = v;
    }

    public final void k(String s) {
        ProtoLiteBuilder hftp0 = this.w;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjnq gjnq0 = (gjnq)hftp0.b_message;
        gjnq0.b |= 4;
        gjnq0.e = s;
    }

    public final void l(String s) {
        ProtoLiteBuilder hftp0 = this.w;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjnq gjnq0 = (gjnq)hftp0.b_message;
        gjnq0.b |= 1;
        gjnq0.c = s;
    }

    public final void m(long v) {
        ProtoLiteBuilder hftp0 = this.k;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjoc gjoc0 = (gjoc)hftp0.b_message;
        gjoc0.b |= 1;
        gjoc0.c = v;
    }

    public final void n(boolean z) {
        ProtoLiteBuilder hftp0 = this.j;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjng gjng0 = (gjng)hftp0.b_message;
        gjng0.b |= 2;
        gjng0.d = z;
    }

    public final void o(boolean z) {
        gjna gjna0 = this.n;
        if(!gjna0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gjna0).ensureMutable();
        }
        gjnb gjnb0 = (gjnb)gjna0.b_message;
        gjnb0.b |= 1;
        gjnb0.c = z;
    }

    public final void p(int v) {
        ProtoLiteBuilder hftp0 = this.w;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjnq gjnq0 = (gjnq)hftp0.b_message;
        gjnq0.b |= 8;
        gjnq0.f = v;
    }

    public final void q(long v) {
        ProtoLiteBuilder hftp0 = this.u;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjob gjob0 = (gjob)hftp0.b_message;
        gjob0.b |= 1;
        gjob0.c = v;
    }

    public final void r() {
        long v = SystemClock.elapsedRealtime();
        this.o.a(v - this.r);
    }

    public final void s(int v) {
        ProtoLiteBuilder hftp0 = this.j;
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

    public final void t(int v) {
        ProtoLiteBuilder hftp0 = this.e;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gjmz)hftp0.b_message).c = v - 1;
        ((gjmz)hftp0.b_message).b |= 1;
    }

    public final void u(int v) {
        ProtoLiteBuilder hftp0 = this.e;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gjmz)hftp0.b_message).e = v - 1;
        ((gjmz)hftp0.b_message).b |= 4;
    }

    public final void v(int v) {
        ProtoLiteBuilder hftp0 = this.j;
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

    public final void w(int v) {
        ProtoLiteBuilder hftp0 = this.w;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gjnq)hftp0.b_message).d = v - 1;
        ((gjnq)hftp0.b_message).b |= 2;
    }

    public final void x(int v) {
        ProtoLiteBuilder hftp0 = this.w;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gjnq)hftp0.b_message).g = v - 1;
        ((gjnq)hftp0.b_message).b |= 16;
    }

    public final void y(int v) {
        ProtoLiteBuilder hftp0 = this.e;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gjmz)hftp0.b_message).l = v - 1;
        ((gjmz)hftp0.b_message).b |= 0x400;
    }

    public final void z(int v) {
        ProtoLiteBuilder hftp0 = this.h;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gjog)hftp0.b_message).h = v - 1;
        ((gjog)hftp0.b_message).b |= 0x20;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gjoe.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gjoe)hftp1.b_message).c = v - 1;
        ((gjoe)hftp1.b_message).b |= 1;
        int v1 = glwy.a(SystemClock.elapsedRealtime() - this.p);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gjoe gjoe0 = (gjoe)hftp1.b_message;
        gjoe0.b |= 2;
        gjoe0.d = v1;
        gjoe gjoe1 = (gjoe)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjog gjog0 = (gjog)hftp0.b_message;
        gjoe1.getClass();
        hfuo hfuo0 = gjog0.i;
        if(!hfuo0.c()) {
            gjog0.i = ProtoLiteMessage.E(hfuo0);
        }
        gjog0.i.add(gjoe1);
        long v2 = SystemClock.elapsedRealtime();
        this.p = v2;
        if(v == 14) {
            this.r = v2;
        }
    }
}

