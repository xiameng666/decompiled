public final class dlwf {
    public static final fhvu a(hjrn hjrn0) {
        ibuq.f(hjrn0, "<this>");
        gjca gjca0 = gjbz.a(((gjcd)((ProtoLiteMessage)gjce.a).v_newBuilder()));
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gjcb.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        hjrw hjrw0 = hjrn0.h == null ? hjrw.a : hjrn0.h;
        ibuq.e(hjrw0, "getBulletinLoggingInfo(...)");
        ibuq.f(hjrw0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjcb gjcb0 = (gjcb)hftp0.b_message;
        hjrw0.getClass();
        gjcb0.c = hjrw0;
        gjcb0.b |= 1;
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        ibuq.f(((gjcb)hftv0), "value");
        gjcd gjcd0 = gjca0.a;
        if(!gjcd0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gjcd0).ensureMutable();
        }
        gjce gjce0 = (gjce)gjcd0.b_message;
        ((gjcb)hftv0).getClass();
        gjce0.o = (gjcb)hftv0;
        gjce0.b |= 0x40000;
        return douc.a(gjca0.a());
    }
}

