public final class hlfj extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public hlfj() {
        super(((ProtoLiteMessage)hlfk.a));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hlfk hlfk0 = (hlfk)this.b_message;
        hfuo hfuo0 = hlfk0.b;
        if(!hfuo0.c()) {
            hlfk0.b = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, hlfk0.b);
    }
}

