public final class aths {
    public static final void a(String s, athu athu0, ggdy ggdy0) {
        gftb.b(s.length() != 0, "Key must have non-zero length");
        gftb.z(athu0, "Hash must not be null");
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)arap.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        arap arap0 = (arap)hftp0.b_message;
        s.getClass();
        arap0.b |= 1;
        arap0.c = s;
        ByteString hfsf0 = ByteString.copyFrom(athu0.a);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        arap arap1 = (arap)hftp0.b_message;
        arap1.b |= 2;
        arap1.d = hfsf0;
        ggdy0.i(((arap)hftp0.N_build()));
    }
}

