public final class crst extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public crst() {
        super(((ProtoLiteMessage)crsu.a));
    }

    public final crso a(int v) {
        return (crso)((crsu)this.b_message).e.get(v);
    }

    public final void k(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        crsu crsu0 = (crsu)this.b_message;
        hfuo hfuo0 = crsu0.D;
        if(!hfuo0.c()) {
            crsu0.D = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, crsu0.D);
    }

    public final void l(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        crsu crsu0 = (crsu)this.b_message;
        crsu0.b();
        hfrj.E(iterable0, crsu0.e);
    }

    public final void m(crsn crsn0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        crsu crsu0 = (crsu)this.b_message;
        crso crso0 = (crso)((ProtoLiteBuilder)crsn0).N_build();
        crso0.getClass();
        crsu0.b();
        crsu0.e.add(crso0);
    }

    public final void n(crtg crtg0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        crsu crsu0 = (crsu)this.b_message;
        crtg0.getClass();
        crsu0.c();
        crsu0.f.add(crtg0);
    }

    public final void o(int v) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        crsu crsu0 = (crsu)this.b_message;
        crsu0.c();
        crsu0.f.remove(v);
    }

    public final void p(int v, crsn crsn0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        crsu crsu0 = (crsu)this.b_message;
        crso crso0 = (crso)((ProtoLiteBuilder)crsn0).N_build();
        crso0.getClass();
        crsu0.b();
        crsu0.e.set(v, crso0);
    }
}

