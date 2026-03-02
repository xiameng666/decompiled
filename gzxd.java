public final class gzxd {
    public final ProtoLiteBuilder a;

    public gzxd(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final gzzc a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (gzzc)hftv0;
    }

    public final void b(gzxz gzxz0) {
        ibuq.f(gzxz0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gzzc gzzc0 = (gzzc)hftp0.b_message;
        gzzc0.h = gzxz0.a();
    }
}

