import java.io.PrintWriter;
import java.util.List;

public abstract class fvqd {
    protected final String a;
    final fwze b;
    final fwyd c;
    final fwzp d;
    final fxzs e;
    final fvrj f;
    public boolean g;
    final fvqa h;
    protected fvpz i;
    int j;
    private boolean k;

    public fvqd(String s, fwze fwze0, fwyd fwyd0, fwzp fwzp0, fvrj fvrj0, fxzs fxzs0, fvqa fvqa0, int v) {
        this.k = true;
        this.g = false;
        this.b = fwze0;
        this.d = fwzp0;
        this.c = fwyd0;
        this.f = fvrj0;
        this.e = fxzs0;
        this.h = fvqa0;
        this.j = v;
        this.a = s;
        this.i = new fvpx();
    }

    protected boolean A() {
        return false;
    }

    protected static boolean B(cjds cjds0, cjds cjds1) {
        return GeoMath.a(cjds0.b(), cjds0.c(), cjds1.b(), cjds1.c()) < 25.0;
    }

    protected static gwtl C(fwyd fwyd0, cjds cjds0, fvtm fvtm0, fvvj fvvj0, fuxg fuxg0, boolean z, int v, boolean z1) {
        ProtoLiteBuilder hftp0 = fyau.a();
        long v1 = fwyd0.a();
        if(cjds0 != null) {
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gwtr.a).v_newBuilder();
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gwtn.a).v_newBuilder();
            int v2 = GeoMath.l(cjds0.b());
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            gwtn gwtn0 = (gwtn)hftp2.b_message;
            gwtn0.b |= 1;
            gwtn0.c = v2;
            int v3 = GeoMath.l(cjds0.c());
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            gwtn gwtn1 = (gwtn)hftp2.b_message;
            gwtn1.b |= 2;
            gwtn1.d = v3;
            gwtn gwtn2 = (gwtn)hftp2.N_build();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp1.b_message;
            gwtn2.getClass();
            ((gwtr)hftv0).c = gwtn2;
            ((gwtr)hftv0).b |= 1;
            if(!hftv0.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((gwtr)hftp1.b_message).f = 0;
            ((gwtr)hftp1.b_message).b |= 0x40;
            long v4 = cjds0.g();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp1.b_message;
            ((gwtr)hftv1).b |= 16;
            ((gwtr)hftv1).e = v4;
            if(!hftv1.isImmutable()) {
                hftp1.ensureMutable();
            }
            gwtr gwtr0 = (gwtr)hftp1.b_message;
            gwtr0.b |= 0x8000;
            gwtr0.k = z;
            int v5 = (int)cjds0.d();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gwtr gwtr1 = (gwtr)hftp1.b_message;
            gwtr1.b |= 4;
            gwtr1.d = v5;
            if(cjds0.a.hasSpeed()) {
                float f = cjds0.f();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gwtr gwtr2 = (gwtr)hftp1.b_message;
                gwtr2.b |= 0x4000;
                gwtr2.j = f;
            }
            if(cjds0.i()) {
                int v6 = (int)cjds0.e();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gwtr gwtr3 = (gwtr)hftp1.b_message;
                gwtr3.b |= 0x800;
                gwtr3.i = v6;
            }
            if((fvtm0 != null || fvvj0 != null) && cjds0.h()) {
                int v7 = (int)cjds0.a();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gwtr gwtr4 = (gwtr)hftp1.b_message;
                gwtr4.b |= 0x100;
                gwtr4.g = v7;
                float f1 = (float)cjds0.a();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gwtr gwtr5 = (gwtr)hftp1.b_message;
                gwtr5.b |= 0x100000;
                gwtr5.l = f1;
            }
            gwtr gwtr6 = (gwtr)hftp1.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwtl gwtl0 = (gwtl)hftp0.b_message;
            gwtr6.getClass();
            gwtl0.e = gwtr6;
            gwtl0.b |= 4;
            long v8 = cjds0.g();
            long v9 = cjds0.b + v1 - v8;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwtl gwtl1 = (gwtl)hftp0.b_message;
            gwtl1.b |= 0x80;
            gwtl1.j = v9;
            byte[] arr_b = cjds0.d;
            if(z1 && arr_b != null) {
                try {
                    ProtoLiteMessage hftv2 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gwrv.a), arr_b, 0, arr_b.length, hftc.a);
                    ProtoLiteMessage.P_makeImmutable(hftv2);
                    gwuu gwuu0 = (gwuu)((ProtoLiteMessage)gwuv.a).v_newBuilder();
                    ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gwse.a).v_newBuilder();
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    gwse gwse0 = (gwse)hftp3.b_message;
                    ((gwrv)hftv2).getClass();
                    gwse0.d = (gwrv)hftv2;
                    gwse0.b |= 2;
                    if(!gwuu0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)gwuu0).ensureMutable();
                    }
                    gwuv gwuv0 = (gwuv)gwuu0.b_message;
                    gwse gwse1 = (gwse)hftp3.N_build();
                    gwse1.getClass();
                    gwuv0.c();
                    gwuv0.u.add(gwse1);
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gwtl gwtl2 = (gwtl)hftp0.b_message;
                    gwuv gwuv1 = (gwuv)((ProtoLiteBuilder)gwuu0).N_build();
                    gwuv1.getClass();
                    gwtl2.h = gwuv1;
                    gwtl2.b |= 0x20;
                }
                catch(hfur unused_ex) {
                }
            }
        }
        if(fvtm0 != null) {
            long v10 = fwyd0.a();
            ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)gwtg.a).v_newBuilder();
            long v11 = v10 + fvtm0.f;
            if(!hftp4.b_message.isImmutable()) {
                hftp4.ensureMutable();
            }
            gwtg gwtg0 = (gwtg)hftp4.b_message;
            gwtg0.b |= 2;
            gwtg0.d = v11;
            gwtf gwtf0 = fvth.b(fvtm0, ((long)fvtm0.e()));
            if(!hftp4.b_message.isImmutable()) {
                hftp4.ensureMutable();
            }
            gwtg gwtg1 = (gwtg)hftp4.b_message;
            gwtf0.getClass();
            gwtg1.c = gwtf0;
            gwtg1.b |= 1;
            gged_interceptors gged0 = fvtm0.g;
            if(gged0 != null) {
                int v12 = gged0.size();
                for(int v13 = 0; v13 < v12; ++v13) {
                    fvtm fvtm1 = (fvtm)gged0.get(v13);
                    gwtf gwtf1 = fvth.b(fvtm1, ((long)fvtm1.e()));
                    if(!hftp4.b_message.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    gwtg gwtg2 = (gwtg)hftp4.b_message;
                    gwtf1.getClass();
                    gwtg2.b();
                    gwtg2.e.add(gwtf1);
                }
            }
            gwtg gwtg3 = (gwtg)hftp4.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwtl gwtl3 = (gwtl)hftp0.b_message;
            gwtg3.getClass();
            gwtl3.c = gwtg3;
            gwtl3.b |= 1;
        }
        if(fvvj0 != null && fvvj0.d() > 0) {
            gwvd gwvd0 = (gwvd)((ProtoLiteMessage)gwve.a).v_newBuilder();
            long v14 = fvvj0.m() + v1;
            if(!gwvd0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gwvd0).ensureMutable();
            }
            gwve gwve0 = (gwve)gwvd0.b_message;
            gwve0.b |= 1;
            gwve0.c = v14;
            int v15 = Math.min(fvvj0.d(), 25);
            for(int v16 = 0; v16 < v15; ++v16) {
                ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)gwvc.a).v_newBuilder();
                if(!hftp5.b_message.isImmutable()) {
                    hftp5.ensureMutable();
                }
                gwvc.b(((gwvc)hftp5.b_message));
                long v17 = fvvj0.l(v16);
                if(!hftp5.b_message.isImmutable()) {
                    hftp5.ensureMutable();
                }
                gwvc gwvc0 = (gwvc)hftp5.b_message;
                gwvc0.b |= 0x80;
                gwvc0.e = v17;
                int v18 = fvvj0.j(v16);
                if(!hftp5.b_message.isImmutable()) {
                    hftp5.ensureMutable();
                }
                gwvc gwvc1 = (gwvc)hftp5.b_message;
                gwvc1.b |= 8;
                gwvc1.d = v18;
                int v19 = fvvj0.g(v16);
                if(!hupd.h()) {
                    if(!hftp5.b_message.isImmutable()) {
                        hftp5.ensureMutable();
                    }
                    gwvc gwvc3 = (gwvc)hftp5.b_message;
                    gwvc3.b |= 0x20000;
                    gwvc3.k = v19;
                }
                else if(v19 != 0) {
                    if(!hftp5.b_message.isImmutable()) {
                        hftp5.ensureMutable();
                    }
                    gwvc gwvc2 = (gwvc)hftp5.b_message;
                    gwvc2.b |= 0x20000;
                    gwvc2.k = v19;
                }
                int v20 = fvvj0.k(v16);
                if(v20 != -1) {
                    if(!hftp5.b_message.isImmutable()) {
                        hftp5.ensureMutable();
                    }
                    gwvc gwvc4 = (gwvc)hftp5.b_message;
                    gwvc4.b |= 0x8000;
                    gwvc4.j = v20;
                }
                int v21 = fvvj0.t(v16, 0);
                if(v21 != -1) {
                    ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)gwuz.a).v_newBuilder();
                    if(!hftp6.b_message.isImmutable()) {
                        hftp6.ensureMutable();
                    }
                    gwuz gwuz0 = (gwuz)hftp6.b_message;
                    gwuz0.b |= 1;
                    gwuz0.c = v21;
                    int v22 = fvvj0.t(v16, 1);
                    if(v22 != -1) {
                        if(!hftp6.b_message.isImmutable()) {
                            hftp6.ensureMutable();
                        }
                        gwuz gwuz1 = (gwuz)hftp6.b_message;
                        gwuz1.b |= 2;
                        gwuz1.d = v22;
                        int v23 = fvvj0.t(v16, 2);
                        if(v23 != -1) {
                            if(!hftp6.b_message.isImmutable()) {
                                hftp6.ensureMutable();
                            }
                            gwuz gwuz2 = (gwuz)hftp6.b_message;
                            gwuz2.b |= 4;
                            gwuz2.e = v23;
                        }
                    }
                    gwuz gwuz3 = (gwuz)hftp6.N_build();
                    if(!hftp5.b_message.isImmutable()) {
                        hftp5.ensureMutable();
                    }
                    gwvc gwvc5 = (gwvc)hftp5.b_message;
                    gwuz3.getClass();
                    gwvc5.m = gwuz3;
                    gwvc5.b |= 0x80000;
                }
                long v24 = fvvj0.n(v16);
                if(v24 != 0L) {
                    int v25 = (int)Math.abs(fvvj0.m() - v24);
                    if(!hftp5.b_message.isImmutable()) {
                        hftp5.ensureMutable();
                    }
                    gwvc gwvc6 = (gwvc)hftp5.b_message;
                    gwvc6.b |= 0x400;
                    gwvc6.h = v25;
                }
                fvvf.b(hftp5, fvvj0.g(v16));
                gwvd0.a(((gwvc)hftp5.N_build()));
            }
            gwve gwve1 = (gwve)((ProtoLiteBuilder)gwvd0).N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwtl gwtl4 = (gwtl)hftp0.b_message;
            gwve1.getClass();
            gwtl4.d = gwve1;
            gwtl4.b |= 2;
        }
        if(fuxg0 != null) {
            ProtoLiteBuilder hftp7 = ((ProtoLiteMessage)gwri.a).v_newBuilder();
            long v26 = fuxg0.c + v1;
            if(!hftp7.b_message.isImmutable()) {
                hftp7.ensureMutable();
            }
            ProtoLiteMessage hftv3 = hftp7.b_message;
            ((gwri)hftv3).b |= 1;
            ((gwri)hftv3).c = v26;
            int v27 = fuxg0.d;
            if(!hftv3.isImmutable()) {
                hftp7.ensureMutable();
            }
            gwri gwri0 = (gwri)hftp7.b_message;
            gwri0.b |= 2;
            gwri0.e = v27;
            List list0 = fuxg0.a;
            if(list0 != null) {
                for(Object object0: list0) {
                    ProtoLiteBuilder hftp8 = ((ProtoLiteMessage)gwrh.a).v_newBuilder();
                    int v28 = ((fuxi)object0).a.x;
                    if(!hftp8.b_message.isImmutable()) {
                        hftp8.ensureMutable();
                    }
                    ProtoLiteMessage hftv4 = hftp8.b_message;
                    ((gwrh)hftv4).b |= 1;
                    ((gwrh)hftv4).c = v28;
                    int v29 = ((fuxi)object0).b;
                    if(!hftv4.isImmutable()) {
                        hftp8.ensureMutable();
                    }
                    gwrh gwrh0 = (gwrh)hftp8.b_message;
                    gwrh0.b |= 2;
                    gwrh0.d = v29;
                    gwrh gwrh1 = (gwrh)hftp8.N_build();
                    if(!hftp7.b_message.isImmutable()) {
                        hftp7.ensureMutable();
                    }
                    gwri gwri1 = (gwri)hftp7.b_message;
                    gwrh1.getClass();
                    hfuo hfuo0 = gwri1.d;
                    if(!hfuo0.c()) {
                        gwri1.d = ProtoLiteMessage.E(hfuo0);
                    }
                    gwri1.d.add(gwrh1);
                }
            }
            gwri gwri2 = (gwri)hftp7.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwtl gwtl5 = (gwtl)hftp0.b_message;
            gwri2.getClass();
            gwtl5.k = gwri2;
            gwtl5.b |= 0x1000;
        }
        gwtk gwtk0 = ((gwtl)hftp0.b_message).n;
        if(gwtk0 == null) {
            gwtk0 = gwtk.a;
        }
        ProtoLiteBuilder hftp9 = (ProtoLiteBuilder)((ProtoLiteMessage)gwtk0).jf(5, null);
        hftp9.X(((ProtoLiteMessage)gwtk0));
        if(!hftp9.b_message.isImmutable()) {
            hftp9.ensureMutable();
        }
        gwtk gwtk1 = (gwtk)hftp9.b_message;
        gwtk1.b |= 1;
        gwtk1.c = v;
        gwtk gwtk2 = (gwtk)hftp9.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwtl gwtl6 = (gwtl)hftp0.b_message;
        gwtk2.getClass();
        gwtl6.n = gwtk2;
        gwtl6.b |= 0x8000;
        return (gwtl)hftp0.N_build();
    }

    public void D(Object object0) {
    }

    private final String E() {
        return "fault from instance of " + this.getClass().getSimpleName();
    }

    public abstract int a();

    public void b(fwzf fwzf0) {
    }

    public void c(int v, int v1, boolean z) {
    }

    public void d(fvtm fvtm0) {
    }

    public void e(PrintWriter printWriter0) {
    }

    public void f(boolean z) {
    }

    public void g(fuxg fuxg0) {
    }

    public void h(boolean z) {
        this.g = z;
    }

    public void i(long v) {
    }

    public void j(boolean z) {
    }

    public void k() {
    }

    public void l() {
        this.k = false;
    }

    public void m(boolean z) {
    }

    public void n(fvpz fvpz0) {
        this.i = fvpz0;
    }

    public void o() {
        boolean z;
        while(true) {
            int v = this.j;
            long v1 = this.c.b();
            int v2 = this.j - 1;
            if(this.j == 0) {
                break;
            }
            switch(v2) {
                case 0: {
                    throw new RuntimeException(this.E());
                }
                case 1: {
                    z = this.s(v1);
                    break;
                }
                case 2: {
                    z = this.r(v1);
                    break;
                }
                case 3: {
                    throw new RuntimeException(this.E());
                }
                case 4: {
                    throw new RuntimeException(this.E());
                }
                case 5: {
                    z = this.t(v1);
                    break;
                }
                case 6: {
                    throw new RuntimeException(this.E());
                }
                case 7: {
                    z = this.A();
                    break;
                }
                case 8: {
                    z = this.z();
                    break;
                }
                default: {
                    throw new RuntimeException(null, null);
                }
            }
            if(v != this.j) {
                int v3 = this.a();
                fvwz fvwz0 = this.b.mH();
                int v4 = this.j;
                if(v == 0 || v4 == 0) {
                    throw null;
                }
                fvwz0.a(new fvqj(fvwz0.f(), v - 1 << 8 | v3 | v4 - 1 << 16, v3, v, v4));
            }
            if(!z) {
                return;
            }
        }
        throw null;
    }

    public void p(fvvj fvvj0) {
    }

    public void q(boolean z) {
    }

    protected boolean r(long v) {
        throw new RuntimeException(this.E());
    }

    protected boolean s(long v) {
        throw new RuntimeException(this.E());
    }

    protected boolean t(long v) {
        throw new RuntimeException(this.E());
    }

    protected boolean u() {
        return this.k && !this.g && fvqi.b();
    }

    public boolean v() {
        return this.j == 1 || this.j == 2;
    }

    public void w(cjds cjds0) {
    }

    protected static boolean x(fuxg fuxg0, cjds cjds0) {
        return cjds0 == null ? false : Math.abs(fuxg0.c - cjds0.b) <= 360000L;
    }

    protected static boolean y(hecp hecp0, cjds cjds0) {
        return hecp0 != null && cjds0 != null && Math.abs(hecp0.m() - cjds0.b) <= 720000L;
    }

    protected boolean z() {
        return false;
    }
}

