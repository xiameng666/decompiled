import android.content.Context;
import android.os.SystemClock;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public final class aqys {
    public int a;
    public int b;
    public int c;
    public int d;
    public final Context e;
    public static final int f;
    private static final baun g;
    private final gful_cronetEngineProvider h;
    private final aqqk i;
    private boolean j;

    static {
        aqys.g = aqql.a("ClearcutEventLogger");
    }

    public aqys(Context context0) {
        gful_cronetEngineProvider gful0 = gfus.a(((gful_cronetEngineProvider)new aqyr(context0)));
        super();
        this.h = gful0;
        this.i = new aqqk(context0);
        this.e = context0;
        this.j = true;
    }

    private static boolean A(gifo gifo0) {
        return gifo0 == gifo.c || gifo0 == gifo.d || gifo0 == gifo.e || gifo0 == gifo.g || gifo0 == gifo.i || gifo0 == gifo.h || gifo0 == gifo.j;
    }

    public final void a(aqzf aqzf0) {
        this.z(aqzf0, null, this.a);
        this.j = true;
    }

    public final void b(long v, long v1) {
        ProtoLiteBuilder hftp0 = aqra.b();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gidr.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((gidr)hftv0).c = 14;
        ((gidr)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((gidr)hftv1).b |= 0x800;
        ((gidr)hftv1).m = v;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        gidr gidr0 = (gidr)hftp1.b_message;
        gidr0.b |= 0x1000;
        gidr0.n = v1;
        gidr gidr1 = (gidr)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghys ghys0 = (ghys)hftp0.b_message;
        gidr1.getClass();
        ghys0.H = gidr1;
        ghys0.c |= 0x400;
        this.x(hftp0, ghyr.O, this.c);
    }

    public final void c(boolean z) {
        ProtoLiteBuilder hftp0 = aqra.b();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gidr.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((gidr)hftv0).c = 7;
        ((gidr)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gidr)hftp1.b_message).g = (z ? 2 : 3) - 1;
        ((gidr)hftp1.b_message).b |= 16;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghys ghys0 = (ghys)hftp0.b_message;
        gidr gidr0 = (gidr)hftp1.N_build();
        gidr0.getClass();
        ghys0.H = gidr0;
        ghys0.c |= 0x400;
        this.x(hftp0, ghyr.O, this.c);
    }

    public final void d() {
        ProtoLiteBuilder hftp0 = aqra.b();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gidz.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gidz)hftp1.b_message).c = 5;
        ((gidz)hftp1.b_message).b |= 1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghys ghys0 = (ghys)hftp0.b_message;
        gidz gidz0 = (gidz)hftp1.N_build();
        gidz0.getClass();
        ghys0.J = gidz0;
        ghys0.c |= 0x1000;
        this.x(hftp0, ghyr.Q, this.d);
    }

    public final void e(aqzf aqzf0, String s) {
        this.z(aqzf0, s, this.b);
    }

    public final void f(int v) {
        ProtoLiteBuilder hftp0 = aqra.b();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ghzo.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((ghzo)hftp1.b_message).c = v - 1;
        ((ghzo)hftp1.b_message).b |= 1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghys ghys0 = (ghys)hftp0.b_message;
        ghzo ghzo0 = (ghzo)hftp1.N_build();
        ghzo0.getClass();
        ghys0.m = ghzo0;
        ghys0.b |= 0x800;
        this.x(hftp0, ghyr.h, this.a);
        this.j = true;
    }

    public final void g(int v, int v1) {
        this.h(v, v1, 0);
    }

    public final void h(int v, int v1, int v2) {
        ProtoLiteBuilder hftp0 = aqra.b();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ghzq.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((ghzq)hftv0).c = v - 1;
        ((ghzq)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((ghzq)hftv1).d = v1 - 1;
        ((ghzq)hftv1).b |= 2;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        ghzq ghzq0 = (ghzq)hftp1.b_message;
        ghzq0.b |= 4;
        ghzq0.e = v2;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghys ghys0 = (ghys)hftp0.b_message;
        ghzq ghzq1 = (ghzq)hftp1.N_build();
        ghzq1.getClass();
        ghys0.n = ghzq1;
        ghys0.b |= 0x1000;
        this.x(hftp0, ghyr.i, this.a);
        if(v1 == 4) {
            this.j = true;
        }
    }

    public final void i(int v, String s, boolean z, boolean z1, int v1) {
        ProtoLiteBuilder hftp0 = aqra.b();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gial.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((gial)hftv0).c = v - 1;
        ((gial)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((gial)hftv1).b |= 4;
        ((gial)hftv1).e = z;
        if(s != null) {
            if(!hftv1.isImmutable()) {
                hftp1.ensureMutable();
            }
            gial gial0 = (gial)hftp1.b_message;
            gial0.b |= 2;
            gial0.d = s;
        }
        if(z1) {
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gial gial1 = (gial)hftp1.b_message;
            gial1.b |= 8;
            gial1.f = true;
        }
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gial)hftp1.b_message).g = v1 - 1;
        ((gial)hftp1.b_message).b |= 16;
        if(aqxa.n(this.e)) {
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gial gial2 = (gial)hftp1.b_message;
            gial2.b |= 0x20;
            gial2.h = true;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghys ghys0 = (ghys)hftp0.b_message;
        gial gial3 = (gial)hftp1.N_build();
        gial3.getClass();
        ghys0.l = gial3;
        ghys0.b |= 0x400;
        if(this.j) {
            this.a = aqra.a();
            this.j = false;
        }
        this.x(hftp0, ghyr.g, this.a);
    }

    public final void j(int v) {
        ProtoLiteBuilder hftp0 = aqra.b();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gidr.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((gidr)hftv0).c = 9;
        ((gidr)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gidr)hftp1.b_message).f = v - 1;
        ((gidr)hftp1.b_message).b |= 8;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghys ghys0 = (ghys)hftp0.b_message;
        gidr gidr0 = (gidr)hftp1.N_build();
        gidr0.getClass();
        ghys0.H = gidr0;
        ghys0.c |= 0x400;
        this.x(hftp0, ghyr.O, this.c);
    }

    public final void k(int v, String s, Exception exception0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gidm.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gidm gidm0 = (gidm)hftp0.b_message;
        gidm0.b |= 1;
        gidm0.c = s;
        String s1 = exception0.getClass().getSimpleName();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        s1.getClass();
        ((gidm)hftv0).b |= 2;
        ((gidm)hftv0).d = s1;
        if((exception0 instanceof aqxy)) {
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            ((gidm)hftv1).b |= 2;
            ((gidm)hftv1).d = "HttpStatusException";
            int v1 = ((aqxy)exception0).a;
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            gidm gidm1 = (gidm)hftp0.b_message;
            gidm1.b |= 4;
            gidm1.e = v1;
        }
        ProtoLiteBuilder hftp1 = aqra.b();
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gidr.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp2.b_message;
        ((gidr)hftv2).c = 9;
        ((gidr)hftv2).b |= 1;
        if(!hftv2.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp2.b_message;
        ((gidr)hftv3).f = v - 1;
        ((gidr)hftv3).b |= 8;
        if(!hftv3.isImmutable()) {
            hftp2.ensureMutable();
        }
        gidr gidr0 = (gidr)hftp2.b_message;
        gidm gidm2 = (gidm)hftp0.N_build();
        gidm2.getClass();
        gidr0.q = gidm2;
        gidr0.b |= 0x8000;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ghys ghys0 = (ghys)hftp1.b_message;
        gidr gidr1 = (gidr)hftp2.N_build();
        gidr1.getClass();
        ghys0.H = gidr1;
        ghys0.c |= 0x400;
        this.x(hftp1, ghyr.O, this.c);
    }

    public final void l(int v, long v1) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gidr.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gidr)hftv0).c = 6;
        ((gidr)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gidr)hftp0.b_message).h = v - 1;
        ((gidr)hftp0.b_message).b |= 0x20;
        if(hqje.H()) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gidr gidr0 = (gidr)hftp0.b_message;
            gidr0.b |= 0x40;
            gidr0.i = v1;
        }
        ProtoLiteBuilder hftp1 = aqra.b();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ghys ghys0 = (ghys)hftp1.b_message;
        gidr gidr1 = (gidr)hftp0.N_build();
        gidr1.getClass();
        ghys0.H = gidr1;
        ghys0.c |= 0x400;
        int v2 = aqra.a();
        this.c = v2;
        this.x(hftp1, ghyr.O, v2);
    }

    public final void m(int v) {
        ProtoLiteBuilder hftp0 = aqra.b();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gidz.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((gidz)hftv0).c = 4;
        ((gidz)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gidz)hftp1.b_message).e = v - 1;
        ((gidz)hftp1.b_message).b |= 4;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghys ghys0 = (ghys)hftp0.b_message;
        gidz gidz0 = (gidz)hftp1.N_build();
        gidz0.getClass();
        ghys0.J = gidz0;
        ghys0.c |= 0x1000;
        this.x(hftp0, ghyr.Q, this.d);
    }

    public final void n(String s, int v) {
        ProtoLiteBuilder hftp0 = aqra.b();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gidz.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gidz)hftp1.b_message).c = 8;
        ((gidz)hftp1.b_message).b |= 1;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gieb.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp2.b_message;
        ((gieb)hftv0).b |= 2;
        ((gieb)hftv0).d = s;
        if(!hftv0.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((gieb)hftp2.b_message).c = v - 1;
        ((gieb)hftp2.b_message).b |= 1;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gidz gidz0 = (gidz)hftp1.b_message;
        gieb gieb0 = (gieb)hftp2.N_build();
        gieb0.getClass();
        gidz0.h = gieb0;
        gidz0.b |= 0x20;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghys ghys0 = (ghys)hftp0.b_message;
        gidz gidz1 = (gidz)hftp1.N_build();
        gidz1.getClass();
        ghys0.J = gidz1;
        ghys0.c |= 0x1000;
        this.x(hftp0, ghyr.Q, this.d);
    }

    public final void o(int v, String s) {
        this.p(v, s, false);
    }

    public final void p(int v, String s, boolean z) {
        ProtoLiteBuilder hftp0 = aqra.b();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)giee.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((giee)hftv0).c = v - 1;
        ((giee)hftv0).b |= 1;
        if(s != null) {
            if(!hftv0.isImmutable()) {
                hftp1.ensureMutable();
            }
            giee giee0 = (giee)hftp1.b_message;
            giee0.b |= 2;
            giee0.d = s;
        }
        if(z) {
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            giee giee1 = (giee)hftp1.b_message;
            giee1.b |= 4;
            giee1.e = true;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghys ghys0 = (ghys)hftp0.b_message;
        giee giee2 = (giee)hftp1.N_build();
        giee2.getClass();
        ghys0.q = giee2;
        ghys0.b |= 0x8000;
        this.x(hftp0, ghyr.l, this.b);
    }

    public final void q(int v) {
        ProtoLiteBuilder hftp0 = aqra.b();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gifl.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((gifl)hftv0).c = 1;
        ((gifl)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((gifl)hftv1).d = v - 1;
        ((gifl)hftv1).b |= 2;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        gifl gifl0 = (gifl)hftp1.b_message;
        gifl0.b |= 4;
        gifl0.e = false;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghys ghys0 = (ghys)hftp0.b_message;
        gifl gifl1 = (gifl)hftp1.N_build();
        gifl1.getClass();
        ghys0.af = gifl1;
        ghys0.d |= 0x40;
        this.x(hftp0, ghyr.ar, this.c);
    }

    public final void r(int v, gifo gifo0, int v1) {
        this.s(v, gifo0, v1, 0);
    }

    public final void s(int v, gifo gifo0, int v1, int v2) {
        this.t(v, gifo0, v1, v2, 0);
    }

    public final void t(int v, gifo gifo0, int v1, int v2, int v3) {
        int v4;
        ProtoLiteBuilder hftp0 = aqra.b();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gifp.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((gifp)hftv0).d = v - 1;
        ((gifp)hftv0).b |= 2;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((gifp)hftv1).c = gifo0.m;
        ((gifp)hftv1).b |= 1;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp1.b_message;
        ((gifp)hftv2).e = v1 - 1;
        ((gifp)hftv2).b |= 4;
        if(!hftv2.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp1.b_message;
        ((gifp)hftv3).b |= 8;
        ((gifp)hftv3).f = v2;
        if(!hftv3.isImmutable()) {
            hftp1.ensureMutable();
        }
        gifp gifp0 = (gifp)hftp1.b_message;
        gifp0.b |= 16;
        gifp0.g = v3;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghys ghys0 = (ghys)hftp0.b_message;
        gifp gifp1 = (gifp)hftp1.N_build();
        gifp1.getClass();
        ghys0.o = gifp1;
        ghys0.b |= 0x2000;
        if(aqys.A(gifo0) && v1 == 4) {
            this.j = true;
        }
        ghyr ghyr0 = ghyr.j;
        if(aqys.A(gifo0)) {
            v4 = this.a;
        }
        else if(gifo0 == gifo.f) {
            v4 = this.b;
        }
        else {
            if(gifo0 != gifo.b) {
                aqys.g.f("RequestErrorEvent logged with an unknown request type %s, can\'t set flow id.", new Object[]{gifo0});
            }
            v4 = 0;
        }
        this.x(hftp0, ghyr0, v4);
    }

    public final void u(int v, boolean z, boolean z1) {
        ProtoLiteBuilder hftp0 = aqra.b();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gifr.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((gifr)hftv0).c = v - 1;
        ((gifr)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((gifr)hftv1).b |= 2;
        ((gifr)hftv1).d = z;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        gifr gifr0 = (gifr)hftp1.b_message;
        gifr0.b |= 4;
        gifr0.e = z1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghys ghys0 = (ghys)hftp0.b_message;
        gifr gifr1 = (gifr)hftp1.N_build();
        gifr1.getClass();
        ghys0.r = gifr1;
        ghys0.b |= 0x10000;
        this.x(hftp0, ghyr.m, this.b);
    }

    public final void v(int v, int v1, String s) {
        ProtoLiteBuilder hftp0 = aqra.b();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gift.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((gift)hftv0).c = v - 1;
        ((gift)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((gift)hftv1).e = v1 - 1;
        ((gift)hftv1).b |= 4;
        if(s != null) {
            if(!hftv1.isImmutable()) {
                hftp1.ensureMutable();
            }
            gift gift0 = (gift)hftp1.b_message;
            gift0.b |= 2;
            gift0.d = s;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghys ghys0 = (ghys)hftp0.b_message;
        gift gift1 = (gift)hftp1.N_build();
        gift1.getClass();
        ghys0.t = gift1;
        ghys0.b |= 0x40000;
        this.x(hftp0, ghyr.o, this.b);
    }

    public final void w(int v) {
        ProtoLiteBuilder hftp0 = aqra.b();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gigf.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gigf)hftp1.b_message).c = v - 1;
        ((gigf)hftp1.b_message).b |= 1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghys ghys0 = (ghys)hftp0.b_message;
        gigf gigf0 = (gigf)hftp1.N_build();
        gigf0.getClass();
        ghys0.I = gigf0;
        ghys0.c |= 0x800;
        this.x(hftp0, ghyr.P, 0);
    }

    public final void x(ProtoLiteBuilder hftp0, ghyr ghyr0, int v) {
        hqlt hqlt0 = hqlt.a;
        if(!hqlt0.o().ae()) {
            aqys.g.d("Dropping transport Clearcut log event because logging is disabled by gservice.", new Object[0]);
            return;
        }
        int v1 = (int)hqlt.f();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghys ghys0 = (ghys)hftp0.b_message;
        ghys0.b |= 0x200000;
        ghys0.w = v1;
        if(hqlt0.o().aP()) {
            aqyo aqyo0 = (aqyo)this.h.mr();
            ghys ghys1 = (ghys)hftp0.N_build();
            aqyo0.c.mkdirs();
            long v2 = SystemClock.elapsedRealtime();
            File file0 = aqyo0.a(v2, 0);
            int v3 = 0;
            while(file0.exists()) {
                ++v3;
                file0 = aqyo0.a(v2, v3);
            }
            try {
                Object[] arr_object = {file0.getName()};
                aqyo.a.j("Dumping log to file %s", arr_object);
                try(FileOutputStream fileOutputStream0 = new FileOutputStream(file0)) {
                    ghys1.writeToStream(fileOutputStream0);
                }
            }
            catch(IOException iOException0) {
                aqyo.a.n("Failed to dump log", iOException0, new Object[0]);
            }
            return;
        }
        ghys ghys2 = (ghys)hftp0.N_build();
        this.i.b(ghys2, ghyr0, Long.valueOf(v));
    }

    public final void y(int v) {
        this.v(v, 4, null);
    }

    private final void z(aqzf aqzf0, String s, int v) {
        int v1;
        ProtoLiteBuilder hftp0 = aqra.b();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gidd.a).v_newBuilder();
        switch(aqzf0.ordinal()) {
            case 1: {
                v1 = 2;
                break;
            }
            case 2: {
                v1 = 3;
                break;
            }
            case 3: {
                v1 = 4;
                break;
            }
            case 4: {
                v1 = 5;
                break;
            }
            case 5: {
                v1 = 6;
                break;
            }
            case 6: {
                v1 = 7;
                break;
            }
            case 7: {
                v1 = 8;
                break;
            }
            case 8: {
                v1 = 9;
                break;
            }
            case 9: {
                v1 = 10;
                break;
            }
            case 10: {
                v1 = 11;
                break;
            }
            default: {
                aqys.g.f("Ineligible event logged with an unknown eligibility value: %s", new Object[]{aqzf0});
                v1 = 1;
            }
        }
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((gidd)hftv0).c = v1 - 1;
        ((gidd)hftv0).b |= 1;
        if(s != null) {
            if(!hftv0.isImmutable()) {
                hftp1.ensureMutable();
            }
            gidd gidd0 = (gidd)hftp1.b_message;
            gidd0.b |= 2;
            gidd0.d = s;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghys ghys0 = (ghys)hftp0.b_message;
        gidd gidd1 = (gidd)hftp1.N_build();
        gidd1.getClass();
        ghys0.v = gidd1;
        ghys0.b |= 0x100000;
        this.x(hftp0, ghyr.q, v);
    }
}

