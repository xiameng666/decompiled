public final class fdoy {
    public static fdol a(String s) {
        if(s.isEmpty()) {
            return fdol.a;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fdol.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fdol fdol0 = (fdol)hftp0.b_message;
        s.getClass();
        fdol0.b |= 1;
        fdol0.c = s;
        return (fdol)hftp0.N_build();
    }

    public static void b(fdnh fdnh0, feyj feyj0) {
        fdnh0.c = 4;
        if((4 & feyj0.b) != 0) {
            fdnh0.a = (feyj0.e == null ? feye.a : feyj0.e).h;
        }
        if(((feyj0.f == null ? feyh.a : feyj0.f).b & 2) != 0) {
            fdnh0.b((feyj0.f == null ? feyh.a : feyj0.f).d.size());
        }
        fdnh0.b(0);
    }
}

