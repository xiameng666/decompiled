public final class btyu implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((buat)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((buat)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        buat buat0 = (buat)hftp0.b_message;
        buat0.b &= -2;
        buat buat1 = buat.a;
        buat0.c = buat1.c;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        buat buat2 = (buat)hftp0.b_message;
        buat2.b &= -3;
        buat2.d = buat1.d;
        return (buat)hftp0.N_build();
    }
}

