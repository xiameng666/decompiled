import android.content.Context;

public final class aspm {
    private final aqqk a;

    public aspm(Context context0) {
        this.a = new aqqk(context0, true);
    }

    public final void a(gfsx gfsx0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giaq.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((giaq)hftp0.b_message).e = 7;
        ((giaq)hftp0.b_message).b |= 4;
        if(gfsx0.i()) {
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ghzd.a).v_newBuilder();
            int v = ((aqzr)gfsx0.d()).a;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((ghzd)hftp1.b_message).c = v - 1;
            ((ghzd)hftp1.b_message).b |= 1;
            int v1 = ((aqzr)gfsx0.d()).b;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((ghzd)hftp1.b_message).d = v1 - 1;
            ((ghzd)hftp1.b_message).b |= 2;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            giaq giaq0 = (giaq)hftp0.b_message;
            ghzd ghzd0 = (ghzd)hftp1.N_build();
            ghzd0.getClass();
            giaq0.g = ghzd0;
            giaq0.b |= 0x80;
        }
        this.e(((giaq)hftp0.N_build()));
    }

    public final void b(giah giah0, boolean z, boolean z1) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giai.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((giai)hftv0).c = giah0.p;
        ((giai)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((giai)hftv1).b |= 2;
        ((giai)hftv1).d = z;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        giai giai0 = (giai)hftp0.b_message;
        giai0.b |= 4;
        giai0.e = z1;
        giai giai1 = (giai)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)giaq.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp1.b_message;
        ((giaq)hftv2).e = 16;
        ((giaq)hftv2).b |= 4;
        if(!hftv2.isImmutable()) {
            hftp1.ensureMutable();
        }
        giaq giaq0 = (giaq)hftp1.b_message;
        giai1.getClass();
        giaq0.m = giai1;
        giaq0.b |= 0x2000;
        this.e(((giaq)hftp1.N_build()));
    }

    public final void c(gico gico0) {
        this.d(gico0, null);
    }

    public final void d(gico gico0, hgwl hgwl0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gibg.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gibg)hftv0).c = gico0.q;
        ((gibg)hftv0).b |= 1;
        if(hgwl0 != null) {
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gibg)hftp0.b_message).d = hgwl0.v;
            ((gibg)hftp0.b_message).b |= 2;
        }
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)giaq.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        giaq giaq0 = (giaq)hftp1.b_message;
        gibg gibg0 = (gibg)hftp0.N_build();
        gibg0.getClass();
        giaq0.c = gibg0;
        giaq0.b |= 1;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((giaq)hftp1.b_message).e = 1;
        ((giaq)hftp1.b_message).b |= 4;
        this.e(((giaq)hftp1.N_build()));
    }

    public final void e(giaq giaq0) {
        ProtoLiteBuilder hftp0 = aqra.b();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghys ghys0 = (ghys)hftp0.b_message;
        giaq0.getClass();
        ghys0.k = giaq0;
        ghys0.b |= 0x200;
        ghys ghys1 = (ghys)hftp0.N_build();
        this.a.a(ghys1, ghyr.f);
    }

    public final void f(int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giaq.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((giaq)hftp0.b_message).e = 11;
        ((giaq)hftp0.b_message).b |= 4;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ghzf.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((ghzf)hftp1.b_message).c = v - 1;
        ((ghzf)hftp1.b_message).b |= 1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        giaq giaq0 = (giaq)hftp0.b_message;
        ghzf ghzf0 = (ghzf)hftp1.N_build();
        ghzf0.getClass();
        giaq0.h = ghzf0;
        giaq0.b |= 0x100;
        this.e(((giaq)hftp0.N_build()));
    }

    public final void g(int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giab.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((giab)hftp0.b_message).c = v - 1;
        ((giab)hftp0.b_message).b |= 1;
        giab giab0 = (giab)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)giaq.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((giaq)hftv0).e = 19;
        ((giaq)hftv0).b |= 4;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        giaq giaq0 = (giaq)hftp1.b_message;
        giab0.getClass();
        giaq0.p = giab0;
        giaq0.b |= 0x10000;
        this.e(((giaq)hftp1.N_build()));
    }

    public final void h(int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gieo.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gieo)hftp0.b_message).c = v - 1;
        ((gieo)hftp0.b_message).b |= 1;
        gieo gieo0 = (gieo)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)giaq.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((giaq)hftv0).e = 13;
        ((giaq)hftv0).b |= 4;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        giaq giaq0 = (giaq)hftp1.b_message;
        gieo0.getClass();
        giaq0.j = gieo0;
        giaq0.b |= 0x400;
        this.e(((giaq)hftp1.N_build()));
    }

    public final void i(int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gifa.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gifa)hftv0).c = v - 1;
        ((gifa)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gifa gifa0 = (gifa)hftp0.b_message;
        gifa0.b |= 2;
        gifa0.d = false;
        gifa gifa1 = (gifa)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)giaq.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((giaq)hftv1).e = 14;
        ((giaq)hftv1).b |= 4;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        giaq giaq0 = (giaq)hftp1.b_message;
        gifa1.getClass();
        giaq0.k = gifa1;
        giaq0.b |= 0x800;
        this.e(((giaq)hftp1.N_build()));
    }

    public final void j(int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gifa.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gifa)hftv0).c = v - 1;
        ((gifa)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gifa gifa0 = (gifa)hftp0.b_message;
        gifa0.b |= 2;
        gifa0.d = true;
        gifa gifa1 = (gifa)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)giaq.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((giaq)hftv1).e = 14;
        ((giaq)hftv1).b |= 4;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        giaq giaq0 = (giaq)hftp1.b_message;
        gifa1.getClass();
        giaq0.k = gifa1;
        giaq0.b |= 0x800;
        this.e(((giaq)hftp1.N_build()));
    }

    public final void k(int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giaq.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((giaq)hftp0.b_message).e = 15;
        ((giaq)hftp0.b_message).b |= 4;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)giff.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((giff)hftp1.b_message).c = v - 1;
        ((giff)hftp1.b_message).b |= 1;
        giff giff0 = (giff)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        giaq giaq0 = (giaq)hftp0.b_message;
        giff0.getClass();
        giaq0.l = giff0;
        giaq0.b |= 0x1000;
        this.e(((giaq)hftp0.N_build()));
    }

    public final void l(int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gigk.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gigk)hftp0.b_message).c = v - 1;
        ((gigk)hftp0.b_message).b |= 1;
        gigk gigk0 = (gigk)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)giaq.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        gigk0.getClass();
        ((giaq)hftv0).d = gigk0;
        ((giaq)hftv0).b |= 2;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((giaq)hftp1.b_message).e = 3;
        ((giaq)hftp1.b_message).b |= 4;
        this.e(((giaq)hftp1.N_build()));
    }
}

