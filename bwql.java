public final class bwql extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public bwql() {
        super(((ProtoLiteMessage)bwqm.a));
    }

    public final void a(String s) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        bwqm bwqm0 = (bwqm)this.b_message;
        hfuo hfuo0 = bwqm0.c;
        if(!hfuo0.c()) {
            bwqm0.c = ProtoLiteMessage.E(hfuo0);
        }
        bwqm0.c.add(s);
    }

    public final void k(bwqg bwqg0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        bwqm bwqm0 = (bwqm)this.b_message;
        bwqk bwqk0 = (bwqk)((ProtoLiteBuilder)bwqg0).N_build();
        bwqk0.getClass();
        hfuo hfuo0 = bwqm0.b;
        if(!hfuo0.c()) {
            bwqm0.b = ProtoLiteMessage.E(hfuo0);
        }
        bwqm0.b.add(bwqk0);
    }
}

