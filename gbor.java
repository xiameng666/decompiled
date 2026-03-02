public final class gbor {
    public static final void a(hftr hftr0, hdih hdih0, String s) {
        ibuq.f(hdih0, "embeddedImage");
        ibuq.f(s, "altText");
        hfta hfta0 = hcly.e;
        int v = hfta0.a();
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        hcnu hcnu0 = (hcnu)hftr0.b_message;
        hcnu0.b |= 8;
        hcnu0.i = v;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hcly.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hdil.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hdil hdil0 = (hdil)hftp1.b_message;
        s.getClass();
        hdil0.b |= 1;
        hdil0.e = s;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hdif.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((hdif)hftp2.b_message).c = (int)hdih0.B;
        ((hdif)hftp2.b_message).b = 5;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hdil hdil1 = (hdil)hftp1.b_message;
        hdif hdif0 = (hdif)hftp2.N_build();
        hdif0.getClass();
        hdil1.b();
        hdil1.f.add(hdif0);
        hdil hdil2 = (hdil)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hcly hcly0 = (hcly)hftp0.b_message;
        hdil2.getClass();
        hcly0.c = hdil2;
        hcly0.b |= 1;
        hftr0.n(hfta0, hftp0.N_build());
    }

    public static final void b(hftr hftr0, String s) {
        ibuq.f(s, "text");
        hcos hcos0 = ((hcnu)hftr0.b_message).c;
        if(hcos0 == null) {
            hcos0 = hcos.a;
        }
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hcos0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)hcos0));
        hfta hfta0 = hcmb.e;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hcmb.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hcmb hcmb0 = (hcmb)hftp1.b_message;
        s.getClass();
        hcmb0.b |= 1;
        hcmb0.c = s;
        ((hftr)hftp0).n(hfta0, hftp1.N_build());
        hcos hcos1 = (hcos)((ProtoLiteBuilder)(((hftr)hftp0))).N_build();
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        hcnu hcnu0 = (hcnu)hftr0.b_message;
        hcos1.getClass();
        hcnu0.c = hcos1;
        hcnu0.b |= 1;
        hfta hfta1 = hcly.e;
        int v = hfta1.a();
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        hcnu hcnu1 = (hcnu)hftr0.b_message;
        hcnu1.b |= 8;
        hcnu1.i = v;
        hftr0.n(hfta1, hcly.a);
    }
}

