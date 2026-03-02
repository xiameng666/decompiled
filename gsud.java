public final class gsud extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public gsud() {
        super(((ProtoLiteMessage)gsue.a));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        gsue gsue0 = (gsue)this.b_message;
        hfuo hfuo0 = gsue0.d;
        if(!hfuo0.c()) {
            gsue0.d = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, gsue0.d);
    }
}

