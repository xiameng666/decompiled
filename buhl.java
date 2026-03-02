public final class buhl {
    public static final void a(hjbr hjbr0) {
        ibuq.f(hjbr0, "eventType");
        cfrj cfrj0 = cfrj.v();
        hjaf hjaf0 = hjae.a(((ProtoLiteMessage)hjaq.a).v_newBuilder());
        hjab hjab0 = hjaa.a(((ProtoLiteMessage)hjan.a).v_newBuilder());
        hjab0.b(hjak.s);
        hjaf0.c(hjab0.a());
        hjad hjad0 = hjac.a(((ProtoLiteMessage)hjap.a).v_newBuilder());
        hjcb hjcb0 = hjca.a(((ProtoLiteMessage)hjbn.a).v_newBuilder());
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hjbs.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        ibuq.f(hjbr0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hjbs)hftp0.b_message).c = hjbr0.h;
        ((hjbs)hftp0.b_message).b |= 1;
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        ibuq.f(((hjbs)hftv0), "value");
        ProtoLiteBuilder hftp1 = hjcb0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hjbn hjbn0 = (hjbn)hftp1.b_message;
        ((hjbs)hftv0).getClass();
        hjbn0.c = (hjbs)hftv0;
        hjbn0.b = 1;
        hjad0.b(hjcb0.a());
        hjaf0.b(hjad0.a());
        cfrj0.c(((ProtoLiteMessage)hjaf0.a())).a();
    }
}

