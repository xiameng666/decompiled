public final class gzxb {
    public final ProtoLiteBuilder a;

    public gzxb(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final gzxm a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (gzxm)hftv0;
    }

    public final void b(gzyb gzyb0) {
        ibuq.f(gzyb0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gzxm gzxm0 = (gzxm)hftp0.b_message;
        gzyb0.getClass();
        gzxm0.d = gzyb0;
        gzxm0.b |= 2;
    }
}

