public final class ehkk implements gfsi {
    public final long a;

    public ehkk(long v) {
        this.a = v;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)igyp.a).v_newBuilder();
        long v = System.currentTimeMillis();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((igyp)hftv0).b |= 1;
        ((igyp)hftv0).c = v;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        igyp igyp0 = (igyp)hftp0.b_message;
        igyp0.b |= 2;
        igyp0.d = this.a;
        igyp igyp1 = (igyp)hftp0.N_build();
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)(((igyu)object0))).jf(5, null);
        hftp1.X(((ProtoLiteMessage)(((igyu)object0))));
        igyq igyq0 = ((igyu)object0).d;
        if(igyq0 == null) {
            igyq0 = igyq.a;
        }
        ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)igyq0).jf(5, null);
        hftp2.X(((ProtoLiteMessage)igyq0));
        if(!((igyo)hftp2).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((igyo)hftp2))).ensureMutable();
        }
        igyq igyq1 = (igyq)((igyo)hftp2).b_message;
        igyp1.getClass();
        igyq1.b();
        igyq1.b.add(igyp1);
        igyq igyq2 = (igyq)((ProtoLiteBuilder)(((igyo)hftp2))).N_build();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        igyu igyu0 = (igyu)hftp1.b_message;
        igyq2.getClass();
        igyu0.d = igyq2;
        igyu0.b |= 2;
        return (igyu)hftp1.N_build();
    }
}

