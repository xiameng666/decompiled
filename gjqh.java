public final class gjqh {
    public final ProtoLiteBuilder a;

    public gjqh(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final gjvl a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (gjvl)hftv0;
    }

    public final void b(boolean z) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjvl gjvl0 = (gjvl)hftp0.b_message;
        gjvl0.b |= 1;
        gjvl0.e = z;
    }

    public final void c(boolean z) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjvl gjvl0 = (gjvl)hftp0.b_message;
        gjvl0.b |= 2;
        gjvl0.f = z;
    }
}

