import java.util.concurrent.TimeUnit;

public final class ccfx implements ccgn {
    public final ccgo a;
    public final String b;
    public final cccq c;
    public final int d;
    public final int e;

    public ccfx(ccgo ccgo0, String s, cccq cccq0, int v, int v1) {
        this.a = ccgo0;
        this.b = s;
        this.c = cccq0;
        this.d = v;
        this.e = v1;
    }

    @Override  // ccgn
    public final gfsz a(fnap fnap0) {
        hfwn hfwn0;
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)fnap0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)fnap0));
        cccq cccq0 = this.c;
        fnan fnan0 = ccgo.f(((fnao)hftp0), this.b, cccq0, this.d);
        Boolean boolean0 = Boolean.valueOf(true);
        if(fnan0 == null) {
            return new gfsz(fnap0, boolean0);
        }
        ccgo ccgo0 = this.a;
        fnah fnah0 = cccq0.c();
        if((fnah0.b & 1) != 0) {
            int v = this.e;
            if(ccgo.o(fnah0) && v == 0) {
                ccgo0.f.a(fnan0);
                ccgo0.d.c(0x46C);
                ccgo0.p(fnah0);
                return new gfsz(((fnap)((ProtoLiteBuilder)(((fnao)hftp0))).N_build()), boolean0);
            }
            long v1 = ccgo.b(cccq0.c());
            long v2 = ccgo0.e.a();
            fnal fnal0 = fnah0.f == null ? fnal.a : fnah0.f;
            int v3 = fnak.a(fnal0.c) == 0 ? 1 : fnak.a(fnal0.c);
            int v4 = 2;
            if(v == 2) {
                hfwn0 = hfyn.h(TimeUnit.SECONDS.toMillis(ccgo0.c.e()) + v2);
            }
            else {
                long v5 = TimeUnit.SECONDS.toMillis(ccgo0.c.m());
                if(v != 0) {
                    v1 = v5;
                }
                hfwn0 = hfyn.h(ccgo0.r(v1, v3, false) + v2);
            }
            switch(v) {
                case 0: {
                    v4 = 5;
                    break;
                }
                case 1: {
                    v4 = 6;
                    break;
                }
                case 2: {
                    v4 = 7;
                }
            }
            ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)fnan0).jf(5, null);
            hftp1.X(((ProtoLiteMessage)fnan0));
            hfwn hfwn1 = hfyn.h(v2);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp1.b_message;
            hfwn1.getClass();
            ((fnan)hftv0).k = hfwn1;
            ((fnan)hftv0).b |= 8;
            if(!hftv0.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp1.b_message;
            hfwn0.getClass();
            ((fnan)hftv1).l = hfwn0;
            ((fnan)hftv1).b |= 16;
            if(!hftv1.isImmutable()) {
                hftp1.ensureMutable();
            }
            fnan fnan1 = (fnan)hftp1.b_message;
            fnan1.o = fnam.a(v4);
            fnan fnan2 = (fnan)hftp1.N_build();
            ((fnao)hftp0).k(fnan2);
            fnap fnap1 = (fnap)((ProtoLiteBuilder)(((fnao)hftp0))).N_build();
            ccgo0.f.b(fnan2, 0L);
            return new gfsz(fnap1, boolean0);
        }
        ccgo0.f.a(fnan0);
        ccgo0.d.c(0x46B);
        ccgo0.p(fnah0);
        return new gfsz(((fnap)((ProtoLiteBuilder)(((fnao)hftp0))).N_build()), boolean0);
    }
}

