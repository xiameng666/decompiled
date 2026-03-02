public final class bwox extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public bwox() {
        super(((ProtoLiteMessage)bwpi.a));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        bwpi bwpi0 = (bwpi)this.b_message;
        hfuo hfuo0 = bwpi0.d;
        if(!hfuo0.c()) {
            bwpi0.d = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, bwpi0.d);
    }

    public final void k(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        bwpi bwpi0 = (bwpi)this.b_message;
        bwpi0.c();
        hfrj.E(iterable0, bwpi0.e);
    }

    public final void l(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        bwpi bwpi0 = (bwpi)this.b_message;
        hfuf hfuf0 = bwpi0.s;
        if(!hfuf0.c()) {
            bwpi0.s = ProtoLiteMessage.C(hfuf0);
        }
        hfrj.E(iterable0, bwpi0.s);
    }

    public final void m(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        bwpi bwpi0 = (bwpi)this.b_message;
        hfuo hfuo0 = bwpi0.f;
        if(!hfuo0.c()) {
            bwpi0.f = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, bwpi0.f);
    }

    public final void n(bwoz bwoz0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        bwpi bwpi0 = (bwpi)this.b_message;
        bwoz0.getClass();
        bwpi0.b();
        bwpi0.c.add(bwoz0);
    }

    public final void o(bwph bwph0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        bwpi bwpi0 = (bwpi)this.b_message;
        bwph0.getClass();
        bwpi0.c();
        bwpi0.e.add(bwph0);
    }
}

