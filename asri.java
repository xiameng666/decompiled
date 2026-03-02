import j..time.Instant;

public final class asri implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.c(((asrb)object0));
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((asrb)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((asrb)object0))));
        asrd asrd0 = asrc.a(hftp0);
        Instant instant0 = Instant.ofEpochMilli(System.currentTimeMillis());
        ibuq.e(instant0, "ofEpochMilli(...)");
        hfwn hfwn0 = hfyo.b(instant0);
        ibuq.f(hfwn0, "value");
        ProtoLiteBuilder hftp1 = asrd0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        asrb asrb0 = (asrb)hftp1.b_message;
        hfwn0.getClass();
        asrb0.c = hfwn0;
        asrb0.b |= 1;
        return asrd0.a();
    }
}

