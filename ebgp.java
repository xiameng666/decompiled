public final class ebgp {
    public static final bboh a;
    private final bbng b;
    private final dtpl c;
    private final dtrw d;

    static {
        ebgp.a = bboh.b("Pay", bbcu.cZ);
    }

    public ebgp(bbng bbng0, dtpl dtpl0, dtrw dtrw0) {
        this.b = bbng0;
        this.c = dtpl0;
        this.d = dtrw0;
    }

    public final void a(String s, String s1, evqf evqf0, evqc evqc0) {
        ebgo ebgo0 = new ebgo(s, s1, this.d, evqf0, evqc0);
        dpuj dpuj0 = dpuj.ah;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hkae.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        dtpl dtpl0 = this.c;
        hkae hkae0 = (hkae)hftp0.b_message;
        s.getClass();
        hkae0.b |= 2;
        hkae0.d = s;
        ProtoLiteBuilder hftp1 = dtpl0.l();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hkae hkae1 = (hkae)hftp0.b_message;
        hkaw hkaw0 = (hkaw)hftp1.N_build();
        hkaw0.getClass();
        hkae1.c = hkaw0;
        hkae1.b |= 1;
        ProtoLiteMessage hftv0 = hftp0.N_build();
        dptv.l(dtpl0.c, dpuj0, ((MessageLite)hftv0), ((MessageLite)hkaf.a), ebgo0);
    }
}

