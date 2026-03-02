import j..time.Instant;

public final class aqpm implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((aqhk)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((aqhk)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        aqhk aqhk0 = (aqhk)hftp0.b_message;
        aqhk0.b |= 1;
        aqhk0.c = true;
        long v = Instant.now().toEpochMilli();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        aqhk aqhk1 = (aqhk)hftp0.b_message;
        aqhk1.b |= 2;
        aqhk1.d = v;
        return (aqhk)hftp0.N_build();
    }
}

