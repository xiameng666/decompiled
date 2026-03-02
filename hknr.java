public final class hknr {
    public final hkms a;

    public hknr(hkms hkms0) {
        this.a = hkms0;
    }

    public final hknp a() {
        ProtoLiteMessage hftv0 = ((ProtoLiteBuilder)this.a).N_build();
        ibuq.e(hftv0, "build(...)");
        return (hknp)hftv0;
    }

    public final void b(hjqu hjqu0) {
        ibuq.f(hjqu0, "value");
        hkms hkms0 = this.a;
        if(!hkms0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hkms0).ensureMutable();
        }
        hknp hknp0 = (hknp)hkms0.b_message;
        hjqu0.getClass();
        hknp0.g = hjqu0;
        hknp0.c |= 1;
    }
}

