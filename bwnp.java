public final class bwnp extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public bwnp() {
        super(((ProtoLiteMessage)bwnq.a));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        bwnq bwnq0 = (bwnq)this.b_message;
        bwnq0.c();
        hfrj.E(iterable0, bwnq0.l);
    }

    public final void k(bwlo bwlo0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        bwnq bwnq0 = (bwnq)this.b_message;
        bwlo0.getClass();
        bwnq0.b();
        bwnq0.k.add(bwlo0);
    }
}

