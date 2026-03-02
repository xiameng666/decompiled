import java.util.concurrent.TimeUnit;

public final class ccfu implements ccgn {
    public final ccgo a;
    public final int b;

    public ccfu(ccgo ccgo0, int v) {
        this.a = ccgo0;
        this.b = v;
    }

    @Override  // ccgn
    public final gfsz a(fnap fnap0) {
        int v1;
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)fnap0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)fnap0));
        fnan fnan0 = ccgo.c(((fnao)hftp0), this.b);
        if(fnan0 == null) {
            return new gfsz(fnap0, null);
        }
        ccgo ccgo0 = this.a;
        cbyw cbyw0 = ccgo0.c;
        int v = 1;
        if(cbyw0.J("com.google.android.gms")) {
            v1 = 0;
        }
        else {
            ccgo0.d.c(0x490);
            v1 = 1;
        }
        long v2 = TimeUnit.SECONDS.toMillis(cbyw0.k());
        fmzy fmzy0 = ccgo0.e;
        if(Long.compare(v2, 0L) > 0 && fmzy0.a() - hfyn.b((fnan0.i == null ? hfwn.a : fnan0.i)) > v2) {
            ccgo0.d.c(0x48F);
        }
        else {
            v = v1;
        }
        if(fnan0.c == 13 && ((fnah)fnan0.d).e.isEmpty()) {
            ccgo0.d.c(0x47B);
            return new gfsz(((fnap)((ProtoLiteBuilder)(((fnao)hftp0))).N_build()), null);
        }
        if(v == 0) {
            ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)fnan0).jf(5, null);
            hftp1.X(((ProtoLiteMessage)fnan0));
            hfwn hfwn0 = hfyn.h(fmzy0.a());
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            fnan fnan1 = (fnan)hftp1.b_message;
            hfwn0.getClass();
            fnan1.j = hfwn0;
            fnan1.b |= 4;
            fnan fnan2 = (fnan)hftp1.N_build();
            ((fnao)hftp0).k(fnan2);
            return new gfsz(((fnap)((ProtoLiteBuilder)(((fnao)hftp0))).N_build()), fnan2);
        }
        return new gfsz(((fnap)((ProtoLiteBuilder)(((fnao)hftp0))).N_build()), null);
    }
}

