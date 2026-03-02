public final class abjz implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.c(((abjd)object0));
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((abjd)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((abjd)object0))));
        abjf abjf0 = abje.a(hftp0);
        ProtoLiteBuilder hftp1 = abjf0.a;
        long v = System.currentTimeMillis();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        abjd abjd0 = (abjd)hftp1.b_message;
        abjd0.b |= 0x20;
        abjd0.h = v;
        return abjf0.a();
    }
}

