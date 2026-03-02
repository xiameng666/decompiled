public final class ghoj extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public ghoj() {
        super(((ProtoLiteMessage)ghok.a));
    }

    public final void a(ghoi ghoi0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        ghok ghok0 = (ghok)this.b_message;
        ghoi0.getClass();
        hfuo hfuo0 = ghok0.b;
        if(!hfuo0.c()) {
            ghok0.b = ProtoLiteMessage.E(hfuo0);
        }
        ghok0.b.add(ghoi0);
    }

    public final void k(ghur ghur0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        ghok ghok0 = (ghok)this.b_message;
        ghur0.getClass();
        hfuo hfuo0 = ghok0.c;
        if(!hfuo0.c()) {
            ghok0.c = ProtoLiteMessage.E(hfuo0);
        }
        ghok0.c.add(ghur0);
    }
}

