import java.util.concurrent.TimeUnit;

public final class ccgg implements ccgn {
    public final ccgo a;
    public final String b;
    public final cccq c;
    public final int d;
    public final int e;
    public final grhj f;

    public ccgg(ccgo ccgo0, String s, cccq cccq0, int v, int v1, grhj grhj0) {
        this.a = ccgo0;
        this.b = s;
        this.c = cccq0;
        this.d = v;
        this.e = v1;
        this.f = grhj0;
    }

    @Override  // ccgn
    public final gfsz a(fnap fnap0) {
        long v2;
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)fnap0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)fnap0));
        cccq cccq0 = this.c;
        fnan fnan0 = ccgo.f(((fnao)hftp0), this.b, cccq0, this.d);
        Boolean boolean0 = Boolean.valueOf(true);
        if(fnan0 == null) {
            return new gfsz(fnap0, boolean0);
        }
        boolean z = this.e == 0;
        fnaf fnaf0 = cccq0.a();
        ccgo ccgo0 = this.a;
        if(fnak.a((fnaf0.e == null ? fnal.a : fnaf0.e).c) == 4 && z) {
            ccgo0.f.a(fnan0);
            ccgo0.d.c(0x46C);
            return new gfsz(((fnap)((ProtoLiteBuilder)(((fnao)hftp0))).N_build()), boolean0);
        }
        grhj grhj0 = this.f;
        long v = ccgo0.e.a();
        if(grhj0 == null) {
        label_24:
            double f = Math.min(1.0, Math.max(0.0, ccgo0.c.a()));
            double f1 = (double)TimeUnit.SECONDS.toMillis(ccgo0.c.g());
            v2 = ccgo0.a(((long)(f1 * (1.0 - f))), ((long)((f + 1.0) * f1)));
        }
        else {
            long v1 = grhj0.c;
            if(Long.compare(v1, 0L) > 0 || grhj0.d > 0L) {
                fnal fnal0 = fnaf0.e == null ? fnal.a : fnaf0.e;
                v2 = ccgo0.r(ccgo0.a(v1, grhj0.d), 2, true);
                if(fnak.a(fnal0.c) == 3 && z) {
                    v2 = Math.max(ccgo0.r(hfyf.e((fnal0.d == null ? hfst.a : fnal0.d)), 3, true), v2);
                }
            }
            else {
                goto label_24;
            }
        }
        hfwn hfwn0 = hfyn.h(v + v2);
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)fnan0).jf(5, null);
        hftp1.X(((ProtoLiteMessage)fnan0));
        hfwn hfwn1 = hfyn.h(v);
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
        if(grhj0 == null) {
            if(!hftv1.isImmutable()) {
                hftp1.ensureMutable();
            }
            fnan fnan2 = (fnan)hftp1.b_message;
            fnan2.o = fnam.a(6);
        }
        else {
            String s = grhj0.b;
            if(!hftv1.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp1.b_message;
            s.getClass();
            ((fnan)hftv2).m = s;
            if(!hftv2.isImmutable()) {
                hftp1.ensureMutable();
            }
            fnan fnan1 = (fnan)hftp1.b_message;
            fnan1.o = fnam.a(4);
        }
        fnan fnan3 = (fnan)hftp1.N_build();
        ((fnao)hftp0).k(fnan3);
        fnap fnap1 = (fnap)((ProtoLiteBuilder)(((fnao)hftp0))).N_build();
        ccgo0.f.b(fnan3, 0L);
        return new gfsz(fnap1, boolean0);
    }
}

