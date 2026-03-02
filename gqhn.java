public final class gqhn extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public gqhn() {
        super(((ProtoLiteMessage)gqhr.a));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        gqhr gqhr0 = (gqhr)this.b_message;
        hfuo hfuo0 = gqhr0.d;
        if(!hfuo0.c()) {
            gqhr0.d = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, gqhr0.d);
    }

    public final void k(ProtoLiteBuilder hftp0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        gqhr gqhr0 = (gqhr)this.b_message;
        gqhq gqhq0 = (gqhq)hftp0.N_build();
        gqhq0.getClass();
        hfuo hfuo0 = gqhr0.e;
        if(!hfuo0.c()) {
            gqhr0.e = ProtoLiteMessage.E(hfuo0);
        }
        gqhr0.e.add(gqhq0);
    }
}

