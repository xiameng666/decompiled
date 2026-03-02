public final class hkfr {
    public final ProtoLiteBuilder a;

    public hkfr(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final hkfp a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (hkfp)hftv0;
    }

    public final void b(long v) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hkfp)hftp0.b_message).c = v;
    }

    public final void c(gtpr gtpr0) {
        ibuq.f(gtpr0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hkfp hkfp0 = (hkfp)hftp0.b_message;
        gtpr0.getClass();
        hkfp0.i = gtpr0;
        hkfp0.b |= 2;
    }

    public final void d(ByteString hfsf0) {
        ibuq.f(hfsf0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hkfp hkfp0 = (hkfp)hftp0.b_message;
        hfsf0.getClass();
        hkfp0.h = hfsf0;
    }

    public final void e(String s) {
        ibuq.f(s, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hkfp hkfp0 = (hkfp)hftp0.b_message;
        s.getClass();
        hkfp0.j = s;
    }

    public final void f(String s) {
        ibuq.f(s, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hkfp hkfp0 = (hkfp)hftp0.b_message;
        s.getClass();
        hkfp0.d = s;
    }

    public final void g(hjih hjih0) {
        ibuq.f(hjih0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hkfp hkfp0 = (hkfp)hftp0.b_message;
        hjih0.getClass();
        hkfp0.e = hjih0;
        hkfp0.b |= 1;
    }
}

