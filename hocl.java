public final class hocl extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public hocl() {
        super(((ProtoLiteMessage)hocq.a));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hocq hocq0 = (hocq)this.b_message;
        hfuo hfuo0 = hocq0.g;
        if(!hfuo0.c()) {
            hocq0.g = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, hocq0.g);
    }
}

