public final class ftiz {
    private final ProtoLiteBuilder a;

    public ftiz(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final ftix a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (ftix)hftv0;
    }

    public final void b(long v) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((ftix)hftp0.b_message).b = v;
    }
}

