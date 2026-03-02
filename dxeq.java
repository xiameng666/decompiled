public final class dxeq extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public dxeq() {
        super(((ProtoLiteMessage)dxer.a));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        dxer dxer0 = (dxer)this.b_message;
        hfuo hfuo0 = dxer0.b;
        if(!hfuo0.c()) {
            dxer0.b = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, dxer0.b);
    }
}

