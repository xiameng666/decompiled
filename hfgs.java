public final class hfgs extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public hfgs() {
        super(((ProtoLiteMessage)hfgu.a));
    }

    public final void a(hfgt hfgt0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hfgu hfgu0 = (hfgu)this.b_message;
        hfgt0.getClass();
        hfgu0.b();
        hfgu0.c.add(hfgt0);
    }

    public final void k(ProtoLiteBuilder hftp0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hfgu hfgu0 = (hfgu)this.b_message;
        hfgt hfgt0 = (hfgt)hftp0.N_build();
        hfgt0.getClass();
        hfgu0.b();
        hfgu0.c.add(hfgt0);
    }
}

