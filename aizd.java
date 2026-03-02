public final class aizd implements gfsi {
    public final long a;
    public final int b;

    public aizd(long v, int v1) {
        this.a = v;
        this.b = v1;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((ajbz)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((ajbz)object0))));
        ajbu ajbu0 = ((ajbz)object0).j;
        if(ajbu0 == null) {
            ajbu0 = ajbu.a;
        }
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)ajbu0).jf(5, null);
        hftp1.X(((ProtoLiteMessage)ajbu0));
        ajbu ajbu1 = ((ajbz)object0).j;
        if(ajbu1 == null) {
            ajbu1 = ajbu.a;
        }
        ajau ajau0 = ajbu1.d == null ? ajau.a : ajbu1.d;
        ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)ajau0).jf(5, null);
        hftp2.X(((ProtoLiteMessage)ajau0));
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp2.b_message;
        ((ajau)hftv0).b |= 4;
        ((ajau)hftv0).e = this.a;
        if(!hftv0.isImmutable()) {
            hftp2.ensureMutable();
        }
        int v = this.b;
        ajau ajau1 = (ajau)hftp2.b_message;
        if(v == 0) {
            throw null;
        }
        ajau1.f = v - 1;
        ajau1.b |= 8;
        ajau ajau2 = (ajau)hftp2.N_build();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ajbu ajbu2 = (ajbu)hftp1.b_message;
        ajau2.getClass();
        ajbu2.d = ajau2;
        ajbu2.b |= 2;
        ajbu ajbu3 = (ajbu)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ajbz ajbz0 = (ajbz)hftp0.b_message;
        ajbu3.getClass();
        ajbz0.j = ajbu3;
        ajbz0.b |= 0x20;
        return (ajbz)hftp0.N_build();
    }
}

