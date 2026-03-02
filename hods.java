public final class hods extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public hods() {
        super(((ProtoLiteMessage)hodt.a));
    }

    public final void a(String s) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hodt hodt0 = (hodt)this.b_message;
        s.getClass();
        hfuo hfuo0 = hodt0.c;
        if(!hfuo0.c()) {
            hodt0.c = ProtoLiteMessage.E(hfuo0);
        }
        hodt0.c.add(s);
    }

    public final void k(String s) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hodt hodt0 = (hodt)this.b_message;
        s.getClass();
        hfuo hfuo0 = hodt0.b;
        if(!hfuo0.c()) {
            hodt0.b = ProtoLiteMessage.E(hfuo0);
        }
        hodt0.b.add(s);
    }
}

