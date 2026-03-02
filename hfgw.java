public final class hfgw extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public hfgw() {
        super(((ProtoLiteMessage)hfgx.a));
    }

    public final void a(henu henu0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hfgx hfgx0 = (hfgx)this.b_message;
        henu0.getClass();
        hfuo hfuo0 = hfgx0.b;
        if(!hfuo0.c()) {
            hfgx0.b = ProtoLiteMessage.E(hfuo0);
        }
        hfgx0.b.add(henu0);
    }
}

