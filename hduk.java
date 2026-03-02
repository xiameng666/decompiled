public final class hduk extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public hduk() {
        super(((ProtoLiteMessage)hdul.a));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hdul hdul0 = (hdul)this.b_message;
        hdul0.b();
        hfrj.E(iterable0, hdul0.e);
    }

    public final void k(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hdul hdul0 = (hdul)this.b_message;
        hfuo hfuo0 = hdul0.h;
        if(!hfuo0.c()) {
            hdul0.h = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, hdul0.h);
    }

    public final void l(hcnu hcnu0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hdul hdul0 = (hdul)this.b_message;
        hcnu0.getClass();
        hdul0.b();
        hdul0.e.add(hcnu0);
    }
}

