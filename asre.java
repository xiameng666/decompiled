public final class asre implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.c(((asrb)object0));
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((asrb)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((asrb)object0))));
        asrd asrd0 = asrc.a(hftp0);
        ProtoLiteBuilder hftp1 = asrd0.a;
        asrx asrx0 = ((asrb)hftp1.b_message).d;
        if(asrx0 == null) {
            asrx0 = asrx.a;
        }
        ibuq.e(asrx0, "getPhotosBackupMissingPermissions(...)");
        ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)asrx0).jf(5, null);
        hftp2.X(((ProtoLiteMessage)asrx0));
        ibuq.f(hftp2, "builder");
        ProtoLiteMessage hftv0 = hftp2.b_message;
        int v = ((asrx)hftv0).d + 1;
        if(!hftv0.isImmutable()) {
            hftp2.ensureMutable();
        }
        asrx asrx1 = (asrx)hftp2.b_message;
        asrx1.b |= 2;
        asrx1.d = v;
        long v1 = System.currentTimeMillis();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        asrx asrx2 = (asrx)hftp2.b_message;
        asrx2.b |= 1;
        asrx2.c = v1;
        ProtoLiteMessage hftv1 = hftp2.N_build();
        ibuq.e(hftv1, "build(...)");
        ibuq.f(((asrx)hftv1), "value");
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        asrb asrb0 = (asrb)hftp1.b_message;
        ((asrx)hftv1).getClass();
        asrb0.d = (asrx)hftv1;
        asrb0.b |= 2;
        return asrd0.a();
    }
}

