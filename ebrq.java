import java.util.Map;

public final class ebrq implements evpo {
    public final ebsf a;
    public final dyey b;

    public ebrq(ebsf ebsf0, dyey dyey0) {
        this.a = ebsf0;
        this.b = dyey0;
    }

    @Override  // evpo
    public final Object a(evql evql0) {
        ebsf ebsf0 = this.a;
        dyey dyey0 = this.b;
        if(!evql0.n()) {
            dyna dyna0 = dyna.b(dyey0.b) == null ? dyna.k : dyna.b(dyey0.b);
            ibuq.e(dyna0, "getSecureElementServiceProvider(...)");
            ebsf0.p(6, dyna0);
            dyfn dyfn0 = dyfm.a(((ProtoLiteMessage)dyfk.a).v_newBuilder());
            String s = dyey0.c;
            ibuq.e(s, "getCid(...)");
            dyfn0.b(s);
            dyna dyna1 = dyna.b(dyey0.b) == null ? dyna.k : dyna.b(dyey0.b);
            ibuq.e(dyna1, "getSecureElementServiceProvider(...)");
            dyfn0.c(dyna1);
            dyfn0.d(dyfj.c);
            return evrg.d(dyfn0.a());
        }
        if(!((Boolean)evql0.j()).booleanValue()) {
            dyfn dyfn1 = dyfm.a(((ProtoLiteMessage)dyfk.a).v_newBuilder());
            String s1 = dyey0.c;
            ibuq.e(s1, "getCid(...)");
            dyfn1.b(s1);
            dyna dyna2 = dyna.b(dyey0.b) == null ? dyna.k : dyna.b(dyey0.b);
            ibuq.e(dyna2, "getSecureElementServiceProvider(...)");
            dyfn1.c(dyna2);
            dyfn1.d(dyfj.f);
            return evrg.d(dyfn1.a());
        }
        Map map0 = ebsf0.v;
        if(map0 == null) {
            ibuq.j("cidToCardInfoMap");
            map0 = null;
        }
        hkjm hkjm0 = (hkjm)map0.get(dyey0.c);
        if(hkjm0 == null) {
            dyna dyna3 = dyna.b(dyey0.b) == null ? dyna.k : dyna.b(dyey0.b);
            ibuq.e(dyna3, "getSecureElementServiceProvider(...)");
            ebsf0.p(8, dyna3);
            dyfn dyfn2 = dyfm.a(((ProtoLiteMessage)dyfk.a).v_newBuilder());
            String s2 = dyey0.c;
            ibuq.e(s2, "getCid(...)");
            dyfn2.b(s2);
            dyna dyna4 = dyna.b(dyey0.b) == null ? dyna.k : dyna.b(dyey0.b);
            ibuq.e(dyna4, "getSecureElementServiceProvider(...)");
            dyfn2.c(dyna4);
            dyfn2.d(dyfj.c);
            return evrg.d(dyfn2.a());
        }
        if(!hkjm0.i) {
            dyfn dyfn3 = dyfm.a(((ProtoLiteMessage)dyfk.a).v_newBuilder());
            String s3 = dyey0.c;
            ibuq.e(s3, "getCid(...)");
            dyfn3.b(s3);
            dyna dyna5 = dyna.b(dyey0.b) == null ? dyna.k : dyna.b(dyey0.b);
            ibuq.e(dyna5, "getSecureElementServiceProvider(...)");
            dyfn3.c(dyna5);
            dyfn3.d((hkjm0.h ? dyfj.g : dyfj.i));
            return evrg.d(dyfn3.a());
        }
        dyna dyna6 = dyna.b(dyey0.b) == null ? dyna.k : dyna.b(dyey0.b);
        ibuq.e(dyna6, "getSecureElementServiceProvider(...)");
        String s4 = dyey0.c;
        ibuq.e(s4, "getCid(...)");
        return ebsf0.h(dyna6, s4);
    }
}

