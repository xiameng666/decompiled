public final class aizg implements gfsi {
    public final long a;
    public final int b;

    public aizg(long v, int v1) {
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
        ajax ajax0 = ajbu1.e == null ? ajax.a : ajbu1.e;
        ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)ajax0).jf(5, null);
        hftp2.X(((ProtoLiteMessage)ajax0));
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp2.b_message;
        ((ajax)hftv0).b |= 1;
        ((ajax)hftv0).c = this.a;
        if(!hftv0.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((ajax)hftp2.b_message).d = this.b - 1;
        ((ajax)hftp2.b_message).b |= 2;
        ajax ajax1 = (ajax)hftp2.N_build();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ajbu ajbu2 = (ajbu)hftp1.b_message;
        ajax1.getClass();
        ajbu2.e = ajax1;
        ajbu2.b |= 4;
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

