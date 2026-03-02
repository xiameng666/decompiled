public final class grec extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public grec() {
        super(((ProtoLiteMessage)gred.a));
    }

    public final void a(String s) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        gred gred0 = (gred)this.b_message;
        hfuo hfuo0 = gred0.e;
        if(!hfuo0.c()) {
            gred0.e = ProtoLiteMessage.E(hfuo0);
        }
        gred0.e.add(s);
    }
}

