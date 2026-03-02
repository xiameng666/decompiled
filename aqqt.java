import j..time.Instant;

public final class aqqt implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.c(((aqqq)object0));
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((aqqq)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((aqqq)object0))));
        aqqs aqqs0 = aqqr.a(hftp0);
        Instant instant0 = Instant.ofEpochMilli(System.currentTimeMillis());
        ibuq.e(instant0, "ofEpochMilli(...)");
        hfwn hfwn0 = hfyo.b(instant0);
        ibuq.f(hfwn0, "value");
        ProtoLiteBuilder hftp1 = aqqs0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        aqqq aqqq0 = (aqqq)hftp1.b_message;
        hfwn0.getClass();
        aqqq0.c = hfwn0;
        aqqq0.b |= 1;
        return aqqs0.a();
    }
}

