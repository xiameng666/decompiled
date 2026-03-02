public final class busb {
    public static final hiwm a;

    static {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hiwm.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hiuw.b).v_newBuilder();
        ibuq.f(hftp1, "builder");
        hiuv hiuv0 = hiuv.p;
        ibuq.f(hiuv0, "value");
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hiuw hiuw0 = (hiuw)hftp1.b_message;
        hiuw0.c = hiuv0.a();
        new hfxu(new hfuh(((hiuw)hftp1.b_message).d, hiuw.a));
        hiwn hiwn0 = hiwn.b;
        ibuq.f(hiwn0, "value");
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hiuw hiuw1 = (hiuw)hftp1.b_message;
        hiwn0.getClass();
        hfuf hfuf0 = hiuw1.d;
        if(!hfuf0.c()) {
            hiuw1.d = ProtoLiteMessage.C(hfuf0);
        }
        hiuw1.d.i(hiwn0.a());
        ProtoLiteMessage hftv0 = hftp1.N_build();
        ibuq.e(hftv0, "build(...)");
        ibuq.f(((hiuw)hftv0), "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hiwm hiwm0 = (hiwm)hftp0.b_message;
        ((hiuw)hftv0).getClass();
        hiwm0.c = (hiuw)hftv0;
        hiwm0.b |= 1;
        ProtoLiteMessage hftv1 = hftp0.N_build();
        ibuq.e(hftv1, "build(...)");
        busb.a = (hiwm)hftv1;
    }
}

