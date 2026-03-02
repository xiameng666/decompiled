public final class hlje extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public hlje() {
        super(((ProtoLiteMessage)hljf.a));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hljf hljf0 = (hljf)this.b_message;
        hljf0.b();
        hfrj.E(iterable0, hljf0.e);
    }

    public final void k(hleg hleg0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hljf hljf0 = (hljf)this.b_message;
        hleg0.getClass();
        hljf0.b();
        hljf0.e.add(hleg0);
    }
}

