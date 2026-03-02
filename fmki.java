public final class fmki implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hnuy.a).v_newBuilder();
        hnrp hnrp0 = flwo.a(((fmlm)object0).d);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hnuy hnuy0 = (hnuy)hftp0.b_message;
        hnrp0.getClass();
        hnuy0.e = hnrp0;
        hnuy0.b |= 1;
        ByteString hfsf0 = ByteString.copyFrom(((fmlm)object0).a);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((hnuy)hftv0).d = hfsf0;
        String s = ((fmlm)object0).c;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        hnuy hnuy1 = (hnuy)hftp0.b_message;
        s.getClass();
        hnuy1.c = s;
        hnrx hnrx0 = flwz.b(((fmlm)object0).b);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hnuy hnuy2 = (hnuy)hftp0.b_message;
        hnrx0.getClass();
        hnuy2.f = hnrx0;
        hnuy2.b |= 2;
        return (hnuy)hftp0.N_build();
    }
}

