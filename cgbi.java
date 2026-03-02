public final class cgbi implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        gksb gksb0 = ((gixy)((ProtoLiteBuilder)object0).b_message).i;
        if(gksb0 == null) {
            gksb0 = gksb.a;
        }
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gksb0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gksb0));
        gksb gksb1 = ((gixy)((ProtoLiteBuilder)object0).b_message).i;
        if(gksb1 == null) {
            gksb1 = gksb.a;
        }
        gkrz gkrz0 = gksb1.c == null ? gkrz.a : gksb1.c;
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)gkrz0).jf(5, null);
        hftp1.X(((ProtoLiteMessage)gkrz0));
        gksb gksb2 = ((gixy)((ProtoLiteBuilder)object0).b_message).i;
        if(gksb2 == null) {
            gksb2 = gksb.a;
        }
        gkrz gkrz1 = gksb2.c == null ? gkrz.a : gksb2.c;
        gkrn gkrn0 = gkrz1.c == null ? gkrn.a : gkrz1.c;
        ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)gkrn0).jf(5, null);
        hftp2.X(((ProtoLiteMessage)gkrn0));
        gksb gksb3 = ((gixy)((ProtoLiteBuilder)object0).b_message).i;
        if(gksb3 == null) {
            gksb3 = gksb.a;
        }
        gkrz gkrz2 = gksb3.c == null ? gkrz.a : gksb3.c;
        gkrn gkrn1 = gkrz2.c == null ? gkrn.a : gkrz2.c;
        gkrd gkrd0 = gkrn1.i == null ? gkrd.a : gkrn1.i;
        ProtoLiteBuilder hftp3 = (ProtoLiteBuilder)((ProtoLiteMessage)gkrd0).jf(5, null);
        hftp3.X(((ProtoLiteMessage)gkrd0));
        ((gkrc)hftp3).a(((gkro)object1));
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gkrn gkrn2 = (gkrn)hftp2.b_message;
        gkrd gkrd1 = (gkrd)((ProtoLiteBuilder)(((gkrc)hftp3))).N_build();
        gkrd1.getClass();
        gkrn2.i = gkrd1;
        gkrn2.b |= 0x20;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gkrz gkrz3 = (gkrz)hftp1.b_message;
        gkrn gkrn3 = (gkrn)hftp2.N_build();
        gkrn3.getClass();
        gkrz3.c = gkrn3;
        gkrz3.b |= 0x800;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gksb gksb4 = (gksb)hftp0.b_message;
        gkrz gkrz4 = (gkrz)hftp1.N_build();
        gkrz4.getClass();
        gksb4.c = gkrz4;
        gksb4.b |= 1;
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gixy gixy0 = (gixy)((ProtoLiteBuilder)object0).b_message;
        gksb gksb5 = (gksb)hftp0.N_build();
        gksb5.getClass();
        gixy0.i = gksb5;
        gixy0.b |= 0x20;
    }
}

