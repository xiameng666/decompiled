public final class envn implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((emit)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((emit)object0))));
        if(!((emis)hftp0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((emis)hftp0))).ensureMutable();
        }
        hfvv hfvv0 = hfvv.a;
        ((emit)((emis)hftp0).b_message).i = hfvv0;
        if(!((emis)hftp0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((emis)hftp0))).ensureMutable();
        }
        ((emit)((emis)hftp0).b_message).h = hfvv0;
        boolean z = hybe.a.b().g();
        if(!((emis)hftp0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((emis)hftp0))).ensureMutable();
        }
        emit emit0 = (emit)((emis)hftp0).b_message;
        emit0.b |= 0x100;
        emit0.m = z;
        gzpq gzpq0 = gzpq.a;
        hftr hftr0 = (hftr)((ProtoLiteMessage)gzpq0).v_newBuilder();
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        ((gzpq)hftr0.b_message).c = 1;
        ((gzpq)hftr0.b_message).b |= 1;
        gzpq gzpq1 = (gzpq)((ProtoLiteBuilder)hftr0).N_build();
        hftr hftr1 = (hftr)((ProtoLiteMessage)gzpq0).v_newBuilder();
        if(!hftr1.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr1).ensureMutable();
        }
        ((gzpq)hftr1.b_message).c = 2;
        ((gzpq)hftr1.b_message).b |= 1;
        gzpq gzpq2 = (gzpq)((ProtoLiteBuilder)hftr1).N_build();
        hftr hftr2 = (hftr)((ProtoLiteMessage)gzpq0).v_newBuilder();
        if(!hftr2.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr2).ensureMutable();
        }
        ((gzpq)hftr2.b_message).c = 3;
        ((gzpq)hftr2.b_message).b |= 1;
        ((emis)hftp0).a(gged_interceptors.n(gzpq1, gzpq2, ((gzpq)((ProtoLiteBuilder)hftr2).N_build())));
        hfwn hfwn0 = hfyn.h(System.currentTimeMillis());
        if(!((emis)hftp0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((emis)hftp0))).ensureMutable();
        }
        emit emit1 = (emit)((emis)hftp0).b_message;
        hfwn0.getClass();
        emit1.d = hfwn0;
        emit1.b |= 2;
        if(!((emis)hftp0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((emis)hftp0))).ensureMutable();
        }
        ((emit)((emis)hftp0).b_message).c = 2;
        ((emit)((emis)hftp0).b_message).b |= 1;
        return (emit)((ProtoLiteBuilder)(((emis)hftp0))).N_build();
    }
}

