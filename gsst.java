public final class gsst {
    public final gssq a;

    public gsst(gssq gssq0) {
        this.a = gssq0;
    }

    public final gssr a() {
        ProtoLiteMessage hftv0 = ((ProtoLiteBuilder)this.a).N_build();
        ibuq.e(hftv0, "build(...)");
        return (gssr)hftv0;
    }

    public final void b(gsts gsts0) {
        ibuq.f(gsts0, "value");
        gssq gssq0 = this.a;
        if(!gssq0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gssq0).ensureMutable();
        }
        gssr gssr0 = (gssr)gssq0.b_message;
        gsts0.getClass();
        gssr0.f = gsts0;
        gssr0.b |= 8;
    }
}

