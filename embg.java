public final class embg implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((emls)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((emls)object0))));
        emlr emlr0 = ((emls)object0).k;
        if(emlr0 == null) {
            emlr0 = emlr.a;
        }
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)emlr0).jf(5, null);
        hftp1.X(((ProtoLiteMessage)emlr0));
        emlr emlr1 = ((emls)object0).k;
        if(emlr1 == null) {
            emlr1 = emlr.a;
        }
        emlq emlq0 = emlr1.c == null ? emlq.a : emlr1.c;
        ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)emlq0).jf(5, null);
        hftp2.X(((ProtoLiteMessage)emlq0));
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp2.b_message;
        ((emlq)hftv0).b &= -2;
        emlq emlq1 = emlq.a;
        ((emlq)hftv0).c = emlq1.c;
        if(!hftv0.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp2.b_message;
        ((emlq)hftv1).b &= -3;
        ((emlq)hftv1).d = emlq1.d;
        if(!hftv1.isImmutable()) {
            hftp2.ensureMutable();
        }
        emlq emlq2 = (emlq)hftp2.b_message;
        emlq2.b &= -5;
        emlq2.e = 0L;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        emlr emlr2 = (emlr)hftp1.b_message;
        emlq emlq3 = (emlq)hftp2.N_build();
        emlq3.getClass();
        emlr2.c = emlq3;
        emlr2.b |= 1;
        emlr emlr3 = ((emls)object0).k;
        if(emlr3 == null) {
            emlr3 = emlr.a;
        }
        emlq emlq4 = emlr3.d;
        if(emlq4 != null) {
            emlq1 = emlq4;
        }
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        emlr emlr4 = (emlr)hftp1.b_message;
        emlq1.getClass();
        emlr4.d = emlq1;
        emlr4.b |= 2;
        if(!((emlf)hftp0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((emlf)hftp0))).ensureMutable();
        }
        emls emls0 = (emls)((emlf)hftp0).b_message;
        emlr emlr5 = (emlr)hftp1.N_build();
        emlr5.getClass();
        emls0.k = emlr5;
        emls0.b |= 0x20;
        return (emls)((ProtoLiteBuilder)(((emlf)hftp0))).N_build();
    }
}

