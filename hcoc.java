public final class hcoc {
    private final ProtoLiteBuilder a;

    public hcoc(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final hcoj a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (hcoj)hftv0;
    }

    public final void b(hcog hcog0) {
        ibuq.f(hcog0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hcoj)hftp0.b_message).d = hcog0.g;
        ((hcoj)hftp0.b_message).b |= 2;
    }
}

