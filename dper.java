public final class dper extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public dper() {
        super(((ProtoLiteMessage)dpes.a));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        dpes dpes0 = (dpes)this.b_message;
        hfuo hfuo0 = dpes0.b;
        if(!hfuo0.c()) {
            dpes0.b = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, dpes0.b);
    }
}

