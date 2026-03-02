public final class cyxp extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public cyxp() {
        super(((ProtoLiteMessage)cyxs.b));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        cyxs cyxs0 = (cyxs)this.b_message;
        hfuo hfuo0 = cyxs0.h;
        if(!hfuo0.c()) {
            cyxs0.h = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, cyxs0.h);
    }

    public final void k(cyxa cyxa0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        cyxs cyxs0 = (cyxs)this.b_message;
        cyxa0.getClass();
        hfuf hfuf0 = cyxs0.m;
        if(!hfuf0.c()) {
            cyxs0.m = ProtoLiteMessage.C(hfuf0);
        }
        cyxs0.m.i(cyxa0.d);
    }
}

