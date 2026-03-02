public final class hcqx {
    public final ProtoLiteBuilder a;

    public hcqx(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final hcrd a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (hcrd)hftv0;
    }

    public final void b(hcqz hcqz0) {
        ibuq.f(hcqz0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hcrd)hftp0.b_message).e = hcqz0.h;
        ((hcrd)hftp0.b_message).b |= 1;
    }
}

