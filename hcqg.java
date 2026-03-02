public final class hcqg extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public hcqg() {
        super(((ProtoLiteMessage)hcqh.a));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hcqh hcqh0 = (hcqh)this.b_message;
        hfui hfui0 = hcqh0.b;
        if(!hfui0.c()) {
            hcqh0.b = ProtoLiteMessage.D(hfui0);
        }
        hfrj.E(iterable0, hcqh0.b);
    }

    public final void k(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hcqh hcqh0 = (hcqh)this.b_message;
        hfuo hfuo0 = hcqh0.c;
        if(!hfuo0.c()) {
            hcqh0.c = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, hcqh0.c);
    }

    public final void l(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hcqh hcqh0 = (hcqh)this.b_message;
        hfuo hfuo0 = hcqh0.d;
        if(!hfuo0.c()) {
            hcqh0.d = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, hcqh0.d);
    }
}

