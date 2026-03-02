public final class gzhm extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public gzhm() {
        super(((ProtoLiteMessage)gzhn.a));
    }

    public final void a(gzkg gzkg0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        gzhn gzhn0 = (gzhn)this.b_message;
        gzkg0.getClass();
        hfuo hfuo0 = gzhn0.b;
        if(!hfuo0.c()) {
            gzhn0.b = ProtoLiteMessage.E(hfuo0);
        }
        gzhn0.b.add(gzkg0);
    }
}

