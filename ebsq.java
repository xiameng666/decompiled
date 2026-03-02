public final class ebsq implements ibts {
    public final ebsr a;
    public final String b;
    public final dyfj c;

    public ebsq(ebsr ebsr0, String s, dyfj dyfj0) {
        this.a = ebsr0;
        this.b = s;
        this.c = dyfj0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.c(((dygd)object0));
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((dygd)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((dygd)object0))));
        dygf dygf0 = dyge.a(hftp0);
        dygd dygd0 = this.a.h;
        if(dygd0 == null) {
            ibuq.j("transferStatus");
            dygd0 = null;
        }
        dyfl dyfl0 = dygd0.d == null ? dyfl.a : dygd0.d;
        ibuq.e(dyfl0, "getDownloadMfiCardsResponse(...)");
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)dyfl0).jf(5, null);
        hftp1.X(((ProtoLiteMessage)dyfl0));
        dyfp dyfp0 = dyfo.a(((dyfi)hftp1));
        if(!dyfp0.b().isEmpty()) {
            String s = this.b;
            dyfp0.b();
            dyfk dyfk0 = (dyfk)dyfp0.b().get(0);
            ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)dyfk0).jf(5, null);
            hftp2.X(((ProtoLiteMessage)dyfk0));
            dyfn dyfn0 = dyfm.a(hftp2);
            if(s != null) {
                dyfn0.b(s);
                ProtoLiteBuilder hftp3 = dyfn0.a;
                dyib dyib0 = ((dyfk)hftp3.b_message).d;
                if(dyib0 == null) {
                    dyib0 = dyib.a;
                }
                ibuq.e(dyib0, "getMfiCardInfo(...)");
                ProtoLiteBuilder hftp4 = (ProtoLiteBuilder)((ProtoLiteMessage)dyib0).jf(5, null);
                hftp4.X(((ProtoLiteMessage)dyib0));
                ibuq.f(hftp4, "builder");
                if(!hftp4.b_message.isImmutable()) {
                    hftp4.ensureMutable();
                }
                ((dyib)hftp4.b_message).c = s;
                ProtoLiteMessage hftv0 = hftp4.N_build();
                ibuq.e(hftv0, "build(...)");
                ibuq.f(((dyib)hftv0), "value");
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                dyfk dyfk1 = (dyfk)hftp3.b_message;
                ((dyib)hftv0).getClass();
                dyfk1.d = (dyib)hftv0;
                dyfk1.b |= 1;
            }
            dyfn0.d(this.c);
            dyfk dyfk2 = dyfn0.a();
            ibuq.f(dyfk2, "value");
            dyfi dyfi0 = dyfp0.a;
            if(!dyfi0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)dyfi0).ensureMutable();
            }
            dyfl dyfl1 = (dyfl)dyfi0.b_message;
            dyfk2.getClass();
            dyfl1.b();
            dyfl1.b.set(0, dyfk2);
        }
        dygf0.c(dyfp0.a());
        return dygf0.a();
    }
}

