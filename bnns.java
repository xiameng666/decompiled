public final class bnns {
    public static gjpw a(hadq hadq0, gfsi gfsi0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gjpw.a).v_newBuilder();
        hado hado0 = (hado)((ProtoLiteMessage)haeb.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hadp.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hadp hadp0 = (hadp)hftp1.b_message;
        hadp0.c = hadq0.a();
        hadp0.b |= 1;
        ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)gfsi0.apply(hftp1);
        if(!hado0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hado0).ensureMutable();
        }
        haeb haeb0 = (haeb)hado0.b_message;
        hadp hadp1 = (hadp)hftp2.N_build();
        hadp1.getClass();
        haeb0.b();
        haeb0.b.add(hadp1);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjpw gjpw0 = (gjpw)hftp0.b_message;
        haeb haeb1 = (haeb)((ProtoLiteBuilder)hado0).N_build();
        haeb1.getClass();
        gjpw0.e = haeb1;
        gjpw0.b |= 4;
        return (gjpw)hftp0.N_build();
    }
}

