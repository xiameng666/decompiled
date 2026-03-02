public final class dvpe {
    public static final boolean a(int v) {
        int v1 = gvbx.a(v);
        return v1 != 0 && (v1 - 2 == 15 || v1 - 2 == 20 || v1 - 2 == 23 || (v1 - 2 == 7 || v1 - 2 == 8 || v1 - 2 == 9 || v1 - 2 == 10));
    }

    public static final gucn b() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)guiv.a).v_newBuilder();
        ibuq.e(hftp0, "newBuilder(...)");
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gtzc.a).v_newBuilder();
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gtzk.a).v_newBuilder();
        gtzj gtzj0 = gtzj.y;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gtzk gtzk0 = (gtzk)hftp2.b_message;
        gtzk0.f = gtzj0.a();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gtzc gtzc0 = (gtzc)hftp1.b_message;
        gtzk gtzk1 = (gtzk)hftp2.N_build();
        gtzk1.getClass();
        gtzc0.d = gtzk1;
        gtzc0.c = 2;
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gucn.a).v_newBuilder();
        gucs gucs0 = (gucs)((ProtoLiteMessage)guct.a).v_newBuilder();
        ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)gucr.a).v_newBuilder();
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        gucr gucr0 = (gucr)hftp4.b_message;
        guiv guiv0 = (guiv)hftp0.N_build();
        guiv0.getClass();
        gucr0.d = guiv0;
        gucr0.c = 55;
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        gucr gucr1 = (gucr)hftp4.b_message;
        gtzc gtzc1 = (gtzc)hftp1.N_build();
        gtzc1.getClass();
        gucr1.g = gtzc1;
        gucr1.b |= 4;
        gucs0.l(hftp4);
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        gucn gucn0 = (gucn)hftp3.b_message;
        guct guct0 = (guct)((ProtoLiteBuilder)gucs0).N_build();
        guct0.getClass();
        gucn0.c = guct0;
        gucn0.b = 2;
        ProtoLiteMessage hftv0 = hftp3.N_build();
        ibuq.e(hftv0, "build(...)");
        return (gucn)hftv0;
    }
}

