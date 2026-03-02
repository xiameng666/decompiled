import android.content.Context;
import android.os.SystemClock;
import java.util.List;
import java.util.concurrent.Executor;

public final class eray implements eqmd {
    public static final baun a;
    public long b;
    public gjld c;
    private static final ggeo d;
    private static eray e;
    private final ccmg f;
    private final Context g;
    private final Executor h;
    private final eqtz i;
    private final eqtx j;
    private final eros k;
    private final ProtoLiteBuilder l;

    static {
        eray.a = new erqc(new String[]{"QuickStart", "Metrics", "TargetQuickStartLogManager"});
        eray.d = ggeo.s(gjjm.c, bbdg.kE, gjjm.h, bbdg.kF, gjjm.i, bbdg.kG, gjjm.q, bbdg.kH, gjjm.E, bbdg.kI, gjjm.F, bbdg.kJ, gjjm.G, bbdg.kK, gjjm.X, bbdg.kL);
    }

    public eray(Context context0) {
        this.c = gjld.a;
        this.l = ((ProtoLiteMessage)gjjt.a).v_newBuilder();
        this.g = context0.getApplicationContext();
        this.j = new eqtx(context0);
        this.i = new eqtz(context0, new aytt(context0, "SMART_SETUP").a(), eqlt.g(context0));
        this.k = new eros(context0);
        this.h = gmap.a;
        this.f = new ccmp();
    }

    @Override  // eqmd
    public final void a(int v) {
    }

    @Override  // eqmd
    public final void b(int v) {
        this.v(v);
    }

    @Override  // eqmd
    public final void c(List list0) {
    }

    @Override  // eqmd
    public final void d(int v) {
    }

    @Override  // eqmd
    public final void e(List list0) {
        ProtoLiteBuilder hftp0 = this.l;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjjt gjjt0 = (gjjt)hftp0.b_message;
        hfuf hfuf0 = gjjt0.f;
        if(!hfuf0.c()) {
            gjjt0.f = ProtoLiteMessage.C(hfuf0);
        }
        hfrj.E(list0, gjjt0.f);
    }

    @Override  // eqmd
    public final void f(int v) {
        this.x(v);
    }

    @Override  // eqmd
    public final void g(int v) {
        this.t(v);
    }

    @Override  // eqmd
    public final void h(int v) {
        this.u(v);
    }

    public static eray i(Context context0) {
        synchronized(eray.class) {
            if(eray.e == null) {
                eray.e = new eray(context0);
            }
        }
        return eray.e;
    }

    public final void j(gjle gjle0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gjll.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjll gjll0 = (gjll)hftp0.b_message;
        gjle0.getClass();
        gjll0.c = gjle0;
        gjll0.b |= 1;
        gjll gjll1 = (gjll)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gjoc.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gjoc gjoc0 = (gjoc)hftp1.b_message;
        gjll1.getClass();
        gjoc0.k = gjll1;
        gjoc0.b |= 0x200;
        gjoc gjoc1 = (gjoc)hftp1.N_build();
        eray.a.j(((ProtoLiteMessage)gjoc1).toString(), new Object[0]);
        this.z(gjoc1);
    }

    public final void k(gjle gjle0) {
        eray.a.j("Sending QuickStart logs with Clearcut.", new Object[0]);
        ggeo ggeo0 = eray.d;
        if(ggeo0.containsKey((gjjm.b(gjle0.e) == null ? gjjm.a : gjjm.b(gjle0.e)))) {
            gjjm gjjm0 = gjjm.b(gjle0.e) == null ? gjjm.a : gjjm.b(gjle0.e);
            this.f.a(((bbdg)ggeo0.get(gjjm0)));
        }
        gmbu.t(this.k.a(), new erax(this, gjle0), this.h);
    }

    public final void l(gjiz gjiz0) {
        ProtoLiteBuilder hftp0 = this.y(gjjm.W);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjle gjle0 = (gjle)hftp0.b_message;
        gjiz0.getClass();
        gjle0.s = gjiz0;
        gjle0.b |= 0x80000;
        this.k(((gjle)hftp0.N_build()));
    }

    public final void m(gjjb gjjb0) {
        ProtoLiteBuilder hftp0 = this.y(gjjm.X);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjle gjle0 = (gjle)hftp0.b_message;
        gjjb0.getClass();
        gjle0.r = gjjb0;
        gjle0.b |= 0x40000;
        this.k(((gjle)hftp0.N_build()));
    }

    public final void n(int v, eqoc eqoc0) {
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
        ProtoLiteBuilder hftp1 = this.y(gjjm.aa);
        gjjk gjjk0 = (gjjk)hftp0.N_build();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gjle gjle0 = (gjle)hftp1.b_message;
        gjjk0.getClass();
        gjle0.f = gjjk0;
        gjle0.b |= 0x20;
        this.k(((gjle)hftp1.N_build()));
    }

    public final void o(gjjm gjjm0) {
        this.k(((gjle)this.y(gjjm0).N_build()));
    }

    public final void p() {
        ProtoLiteBuilder hftp0 = this.y(gjjm.ab);
        gjjt gjjt0 = (gjjt)this.l.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjle gjle0 = (gjle)hftp0.b_message;
        gjjt0.getClass();
        gjle0.p = gjjt0;
        gjle0.b |= 0x10000;
        this.k(((gjle)hftp0.N_build()));
    }

    public final void q(gjlg gjlg0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gjlg0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gjlg0));
        long v = this.b;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjlg gjlg1 = (gjlg)hftp0.b_message;
        gjlg1.b |= 1;
        gjlg1.c = v;
        long v1 = SystemClock.elapsedRealtime();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjlg gjlg2 = (gjlg)hftp0.b_message;
        gjlg2.b |= 2;
        gjlg2.d = v1;
        gjlg gjlg3 = (gjlg)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gjll.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gjll gjll0 = (gjll)hftp1.b_message;
        gjlg3.getClass();
        gjll0.f = gjlg3;
        gjll0.b |= 8;
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
        eray.a.j(((ProtoLiteMessage)gjoc1).toString(), new Object[0]);
        this.z(gjoc1);
    }

    public final void r(gjkz gjkz0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gjkz0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gjkz0));
        long v = this.b;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjkz gjkz1 = (gjkz)hftp0.b_message;
        gjkz1.b |= 1;
        gjkz1.c = v;
        long v1 = SystemClock.elapsedRealtime();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjkz gjkz2 = (gjkz)hftp0.b_message;
        gjkz2.b |= 2;
        gjkz2.d = v1;
        gjkz gjkz3 = (gjkz)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gjll.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gjll gjll0 = (gjll)hftp1.b_message;
        gjkz3.getClass();
        gjll0.g = gjkz3;
        gjll0.b |= 16;
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
        eray.a.j(((ProtoLiteMessage)gjoc1).toString(), new Object[0]);
        this.z(gjoc1);
    }

    public final void s(int v, int v1) {
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
        ProtoLiteBuilder hftp1 = this.y(gjjm.T);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gjle gjle0 = (gjle)hftp1.b_message;
        gjjd1.getClass();
        gjle0.z = gjjd1;
        gjle0.b |= 0x4000000;
        this.k(((gjle)hftp1.N_build()));
    }

    public final void t(int v) {
        ProtoLiteBuilder hftp0 = this.l;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjjt gjjt0 = (gjjt)hftp0.b_message;
        gjjt0.b |= 2;
        gjjt0.d = v;
    }

    public final void u(int v) {
        ProtoLiteBuilder hftp0 = this.l;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjjt gjjt0 = (gjjt)hftp0.b_message;
        gjjt0.b |= 1;
        gjjt0.c = v;
    }

    public final void v(int v) {
        ProtoLiteBuilder hftp0 = this.l;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjjt gjjt0 = (gjjt)hftp0.b_message;
        gjjt0.b |= 4;
        gjjt0.e = v;
    }

    public final void w(int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gjjc.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gjjc)hftp0.b_message).c = v - 1;
        ((gjjc)hftp0.b_message).b |= 1;
        gjjc gjjc0 = (gjjc)hftp0.N_build();
        ProtoLiteBuilder hftp1 = this.y(gjjm.ac);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gjle gjle0 = (gjle)hftp1.b_message;
        gjjc0.getClass();
        gjle0.w = gjjc0;
        gjle0.b |= 0x800000;
        this.k(((gjle)hftp1.N_build()));
    }

    public final void x(int v) {
        gjjm gjjm0;
        switch(v - 1) {
            case 7: {
                gjjm0 = gjjm.M;
                break;
            }
            case 8: {
                gjjm0 = gjjm.N;
                break;
            }
            case 9: {
                gjjm0 = gjjm.O;
                break;
            }
            case 10: {
                gjjm0 = gjjm.P;
                break;
            }
            case 12: {
                gjjm0 = gjjm.R;
                break;
            }
            default: {
                gjjm0 = gjjm.Q;
            }
        }
        this.k(((gjle)this.y(gjjm0).N_build()));
    }

    public final ProtoLiteBuilder y(gjjm gjjm0) {
        Context context0 = this.g;
        int v = eqsh.w(context0) ? 3 : 2;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gjle.a).v_newBuilder();
        long v1 = this.b;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjle gjle0 = (gjle)hftp0.b_message;
        gjle0.b |= 0x1000000;
        gjle0.x = v1;
        long v2 = System.currentTimeMillis();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjle gjle1 = (gjle)hftp0.b_message;
        gjle1.b |= 2;
        gjle1.c = v2;
        long v3 = SystemClock.elapsedRealtime();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gjle)hftv0).b |= 4;
        ((gjle)hftv0).d = v3;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((gjle)hftv1).u = v - 1;
        ((gjle)hftv1).b |= 0x200000;
        gjld gjld0 = this.c;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gjle)hftp0.b_message).g = gjld0.f;
        ((gjle)hftp0.b_message).b |= 0x40;
        int v4 = eqsh.b(context0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((gjle)hftv2).b |= 0x400000;
        ((gjle)hftv2).v = v4;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gjle)hftp0.b_message).e = gjjm0.ae;
        ((gjle)hftp0.b_message).b |= 8;
        return hftp0;
    }

    private final void z(gjoc gjoc0) {
        if(hygo.d()) {
            this.j.a(gjoc0);
            return;
        }
        this.i.d(((MessageLite)gjoc0));
    }
}

