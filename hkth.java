public final class hkth {
    public final ProtoLiteBuilder a;

    public hkth(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final hktf a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (hktf)hftv0;
    }

    public final void b(hktd hktd0) {
        ibuq.f(hktd0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hktf hktf0 = (hktf)hftp0.b_message;
        hktd0.getClass();
        hktf0.d = hktd0;
        hktf0.c = 2;
    }

    public final void c(String s) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hktf hktf0 = (hktf)hftp0.b_message;
        hktf0.b |= 1;
        hktf0.e = s;
    }

    public final void d(hkte hkte0) {
        ibuq.f(hkte0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hktf hktf0 = (hktf)hftp0.b_message;
        hkte0.getClass();
        hktf0.d = hkte0;
        hktf0.c = 3;
    }
}

