public final class ebgt extends ebhb {
    public static final ebgs a;
    public dtsh b;
    public dtpl c;
    private static final bboh d;
    private final String e;

    static {
        ebgt.a = new ebgs();
        ebgt.d = bboh.b("Pay", bbcu.cZ);
    }

    public ebgt(String s) {
        this.e = s;
    }

    @Override  // ebhb
    public final ftcg a() {
        dtsh dtsh0 = this.b;
        if(dtsh0 == null) {
            ibuq.j("database");
            dtsh0 = null;
        }
        hkan hkan0 = dtsh0.b();
        if(hkan0 == null) {
            hkan0 = hkan.a;
            ibuq.e(hkan0, "getDefaultInstance(...)");
        }
        if(hkan0.b.isEmpty()) {
            ((ggtj)ebgt.d.j()).x("GetBrowserInfoOperation: No GlobalConfig was found.");
        }
        String s = this.e;
        if(s != null && s.length() != 0) {
            ftci ftci0 = ftch.a(((ProtoLiteMessage)ftcg.a).v_newBuilder());
            ftbd ftbd0 = ftbc.a(((ProtoLiteMessage)ftbb.a).v_newBuilder());
            for(Object object0: hkan0.b) {
                hkay hkay0 = (hkay)object0;
                if(hkay0.b.equals(s)) {
                    ftbd0.b();
                    ibuq.c(hkay0);
                    ibuq.f(hkay0, "value");
                    ProtoLiteBuilder hftp0 = ftbd0.a;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ftbb ftbb0 = (ftbb)hftp0.b_message;
                    hkay0.getClass();
                    ftbb0.b();
                    ftbb0.b.add(hkay0);
                }
            }
            ftci0.b(ftbd0.a());
            return ftci0.a();
        }
        ftci ftci1 = ftch.a(((ProtoLiteMessage)ftcg.a).v_newBuilder());
        ftbd ftbd1 = ftbc.a(((ProtoLiteMessage)ftbb.a).v_newBuilder());
        ftbd1.b();
        hfuo hfuo0 = hkan0.b;
        ibuq.e(hfuo0, "getBrowserAllowlistList(...)");
        ibuq.f(hfuo0, "values");
        ProtoLiteBuilder hftp1 = ftbd1.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ftbb ftbb1 = (ftbb)hftp1.b_message;
        ftbb1.b();
        hfrj.E(hfuo0, ftbb1.b);
        ftci1.b(ftbd1.a());
        return ftci1.a();
    }
}

