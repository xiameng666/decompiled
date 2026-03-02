public final class gser extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public gser() {
        super(((ProtoLiteMessage)gset.a));
    }

    @Deprecated
    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        gset gset0 = (gset)this.b_message;
        hfuf hfuf0 = gset0.f;
        if(!hfuf0.c()) {
            gset0.f = ProtoLiteMessage.C(hfuf0);
        }
        hfrj.E(iterable0, gset0.f);
    }
}

