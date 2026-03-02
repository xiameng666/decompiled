public final class hftf extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public hftf() {
        super(((ProtoLiteMessage)hftg.a));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hftg hftg0 = (hftg)this.b_message;
        hftg0.b();
        hfrj.E(iterable0, hftg0.b);
    }

    public final void k(String s) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hftg hftg0 = (hftg)this.b_message;
        hftg0.b();
        hftg0.b.add(s);
    }
}

