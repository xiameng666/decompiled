public final class gzig extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public gzig() {
        super(((ProtoLiteMessage)gzik.a));
    }

    public final void a(gzij gzij0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        gzik gzik0 = (gzik)this.b_message;
        gzij0.getClass();
        hfuo hfuo0 = gzik0.b;
        if(!hfuo0.c()) {
            gzik0.b = ProtoLiteMessage.E(hfuo0);
        }
        gzik0.b.add(gzij0);
    }
}

