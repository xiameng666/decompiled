public final class gzhx extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public gzhx() {
        super(((ProtoLiteMessage)gzhz.a));
    }

    public final void a(gzhy gzhy0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        gzhz gzhz0 = (gzhz)this.b_message;
        gzhy0.getClass();
        hfuo hfuo0 = gzhz0.b;
        if(!hfuo0.c()) {
            gzhz0.b = ProtoLiteMessage.E(hfuo0);
        }
        gzhz0.b.add(gzhy0);
    }
}

