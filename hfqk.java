public final class hfqk extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public hfqk() {
        super(((ProtoLiteMessage)hfql.a));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hfql hfql0 = (hfql)this.b_message;
        hfuo hfuo0 = hfql0.g;
        if(!hfuo0.c()) {
            hfql0.g = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, hfql0.g);
    }
}

