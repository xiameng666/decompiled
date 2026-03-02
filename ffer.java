final class ffer {
    public static fdpl a(fexh fexh0) {
        return fdpl.b(fexh0.c, fexh0.d.toByteArray());
    }

    public static fexh b(fdpl fdpl0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fexh.a).v_newBuilder();
        String s = fdpl0.b;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fexh fexh0 = (fexh)hftp0.b_message;
        s.getClass();
        fexh0.b |= 1;
        fexh0.c = s;
        ByteString hfsf0 = ByteString.copyFrom(fdpl0.c());
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fexh fexh1 = (fexh)hftp0.b_message;
        fexh1.b |= 2;
        fexh1.d = hfsf0;
        return (fexh)hftp0.N_build();
    }
}

