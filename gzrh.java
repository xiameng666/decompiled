public final class gzrh extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public gzrh() {
        super(((ProtoLiteMessage)gzri.a));
    }

    public final void a(gzrg gzrg0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        gzri gzri0 = (gzri)this.b_message;
        gzrg0.getClass();
        hfuo hfuo0 = gzri0.c;
        if(!hfuo0.c()) {
            gzri0.c = ProtoLiteMessage.E(hfuo0);
        }
        gzri0.c.add(gzrg0);
    }
}

