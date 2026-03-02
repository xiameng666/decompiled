public final class ebir extends ebhb {
    public static final ebiq a;
    public dtsh b;
    public dtpl c;
    public ibrt d;

    static {
        ebir.a = new ebiq();
    }

    @Override  // ebhb
    public final ftcg a() {
        String s = this.d().d();
        if(s == null) {
            s = "0";
        }
        dtpl dtpl0 = this.c;
        if(dtpl0 == null) {
            ibuq.j("mobileDocumentClient");
            dtpl0 = null;
        }
        dmhi dmhi0 = dtpl0.c;
        dpuj dpuj0 = dpuj.aj;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hkai.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hkai hkai0 = (hkai)hftp0.b_message;
        hkai0.b |= 1;
        hkai0.c = s;
        hkaj hkaj0 = (hkaj)dptv.e(dmhi0, dpuj0, ((MessageLite)hftp0.N_build()), ((MessageLite)hkaj.a));
        if(!ibuq.m(hkaj0.c, s)) {
            this.d().e((hkaj0.b == null ? hkbe.a : hkaj0.b), hkaj0.c);
        }
        ibuq.e(ftcg.a, "getDefaultInstance(...)");
        return ftcg.a;
    }

    public final dtsh d() {
        dtsh dtsh0 = this.b;
        if(dtsh0 != null) {
            return dtsh0;
        }
        ibuq.j("database");
        return null;
    }
}

