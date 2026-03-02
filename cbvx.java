public final class cbvx {
    public static final gvmk a() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gvmk.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gvmo.a).v_newBuilder();
        ibuq.f(hftp1, "builder");
        gvmm gvmm0 = gvmm.h;
        ibuq.f(gvmm0, "value");
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gvmo)hftp1.b_message).c = gvmm0.v;
        ((gvmo)hftp1.b_message).b |= 2;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gvmn.a).v_newBuilder();
        ibuq.f(hftp2, "builder");
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gvmn gvmn0 = (gvmn)hftp2.b_message;
        gvmn0.b |= 1;
        gvmn0.c = "ksm";
        ProtoLiteMessage hftv0 = hftp2.N_build();
        ibuq.e(hftv0, "build(...)");
        ibuq.f(((gvmn)hftv0), "value");
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gvmo gvmo0 = (gvmo)hftp1.b_message;
        ((gvmn)hftv0).getClass();
        gvmo0.d = (gvmn)hftv0;
        gvmo0.b |= 8;
        ProtoLiteMessage hftv1 = hftp1.N_build();
        ibuq.e(hftv1, "build(...)");
        ibuq.f(((gvmo)hftv1), "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gvmk gvmk0 = (gvmk)hftp0.b_message;
        ((gvmo)hftv1).getClass();
        gvmk0.c = (gvmo)hftv1;
        gvmk0.b |= 16;
        ProtoLiteMessage hftv2 = hftp0.N_build();
        ibuq.e(hftv2, "build(...)");
        return (gvmk)hftv2;
    }
}

