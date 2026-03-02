public final class gzia extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public gzia() {
        super(((ProtoLiteMessage)gzic.a));
    }

    public final void a(gzib gzib0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        gzic gzic0 = (gzic)this.b_message;
        gzib0.getClass();
        hfuo hfuo0 = gzic0.b;
        if(!hfuo0.c()) {
            gzic0.b = ProtoLiteMessage.E(hfuo0);
        }
        gzic0.b.add(gzib0);
    }
}

