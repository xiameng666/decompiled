public final class auhu implements evqf {
    public final auhw a;

    public auhu(auhw auhw0) {
        this.a = auhw0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        auhw auhw0 = this.a;
        gqft gqft0 = (gqft)object0;
        if(gqft0 == null) {
            long v = System.currentTimeMillis();
            auhw0.a.c.d("Failed to parse RAT from response, generating placeholder RAT with timestamp %d", new Object[]{v});
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gqft.a).v_newBuilder();
            ByteString hfsf0 = avjn.g(v);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gqft gqft1 = (gqft)hftp0.b_message;
            gqft1.b |= 1;
            gqft1.c = hfsf0;
            gqft0 = (gqft)hftp0.N_build();
        }
        else {
            Long long0 = avjn.b(gqft0.c);
            auhw0.a.c.n("Successfully parsed RAT, timestamp=%d", long0);
        }
        auhx auhx0 = auhw0.a;
        auhx0.v = gqft0;
        int v1 = auhx0.q - 1;
        auhx0.q = v1;
        if(v1 == 0) {
            auhx0.b();
        }
    }
}

