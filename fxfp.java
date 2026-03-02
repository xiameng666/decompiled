final class fxfp {
    private final kba a;
    private final kba b;
    private gxpf c;
    private long d;

    static {
        bboh.c("EQMon", bbcu.g, "QuakeTime");
    }

    public fxfp(kba kba0, kba kba1) {
        this.a = kba0;
        this.b = kba1;
    }

    final long a(long v) {
        return v / 1000000L + (((long)(((Long)this.b.a()))) - ((long)(((Long)this.a.a()))));
    }

    final long b() {
        return (long)(((Long)this.a.a()));
    }

    final fxfo c(long v) {
        gxpf gxpf0 = this.c;
        long v1 = this.d;
        return gxpf0 == null ? new fxfm() : new fxfn(this, gxpf0, v, v1);
    }

    final fxfo d() {
        return this.c(this.b());
    }

    final void e(int v, gxph gxph0) {
        long v1 = this.b();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gxpf.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gxpf)hftv0).d = v;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gxpf gxpf0 = (gxpf)hftp0.b_message;
        gxph0.getClass();
        gxpf0.c = gxph0;
        gxpf0.b |= 1;
        gxpf gxpf1 = (gxpf)hftp0.N_build();
        if(this.c != null && ((this.c.c == null ? gxph.a : this.c.c).b + huwe.a.e().k() > (gxpf1.c == null ? gxph.a : gxpf1.c).b && this.c.d < gxpf1.d)) {
            return;
        }
        this.c = gxpf1;
        this.d = v1;
    }
}

