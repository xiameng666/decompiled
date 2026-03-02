public final class ascz {
    public final ProtoLiteBuilder a;

    public ascz(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final ascx a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (ascx)hftv0;
    }

    public final void b(ascs ascs0) {
        ibuq.f(ascs0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((ascx)hftp0.b_message).e = ascs0.d;
        ((ascx)hftp0.b_message).b |= 1;
    }
}

