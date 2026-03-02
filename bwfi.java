public final class bwfi implements glzn {
    public final bwfr a;
    public final String b;

    public bwfi(bwfr bwfr0, String s) {
        this.a = bwfr0;
        this.b = s;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        boolean z = bwfr.k(((gqpz)object0), htxi.a.b().a());
        String s = this.b;
        bwfr bwfr0 = this.a;
        if(z) {
            bvrf bvrf0 = bwfr0.b;
            String s1 = ((gqpz)object0).d;
            int v = ((gqpz)object0).e;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gqyb.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((gqyb)hftv0).d = 2;
            ((gqyb)hftv0).b |= 2;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            gqyb gqyb0 = (gqyb)hftp0.b_message;
            s.getClass();
            gqyb0.b |= 4;
            gqyb0.e = s;
            bvrf0.b(s1, v, hftp0);
        }
        bvss bvss0 = new bvss(s);
        return bwfr0.c.a.b(bvss0, gmap.a);
    }
}

