public final class cyxc extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public cyxc() {
        super(((ProtoLiteMessage)cyxd.a));
    }

    public final void a(int v) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        cyxd cyxd0 = (cyxd)this.b_message;
        hfuf hfuf0 = cyxd0.g;
        if(!hfuf0.c()) {
            cyxd0.g = ProtoLiteMessage.C(hfuf0);
        }
        cyxd0.g.i(v);
    }

    public final void k(int v) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        cyxd cyxd0 = (cyxd)this.b_message;
        hfuf hfuf0 = cyxd0.f;
        if(!hfuf0.c()) {
            cyxd0.f = ProtoLiteMessage.C(hfuf0);
        }
        cyxd0.f.i(v);
    }
}

