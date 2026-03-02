public final class gzhu extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public gzhu() {
        super(((ProtoLiteMessage)gzhw.a));
    }

    public final void a(gzhv gzhv0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        gzhw gzhw0 = (gzhw)this.b_message;
        gzhv0.getClass();
        hfuo hfuo0 = gzhw0.b;
        if(!hfuo0.c()) {
            gzhw0.b = ProtoLiteMessage.E(hfuo0);
        }
        gzhw0.b.add(gzhv0);
    }
}

