public final class bwon extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public bwon() {
        super(((ProtoLiteMessage)bwop.a));
    }

    public final void a(bwki bwki0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        bwop bwop0 = (bwop)this.b_message;
        hfuo hfuo0 = bwop0.d;
        if(!hfuo0.c()) {
            bwop0.d = ProtoLiteMessage.E(hfuo0);
        }
        bwop0.d.add(bwki0);
    }
}

