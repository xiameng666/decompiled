public final class hdvc extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public hdvc() {
        super(((ProtoLiteMessage)hdvd.a));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hdvd hdvd0 = (hdvd)this.b_message;
        hfuo hfuo0 = hdvd0.f;
        if(!hfuo0.c()) {
            hdvd0.f = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, hdvd0.f);
    }

    public final void k(hcos hcos0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hdvd hdvd0 = (hdvd)this.b_message;
        hcos0.getClass();
        hfuo hfuo0 = hdvd0.d;
        if(!hfuo0.c()) {
            hdvd0.d = ProtoLiteMessage.E(hfuo0);
        }
        hdvd0.d.add(hcos0);
    }
}

