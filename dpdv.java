public final class dpdv extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public dpdv() {
        super(((ProtoLiteMessage)dpeb.b));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        dpeb dpeb0 = (dpeb)this.b_message;
        hfuf hfuf0 = dpeb0.u;
        if(!hfuf0.c()) {
            dpeb0.u = ProtoLiteMessage.C(hfuf0);
        }
        for(Object object0: iterable0) {
            dpeb0.u.i(((hksv)object0).a());
        }
    }

    public final void k(String s, dpdy dpdy0) {
        s.getClass();
        dpdy0.getClass();
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        ((dpeb)this.b_message).b().put(s, dpdy0);
    }
}

