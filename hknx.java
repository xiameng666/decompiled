public final class hknx extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public hknx() {
        super(((ProtoLiteMessage)hknz.a));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hknz hknz0 = (hknz)this.b_message;
        hfuf hfuf0 = hknz0.h;
        if(!hfuf0.c()) {
            hknz0.h = ProtoLiteMessage.C(hfuf0);
        }
        ggqk ggqk0 = ((gged_interceptors)iterable0).E();
        while(ggqk0.hasNext()) {
            Object object0 = ggqk0.next();
            hknz0.h.i(((hkny)object0).a());
        }
    }

    public final void k(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hknz hknz0 = (hknz)this.b_message;
        hfuo hfuo0 = hknz0.e;
        if(!hfuo0.c()) {
            hknz0.e = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, hknz0.e);
    }
}

