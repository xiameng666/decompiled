public final class gzow extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public gzow() {
        super(((ProtoLiteMessage)gzox.a));
    }

    public final void a(hguu hguu0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        gzox gzox0 = (gzox)this.b_message;
        hguu0.getClass();
        hfuo hfuo0 = gzox0.b;
        if(!hfuo0.c()) {
            gzox0.b = ProtoLiteMessage.E(hfuo0);
        }
        gzox0.b.add(hguu0);
    }
}

