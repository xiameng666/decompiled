public final class gziq extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public gziq() {
        super(((ProtoLiteMessage)gzis.a));
    }

    public final void a(gzir gzir0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        gzis gzis0 = (gzis)this.b_message;
        gzir0.getClass();
        hfuo hfuo0 = gzis0.b;
        if(!hfuo0.c()) {
            gzis0.b = ProtoLiteMessage.E(hfuo0);
        }
        gzis0.b.add(gzir0);
    }
}

