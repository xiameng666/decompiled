public final class hofb extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public hofb() {
        super(((ProtoLiteMessage)hofc.a));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hofc hofc0 = (hofc)this.b_message;
        hfuo hfuo0 = hofc0.e;
        if(!hfuo0.c()) {
            hofc0.e = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, hofc0.e);
    }

    public final void k(String s) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hofc hofc0 = (hofc)this.b_message;
        s.getClass();
        hofc0.b();
        hofc0.b.add(s);
    }
}

