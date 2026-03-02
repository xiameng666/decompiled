public final class hfay extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public hfay() {
        super(((ProtoLiteMessage)hfaz.a));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hfaz hfaz0 = (hfaz)this.b_message;
        hfaz0.b();
        hfrj.E(iterable0, hfaz0.b);
    }
}

