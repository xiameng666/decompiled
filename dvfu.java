import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Valuable;

public final class dvfu {
    public final dmgi a;
    public final dmgm b;

    public dvfu(dmgi dmgi0, dmgm dmgm0) {
        this.a = dmgi0;
        this.b = dmgm0;
    }

    public final void a(boolean z) {
        hard hard0 = (hard)((ProtoLiteMessage)harg.a).v_newBuilder();
        if(!hard0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hard0).ensureMutable();
        }
        ((harg)hard0.b_message).b = (z ? 18 : 19) - 2;
        harg harg0 = (harg)((ProtoLiteBuilder)hard0).N_build();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hapr.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hapr hapr0 = (hapr)hftp0.b_message;
        harg0.getClass();
        hapr0.ao = harg0;
        hapr0.d |= 0x800;
        this.b.a(hftp0);
    }

    public final void b(boolean z) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hapr.a).v_newBuilder();
        hard hard0 = (hard)((ProtoLiteMessage)harg.a).v_newBuilder();
        if(!hard0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hard0).ensureMutable();
        }
        ((harg)hard0.b_message).c = 3;
        if(!hard0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hard0).ensureMutable();
        }
        ((harg)hard0.b_message).b = (z ? 7 : 6) - 2;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hapr hapr0 = (hapr)hftp0.b_message;
        harg harg0 = (harg)((ProtoLiteBuilder)hard0).N_build();
        harg0.getClass();
        hapr0.ao = harg0;
        hapr0.d |= 0x800;
        hapr hapr1 = (hapr)hftp0.N_build();
        this.a.b(hapr1);
    }

    public final void c(boolean z) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hapr.a).v_newBuilder();
        hard hard0 = (hard)((ProtoLiteMessage)harg.a).v_newBuilder();
        if(!hard0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hard0).ensureMutable();
        }
        ((harg)hard0.b_message).c = 3;
        if(!hard0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hard0).ensureMutable();
        }
        ((harg)hard0.b_message).b = (z ? 14 : 15) - 2;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hapr hapr0 = (hapr)hftp0.b_message;
        harg harg0 = (harg)((ProtoLiteBuilder)hard0).N_build();
        harg0.getClass();
        hapr0.ao = harg0;
        hapr0.d |= 0x800;
        this.b.a(hftp0);
    }

    public final void d(int v, int v1, guwf guwf0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hapr.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)harc.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((harc)hftv0).e = v - 2;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((harc)hftv1).d = v1 - 2;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        harc harc0 = (harc)hftp1.b_message;
        harc0.b = guwf0.a();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hapr hapr0 = (hapr)hftp0.b_message;
        harc harc1 = (harc)hftp1.N_build();
        harc1.getClass();
        hapr0.l = harc1;
        hapr0.b |= 8;
        if(guwf0 == guwf.i) {
            this.b.a(hftp0);
            return;
        }
        hapr hapr1 = (hapr)hftp0.N_build();
        this.a.b(hapr1);
    }

    public final void e(String s, int v, int v1) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hapr.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)haik.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        s.getClass();
        ((haik)hftv0).c = s;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((haik)hftv1).b = v - 2;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((haik)hftp1.b_message).d = (long)v1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hapr hapr0 = (hapr)hftp0.b_message;
        haik haik0 = (haik)hftp1.N_build();
        haik0.getClass();
        hapr0.K = haik0;
        hapr0.c |= 0x200;
        hapr hapr1 = (hapr)hftp0.N_build();
        this.a.b(hapr1);
    }

    public final void f(int v, Valuable valuable0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hapr.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hamv.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((hamv)hftv0).b = v - 2;
        guwf guwf0 = valuable0.R;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        hamv hamv0 = (hamv)hftp1.b_message;
        hamv0.c = guwf0.a();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hapr hapr0 = (hapr)hftp0.b_message;
        hamv hamv1 = (hamv)hftp1.N_build();
        hamv1.getClass();
        hapr0.bN = hamv1;
        hapr0.g |= 0x8000;
        this.b.a(hftp0);
    }

    public final void g(int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hapr.a).v_newBuilder();
        hard hard0 = (hard)((ProtoLiteMessage)harg.a).v_newBuilder();
        if(!hard0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hard0).ensureMutable();
        }
        ((harg)hard0.b_message).b = v - 2;
        if(!hard0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hard0).ensureMutable();
        }
        ((harg)hard0.b_message).c = 3;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hapr hapr0 = (hapr)hftp0.b_message;
        harg harg0 = (harg)((ProtoLiteBuilder)hard0).N_build();
        harg0.getClass();
        hapr0.ao = harg0;
        hapr0.d |= 0x800;
        this.b.a(hftp0);
    }

    public final void h(int v, guwf guwf0) {
        hard hard0 = (hard)((ProtoLiteMessage)harg.a).v_newBuilder();
        if(!hard0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hard0).ensureMutable();
        }
        harg harg0 = (harg)hard0.b_message;
        harg0.f = guwf0.a();
        if(!hard0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hard0).ensureMutable();
        }
        ((harg)hard0.b_message).b = v - 2;
        harg harg1 = (harg)((ProtoLiteBuilder)hard0).N_build();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hapr.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hapr hapr0 = (hapr)hftp0.b_message;
        harg1.getClass();
        hapr0.ao = harg1;
        hapr0.d |= 0x800;
        this.b.a(hftp0);
    }

    public final void i(int v, String s, Iterable iterable0) {
        this.k(v, s, iterable0, false);
    }

    public final void j(int v, String s, guwf guwf0, Iterable iterable0) {
        hard hard0 = (hard)((ProtoLiteMessage)harg.a).v_newBuilder();
        hard0.a(iterable0);
        if(!hard0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hard0).ensureMutable();
        }
        harg harg0 = (harg)hard0.b_message;
        harg0.f = guwf0.a();
        if(!hard0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hard0).ensureMutable();
        }
        ((harg)hard0.b_message).b = v - 2;
        if(s != null) {
            if(!hard0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hard0).ensureMutable();
            }
            ((harg)hard0.b_message).d = s;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hapr.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hapr hapr0 = (hapr)hftp0.b_message;
        harg harg1 = (harg)((ProtoLiteBuilder)hard0).N_build();
        harg1.getClass();
        hapr0.ao = harg1;
        hapr0.d |= 0x800;
        this.b.a(hftp0);
    }

    public final void k(int v, String s, Iterable iterable0, boolean z) {
        hard hard0 = (hard)((ProtoLiteMessage)harg.a).v_newBuilder();
        hard0.a(iterable0);
        if(!hard0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hard0).ensureMutable();
        }
        ((harg)hard0.b_message).b = v - 2;
        if(s != null) {
            if(!hard0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hard0).ensureMutable();
            }
            ((harg)hard0.b_message).d = s;
        }
        if(z) {
            if(!hard0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hard0).ensureMutable();
            }
            ((harg)hard0.b_message).g = 2;
        }
        else {
            if(!hard0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hard0).ensureMutable();
            }
            ((harg)hard0.b_message).g = 1;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hapr.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hapr hapr0 = (hapr)hftp0.b_message;
        harg harg0 = (harg)((ProtoLiteBuilder)hard0).N_build();
        harg0.getClass();
        hapr0.ao = harg0;
        hapr0.d |= 0x800;
        this.b.a(hftp0);
    }

    public final void l(Valuable valuable0, int v, int v1) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hapr.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)harv.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        guwf guwf0 = valuable0.R;
        harv harv0 = (harv)hftp1.b_message;
        harv0.b = guwf0.a();
        String s = valuable0.c;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        s.getClass();
        ((harv)hftv0).c = s;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((harv)hftv1).d = v - 2;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((harv)hftp1.b_message).e = v1 - 2;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hapr hapr0 = (hapr)hftp0.b_message;
        harv harv1 = (harv)hftp1.N_build();
        harv1.getClass();
        hapr0.bM = harv1;
        hapr0.g |= 0x4000;
        this.b.a(hftp0);
    }

    public final void m(int v, int v1, Valuable valuable0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hamz.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((hamz)hftv0).b = v - 2;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((hamz)hftv1).f = v1 - 2;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((hamz)hftv2).g = 3;
        if(valuable0 != null) {
            if(!hftv2.isImmutable()) {
                hftp0.ensureMutable();
            }
            guwf guwf0 = valuable0.R;
            hamz hamz0 = (hamz)hftp0.b_message;
            hamz0.c = guwf0.a();
            String s = valuable0.c;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv3 = hftp0.b_message;
            s.getClass();
            ((hamz)hftv3).d = s;
            String s1 = valuable0.b;
            if(!hftv3.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv4 = hftp0.b_message;
            s1.getClass();
            ((hamz)hftv4).e = s1;
            int v2 = dvfu.n(valuable0);
            if(!hftv4.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((hamz)hftp0.b_message).h = v2 - 2;
        }
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hapr.a).v_newBuilder();
        hamz hamz1 = (hamz)hftp0.N_build();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hapr hapr0 = (hapr)hftp1.b_message;
        hamz1.getClass();
        hapr0.p = hamz1;
        hapr0.b |= 0x80;
        if(valuable0 != null && valuable0.R == guwf.i) {
            this.b.a(hftp1);
            return;
        }
        hapr hapr1 = (hapr)hftp1.N_build();
        this.a.b(hapr1);
    }

    public static final int n(Valuable valuable0) {
        return valuable0.i ? 4 : 3;
    }

    public final void o(int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hapr.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hars.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((hars)hftv0).c = v - 2;
        ((hars)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((hars)hftv1).d = 1;
        ((hars)hftv1).b |= 2;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp1.b_message;
        ((hars)hftv2).e = 2;
        ((hars)hftv2).b |= 4;
        if(!hftv2.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((hars)hftp1.b_message).f = 3;
        ((hars)hftp1.b_message).b |= 8;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hapr hapr0 = (hapr)hftp0.b_message;
        hars hars0 = (hars)hftp1.N_build();
        hars0.getClass();
        hapr0.bV = hars0;
        hapr0.g |= 0x10000000;
        hapr hapr1 = (hapr)hftp0.N_build();
        this.a.b(hapr1);
    }
}

