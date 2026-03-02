public final class hnnw extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public hnnw() {
        super(((ProtoLiteMessage)hnnx.a));
    }

    public final void a(hnod hnod0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hnnx hnnx0 = (hnnx)this.b_message;
        hnod0.getClass();
        hfuo hfuo0 = hnnx0.d;
        if(!hfuo0.c()) {
            hnnx0.d = ProtoLiteMessage.E(hfuo0);
        }
        hnnx0.d.add(hnod0);
    }
}

