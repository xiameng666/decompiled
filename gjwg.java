public final class gjwg extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public gjwg() {
        super(((ProtoLiteMessage)gjwh.a));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        gjwh gjwh0 = (gjwh)this.b_message;
        hfuo hfuo0 = gjwh0.d;
        if(!hfuo0.c()) {
            gjwh0.d = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, gjwh0.d);
    }
}

