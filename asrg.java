import j..time.Instant;

public final class asrg implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.c(((asrb)object0));
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((asrb)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((asrb)object0))));
        asrd asrd0 = asrc.a(hftp0);
        ProtoLiteBuilder hftp1 = asrd0.a;
        asry asry0 = ((asrb)hftp1.b_message).e;
        if(asry0 == null) {
            asry0 = asry.a;
        }
        ibuq.e(asry0, "getPhotosOptIn(...)");
        ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)asry0).jf(5, null);
        hftp2.X(((ProtoLiteMessage)asry0));
        ibuq.f(hftp2, "builder");
        ProtoLiteMessage hftv0 = hftp2.b_message;
        int v = ((asry)hftv0).d + 1;
        if(!hftv0.isImmutable()) {
            hftp2.ensureMutable();
        }
        asry asry1 = (asry)hftp2.b_message;
        asry1.b |= 2;
        asry1.d = v;
        Instant instant0 = Instant.ofEpochMilli(System.currentTimeMillis());
        ibuq.e(instant0, "ofEpochMilli(...)");
        hfwn hfwn0 = hfyo.b(instant0);
        ibuq.f(hfwn0, "value");
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        asry asry2 = (asry)hftp2.b_message;
        hfwn0.getClass();
        asry2.c = hfwn0;
        asry2.b |= 1;
        ProtoLiteMessage hftv1 = hftp2.N_build();
        ibuq.e(hftv1, "build(...)");
        ibuq.f(((asry)hftv1), "value");
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        asrb asrb0 = (asrb)hftp1.b_message;
        ((asry)hftv1).getClass();
        asrb0.e = (asry)hftv1;
        asrb0.b |= 4;
        return asrd0.a();
    }
}

