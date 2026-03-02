public final class gijt extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public gijt() {
        super(((ProtoLiteMessage)giju.a));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        giju giju0 = (giju)this.b_message;
        hfuo hfuo0 = giju0.g;
        if(!hfuo0.c()) {
            giju0.g = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, giju0.g);
    }
}

