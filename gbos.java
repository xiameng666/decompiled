public final class gbos {
    public static final hcrz a(long v, hcur hcur0) {
        ibuq.f(hcur0, "flashlightState");
        hcry hcry0 = hcrx.a(((hftr)((ProtoLiteMessage)hcrz.a).v_newBuilder()));
        hcry0.d();
        hcry0.c(v);
        hfta hfta0 = hcum.f;
        ibuq.e(hfta0, "cameraResultingActionExtension");
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hcum.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        hcul hcul0 = hcul.b;
        ibuq.f(hcul0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hcum)hftp0.b_message).e = hcul0.c;
        ((hcum)hftp0.b_message).b |= 1;
        ibuq.f(hcur0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hcum)hftp0.b_message).d = (int)hcur0.e;
        ((hcum)hftp0.b_message).c = 2;
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        hcry0.b(hfta0, ((hcum)hftv0));
        return hcry0.a();
    }
}

