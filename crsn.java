public final class crsn extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public crsn() {
        super(((ProtoLiteMessage)crso.a));
    }

    public final crsq a(int v) {
        return (crsq)((crso)this.b_message).c.get(v);
    }

    public final void k(crsq crsq0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        crso crso0 = (crso)this.b_message;
        crsq0.getClass();
        crso0.b();
        crso0.c.add(crsq0);
    }

    public final void l(int v) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        crso crso0 = (crso)this.b_message;
        crso0.b();
        crso0.c.remove(v);
    }

    public final void m(int v, crsq crsq0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        crso crso0 = (crso)this.b_message;
        crsq0.getClass();
        crso0.b();
        crso0.c.set(v, crsq0);
    }

    public final void n(ProtoLiteBuilder hftp0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        crso crso0 = (crso)this.b_message;
        crsq crsq0 = (crsq)hftp0.N_build();
        crsq0.getClass();
        crso0.b();
        crso0.c.add(crsq0);
    }

    public final void o(int v, ProtoLiteBuilder hftp0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        crso crso0 = (crso)this.b_message;
        crsq crsq0 = (crsq)hftp0.N_build();
        crsq0.getClass();
        crso0.b();
        crso0.c.set(v, crsq0);
    }
}

