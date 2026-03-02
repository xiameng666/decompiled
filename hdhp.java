public final class hdhp extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public hdhp() {
        super(((ProtoLiteMessage)hdhq.a));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hdhq hdhq0 = (hdhq)this.b_message;
        hdhq0.b();
        hfrj.E(iterable0, hdhq0.b);
    }

    public final void k(long v) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hdhq hdhq0 = (hdhq)this.b_message;
        hdhq0.b();
        hdhq0.b.g(v);
    }
}

