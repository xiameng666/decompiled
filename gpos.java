public final class gpos extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public gpos() {
        super(((ProtoLiteMessage)gpot.a));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        gpot gpot0 = (gpot)this.b_message;
        hfuo hfuo0 = gpot0.c;
        if(!hfuo0.c()) {
            gpot0.c = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, gpot0.c);
    }
}

