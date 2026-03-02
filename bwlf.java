public final class bwlf extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public bwlf() {
        super(((ProtoLiteMessage)bwlo.b));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        bwlo bwlo0 = (bwlo)this.b_message;
        hfuo hfuo0 = bwlo0.k;
        if(!hfuo0.c()) {
            bwlo0.k = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, bwlo0.k);
    }

    public final void k(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        bwlo bwlo0 = (bwlo)this.b_message;
        hfuf hfuf0 = bwlo0.j;
        if(!hfuf0.c()) {
            bwlo0.j = ProtoLiteMessage.C(hfuf0);
        }
        for(Object object0: iterable0) {
            bwlo0.j.i(((bwln)object0).d);
        }
    }
}

