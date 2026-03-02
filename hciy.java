public final class hciy extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public hciy() {
        super(((ProtoLiteMessage)hcji.b));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hcji hcji0 = (hcji)this.b_message;
        hfuo hfuo0 = hcji0.Q;
        if(!hfuo0.c()) {
            hcji0.Q = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, hcji0.Q);
    }

    public final void k(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hcji hcji0 = (hcji)this.b_message;
        hfuo hfuo0 = hcji0.I;
        if(!hfuo0.c()) {
            hcji0.I = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, hcji0.I);
    }

    public final void l(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hcji hcji0 = (hcji)this.b_message;
        hfuf hfuf0 = hcji0.P;
        if(!hfuf0.c()) {
            hcji0.P = ProtoLiteMessage.C(hfuf0);
        }
        for(Object object0: iterable0) {
            hcji0.P.i(((hcix)object0).f);
        }
    }

    public final void m(hcjg hcjg0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hcji hcji0 = (hcji)this.b_message;
        hcjg0.getClass();
        hcji0.b();
        hcji0.G.i(hcjg0.k);
    }

    public final void n(hcje hcje0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hcji hcji0 = (hcji)this.b_message;
        hcje0.getClass();
        hfuo hfuo0 = hcji0.g;
        if(!hfuo0.c()) {
            hcji0.g = ProtoLiteMessage.E(hfuo0);
        }
        hcji0.g.add(hcje0);
    }

    public final void o(hcja hcja0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hcji hcji0 = (hcji)this.b_message;
        hcja0.getClass();
        hcji0.c();
        hcji0.T.i(hcja0.d);
    }
}

