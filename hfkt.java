public final class hfkt {
    public static hfky a(hfnh hfnh0) {
        hfta hfta0 = hfku.b;
        hfnh0.f(hfta0);
        hftu hftu0 = hfta0.d;
        if(hfnh0.s.m(hftu0)) {
            hfnh0.f(hfta0);
            Object object0 = hfnh0.s.k(hftu0);
            return object0 == null ? ((hfky)hfta0.b) : ((hfky)hfta0.d(object0));
        }
        hfta hfta1 = hfkv.b;
        hfnh0.f(hfta1);
        hftu hftu1 = hfta1.d;
        if(!hfnh0.s.m(hftu1)) {
            throw new IllegalArgumentException("Malformed pToken: pToken version is not recognized.");
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hfky.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hfkx.a).v_newBuilder();
        hfnh0.f(hfta1);
        Object object1 = hfnh0.s.k(hftu1);
        Object object2 = object1 == null ? hfta1.b : hfta1.d(object1);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hfkx hfkx0 = (hfkx)hftp1.b_message;
        ((hfkw)object2).getClass();
        hfkx0.c = (hfkw)object2;
        hfkx0.b = 1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hfky hfky0 = (hfky)hftp0.b_message;
        hfkx hfkx1 = (hfkx)hftp1.N_build();
        hfkx1.getClass();
        hfuo hfuo0 = hfky0.b;
        if(!hfuo0.c()) {
            hfky0.b = ProtoLiteMessage.E(hfuo0);
        }
        hfky0.b.add(hfkx1);
        return (hfky)hftp0.N_build();
    }

    public static hfnh b(ProtoLiteBuilder hftp0) {
        hfkw hfkw0 = (hfkw)hftp0.N_build();
        hftr hftr0 = (hftr)((ProtoLiteMessage)hfnh.a).v_newBuilder();
        hftr0.n(hfkv.b, hfkw0);
        return (hfnh)((ProtoLiteBuilder)hftr0).N_build();
    }
}

