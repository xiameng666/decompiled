public final class bwkt extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public bwkt() {
        super(((ProtoLiteMessage)bwkv.a));
    }

    public final void a(bwks bwks0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        bwkv bwkv0 = (bwkv)this.b_message;
        bwks0.getClass();
        bwkv0.b();
        bwkv0.b.add(bwks0);
    }

    public final void k(bwkw bwkw0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        bwkv bwkv0 = (bwkv)this.b_message;
        bwkw0.getClass();
        bwkv0.c();
        bwkv0.c.add(bwkw0);
    }

    public final void l() {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        bwkv bwkv0 = (bwkv)this.b_message;
        hfuf hfuf0 = bwkv0.d;
        if(!hfuf0.c()) {
            bwkv0.d = ProtoLiteMessage.C(hfuf0);
        }
        bwkv0.d.i(1);
    }
}

