public final class gjzq {
    public final ProtoLiteBuilder a;

    public gjzq(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final gjzo a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (gjzo)hftv0;
    }

    public final void b(int v) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjzo gjzo0 = (gjzo)hftp0.b_message;
        gjzo0.b |= 4;
        gjzo0.f = v;
    }
}

