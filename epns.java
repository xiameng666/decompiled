public final class epns extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public epns() {
        super(((ProtoLiteMessage)epnt.a));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        epnt epnt0 = (epnt)this.b_message;
        hfuo hfuo0 = epnt0.b;
        if(!hfuo0.c()) {
            epnt0.b = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, epnt0.b);
    }
}

