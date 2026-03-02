public final class hdjt {
    private final ProtoLiteBuilder a;

    public hdjt(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final hdju a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (hdju)hftv0;
    }

    public final void b(hdjx hdjx0) {
        ibuq.f(hdjx0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hdju hdju0 = (hdju)hftp0.b_message;
        hdjx0.getClass();
        hdju0.c = hdjx0;
        hdju0.b = 1;
    }
}

