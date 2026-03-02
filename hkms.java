public final class hkms extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public hkms() {
        super(((ProtoLiteMessage)hknp.b));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hknp hknp0 = (hknp)this.b_message;
        hfuf hfuf0 = hknp0.p;
        if(!hfuf0.c()) {
            hknp0.p = ProtoLiteMessage.C(hfuf0);
        }
        for(Object object0: iterable0) {
            hknp0.p.i(((hkmy)object0).a());
        }
    }

    public final void k(hjqn hjqn0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hknp hknp0 = (hknp)this.b_message;
        hjqn0.getClass();
        hknp0.b();
        hknp0.r.add(hjqn0);
    }

    public final void l(ProtoLiteBuilder hftp0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hknp hknp0 = (hknp)this.b_message;
        hjqn hjqn0 = (hjqn)hftp0.N_build();
        hjqn0.getClass();
        hknp0.b();
        hknp0.r.add(hjqn0);
    }
}

