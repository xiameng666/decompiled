public final class gzil extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public gzil() {
        super(((ProtoLiteMessage)gzip.a));
    }

    public final void a(gzio gzio0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        gzip gzip0 = (gzip)this.b_message;
        gzio0.getClass();
        hfuo hfuo0 = gzip0.b;
        if(!hfuo0.c()) {
            gzip0.b = ProtoLiteMessage.E(hfuo0);
        }
        gzip0.b.add(gzio0);
    }
}

