public final class cgus implements bbmv {
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
        gkrf gkrf0 = gkrz1.d == null ? gkrf.a : gkrz1.d;
        ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)gkrf0).jf(5, null);
        hftp2.X(((ProtoLiteMessage)gkrf0));
        ((gkre)hftp2).a(((gkse)object1));
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gkrz gkrz2 = (gkrz)hftp1.b_message;
        gkrf gkrf1 = (gkrf)((ProtoLiteBuilder)(((gkre)hftp2))).N_build();
        gkrf1.getClass();
        gkrz2.d = gkrf1;
        gkrz2.b |= 0x8000;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gksb gksb3 = (gksb)hftp0.b_message;
        gkrz gkrz3 = (gkrz)hftp1.N_build();
        gkrz3.getClass();
        gksb3.c = gkrz3;
        gksb3.b |= 1;
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gixy gixy0 = (gixy)((ProtoLiteBuilder)object0).b_message;
        gksb gksb4 = (gksb)hftp0.N_build();
        gksb4.getClass();
        gixy0.i = gksb4;
        gixy0.b |= 0x20;
    }
}

