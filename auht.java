public final class auht implements evqf {
    public final auhw a;
    public final evqp b;
    public final gegx c;

    public auht(auhw auhw0, evqp evqp0, gegx gegx0) {
        this.a = auhw0;
        this.b = evqp0;
        this.c = gegx0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        evqp evqp0 = this.b;
        auhw auhw0 = this.a;
        if(!((Boolean)object0).booleanValue()) {
            auhw0.a.c.d("Response is invalid", new Object[0]);
            evqp0.b(null);
            return;
        }
        gegx gegx0 = this.c;
        String s = audd.e(gegx0);
        if(s == null) {
            auhw0.a.c.d("Invalid algorithm", new Object[0]);
            evqp0.b(null);
            return;
        }
        auhx auhx0 = auhw0.a;
        if(auhx0.z != null) {
            if((gegx0.b & 8) != 0) {
                if(hque.a.d().l() && aujd.p(avjn.b(gegx0.g), System.currentTimeMillis())) {
                    auhx0.c.d("RAT timestamp is invalid", new Object[0]);
                    evqp0.b(null);
                    return;
                }
                if((gegx0.b & 1) != 0) {
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gqft.a).v_newBuilder();
                    ByteString hfsf0 = gegx0.g;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gqft gqft0 = (gqft)hftp0.b_message;
                    hfsf0.getClass();
                    gqft0.b |= 1;
                    gqft0.c = hfsf0;
                    byte[] arr_b = auhx0.z;
                    batl.s(arr_b);
                    ByteString hfsf1 = ByteString.copyFrom(arr_b);
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp0.b_message;
                    ((gqft)hftv0).b |= 2;
                    ((gqft)hftv0).d = hfsf1;
                    ByteString hfsf2 = gegx0.c;
                    if(!hftv0.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv1 = hftp0.b_message;
                    hfsf2.getClass();
                    ((gqft)hftv1).b |= 8;
                    ((gqft)hftv1).f = hfsf2;
                    if(!hftv1.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gqft gqft1 = (gqft)hftp0.b_message;
                    gqft1.b |= 4;
                    gqft1.e = s;
                    evqp0.b(((gqft)hftp0.N_build()));
                    return;
                }
                auhx0.c.d("The response has null signature", new Object[0]);
                evqp0.b(null);
                return;
            }
            auhx0.c.d("The response has null nonce", new Object[0]);
            evqp0.b(null);
            return;
        }
        auhx0.c.d("The peer certificate is absent", new Object[0]);
        evqp0.b(null);
    }
}

