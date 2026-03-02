public final class bwlb extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public bwlb() {
        super(((ProtoLiteMessage)bwld.a));
    }

    public final void a(bwlc bwlc0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        bwld bwld0 = (bwld)this.b_message;
        bwlc0.getClass();
        bwld0.b();
        bwld0.f.add(bwlc0);
    }

    public final void k(ProtoLiteBuilder hftp0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        bwld bwld0 = (bwld)this.b_message;
        bwlc bwlc0 = (bwlc)hftp0.N_build();
        bwlc0.getClass();
        bwld0.b();
        bwld0.f.add(bwlc0);
    }
}

