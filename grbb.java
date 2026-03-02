public final class grbb extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public grbb() {
        super(((ProtoLiteMessage)grbe.b));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        grbe grbe0 = (grbe)this.b_message;
        hfuf hfuf0 = grbe0.d;
        if(!hfuf0.c()) {
            grbe0.d = ProtoLiteMessage.C(hfuf0);
        }
        for(Object object0: iterable0) {
            grbe0.d.i(((grbd)object0).d);
        }
    }

    public final void k(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        grbe grbe0 = (grbe)this.b_message;
        grbe0.b();
        hfrj.E(iterable0, grbe0.c);
    }
}

