public final class hkvb extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public hkvb() {
        super(((ProtoLiteMessage)hkvd.c));
    }

    public final void a(hkva hkva0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hkvd hkvd0 = (hkvd)this.b_message;
        hkva0.getClass();
        hfuf hfuf0 = hkvd0.e;
        if(!hfuf0.c()) {
            hkvd0.e = ProtoLiteMessage.C(hfuf0);
        }
        hkvd0.e.i(hkva0.a());
    }

    public final void k(hkvc hkvc0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hkvd hkvd0 = (hkvd)this.b_message;
        hkvc0.getClass();
        hfuf hfuf0 = hkvd0.f;
        if(!hfuf0.c()) {
            hkvd0.f = ProtoLiteMessage.C(hfuf0);
        }
        hkvd0.f.i(hkvc0.a());
    }
}

