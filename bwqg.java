public final class bwqg extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public bwqg() {
        super(((ProtoLiteMessage)bwqk.a));
    }

    public final void a(ProtoLiteBuilder hftp0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        bwqk bwqk0 = (bwqk)this.b_message;
        bwqj bwqj0 = (bwqj)hftp0.N_build();
        bwqj0.getClass();
        hfuo hfuo0 = bwqk0.d;
        if(!hfuo0.c()) {
            bwqk0.d = ProtoLiteMessage.E(hfuo0);
        }
        bwqk0.d.add(bwqj0);
    }
}

