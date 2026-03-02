public final class gbow {
    public static final hcrz a(String s, long[] arr_v) {
        ibuq.f(s, "announcement");
        hcry hcry0 = hcrx.a(((hftr)((ProtoLiteMessage)hcrz.a).v_newBuilder()));
        hcry0.d();
        ibpj ibpj0 = new ibpj(arr_v);
        hcry0.a.s(ibpj0);
        hfta hfta0 = hddt.f;
        ibuq.e(hfta0, "infrastructureResultingActionExtension");
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hddt.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        hdds hdds0 = hdds.g;
        ibuq.f(hdds0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hddt)hftp0.b_message).e = hdds0.p;
        ((hddt)hftp0.b_message).b |= 1;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hddg.a).v_newBuilder();
        ibuq.f(hftp1, "builder");
        ibuq.f(s, "value");
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hddg hddg0 = (hddg)hftp1.b_message;
        s.getClass();
        hddg0.b |= 1;
        hddg0.c = s;
        ProtoLiteMessage hftv0 = hftp1.N_build();
        ibuq.e(hftv0, "build(...)");
        ibuq.f(((hddg)hftv0), "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hddt hddt0 = (hddt)hftp0.b_message;
        ((hddg)hftv0).getClass();
        hddt0.d = (hddg)hftv0;
        hddt0.c = 7;
        ProtoLiteMessage hftv1 = hftp0.N_build();
        ibuq.e(hftv1, "build(...)");
        hcry0.b(hfta0, ((hddt)hftv1));
        return hcry0.a();
    }

    public static void b(hftr hftr0, hddn hddn0, hddl hddl0, hcjo hcjo0, int v) {
        ibuq.f(hddn0, "resultCode");
        hfta hfta0 = hddt.f;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hddt.a).v_newBuilder();
        hdds hdds0 = hdds.c;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hddt)hftp0.b_message).e = hdds0.p;
        ((hddt)hftp0.b_message).b |= 1;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hddo.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        if((v & 2) != 0) {
            hddl0 = null;
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((hddo)hftv0).c = hddn0.e;
        ((hddo)hftv0).b |= 1;
        if(hddl0 != null) {
            if(!hftv0.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((hddo)hftp1.b_message).g = hddl0;
            ((hddo)hftp1.b_message).b |= 16;
        }
        if((v & 8) != 0) {
            hcjo0 = null;
        }
        if(hcjo0 != null) {
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((hddo)hftp1.b_message).e = hcjo0;
            ((hddo)hftp1.b_message).b |= 4;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hddt hddt0 = (hddt)hftp0.b_message;
        hddo hddo0 = (hddo)hftp1.N_build();
        hddo0.getClass();
        hddt0.d = hddo0;
        hddt0.c = 3;
        hftr0.n(hfta0, hftp0.N_build());
    }

    public static final void c(hftr hftr0, hddb hddb0) {
        ibuq.f(hddb0, "triggerType");
        hfta hfta0 = hddc.d;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hddc.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hddc)hftp0.b_message).c = hddb0.g;
        ((hddc)hftp0.b_message).b |= 1;
        hftr0.n(hfta0, hftp0.N_build());
    }
}

