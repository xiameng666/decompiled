public final class bwnt extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public bwnt() {
        super(((ProtoLiteMessage)bwny.a));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        bwny bwny0 = (bwny)this.b_message;
        hfuo hfuo0 = bwny0.c;
        if(!hfuo0.c()) {
            bwny0.c = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, bwny0.c);
    }
}

