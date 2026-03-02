public final class bwfg implements glzn {
    public final bwfr a;

    public bwfg(bwfr bwfr0) {
        this.a = bwfr0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        boolean z = bwfr.k(((gqpz)object0), htxi.a.b().c());
        bwfr bwfr0 = this.a;
        if(z) {
            bvrf bvrf0 = bwfr0.b;
            String s = ((gqpz)object0).d;
            int v = ((gqpz)object0).e;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gqyb.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gqyb)hftp0.b_message).d = 17;
            ((gqyb)hftp0.b_message).b |= 2;
            bvrf0.b(s, v, hftp0);
        }
        bvta bvta0 = new bvta();
        return bwfr0.c.a.b(bvta0, gmap.a);
    }
}

