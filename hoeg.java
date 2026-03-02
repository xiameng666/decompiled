public final class hoeg extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public hoeg() {
        super(((ProtoLiteMessage)hoeh.a));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hoeh hoeh0 = (hoeh)this.b_message;
        hfuo hfuo0 = hoeh0.f;
        if(!hfuo0.c()) {
            hoeh0.f = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, hoeh0.f);
    }
}

