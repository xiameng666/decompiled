public final class hdvu {
    private final ProtoLiteBuilder a;

    public hdvu(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final hdvv a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (hdvv)hftv0;
    }

    public final void b(hdrl hdrl0) {
        ibuq.f(hdrl0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hdvv hdvv0 = (hdvv)hftp0.b_message;
        hdrl0.getClass();
        hdvv0.c = hdrl0;
        hdvv0.b |= 1;
    }
}

