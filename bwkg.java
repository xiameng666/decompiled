public final class bwkg extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public bwkg() {
        super(((ProtoLiteMessage)bwki.a));
    }

    public final void a(bwkh bwkh0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        bwki bwki0 = (bwki)this.b_message;
        bwkh0.getClass();
        hfuo hfuo0 = bwki0.d;
        if(!hfuo0.c()) {
            bwki0.d = ProtoLiteMessage.E(hfuo0);
        }
        bwki0.d.add(bwkh0);
    }
}

