public final class hdin {
    private final ProtoLiteBuilder a;

    public hdin(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final hdio a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (hdio)hftv0;
    }

    public final void b(hdil hdil0) {
        ibuq.f(hdil0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hdio hdio0 = (hdio)hftp0.b_message;
        hdil0.getClass();
        hdio0.c = hdil0;
        hdio0.b |= 1;
    }
}

