public final class hlrg extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public hlrg() {
        super(((ProtoLiteMessage)hlrh.a));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hlrh hlrh0 = (hlrh)this.b_message;
        hlrh0.b();
        hfrj.E(iterable0, hlrh0.f);
    }

    public final void k(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hlrh hlrh0 = (hlrh)this.b_message;
        hfuf hfuf0 = hlrh0.g;
        if(!hfuf0.c()) {
            hlrh0.g = ProtoLiteMessage.C(hfuf0);
        }
        hfrj.E(iterable0, hlrh0.g);
    }
}

